// Generated from Mapping.g4 by ANTLR 4.9.1

package io.github.disabledmallis.map2cpp.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7;
	public static final int
		RULE_mappingFile = 0, RULE_classMap = 1, RULE_fieldMap = 2, RULE_methodMap = 3, 
		RULE_methodParams = 4, RULE_dataType = 5, RULE_unmappedName = 6, RULE_mappedName = 7, 
		RULE_name = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"mappingFile", "classMap", "fieldMap", "methodMap", "methodParams", "dataType", 
			"unmappedName", "mappedName", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CLASS '", "' '", "'FIELD '", "'METHOD '", "'('", "';'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mapping.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MappingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MappingFileContext extends ParserRuleContext {
		public List<ClassMapContext> classMap() {
			return getRuleContexts(ClassMapContext.class);
		}
		public ClassMapContext classMap(int i) {
			return getRuleContext(ClassMapContext.class,i);
		}
		public List<FieldMapContext> fieldMap() {
			return getRuleContexts(FieldMapContext.class);
		}
		public FieldMapContext fieldMap(int i) {
			return getRuleContext(FieldMapContext.class,i);
		}
		public List<MethodMapContext> methodMap() {
			return getRuleContexts(MethodMapContext.class);
		}
		public MethodMapContext methodMap(int i) {
			return getRuleContext(MethodMapContext.class,i);
		}
		public MappingFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterMappingFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitMappingFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitMappingFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingFileContext mappingFile() throws RecognitionException {
		MappingFileContext _localctx = new MappingFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mappingFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(18);
				classMap();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(24);
				fieldMap();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(30);
				methodMap();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMapContext extends ParserRuleContext {
		public UnmappedNameContext unmappedName() {
			return getRuleContext(UnmappedNameContext.class,0);
		}
		public MappedNameContext mappedName() {
			return getRuleContext(MappedNameContext.class,0);
		}
		public ClassMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterClassMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitClassMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitClassMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMapContext classMap() throws RecognitionException {
		ClassMapContext _localctx = new ClassMapContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			unmappedName();
			setState(38);
			match(T__1);
			setState(39);
			mappedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldMapContext extends ParserRuleContext {
		public UnmappedNameContext unmappedName() {
			return getRuleContext(UnmappedNameContext.class,0);
		}
		public MappedNameContext mappedName() {
			return getRuleContext(MappedNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public FieldMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterFieldMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitFieldMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitFieldMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldMapContext fieldMap() throws RecognitionException {
		FieldMapContext _localctx = new FieldMapContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			unmappedName();
			setState(43);
			match(T__1);
			setState(44);
			mappedName();
			setState(45);
			match(T__1);
			setState(46);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodMapContext extends ParserRuleContext {
		public UnmappedNameContext unmappedName() {
			return getRuleContext(UnmappedNameContext.class,0);
		}
		public MappedNameContext mappedName() {
			return getRuleContext(MappedNameContext.class,0);
		}
		public MethodParamsContext methodParams() {
			return getRuleContext(MethodParamsContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MethodMapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodMap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterMethodMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitMethodMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitMethodMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodMapContext methodMap() throws RecognitionException {
		MethodMapContext _localctx = new MethodMapContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			unmappedName();
			setState(50);
			match(T__1);
			setState(51);
			mappedName();
			setState(52);
			match(T__1);
			setState(53);
			methodParams();
			setState(54);
			match(T__1);
			setState(55);
			dataType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodParamsContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public MethodParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterMethodParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitMethodParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitMethodParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParamsContext methodParams() throws RecognitionException {
		MethodParamsContext _localctx = new MethodParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					dataType();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(64);
				match(T__5);
				setState(65);
				dataType();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnmappedNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UnmappedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unmappedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterUnmappedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitUnmappedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitUnmappedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnmappedNameContext unmappedName() throws RecognitionException {
		UnmappedNameContext _localctx = new UnmappedNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unmappedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappedNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MappedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterMappedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitMappedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitMappedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappedNameContext mappedName() throws RecognitionException {
		MappedNameContext _localctx = new MappedNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mappedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingListener ) ((MappingListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingVisitor ) return ((MappingVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(79);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tW\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\6\3\6\7"+
		"\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\nS\n\n\r"+
		"\n\16\nT\3\n\3T\2\13\2\4\6\b\n\f\16\20\22\2\2\2S\2\27\3\2\2\2\4&\3\2\2"+
		"\2\6+\3\2\2\2\b\62\3\2\2\2\n;\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20O\3\2\2"+
		"\2\22R\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2"+
		"\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 "+
		"\"\5\b\5\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2"+
		"\2&\'\7\3\2\2\'(\5\16\b\2()\7\4\2\2)*\5\20\t\2*\5\3\2\2\2+,\7\5\2\2,-"+
		"\5\16\b\2-.\7\4\2\2./\5\20\t\2/\60\7\4\2\2\60\61\5\f\7\2\61\7\3\2\2\2"+
		"\62\63\7\6\2\2\63\64\5\16\b\2\64\65\7\4\2\2\65\66\5\20\t\2\66\67\7\4\2"+
		"\2\678\5\n\6\289\7\4\2\29:\5\f\7\2:\t\3\2\2\2;?\7\7\2\2<>\5\f\7\2=<\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@F\3\2\2\2A?\3\2\2\2BC\7\b\2\2CE\5"+
		"\f\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7"+
		"\t\2\2J\13\3\2\2\2KL\5\22\n\2L\r\3\2\2\2MN\5\22\n\2N\17\3\2\2\2OP\5\22"+
		"\n\2P\21\3\2\2\2QS\13\2\2\2RQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2TR\3\2\2\2U\23"+
		"\3\2\2\2\b\27\35#?FT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}