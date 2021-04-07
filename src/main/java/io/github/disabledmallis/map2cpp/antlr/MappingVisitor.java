// Generated from Mapping.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MappingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MappingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MappingParser#classMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMap(MappingParser.ClassMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#fieldMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMap(MappingParser.FieldMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#methodMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMap(MappingParser.MethodMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#methodParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParams(MappingParser.MethodParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(MappingParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#unmappedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnmappedName(MappingParser.UnmappedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#mappedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappedName(MappingParser.MappedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(MappingParser.NameContext ctx);
}