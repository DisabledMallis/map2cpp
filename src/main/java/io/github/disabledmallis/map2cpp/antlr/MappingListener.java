// Generated from Mapping.g4 by ANTLR 4.9.1

package io.github.disabledmallis.map2cpp.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MappingParser}.
 */
public interface MappingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MappingParser#mappingFile}.
	 * @param ctx the parse tree
	 */
	void enterMappingFile(MappingParser.MappingFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#mappingFile}.
	 * @param ctx the parse tree
	 */
	void exitMappingFile(MappingParser.MappingFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#classMap}.
	 * @param ctx the parse tree
	 */
	void enterClassMap(MappingParser.ClassMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#classMap}.
	 * @param ctx the parse tree
	 */
	void exitClassMap(MappingParser.ClassMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#fieldMap}.
	 * @param ctx the parse tree
	 */
	void enterFieldMap(MappingParser.FieldMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#fieldMap}.
	 * @param ctx the parse tree
	 */
	void exitFieldMap(MappingParser.FieldMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#methodMap}.
	 * @param ctx the parse tree
	 */
	void enterMethodMap(MappingParser.MethodMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#methodMap}.
	 * @param ctx the parse tree
	 */
	void exitMethodMap(MappingParser.MethodMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodParams(MappingParser.MethodParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#methodParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodParams(MappingParser.MethodParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MappingParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MappingParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#unmappedName}.
	 * @param ctx the parse tree
	 */
	void enterUnmappedName(MappingParser.UnmappedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#unmappedName}.
	 * @param ctx the parse tree
	 */
	void exitUnmappedName(MappingParser.UnmappedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#mappedName}.
	 * @param ctx the parse tree
	 */
	void enterMappedName(MappingParser.MappedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#mappedName}.
	 * @param ctx the parse tree
	 */
	void exitMappedName(MappingParser.MappedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MappingParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MappingParser.NameContext ctx);
}