/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpConstructCircle extends HBaseOperator {
  private long swigCPtr;

  public HOpConstructCircle(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpConstructCircle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpConstructCircle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpConstructCircle(swigCPtr);
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
    HJMVOJNI.HOpConstructCircle_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpConstructCircle_change_ownership(this, swigCPtr, true);
  }

  public HOpConstructCircle(HBaseView view, int DoRepeat, int DoCapture, boolean UseCenterMarker) {
    this(HJMVOJNI.new_HOpConstructCircle__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, UseCenterMarker), true);
    HJMVOJNI.HOpConstructCircle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpConstructCircle(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpConstructCircle__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpConstructCircle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpConstructCircle(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpConstructCircle__SWIG_2(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpConstructCircle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpConstructCircle(HBaseView view) {
    this(HJMVOJNI.new_HOpConstructCircle__SWIG_3(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpConstructCircle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetName() {
    return (getClass() == HOpConstructCircle.class) ? HJMVOJNI.HOpConstructCircle_GetName(swigCPtr, this) : HJMVOJNI.HOpConstructCircle_GetNameSwigExplicitHOpConstructCircle(swigCPtr, this);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return (getClass() == HOpConstructCircle.class) ? HJMVOJNI.HOpConstructCircle_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpConstructCircle_OnLButtonDownSwigExplicitHOpConstructCircle(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonDownAndMove(HEventInfo hevent) {
    return (getClass() == HOpConstructCircle.class) ? HJMVOJNI.HOpConstructCircle_OnLButtonDownAndMove(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpConstructCircle_OnLButtonDownAndMoveSwigExplicitHOpConstructCircle(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonUp(HEventInfo hevent) {
    return (getClass() == HOpConstructCircle.class) ? HJMVOJNI.HOpConstructCircle_OnLButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpConstructCircle_OnLButtonUpSwigExplicitHOpConstructCircle(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpConstructCircle.class) ? HJMVOJNI.HOpConstructCircle_Clone(swigCPtr, this) : HJMVOJNI.HOpConstructCircle_CloneSwigExplicitHOpConstructCircle(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void setM_radius(float value) {
    HJMVOJNI.HOpConstructCircle_m_radius_set(swigCPtr, this, value);
  }

  protected float getM_radius() {
    return HJMVOJNI.HOpConstructCircle_m_radius_get(swigCPtr, this);
  }

}
