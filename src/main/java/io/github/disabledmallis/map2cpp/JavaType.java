package io.github.disabledmallis.map2cpp;

import io.github.disabledmallis.map2cpp.mapping.MappingString;

public class JavaType {

	//Primitive java types
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
		public boolean equals(Primitives other) {
			return this.getRep()==other.getRep();
		}
	}

	//Primitive types represented as JavaTypes
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

		// [ indicates an array, we should handle that.
		if(fromMapped.charAt(0) == '[') {
			isArray = true;
			fromMapped = fromMapped.substring(1);
		}

		//Search for the type's primitive
		for(Primitives prim : Primitives.values()) {
			if(prim.getRepMap() == fromMapped.charAt(0)) {
				primF = prim;
				break;
			}
		}

		primitiveForm = primF;
		//If its an object, save the classpath without the L or ;
		if(primF.equals(Primitives.jobject)) {
			classPath = new MappingString(fromMapped.substring(1, fromMapped.length()-1));
		}
	}

	public boolean isArray() {
		return this.isArray;
	}
	public Primitives getPrimitiveForm() {
		return this.primitiveForm;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof JavaType) {
			JavaType otherType = (JavaType) other;
			if(this.getPrimitiveForm().equals(Primitives.jobject)) {
				return this.isArray() == otherType.isArray() && this.getClasspath().equals(otherType.getClasspath());
			}
			else {
				if(this.getPrimitiveForm().equals(otherType.getPrimitiveForm())) {
					return this.isArray() == otherType.isArray();
				}
			}
		}
		return super.equals(other);
	}

	//Returns the classpath, must be an Object to work, otherwise its null.
	public MappingString getClasspath() {
		return classPath;
	}

	//Get the primitive name back.
	public String getPrimitiveName() {
		if(primitiveForm.equals(Primitives.jobject)) {
			return "L"+getClasspath().getFullName()+";";
		}
		return ""+primitiveForm.getRepMap();
	}

	//Get the C++ equivelant.
	public String getCppType() {
		//Add another pointer (*) if its an array
		return getCppTypeHelper() + (isArray ? "*" : "");
	}
	//I'm lazy
	private String getCppTypeHelper() {
		switch(primitiveForm) {
			case jobject:
				// Objects should be classname pointers so when their 
				// header is included, it can function as expected for the developer.
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
		//Can't figure out what it is? Fuck it, guess its a void pointer
		return "void*";
	}
}
