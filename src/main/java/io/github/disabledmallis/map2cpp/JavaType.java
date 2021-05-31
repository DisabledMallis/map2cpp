package io.github.disabledmallis.map2cpp;

public class JavaType {

	enum Primitives {
		jboolean('z'),
		jbyte('b'),
		jchar('c'),
		jshort('s'),
		jint('i'),
		jlong('j'),
		jfloat('f'),
		jdouble('d'),
		jobject('l');

		char cRep;
		Primitives(char cRep) {
			this.cRep = cRep;
		}

		//get char representation
		public char getRep() {
			return this.cRep;
		}
		//get char representation that would be seen in a mapping (upper case)
		public char getRepMap() {
			return (""+this.cRep).toUpperCase().charAt(0);
		}
	}

	public static JavaType BOOL = new JavaType("Z");
	public static JavaType BYTE = new JavaType("B");
	public static JavaType CHAR = new JavaType("C");
	public static JavaType SHORT = new JavaType("S");
	public static JavaType INT = new JavaType("I");
	public static JavaType LONG = new JavaType("J");
	public static JavaType FLOAT = new JavaType("F");
	public static JavaType DOUBLE = new JavaType("D");
	public static JavaType OBJECT = new JavaType("Ljava/lang/Object;");

	boolean isArray;
	Primitives primitiveForm;
	MappingString classPath;

	public JavaType(String fromMapped) {
		Primitives primF = Primitives.jobject;
		isArray = false;

		if(fromMapped.charAt(0) == '[') {
			isArray = true;
			fromMapped = fromMapped.substring(1);
		}

		for(Primitives prim : Primitives.values()) {
			if(prim.getRepMap() == fromMapped.charAt(0)) {
				primF = prim;
				break;
			}
		}

		primitiveForm = primF;
		if(primF.equals(Primitives.jobject)) {
			classPath = new MappingString(fromMapped.substring(1, fromMapped.length()-1));
		}
	}

	public MappingString getClasspath() {
		return classPath;
	}

	public String getPrimitiveName() {
		if(primitiveForm.equals(Primitives.jobject)) {
			return "L"+getClasspath().getFullName()+";";
		}
		return ""+primitiveForm.getRepMap();
	}

	public String getCppType() {
		return getCppTypeHelper() + (isArray ? "*" : "");
	}
	private String getCppTypeHelper() {
		switch(primitiveForm) {
			case jobject:
				return "struct " + classPath.getPackagelessName()+"*";
			case jboolean:
				return "bool";
			case jbyte:
				return "char";
			case jchar:
				return "char";
			case jdouble:
				return "double";
			case jfloat:
				return "float";
			case jint:
				return "int";
			case jlong:
				return "long";
			case jshort:
				return "short";
		}
		return "void*";
	}
}
