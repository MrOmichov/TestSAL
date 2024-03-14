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
            |       expression
            ;

block       :       BEGIN statement* END             ;
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

ALG         :       '\u0430\u043b\u0433'             ;                               // алг
ARG         :       '\u0430\u0440\u0433'             ;                               // арг
BEGIN       :       '\u043d\u0430\u0447'             ;                               // нач
END         :       '\u043a\u043e\u043d'             ;                               // кон
TYPE        :       '\u0446\u0435\u043b'                                             // цел
            |       '\u043b\u0438\u0442'             ;                               // лит
PRINT       :       '\u0432\u044b\u0432\u043e\u0434' ;                               // вывод
NEXTLINE    :       '\u043d\u0441' ;                                                 // нс — перевод каретки на новую строку
ID          :       [\u0430-\u044f\u0410-\u042f_][\u0430-\u044f\u0410-\u042f0-9_]* ; // [а-яА-Я_][а-яА-Я0-9_]*
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