grammar LA;


@members{
PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
Tipos tipos = new Tipos();

private void stop(String msg) {
      throw new ParseCancellationException(msg);
}
}


//Um programa na linguagem LA é composto por declarações de variáveis, palavra
//reservada algoritmo um corpo de comandos e termina com a palavra reservada fim_algoritmo

programa : {pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));}
           declaracoes 'algoritmo' corpo 'fim_algoritmo'
           {pilhaDeTabelas.desempilhar();};

//Declaração é formada por uma declaração global seguida de uma delcaração ou vazio

declaracoes : decl_local_global*;

//Define a decl_local_global sendo uma delcaração local ou global

decl_local_global : declaracao_local | declaracao_global;

//A declaração local é composta por a palavra reservada "declare" seguida da variável ou
//pela palavre reservada "constante" seguida de um identificador, dois pontos, um tipo e uma constante
//ou pela palavra reservada "tipo" seguida de um identificador, dois pontos e o tipo

declaracao_local : 'declare' variavel
                 | 'constante' IDENT ':' tipo_basico '=' valor_constante
                   {pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, $tipo_basico.tipodado, "constante");}
                 | 'tipo' IDENT ':' tipo
                   {tipos.addTipo($IDENT.text, $tipo.atributos);
                    pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "indefinido", "tipo");};

//uma variável é do tipo "nome[expressão]" ou "nome" seguido de dois pontos e o tipo

variavel : IDENT dimensao mais_var ':' tipo
         {  List<Pair> nomes = new ArrayList<Pair>();
            nomes = $mais_var.nomes;
            Pair pair = new Pair($IDENT.text, $IDENT.line);
            nomes.add(0, pair);
            for (Pair var : nomes) {
                if(!pilhaDeTabelas.existeSimbolo(var.a.toString()))
                    pilhaDeTabelas.topo().adicionarSimbolo(var.a.toString(), $tipo.tipodado, "variavel");
                else
                    Mensagens.erroVariavelJaExiste(var.a.toString(), Integer.parseInt(var.b.toString()));
                
            }
         };
         

//Permite que seja declarada mais de uma variável do mesmo tipo separando por virgulas

mais_var returns [List<Pair> nomes]
@init { $nomes = new ArrayList<Pair>(); }
    : (',' IDENT dimensao {Pair pair = new Pair($IDENT.text, $IDENT.line); $nomes.add(pair);})*;

//Identificador pode iniciar com 0 ou mais ^ seguido de um identificador,
//Podendo ou não ter uma dimensão e podendo ou não ser composto de outros identificadores
//separados por virgula

identificador : ponteiros_opcionais IDENT dimensao outros_ident 
                {if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                     Mensagens.erroVariavelNaoExiste($IDENT.text, $IDENT.line);
                     else if (!$outros_ident.id.equals("")) {
                        String var = $IDENT.text + $outros_ident.id;
                        String tipo = pilhaDeTabelas.getVarTipo($IDENT.text);
                        String atr = $outros_ident.id.substring(1);
                        if(!tipos.existeAtributo(tipo, atr))
                            Mensagens.erroVariavelNaoExiste(var, $IDENT.line);
                    }
                    };

//ponteiros_opcionais são compostos por zero ou mais ^

ponteiros_opcionais returns [String ponteiros]
@init {$ponteiros = "";}
    : ('^'{$ponteiros += "^";})*;

//outros_ident permite a separação dos identificadores por virgula

outros_ident returns [String id, String type]
@init {$id = ""; $type = "";}
    : ('.' ponteiros_opcionais IDENT dimensao {$id += "." + $IDENT.text; 
                                               $type = pilhaDeTabelas.getTypeData($IDENT.text);})*;

//Define a dimensão sendo zero ou mais sequencidas de [expressão]

dimensao : ('[' exp_aritmetica ']')*;

//Tipo é definido como um registro ("registro" v1, v2 ... "fim registro") ou
// um ponteiro (^) seguido de um tipo básico

tipo returns [String tipodado, List<Pair> atributos]
    : registro {$tipodado = "registro"; $atributos = $registro.atributos;}| tipo_estendido {$tipodado = $tipo_estendido.tipodado;};

//mais identificadores composto de ',' e outro identificador

mais_ident : (',' identificador)* ;


//Define as palavres reservadas para um tipo basico

tipo_basico returns [String tipodado]
    : 'literal' {$tipodado = "literal";}| 'inteiro' {$tipodado = "inteiro";}
    | 'real' {$tipodado = "real";}| 'logico' {$tipodado = "logico";};

