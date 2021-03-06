/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTManager {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HTManager(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HTManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HTManager(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HTManager(int output_hz) {
    this(HJMVOJNI.new_HTManager__SWIG_0(output_hz), true);
  }

  public HTManager() {
    this(HJMVOJNI.new_HTManager__SWIG_1(), true);
  }

  public void Tick(float time) {
    HJMVOJNI.HTManager_Tick(swigCPtr, this, time);
  }

  public void RegisterClient(HTClient c) {
    HJMVOJNI.HTManager_RegisterClient(swigCPtr, this, HTClient.getCPtr(c), c);
  }

  public void UnRegisterClient(HTClient c) {
    HJMVOJNI.HTManager_UnRegisterClient(swigCPtr, this, HTClient.getCPtr(c), c);
  }

  public static HTManager GetCurrentHTManager() {
    long cPtr = HJMVOJNI.HTManager_GetCurrentHTManager();
    return (cPtr == 0) ? null : new HTManager(cPtr, false);
  }

}
