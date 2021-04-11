grammar Mapping;

@header {
package io.github.disabledmallis.map2cpp.antlr;
}


mappingFile
	: classMap* fieldMap* methodMap*
	;

classMap
	: 'CLASS ' unmappedName ' ' mappedName
	;
fieldMap
	: 'FIELD ' unmappedName ' ' mappedName ' ' dataType
	;
methodMap
	: 'METHOD ' unmappedName ' ' mappedName ' ' methodParams ' ' dataType
	;
methodParams
	: '(' dataType* (';' dataType)* ')'
	;

dataType : name;
unmappedName : name;
mappedName : name;

name : .+?;