//Define um tipo basico ou um identificador

tipo_basico_ident returns [String tipodado]
    : tipo_basico {$tipodado = $tipo_basico.tipodado;}
    | IDENT {$tipodado = $IDENT.text;
             if(!tipos.existeTipo($IDENT.text))
                Mensagens.erroTipoNaoExiste($IDENT.text, $IDENT.line);};

//tipo estendido é definido como um ponteiro seguido de um identificador de tipo básico

tipo_estendido returns [String tipodado]
    : ponteiros_opcionais tipo_basico_ident {$tipodado = $tipo_basico_ident.tipodado + $ponteiros_opcionais.ponteiros;};

//valor constante pode ser composto por verdadeiro ou falso ou uma cadeia ou um numero real ou inteiro

valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

//registro é composto pela palavra reservada "registro" seguido de uma ou mais variáveis e
//finalizado pela palavra reservada "fim_registro"

registro returns [List<Pair> atributos]
@init { $atributos = new ArrayList<Pair>();}
    : 'registro' (variavel_registro {$atributos.addAll($variavel_registro.atributos);})+ 'fim_registro';


variavel_registro returns [List<Pair> atributos]
@init { $atributos = new ArrayList<Pair>();}
    : IDENT dimensao mais_var_registro ':' tipo
      {Pair pair = new Pair($IDENT.text, $tipo.tipodado);
       $atributos.add(pair);
       for (String atr : $mais_var_registro.atributos) {
           Pair npair = new Pair(atr, $tipo.tipodado);
           $atributos.add(npair);
           }};

mais_var_registro returns [List<String> atributos]
@init { $atributos = new ArrayList<String>();}
    : (',' IDENT dimensao {$atributos.add($IDENT.text);})*;

//Uma declaração é composta por "procedimento nome_procedimento (parametros)" seguido de 
//declarações e comandos terminado pela palavra reservada "fim_procedimento" ou
//composta por "funcao nome_funcao (parametros) :" seguido de um tipo estendido, 
//declarações e comandos, sendo terminado por "fim_funcao"

declaracao_global : 'procedimento' IDENT 
                    {pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "void", "procedimento");
                     pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento_"+$IDENT.text));}
                    '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
                    {pilhaDeTabelas.desempilhar();}
                  | 'funcao' IDENT 
                    {pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "", "funcao");
                     pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao_"+$IDENT.text));}
                    '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao'
                    {pilhaDeTabelas.desempilhar();};

//parametro opcional é formado por parametro

parametros_opcional : parametro | ;

//parametro é formado por uma variavel opcional, um ou mais indentificadores seguido de ":"
//e um tipo estendido seguido de mais parametros

parametro : var_opcional ident_param mais_id_param ':' tipo_estendido 
            {pilhaDeTabelas.topo().adicionarSimbolo($ident_param.param, $tipo_estendido.tipodado, "parametro");} mais_parametros;

ident_param returns [String param]
    : ponteiros_opcionais IDENT {$param = $IDENT.text;} dimensao outros_ident;

mais_id_param : (',' ident_param)* ;

//var opcional é definido como a palavra reservada "var"

var_opcional : 'var' | ;

//mais parametros permite separar os parametros por virgula

mais_parametros : ',' parametro | ;

//declarações locais são compostas por uma ou mais declarações locais

declaracoes_locais : declaracao_local*;

//um corpo é formado por uma ou mais declarações locais seguida de um ou mais comandos

corpo : declaracoes_locais comandos;

//Define que os commandos devem possuir ao menos uma instrução e podem ser seguidos de mais
//instruções

comandos : cmd comandos | ;

//Define todas as instruções da linguagem e os seus formatos

cmd : 'leia' '(' identificador mais_ident ')'
    | 'escreva' '(' expressao mais_expressao ')'
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    | 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
    | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    | 'faca' comandos 'ate' expressao
    | '^' IDENT outros_ident dimensao '<-' expressao
    | IDENT chamada
    | IDENT atribuicao {if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                            Mensagens.erroVariavelNaoExiste($IDENT.text, $IDENT.line);
                        if(!$atribuicao.compativel && !$atribuicao.type.equals("") && !pilhaDeTabelas.getTypeData($IDENT.text).equals($atribuicao.type)){
                            if(!(pilhaDeTabelas.getTypeData($IDENT.text).equals("real") && $atribuicao.type.equals("inteiro")) && pilhaDeTabelas.existeSimbolo($IDENT.text)){
                                Mensagens.erroVariavelNaoCompativel($IDENT.text, $IDENT.line);
                            }
                            }
                        }
      
    | r = 'retorne' expressao { if(!pilhaDeTabelas.topo().getType().equals("funcao"))
                                    Mensagens.escopoNaoPermitido($r.line);};

