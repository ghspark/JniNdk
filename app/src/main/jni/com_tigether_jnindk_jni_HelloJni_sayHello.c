//
// Created by gaohang on 17/7/12.
//
#include "com_tigether_jnindk_jni_HelloJni.h"


JNIEXPORT jstring JNICALL Java_com_tigether_jnindk_jni_HelloJni_sayHello
  (JNIEnv *env, jobject obj){
  return (*env)->NewStringUTF(env, "Hello Jni");
  }




