/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpMarkupFreehand extends HBaseOperator {
  private long swigCPtr;

  public HOpMarkupFreehand(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpMarkupFreehand_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpMarkupFreehand obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpMarkupFreehand(swigCPtr);
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
    HJMVOJNI.HOpMarkupFreehand_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpMarkupFreehand_change_ownership(this, swigCPtr, true);
  }

  public HOpMarkupFreehand(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpMarkupFreehand__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpMarkupFreehand_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpMarkupFreehand(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpMarkupFreehand__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpMarkupFreehand_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpMarkupFreehand(HBaseView view) {
    this(HJMVOJNI.new_HOpMarkupFreehand__SWIG_2(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpMarkupFreehand_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public static void CreateMarkupFreehand(HBaseView pView, String segment, int PolyLineLength, HPoint pPolyline, boolean emit_message) {
    HJMVOJNI.HOpMarkupFreehand_CreateMarkupFreehand(HBaseView.getCPtr(pView), pView, segment, PolyLineLength, HPoint.getCPtr(pPolyline), pPolyline, emit_message);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpMarkupFreehand.class) ? HJMVOJNI.HOpMarkupFreehand_Clone(swigCPtr, this) : HJMVOJNI.HOpMarkupFreehand_CloneSwigExplicitHOpMarkupFreehand(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  public String GetName() {
    return (getClass() == HOpMarkupFreehand.class) ? HJMVOJNI.HOpMarkupFreehand_GetName(swigCPtr, this) : HJMVOJNI.HOpMarkupFreehand_GetNameSwigExplicitHOpMarkupFreehand(swigCPtr, this);
  }

  public void setM_lPolyline(long value) {
    HJMVOJNI.HOpMarkupFreehand_m_lPolyline_set(swigCPtr, this, value);
  }

  public long getM_lPolyline() {return HJMVOJNI.HOpMarkupFreehand_m_lPolyline_get(swigCPtr, this);}

  public int OnLButtonDownAndMove(HEventInfo hevent) {
    return (getClass() == HOpMarkupFreehand.class) ? HJMVOJNI.HOpMarkupFreehand_OnLButtonDownAndMove(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpMarkupFreehand_OnLButtonDownAndMoveSwigExplicitHOpMarkupFreehand(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return (getClass() == HOpMarkupFreehand.class) ? HJMVOJNI.HOpMarkupFreehand_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpMarkupFreehand_OnLButtonDownSwigExplicitHOpMarkupFreehand(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonUp(HEventInfo hevent) {
    return (getClass() == HOpMarkupFreehand.class) ? HJMVOJNI.HOpMarkupFreehand_OnLButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpMarkupFreehand_OnLButtonUpSwigExplicitHOpMarkupFreehand(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  protected void setM_ptLast(HPoint value) {
    HJMVOJNI.HOpMarkupFreehand_m_ptLast_set(swigCPtr, this, HPoint.getCPtr(value), value);
  }

  protected HPoint getM_ptLast() {
    long cPtr = HJMVOJNI.HOpMarkupFreehand_m_ptLast_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HPoint(cPtr, false);
  }

}
