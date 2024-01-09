grammar sal;

start       :       ( assignment | print )* EOF;

assignment  :       TYPE ID ASSIGN value  ;
print       :       PRINT ID              ;
value       :       NUMBER
            |       STRING
            ;

TYPE        :       '\u0446\u0435\u043b'                                             //цел
            |       '\u043b\u0438\u0442' ;                                           //лит
PRINT       :       '\u0432\u044b\u0432\u043e\u0434' ;                               //вывод
ID          :       [\u0430-\u044f\u0410-\u042f_][\u0430-\u044f\u0410-\u042f0-9_]* ; // [а-яА-Я_][а-яА-Я0-9_]
ASSIGN      :       ':='
            ;
NUMBER      :       [0-9]+ ;
STRING      :       '"'.*'"' ;
WS          :       [ \n\r\t]+ -> skip ;