/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HFitWorldListener extends HEventListener {
  private long swigCPtr;

  public HFitWorldListener(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HFitWorldListener_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HFitWorldListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HFitWorldListener(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    HJMVOJNI.HFitWorldListener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HFitWorldListener_change_ownership(this, swigCPtr, true);
  }

  public static HEventListenerType GetEventType() {
    return HEventListenerType.swigToEnum(HJMVOJNI.HFitWorldListener_GetEventType());
  }

  public HEventListener CreateListenerManager() {
    long cPtr = (getClass() == HFitWorldListener.class) ? HJMVOJNI.HFitWorldListener_CreateListenerManager(swigCPtr, this) : HJMVOJNI.HFitWorldListener_CreateListenerManagerSwigExplicitHFitWorldListener(swigCPtr, this);
    return (cPtr == 0) ? null : new HEventListener(cPtr, false);
  }

  public int PreFitWorldEvent(HBaseView param_1) {
    return (getClass() == HFitWorldListener.class) ? HJMVOJNI.HFitWorldListener_PreFitWorldEvent(swigCPtr, this, HBaseView.getCPtr(param_1), param_1) : HJMVOJNI.HFitWorldListener_PreFitWorldEventSwigExplicitHFitWorldListener(swigCPtr, this, HBaseView.getCPtr(param_1), param_1);
  }

  public int PostFitWorldEvent(HBaseView param_1) {
    return (getClass() == HFitWorldListener.class) ? HJMVOJNI.HFitWorldListener_PostFitWorldEvent(swigCPtr, this, HBaseView.getCPtr(param_1), param_1) : HJMVOJNI.HFitWorldListener_PostFitWorldEventSwigExplicitHFitWorldListener(swigCPtr, this, HBaseView.getCPtr(param_1), param_1);
  }

  public HFitWorldListener() {
    this(HJMVOJNI.new_HFitWorldListener(), true);
    HJMVOJNI.HFitWorldListener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
