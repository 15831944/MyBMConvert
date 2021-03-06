/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpNavCube extends HBaseOperator {
  private long swigCPtr;

  public HOpNavCube(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpNavCube_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpNavCube obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpNavCube(swigCPtr);
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
    HJMVOJNI.HOpNavCube_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpNavCube_change_ownership(this, swigCPtr, true);
  }

  public HOpNavCube(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpNavCube__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpNavCube_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpNavCube(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpNavCube__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpNavCube_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpNavCube(HBaseView view) {
    this(HJMVOJNI.new_HOpNavCube__SWIG_2(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpNavCube_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetName() {
    return (getClass() == HOpNavCube.class) ? HJMVOJNI.HOpNavCube_GetName(swigCPtr, this) : HJMVOJNI.HOpNavCube_GetNameSwigExplicitHOpNavCube(swigCPtr, this);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return (getClass() == HOpNavCube.class) ? HJMVOJNI.HOpNavCube_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpNavCube_OnLButtonDownSwigExplicitHOpNavCube(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpNavCube.class) ? HJMVOJNI.HOpNavCube_Clone(swigCPtr, this) : HJMVOJNI.HOpNavCube_CloneSwigExplicitHOpNavCube(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

}
