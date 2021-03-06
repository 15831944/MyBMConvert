/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTCObjectRotate extends HBaseOperator {
  private long swigCPtr;

  public HTCObjectRotate(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HTCObjectRotate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HTCObjectRotate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HTCObjectRotate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HTCObjectRotate(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HTCObjectRotate__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
  }

  public HTCObjectRotate(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HTCObjectRotate__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
  }

  public HTCObjectRotate(HBaseView view) {
    this(HJMVOJNI.new_HTCObjectRotate__SWIG_2(HBaseView.getCPtr(view), view), true);
  }

  public HTCObjectRotate(HTCObjectRotate mommy) {
    this(HJMVOJNI.new_HTCObjectRotate__SWIG_3(HTCObjectRotate.getCPtr(mommy), mommy), true);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return HJMVOJNI.HTCObjectRotate_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public boolean Tick(float request_time, float actual_time) {
    return HJMVOJNI.HTCObjectRotate_Tick(swigCPtr, this, request_time, actual_time);
  }

  public void SetDeleteOnUnRegister() {
    HJMVOJNI.HTCObjectRotate_SetDeleteOnUnRegister(swigCPtr, this);
  }

  public void UnRegister() {
    HJMVOJNI.HTCObjectRotate_UnRegister(swigCPtr, this);
  }

  public boolean OnSignal(int signal) {
    return HJMVOJNI.HTCObjectRotate_OnSignal(swigCPtr, this, signal);
  }

}