//Permite que exista mais de uma expressão, separando-as por vírgula

mais_expressao : (',' expressao)* ;

//Define o comando senao que deve ser acompanhado ou não por outros comandos

senao_opcional : 'senao' comandos | ;

//chamada de atribuição é composta por argumentos opcionais entre parenteses ou
//um ou mais identificador podendo ou não ser mais dimensões seguido de "<-" expressão

chamada : '(' argumentos_opcional ')';

atribuicao returns [boolean compativel, String type]
@init {$type = "";}
    : outros_ident dimensao '<-' expressao {if($outros_ident.type.equals("")){
                                                $compativel = $expressao.compativel; $type = $expressao.type;
                                                }else{
                                                if(!$outros_ident.type.equals($expressao.type))
                                                    $compativel = false; $type = $outros_ident.type;
                                             }};

//argumento opcional é composto por uma ou mais expressões

argumentos_opcional : expressao mais_expressao | ;

//selação é composta por uma constante seguida de : comandos e seleção

selecao : constantes ':' comandos mais_selecao;

//mais selação é composta por uma selação (definida acima)

mais_selecao : selecao | ;

//Constantes são definidas como um intervalo no formato numero..numero e mais constantes separadas
//por virgula

constantes : numero_intervalo mais_constantes;

//mais constantes permite separar as constantes por virgula

mais_constantes : ',' constantes | ;

//definida por um operador unário ou não seguido de um numero inteiro e um intervalo operacional (..)

numero_intervalo : op_unario NUM_INT intervalo_opcional;

//intervalo opcional é composto por ".." seguido ou não de um op_unario e seguido de um numero
//inteiro

intervalo_opcional : '..' op_unario NUM_INT | ;

//Define o op_unario como "-"

op_unario : '-' | ;

//Expressẽos aritiméticas são compostas por um ou mais termos separados por virgulas

exp_aritmetica returns [boolean compativel, String type]
@init {$compativel = false; $type = ""; }
    : termo outros_termos {if(!$outros_termos.type.equals("") && !$termo.type.equals($outros_termos.type)){
                                $compativel = false;
                                $type = $outros_termos.type;
                           }else{
                                $compativel = false; 
                                $type = $termo.type;};};
//Define as operaçẽs de multiplicação com sendo multiplicação e divisão

op_multiplicacao : '*' | '/';

//Define as operações de adição como sendo soma e subtração

op_adicao : '+' | '-';

//Termo é composto por um ou mais fatores separados por virgula

termo returns [String type] : fator outros_fatores {$type = $fator.type;};

//outros termos é composto por uma operação de soma ou subtração seguida de um ou mais termos
//separados por virgula

outros_termos returns [String type]
@init {$type = "";}
    : (op_adicao termo {$type = $termo.type;})*;

//fator é uma ou mais parecelas separadas por virgula

fator returns [String type]
    : parcela outras_parcelas {$type = $parcela.type;};

//outros fatores é composto por operações de multiplicação ou divisão e um ou mais fatores separados
//por virgula

outros_fatores : (op_multiplicacao fator)*;

//parecela é composta por um operador unario seguido de uma parecela unária ou
//seguido por uma parecela não unária

parcela returns [String type]
    : op_unario parcela_unario {$type = $parcela_unario.type;}
    | parcela_nao_unario {$type = $parcela_nao_unario.type;};

//parcela_unario é composta de um ponteiro (^) seguido de um identificador podendo ou não ter 
//uma dimensão ou
//um identificador seguido de uma chamada *** ou
//um número inteiro ou
//um número real ou
//uma expressão entre parenteses

parcela_unario returns [String type]
@init {$type = "";}
    : '^' IDENT outros_ident dimensao {$type = $outros_ident.type;} 
    | IDENT chamada_partes {if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                                Mensagens.erroVariavelNaoExiste($IDENT.text+$chamada_partes.id, $IDENT.line);
                            $type = pilhaDeTabelas.getTypeData($IDENT.text);}
    | NUM_INT {$type = "inteiro";}
    | NUM_REAL {$type = "real";}
    | '(' expressao ')'; //{$type = $expressao.type;};

//Parcela não unario é composta pela operação AND seguida de um ou mais identificadores separados
//por vírgula, podendo ou não ter uma dimensão.
//também pode ser composto por uma sequencia de caracteres diferentes de \n ou \r

