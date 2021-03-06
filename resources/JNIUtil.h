#ifndef JNIUTIL
#define JNIUTIL

#include "jni.h"

#ifndef hJNI_GetCreatedJavaVMs
typedef jint(*hJNI_GetCreatedJavaVMs)(JavaVM** vmBuf, jsize bufLen, jsize* nVMs);
hJNI_GetCreatedJavaVMs oJNI_GetCreatedJavaVMs;
#endif

// Get JNIEnv from the jvm dll & its exports
auto getJNI() -> JNIEnv*
{
	JavaVM* jvm;
	JNIEnv* jenv;

	HMODULE jvmHandle = GetModuleHandleA("jvm.dll");
	hJNI_GetCreatedJavaVMs oJNI_GetCreatedJavaVMs = (hJNI_GetCreatedJavaVMs)GetProcAddress(jvmHandle, "JNI_GetCreatedJavaVMs");
	oJNI_GetCreatedJavaVMs(&jvm, 1, nullptr);
	jvm->AttachCurrentThread((void**)&jenv, NULL);
	return jenv;
}

/* Generic Minecraft classloader, should work across versions 1.7.10-latest because they share the same launch wrapper??? */
auto getClassLoader(JNIEnv* env) -> jobject
{
	jclass launch = env->FindClass("net/minecraft/launchwrapper/Launch");
	jfieldID sfid = env->GetStaticFieldID(launch, "classLoader", "Lnet/minecraft/launchwrapper/LaunchClassLoader;");
	jobject classLoader = env->GetStaticObjectField(launch, sfid);

	return classLoader;
}

// Find a class from the environment
auto jclassfindClass(JNIEnv* env, const char* className) -> jclass
{
	jstring name = env->NewStringUTF(className);
	jobject classLoader = getClassLoader(env);
	jmethodID mid = env->GetMethodID(env->GetObjectClass(classLoader), "findClass", "(Ljava/lang/String;)Ljava/lang/Class;");
	return (jclass)env->CallObjectMethod(classLoader, mid, name);
	env->DeleteLocalRef(name);
}

#endif /* JNIUTIL */
