grammar Mapping;


classMap
	: 'CLASS' unmappedName mappedName
	;
fieldMap
	: 'FIELD' unmappedName mappedName dataType
	;
methodMap
	: 'METHOD' unmappedName mappedName methodParams dataType
	;
methodParams
	: '(' dataType* (';' dataType)* ')'
	;

dataType : name;
unmappedName : name;
mappedName : name;

name : .+?;

TERMINATOR : ' ' -> skip;
WHITESPACE : [\t\r\n] -> skip;