package io.github.disabledmallis.map2cpp;

public class JNIHelper {
	// Diff primitives have their own JNI calls, we need to use these properly
	public static String getProperFieldAccessCall(JavaType retType) {
		switch(retType.primitiveForm) {
			case jobject:
				return "GetObjectField";
			case jboolean:
				return "GetBooleanField";
			case jbyte:
				return "GetByteField";
			case jchar:
				return "GetCharField";
			case jdouble:
				return "GetDoubleField";
			case jfloat:
				return "GetFloatField";
			case jint:
				return "GetIntField";
			case jlong:
				return "GetLongField";
			case jshort:
				return "GetShortField";
		}
		return null;
	}
}
