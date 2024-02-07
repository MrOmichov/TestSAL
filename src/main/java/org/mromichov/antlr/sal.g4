grammar sal;

start       :       ( variableDeclaration | assignment | print )* EOF;

variableDeclaration
            :       TYPE ID ASSIGN expression        ;
assignment  :       ID ASSIGN expression             ;
print       :       PRINT ID (',' NEXTLINE)*         ;

expression  :       t1=term
            (   '+' t2=term
            |   '-' t2=term)*
            ;
term        :       a1=atom
            (   '*' a2=atom
            |   '/' a2=atom)*
            ;
atom        :       value
            |       '(' expression ')'
            ;
value       :       NUMBER
            |       STRING
            |       ID
            ;

TYPE        :       '\u0446\u0435\u043b'                                             // цел
            |       '\u043b\u0438\u0442' ;                                           // лит
PRINT       :       '\u0432\u044b\u0432\u043e\u0434' ;                               // вывод
NEXTLINE    :       '\u043d\u0441' ;                                                 // нс — перевод каретки на новую строку
ID          :       [\u0430-\u044f\u0410-\u042f_][\u0430-\u044f\u0410-\u042f0-9_]* ; // [а-яА-Я_][а-яА-Я0-9_]
ASSIGN      :       ':='
            ;
NUMBER      :       [0-9]+ ;
STRING      :       '"'~('\r' | '\n' | '"')*'"' ;
WS          :       [ \n\r\t]+ -> skip ;