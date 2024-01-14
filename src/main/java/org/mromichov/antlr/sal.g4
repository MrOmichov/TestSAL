grammar sal;

start                  :       algorithm* EOF                     ;
algorithm              :       algorithmDeclaration '\u043d\u0430\u0447' blockStatement* '\u043a\u043e\u043d'     ; // нач кон
algorithmDeclaration   :       '\u0430\u043b\u0433' TYPE? algorithmName* ('(' algorithmArgument (',' algorithmArgument)* ')')* ; // алг
algorithmName          :       ID ;
algorithmArgument      :       '\u0430\u0440\u0433' TYPE ID       ; // арг
blockStatement         :       variableDeclaration
                       |       printStatement
                       |       algorithmCall
                       ;
variableDeclaration    :       TYPE name ASSIGN expression          ;
printStatement         :       PRINT (NEXTLINE | expression) (',' (NEXTLINE | expression))*          ;
algorithmCall          :       algorithmName ('(' expressionList ')')*        ;

expressionList : expression (',' expression)* ;
expression :
            varReference
           | value
           | algorithmCall
           |  '('expression '*' expression')'
           | expression '*' expression
           | '(' expression '/' expression ')'
           | expression '/' expression
           | '(' expression '+' expression ')'
           | expression '+' expression
           | '(' expression '-' expression ')'
           | expression '-' expression
           ;
name       : ID ;
varReference : ID ;
value : NUMBER
      | STRING ;



TYPE        :       '\u0446\u0435\u043b'                                             // цел
            |       '\u0432\u0435\u0449'                                             // вещ
            |       '\u043b\u043e\u0433'                                             // лог
            |       '\u0441\u0438\u043c'                                             // сим
            |       '\u043b\u0438\u0442'                                             // лит
            ;
PRINT       :       '\u0432\u044b\u0432\u043e\u0434' ;                               // вывод
NEXTLINE    :       '\u043d\u0441' ;                                                 // нс — перевод каретки на новую строку
ID          :       [\u0430-\u044f\u0410-\u042f_][\u0430-\u044f\u0410-\u042f0-9_]* ; // [а-яА-Я_][а-яА-Я0-9_]
ASSIGN      :       ':='
            ;
NUMBER      :       [0-9]+ ;
STRING      :       '"'~('\r' | '\n' | '"')*'"' ;
WS          :       [ \n\r\t]+ -> skip ;