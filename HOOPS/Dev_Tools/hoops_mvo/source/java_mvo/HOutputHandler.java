/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOutputHandler {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HOutputHandler(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOutputHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOutputHandler(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String GetOutputName() {
    return HJMVOJNI.HOutputHandler_GetOutputName(swigCPtr, this);
  }

  public long GetOutputOps() {
    return HJMVOJNI.HOutputHandler_GetOutputOps(swigCPtr, this);
  }

  public void RegisterOutputHandlerTypes() {
    HJMVOJNI.HOutputHandler_RegisterOutputHandlerTypes(swigCPtr, this);
  }

  public HFileIOResult FileOutputByKey(String filename, long key, HOutputHandlerOptions options) {
    return HFileIOResult.swigToEnum(HJMVOJNI.HOutputHandler_FileOutputByKey__SWIG_0(swigCPtr, this, filename, key, HOutputHandlerOptions.getCPtr(options), options));
  }

  public HFileIOResult FileOutputByKey(SWIGTYPE_p_wchar_t filename, long key, HOutputHandlerOptions options) {
    return HFileIOResult.swigToEnum(HJMVOJNI.HOutputHandler_FileOutputByKey__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(filename), key, HOutputHandlerOptions.getCPtr(options), options));
  }

  public HFileIOResult FileOutputByKey(int[] filename, long key, HOutputHandlerOptions options) {
    return HFileIOResult.swigToEnum(HJMVOJNI.HOutputHandler_FileOutputByKey__SWIG_2(swigCPtr, this, filename, key, HOutputHandlerOptions.getCPtr(options), options));
  }

  public HFileIOResult FileOutputFromImageKey(String filename, long image_key, HOutputHandlerOptions options) {
    return HFileIOResult.swigToEnum(HJMVOJNI.HOutputHandler_FileOutputFromImageKey__SWIG_0(swigCPtr, this, filename, image_key, HOutputHandlerOptions.getCPtr(options), options));
  }

  public HFileIOResult FileOutputFromImageKey(SWIGTYPE_p_wchar_t filename, long image_key, HOutputHandlerOptions options) {
    return HFileIOResult.swigToEnum(HJMVOJNI.HOutputHandler_FileOutputFromImageKey__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(filename), image_key, HOutputHandlerOptions.getCPtr(options), options));
  }

  public String GetOutputTypesString() {
    return HJMVOJNI.HOutputHandler_GetOutputTypesString(swigCPtr, this);
  }

  public HOutputHandlerStyle GetOutputStyle() {
    return HOutputHandlerStyle.swigToEnum(HJMVOJNI.HOutputHandler_GetOutputStyle(swigCPtr, this));
  }

  public String GetOutputDefaultHSRA() {
    return HJMVOJNI.HOutputHandler_GetOutputDefaultHSRA(swigCPtr, this);
  }

  public String GetOutputProgress() {
    return HJMVOJNI.HOutputHandler_GetOutputProgress(swigCPtr, this);
  }

  public float GetOutputPercentProgress() {
    return HJMVOJNI.HOutputHandler_GetOutputPercentProgress(swigCPtr, this);
  }

  public SWIGTYPE_p_wchar_t GetOutputInformation() {
    long cPtr = HJMVOJNI.HOutputHandler_GetOutputInformation(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
  }

  public HIONoticeCallback SetOutputProgressNoticeCallback(HIONoticeCallback notice_callback) {
    long cPtr = HJMVOJNI.HOutputHandler_SetOutputProgressNoticeCallback(swigCPtr, this, HIONoticeCallback.getCPtr(notice_callback), notice_callback);
    return (cPtr == 0) ? null : new HIONoticeCallback(cPtr, false);
  }

  public HIOPercentNoticeCallback SetOutputPercentProgressNoticeCallback(HIOPercentNoticeCallback percent_notice_callback) {
    long cPtr = HJMVOJNI.HOutputHandler_SetOutputPercentProgressNoticeCallback(swigCPtr, this, HIOPercentNoticeCallback.getCPtr(percent_notice_callback), percent_notice_callback);
    return (cPtr == 0) ? null : new HIOPercentNoticeCallback(cPtr, false);
  }

  public HIONoticeCallback SetOutputInformationNoticeCallback(HIONoticeCallback notice_callback) {
    long cPtr = HJMVOJNI.HOutputHandler_SetOutputInformationNoticeCallback(swigCPtr, this, HIONoticeCallback.getCPtr(notice_callback), notice_callback);
    return (cPtr == 0) ? null : new HIONoticeCallback(cPtr, false);
  }

  public void ReportOutputProgress(String progress) {
    HJMVOJNI.HOutputHandler_ReportOutputProgress(swigCPtr, this, progress);
  }

  public void ReportOutputPercentProgress(float percent_progress) {
    HJMVOJNI.HOutputHandler_ReportOutputPercentProgress(swigCPtr, this, percent_progress);
  }

  public void ReportOutputInformation(String information) {
    HJMVOJNI.HOutputHandler_ReportOutputInformation(swigCPtr, this, information);
  }

  public void SetModuleDirectory(String module_directory) {
    HJMVOJNI.HOutputHandler_SetModuleDirectory__SWIG_0(swigCPtr, this, module_directory);
  }

  public void SetModuleDirectory(SWIGTYPE_p_wchar_t module_directory) {
    HJMVOJNI.HOutputHandler_SetModuleDirectory__SWIG_1(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(module_directory));
  }

}