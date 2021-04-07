// Generated from Mapping.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, WHITESPACE=4;
	public static final int
		RULE_classMap = 0, RULE_fieldMap = 1, RULE_methodMap = 2, RULE_dataType = 3, 
		RULE_unmappedName = 4, RULE_mappedName = 5, RULE_name = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"classMap", "fieldMap", "methodMap", "dataType", "unmappedName", "mappedName", 
			"name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CLASS'", "'FIELD'", "'METHOD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WHITESPACE"
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
		enterRule(_localctx, 0, RULE_classMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			unmappedName();
			setState(16);
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
		enterRule(_localctx, 2, RULE_fieldMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__1);
			setState(19);
			unmappedName();
			setState(20);
			mappedName();
			setState(21);
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
		enterRule(_localctx, 4, RULE_methodMap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__2);
			setState(24);
			unmappedName();
			setState(25);
			mappedName();
			setState(26);
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
		enterRule(_localctx, 6, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
		enterRule(_localctx, 8, RULE_unmappedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
		enterRule(_localctx, 10, RULE_mappedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
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
		enterRule(_localctx, 12, RULE_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(34);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b&\n\b\r\b"+
		"\16\b\'\3\b\3\'\2\t\2\4\6\b\n\f\16\2\2\2#\2\20\3\2\2\2\4\24\3\2\2\2\6"+
		"\31\3\2\2\2\b\36\3\2\2\2\n \3\2\2\2\f\"\3\2\2\2\16%\3\2\2\2\20\21\7\3"+
		"\2\2\21\22\5\n\6\2\22\23\5\f\7\2\23\3\3\2\2\2\24\25\7\4\2\2\25\26\5\n"+
		"\6\2\26\27\5\f\7\2\27\30\5\b\5\2\30\5\3\2\2\2\31\32\7\5\2\2\32\33\5\n"+
		"\6\2\33\34\5\f\7\2\34\35\5\b\5\2\35\7\3\2\2\2\36\37\5\16\b\2\37\t\3\2"+
		"\2\2 !\5\16\b\2!\13\3\2\2\2\"#\5\16\b\2#\r\3\2\2\2$&\13\2\2\2%$\3\2\2"+
		"\2&\'\3\2\2\2\'(\3\2\2\2\'%\3\2\2\2(\17\3\2\2\2\3\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}