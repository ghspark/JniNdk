APP_MODULES := hello
APP_ABI :=all

LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE :=hello
LOCAL_SRC_FILES =: com_tigether_jnindk_jni_HelloJni_sayHello.c
include $(BUILD_SHARED_LIBRARY)