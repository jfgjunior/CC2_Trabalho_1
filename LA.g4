grammar LA;

@members{
static String grupo = "<489131, 489468, 408620>";
PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
}

//Programa é composto por declarações definidas abaixo, palavra reservada algoritmo
//um corpo que também é definido abaixo e termina com a palavra reservada fim_algoritmo
programa : declaracoes 'algoritmo' corpo 'fim_algoritmo';

//Declaração é formada por uma declaração global seguida de uma delcaração ou vazio
declaracoes : decl_local_global declaracoes | ;

//Define a decl_local_global sendo uma delcaração local ou global
decl_local_global : declaracao_local | declaracao_global;

//A declaração local é composta por a palavra reservada "declare" seguida da variável ou
//pela palavre reservada "constante" seguida de um identificador, dois pontos, um tipo e uma constante
//ou pela palavra reservada "tipo" seguida de um identificador, dois pontos e o tipo
declaracao_local : 'declare' variavel 
                 | 'constante' IDENT ':' tipo_basico '=' valor_constante
                 | 'tipo' IDENT ':' tipo;

//uma variável é do tipo "nome[expressão]" ou "nome" seguido de dois pontos e o tipo
variavel : IDENT dimensao mais_var ':' tipo;

//Permite que seja declarada mais de uma variável do mesmo tipo separando por virgulas
mais_var : ',' IDENT dimensao mais_var | ;

//Identificador pode iniciar com 0 ou mais ^ seguido de um identificador,
//Podendo ou não ter uma dimensão e podendo ou não ser composto de outros identificadores
//separados por virgula
identificador : ponteiros_opcionais IDENT dimensao outros_ident;

//ponteiros_opcionais são compostos por zero ou mais ^
ponteiros_opcionais : '^' ponteiros_opcionais | ;

//outros_ident permite a separação dos identificadores por virgula
outros_ident : '.' identificador | ;

//Define a dimensão sendo zero ou mais sequencidas de [expressão]
dimensao : '[' exp_aritmetica ']' dimensao | ;


tipo : registro | tipo_estendido;

mais_ident : ',' identificador mais_ident | ;

mais_variaveis : variavel mais_variaveis | ;

tipo_basico : 'literal' | 'inteiro' | 'real' | 'logico' ;

tipo_basico_ident : tipo_basico | IDENT ;

tipo_estendido : ponteiros_opcionais tipo_basico_ident;

valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

registro : 'registro' variavel mais_variaveis 'fim_registro';

declaracao_global : 'procedimento' IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
                  | 'funcao' IDENT '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao';

parametros_opcional : parametro | ;

parametro : var_opcional identificador mais_ident ':' tipo_estendido mais_parametros;

var_opcional : 'var' | ;

mais_parametros : ',' parametro | ;

declaracoes_locais : declaracao_local declaracoes_locais | ;

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
    | '^' IDENT chamada_atribuicao
    | 'retorne' expressao;

//Permite que exista mais de uma expressão, separando-as por vírgula
mais_expressao : ',' expressao mais_expressao | ;


senao_opcional : 'senao' comandos | ;

chamada_atribuicao : '(' argumentos_opcional ')' | outros_ident dimensao '<-' expressao;

argumentos_opcional : expressao mais_expressao | ;

selecao : constantes ':' comandos mais_selecao;

mais_selecao : selecao | ;

constantes : numero_intervalo mais_constantes;

mais_constantes : ',' constantes | ;

numero_intervalo : op_unario NUM_INT intervalo_opcional;

intervalo_opcional : '..' op_unario NUM_INT | ;

op_unario : '-' | ;

exp_aritmetica : termo outros_termos;

op_multiplicacao : '*' | '/';

op_adicao : '+' | '-';

termo : fator outros_fatores;

outros_termos : op_adicao termo outros_termos | ;

fator : parcela outras_parcelas;

outros_fatores : op_multiplicacao fator outros_fatores | ;

parcela : op_unario parcela_unario | parcela_nao_unario;

parcela_unario : '^' IDENT outros_ident dimensao | IDENT chamada_partes | NUM_INT | NUM_REAL | '(' expressao ')';

parcela_nao_unario : '&' IDENT outros_ident dimensao | CADEIA;

outras_parcelas : '%' parcela outras_parcelas | ;

chamada_partes : '(' expressao mais_expressao ')' | outros_ident dimensao | ;


exp_relacional : exp_aritmetica op_opcional;

//Diz que uma op_opcional é uma operação relacional seguida de uma expressão aritimética
op_opcional : op_relacional exp_aritmetica | ;

//Define as expressões relacionais
op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<';

//Expressão é composta por um termo lógico seguido ou não de outros termos lógicos
expressao : termo_logico outros_termos_logicos;

//op_nao pode ser nao ou vazio
op_nao : 'nao' | ;

termo_logico : fator_logico outros_fatores_logicos;

outros_termos_logicos : 'ou' termo_logico outros_termos_logicos | ;


outros_fatores_logicos : 'e' fator_logico outros_fatores_logicos | ;

//fator_logico é uma parecela lógica, negada ou não (pos op_nao leva à vazio)
fator_logico : op_nao parcela_logica;

//Parcela_logica pode ser verdadeira, falsa ou uma expressão relacional
parcela_logica : 'verdadeiro' | 'falso' | exp_relacional;

//Identificador, inicia com letras ou underscore seguido zero ou mais letras, numeros
//ou underscore
IDENT : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

//Sequência de um ou mais numeros entre 0 e 9
NUM_INT : ('0'..'9')+;
//Inicia com um número entre 0 e 9 seguido de quantos números quiser, mas deve haver
//ao menos um, seguido de um ponto e outra sequencia de números entre 0 ou 9 tendo ao menos
//um número
NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+;

//Todos os caracteres que não são quebra de linha ou "retorno do cursor"
CADEIA : '"' ~('\n' | '\r' | '"')* '"';
//Tudo entre {} 
COMENTARIO : '{' .* '}' {skip();};