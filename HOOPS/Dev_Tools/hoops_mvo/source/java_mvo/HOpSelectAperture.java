/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpSelectAperture extends HBaseOperator {
  private long swigCPtr;

  public HOpSelectAperture(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpSelectAperture_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpSelectAperture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpSelectAperture(swigCPtr);
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
    HJMVOJNI.HOpSelectAperture_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpSelectAperture_change_ownership(this, swigCPtr, true);
  }

  public HOpSelectAperture(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpSelectAperture__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpSelectAperture_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpSelectAperture(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpSelectAperture__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpSelectAperture_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpSelectAperture(HBaseView view) {
    this(HJMVOJNI.new_HOpSelectAperture__SWIG_2(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpSelectAperture_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetName() {
    return (getClass() == HOpSelectAperture.class) ? HJMVOJNI.HOpSelectAperture_GetName(swigCPtr, this) : HJMVOJNI.HOpSelectAperture_GetNameSwigExplicitHOpSelectAperture(swigCPtr, this);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return (getClass() == HOpSelectAperture.class) ? HJMVOJNI.HOpSelectAperture_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpSelectAperture_OnLButtonDownSwigExplicitHOpSelectAperture(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpSelectAperture.class) ? HJMVOJNI.HOpSelectAperture_Clone(swigCPtr, this) : HJMVOJNI.HOpSelectAperture_CloneSwigExplicitHOpSelectAperture(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void HandleSelection(HEventInfo hevent) {
    if (getClass() == HOpSelectAperture.class) HJMVOJNI.HOpSelectAperture_HandleSelection(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent); else HJMVOJNI.HOpSelectAperture_HandleSelectionSwigExplicitHOpSelectAperture(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

}