parcela_nao_unario returns [String type]
    : '&' IDENT outros_ident dimensao {$type = $outros_ident.type;}
    | CADEIA {$type = "literal";};

//Composto pela operação modulo seguida de uma ou mais parcelas separadas por vírgula

outras_parcelas : ('%' parcela)*;

//chamada partes é definida por uma ou mais expressões separadas por vírgula entre parentes ou
// por identificadores, também separados por virgulas podendo ou não ter alguma dimensão

chamada_partes returns [String id]
@init {$id = "";}
    : '(' expressao mais_expressao ')' | outros_ident dimensao {$id = $outros_ident.id;}| ;

//Define a expressão relacinal como uma expressão aritimética seguida de um operadr opcional ou não

exp_relacional returns [boolean compativel, String type]
    : exp_aritmetica op_opcional {if($op_opcional.type.equals("")){
                                        $compativel = $exp_aritmetica.compativel; $type = $exp_aritmetica.type;
                                   }else{
                                        $compativel = true; $type = $op_opcional.type;
                                   }
                                  };

//Diz que uma op_opcional é uma operação relacional seguida de uma expressão aritimética

op_opcional returns [String type, boolean compativel]
@init {$type = ""; $compativel = true;}
    : op_relacional exp_aritmetica {$type = "logico";}
    | ;

//Define as expressões relacionais

op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';

//Expressão é composta por um termo lógico seguido ou não de outros termos lógicos

expressao returns [boolean compativel, String type]
    : termo_logico outros_termos_logicos {$compativel = $termo_logico.compativel; $type = $termo_logico.type;};

//op_nao pode ser nao ou vazio

op_nao : 'nao' | ;

//Um termo lógico é composto por um ou mais fatores lógicos separados por virgula

termo_logico returns [boolean compativel, String type]
    : fator_logico outros_fatores_logicos {$compativel = $fator_logico.compativel; $type = $fator_logico.type;};

//outros termos lógicos são compostos pela operação OR seguida de um ou mais termos lógicos separados
//por virgula

outros_termos_logicos : 'ou' termo_logico outros_termos_logicos | ;

//outros fatores lógicos é composto pela operação AND seguida por um ou mais fatores lógicos
//separados por virgula

outros_fatores_logicos : 'e' fator_logico outros_fatores_logicos | ;

//fator_logico é uma parecela lógica, negada ou não (pos op_nao leva à vazio)

fator_logico returns [boolean compativel, String type]
    : op_nao parcela_logica {$compativel = $parcela_logica.compativel; $type = $parcela_logica.type;};

//Parcela_logica pode ser verdadeira, falsa ou uma expressão relacional

parcela_logica returns [boolean compativel, String type]
    : 'verdadeiro' {$compativel = false; $type = "logico";}
    | 'falso' {$compativel = false; $type = "logico";}
    | exp_relacional {$compativel = $exp_relacional.compativel; $type = $exp_relacional.type;};

//Identificador, inicia com letras ou underscore seguido zero ou mais letras, numeros
//ou underscore

IDENT : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

IDENT_ERRADO : '[' IDENT ')' {stop("Linha "+getLine()+": erro sintatico proximo a )");};

//Sequência de um ou mais numeros entre 0 e 9

NUM_INT : ('0'..'9')+;

NUM_ERRADO : ('0'..'9')+ ('a'..'z' | 'A'..'Z' | '_')+ 
             {String variavel = getText().replaceAll("[0-9]","");
              stop("Linha "+getLine()+": erro sintatico proximo a " + variavel);};

//Inicia com um número entre 0 e 9 seguido de quantos números quiser, mas deve haver
//ao menos um, seguido de um ponto e outra sequencia de números entre 0 ou 9 tendo ao menos
//um número

NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+;

//Todos os caracteres que não são quebra de linha ou "retorno do cursor"

CADEIA : '"' ~('\n' | '\r' | '"')* '"';

//CADEIA_ERRADA : '"' ~('\n' | '\r' | '"')* '\n'
  //              { stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");
                 
//Tudo entre {} 

COMENTARIO : '{' (~'}')* '}' {skip();};

ESPACO : ( ' ' |'\t' | '\r' | '\n') {skip();};

COMENTARIO_ERRADO
    : '{' ~('\r'|'\n'|'}')* '\n' 
      { stop("Linha "+getLine()+": comentario nao fechado"); }
    ;
ERROR
    : . { stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); }
    ;