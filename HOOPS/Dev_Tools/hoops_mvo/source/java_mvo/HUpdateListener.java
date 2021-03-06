/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HUpdateListener extends HEventListener {
  private long swigCPtr;

  public HUpdateListener(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HUpdateListener_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HUpdateListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HUpdateListener(swigCPtr);
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
    HJMVOJNI.HUpdateListener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HUpdateListener_change_ownership(this, swigCPtr, true);
  }

  public static HEventListenerType GetEventType() {
    return HEventListenerType.swigToEnum(HJMVOJNI.HUpdateListener_GetEventType());
  }

  public HEventListener CreateListenerManager() {
    long cPtr = (getClass() == HUpdateListener.class) ? HJMVOJNI.HUpdateListener_CreateListenerManager(swigCPtr, this) : HJMVOJNI.HUpdateListener_CreateListenerManagerSwigExplicitHUpdateListener(swigCPtr, this);
    return (cPtr == 0) ? null : new HEventListener(cPtr, false);
  }

  public int CameraChangedEvent(HBaseView param_1) {
    return (getClass() == HUpdateListener.class) ? HJMVOJNI.HUpdateListener_CameraChangedEvent(swigCPtr, this, HBaseView.getCPtr(param_1), param_1) : HJMVOJNI.HUpdateListener_CameraChangedEventSwigExplicitHUpdateListener(swigCPtr, this, HBaseView.getCPtr(param_1), param_1);
  }

  public int UpdateEvent(boolean antialias, boolean forceUpdate) {
    return (getClass() == HUpdateListener.class) ? HJMVOJNI.HUpdateListener_UpdateEvent(swigCPtr, this, antialias, forceUpdate) : HJMVOJNI.HUpdateListener_UpdateEventSwigExplicitHUpdateListener(swigCPtr, this, antialias, forceUpdate);
  }

  public int ViewDestroyedEvent(HBaseView param_1) {
    return (getClass() == HUpdateListener.class) ? HJMVOJNI.HUpdateListener_ViewDestroyedEvent(swigCPtr, this, HBaseView.getCPtr(param_1), param_1) : HJMVOJNI.HUpdateListener_ViewDestroyedEventSwigExplicitHUpdateListener(swigCPtr, this, HBaseView.getCPtr(param_1), param_1);
  }

  public int SmoothTransitionFinishedEvent(HBaseView param_1) {
    return (getClass() == HUpdateListener.class) ? HJMVOJNI.HUpdateListener_SmoothTransitionFinishedEvent(swigCPtr, this, HBaseView.getCPtr(param_1), param_1) : HJMVOJNI.HUpdateListener_SmoothTransitionFinishedEventSwigExplicitHUpdateListener(swigCPtr, this, HBaseView.getCPtr(param_1), param_1);
  }

  public HUpdateListener() {
    this(HJMVOJNI.new_HUpdateListener(), true);
    HJMVOJNI.HUpdateListener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
