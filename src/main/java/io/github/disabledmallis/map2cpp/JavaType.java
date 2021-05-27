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

	Primitives primitiveForm;
	MappingString classPath;

	public JavaType(String fromMapped) {
		Primitives primF = Primitives.jobject;
		for(Primitives prim : Primitives.values()) {
			if(prim.getRepMap() == fromMapped.charAt(0)) {
				primF = prim;
				break;
			}
		}

		primitiveForm = primF;
		if(primF == Primitives.jobject) {
			classPath = new MappingString(fromMapped.substring(0, fromMapped.length()-1));
		}
	}

	public String getCppType() {
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
