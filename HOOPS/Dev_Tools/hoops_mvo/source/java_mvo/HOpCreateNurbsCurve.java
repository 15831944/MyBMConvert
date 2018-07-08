/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpCreateNurbsCurve extends HOpConstructNurbsCurve {
  private long swigCPtr;

  public HOpCreateNurbsCurve(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpCreateNurbsCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpCreateNurbsCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpCreateNurbsCurve(swigCPtr);
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
    HJMVOJNI.HOpCreateNurbsCurve_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpCreateNurbsCurve_change_ownership(this, swigCPtr, true);
  }

  public HOpCreateNurbsCurve(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpCreateNurbsCurve__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpCreateNurbsCurve_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCreateNurbsCurve(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpCreateNurbsCurve__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpCreateNurbsCurve_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCreateNurbsCurve(HBaseView view) {
    this(HJMVOJNI.new_HOpCreateNurbsCurve__SWIG_2(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpCreateNurbsCurve_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpCreateNurbsCurve.class) ? HJMVOJNI.HOpCreateNurbsCurve_Clone(swigCPtr, this) : HJMVOJNI.HOpCreateNurbsCurve_CloneSwigExplicitHOpCreateNurbsCurve(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  public String GetName() {
    return (getClass() == HOpCreateNurbsCurve.class) ? HJMVOJNI.HOpCreateNurbsCurve_GetName(swigCPtr, this) : HJMVOJNI.HOpCreateNurbsCurve_GetNameSwigExplicitHOpCreateNurbsCurve(swigCPtr, this);
  }

  public int OnLButtonDblClk(HEventInfo hevent) {
    return (getClass() == HOpCreateNurbsCurve.class) ? HJMVOJNI.HOpCreateNurbsCurve_OnLButtonDblClk(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCreateNurbsCurve_OnLButtonDblClkSwigExplicitHOpCreateNurbsCurve(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

}