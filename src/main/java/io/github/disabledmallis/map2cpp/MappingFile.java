package io.github.disabledmallis.map2cpp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.github.disabledmallis.map2cpp.antlr.MappingLexer;
import io.github.disabledmallis.map2cpp.antlr.MappingListener;
import io.github.disabledmallis.map2cpp.antlr.MappingParser;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.ClassMapContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.DataTypeContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.FieldMapContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.MappedNameContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.MappingFileContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.MethodMapContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.MethodParamsContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.NameContext;
import io.github.disabledmallis.map2cpp.antlr.MappingParser.UnmappedNameContext;

public class MappingFile extends File implements MappingListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	MappingFileContext parsed;

	public MappingFile(String path) throws IOException {
		super(path);

		String content = Files.readString(this.toPath());

		// Parser & Lexer contexts
		MappingLexer lexer = new MappingLexer(CharStreams.fromString(content));
		MappingParser parser = new MappingParser(new CommonTokenStream(lexer));
		// Get the script context
		parsed = parser.mappingFile();

		ParseTreeWalker walk = new ParseTreeWalker();
		walk.walk(this, parsed);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMappingFile(MappingFileContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMappingFile(MappingFileContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterClassMap(ClassMapContext ctx) {
		Logger.Log("class "+ctx.mappedName().getText() + " {");
	}

	@Override
	public void exitClassMap(ClassMapContext ctx) {
		Logger.Log("}");
	}

	@Override
	public void enterFieldMap(FieldMapContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFieldMap(FieldMapContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodMap(MethodMapContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodMap(MethodMapContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMethodParams(MethodParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMethodParams(MethodParamsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDataType(DataTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDataType(DataTypeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnmappedName(UnmappedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnmappedName(UnmappedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMappedName(MappedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMappedName(MappedNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterName(NameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitName(NameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	
}
