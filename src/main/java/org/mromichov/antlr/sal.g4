grammar sal;

start       :       algorithm* EOF;

algorithm   :       algorithmDeclaration block ;

algorithmDeclaration
            :       ALG (TYPE)? algorithmName '('? ARG? parameterList? ')'?
            ;

algorithmName
            :       ID
            ;

parameterList
            :        parameter (',' parameter)*
            ;

parameter   :       TYPE ID
            ;

statement   :       variableDeclaration
            |       assignment
            |       print
            |       ifStatement
            |       expression
            ;

ifStatement :       IF condition THEN ifBlock elseStatement? ALL
            ;

elseStatement
            :       ELSE ifBlock
            ;

condition
            :       expression comparisonSign expression
            |       expression
            ;

ifBlock     :       statement*
            ;

block       :       BEGIN statement* algorithmReturn? END
            ;

algorithmReturn:    VAL ASSIGN expression            ;
variableDeclaration
            :       TYPE ID ASSIGN expression        ;
assignment  :       ID ASSIGN expression             ;
print       :       PRINT ID (',' NEXTLINE)*         ;
algorithmCall
            :       algorithmName LPAREN argumentList? RPAREN
            ;
argumentList:       argument (',' argument)*         ;
argument    :       expression                       ;

expression
    : t1=term (termSign t2=term)*
    ;

term
    : a1=atom (atomSign a2=atom)*
    ;
atom        :       algorithmCall  #Algorithm_Call
            |       ID #VariableReference
            |       NUMBER #Number
            |       DNUMBER #DoubleNumber
            |       STRING #String
            |       LPAREN expression RPAREN #ParenExpression
            ;

termSign
    : PLUS
    | MINUS
    ;

atomSign
    : TIMES
    | DIV
    ;

comparisonSign
    : EQ
    | NE
    | GT
    | LT
    | GE
    | LE
    ;

ALG         :       '\u0430\u043b\u0433'             ;                               // алг
ARG         :       '\u0430\u0440\u0433'             ;                               // арг
BEGIN       :       '\u043d\u0430\u0447'             ;                               // нач
END         :       '\u043a\u043e\u043d'             ;                               // кон
VAL         :       '\u0437\u043d\u0430\u0447'       ;                               // знач

IF          :       '\u0435\u0441\u043b\u0438'       ;                               // если
THEN        :       '\u0442\u043e'                   ;                               // то
ELSE        :       '\u0438\u043d\u0430\u0447\u0435' ;                               // иначе
ALL         :       '\u0432\u0441\u0435'                                             // все
            |       '\u0432\u0441\u0451'                                             // всё
            ;

EQ          :       '='                              ;
NE          :       '<>'                             ;
GT          :       '>'                              ;
LT          :       '<'                              ;
GE          :       '>='                             ;
LE          :       '<='                             ;

TYPE        :       '\u0446\u0435\u043b'                                             // цел
            |       '\u0432\u0435\u0449'                                             // вещ
            |       '\u0441\u0438\u043c'                                             // сим
            |       '\u043b\u0438\u0442'                                             // лит
            |       '\u043b\u043e\u0433'                                             // лог
            ;

PRINT       :       '\u0432\u044b\u0432\u043e\u0434' ;                               // вывод
NEXTLINE    :       '\u043d\u0441' ;                                                 // нс — перевод каретки на новую строку
ID          :       [\u0430-\u044f\u0410-\u042fa-zA-Z_][\u0430-\u044f\u0410-\u042fa-zA-Z0-9_]* ; // [а-яА-Я_][а-яА-Я0-9_]*
ASSIGN      :       ':='                             ;
LPAREN      :       '('                              ;
RPAREN      :       ')'                              ;
PLUS        :       '+' ;
MINUS       :       '-' ;
TIMES       :       '*' ;
DIV         :       '/' ;
NUMBER      :       [0-9]+ ; //TODO сделать отрицательные числа NUMBER и DNUMBER
DNUMBER     :       [0-9]+ '.' [0-9]+;
STRING      :       '"'~('\r' | '\n' | '"')*'"' ;
WS          :       [ \n\r\t]+ -> skip ;