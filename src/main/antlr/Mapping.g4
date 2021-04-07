grammar Mapping;


classMap
	: 'CLASS' unmappedName mappedName
	;
fieldMap
	: 'FIELD' unmappedName mappedName dataType
	;
methodMap
	: 'METHOD' unmappedName mappedName dataType
	;

dataType : name;
unmappedName : name;
mappedName : name;

name : .+?;

WHITESPACE : [ \t\r\n] -> skip;