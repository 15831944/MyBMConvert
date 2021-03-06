/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpCameraManipulate extends HBaseOperator {
  private long swigCPtr;

  public HOpCameraManipulate(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpCameraManipulate_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpCameraManipulate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpCameraManipulate(swigCPtr);
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
    HJMVOJNI.HOpCameraManipulate_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpCameraManipulate_change_ownership(this, swigCPtr, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture, HBaseOperator orbit, HBaseOperator pan, HBaseOperator zoom, HBaseOperator relative, boolean AllowHandleActivation) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, HBaseOperator.getCPtr(orbit), orbit, HBaseOperator.getCPtr(pan), pan, HBaseOperator.getCPtr(zoom), zoom, HBaseOperator.getCPtr(relative), relative, AllowHandleActivation), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture, HBaseOperator orbit, HBaseOperator pan, HBaseOperator zoom, HBaseOperator relative) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, HBaseOperator.getCPtr(orbit), orbit, HBaseOperator.getCPtr(pan), pan, HBaseOperator.getCPtr(zoom), zoom, HBaseOperator.getCPtr(relative), relative), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture, HBaseOperator orbit, HBaseOperator pan, HBaseOperator zoom) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_2(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, HBaseOperator.getCPtr(orbit), orbit, HBaseOperator.getCPtr(pan), pan, HBaseOperator.getCPtr(zoom), zoom), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture, HBaseOperator orbit, HBaseOperator pan) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_3(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, HBaseOperator.getCPtr(orbit), orbit, HBaseOperator.getCPtr(pan), pan), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture, HBaseOperator orbit) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_4(HBaseView.getCPtr(view), view, DoRepeat, DoCapture, HBaseOperator.getCPtr(orbit), orbit), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_5(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_6(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraManipulate(HBaseView view) {
    this(HJMVOJNI.new_HOpCameraManipulate__SWIG_7(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpCameraManipulate_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetName() {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_GetName(swigCPtr, this) : HJMVOJNI.HOpCameraManipulate_GetNameSwigExplicitHOpCameraManipulate(swigCPtr, this);
  }

  public int OnLButtonDown(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnLButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnLButtonDownSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonDownAndMove(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnLButtonDownAndMove(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnLButtonDownAndMoveSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonUp(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnLButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnLButtonUpSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnMButtonDown(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnMButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnMButtonDownSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnMButtonDownAndMove(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnMButtonDownAndMove(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnMButtonDownAndMoveSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnMButtonUp(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnMButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnMButtonUpSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnRButtonDown(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnRButtonDown(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnRButtonDownSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnRButtonDownAndMove(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnRButtonDownAndMove(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnRButtonDownAndMoveSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnRButtonUp(HEventInfo hevent) {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OnRButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraManipulate_OnRButtonUpSwigExplicitHOpCameraManipulate(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_Clone(swigCPtr, this) : HJMVOJNI.HOpCameraManipulate_CloneSwigExplicitHOpCameraManipulate(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  public boolean OperatorStarted() {
    return (getClass() == HOpCameraManipulate.class) ? HJMVOJNI.HOpCameraManipulate_OperatorStarted(swigCPtr, this) : HJMVOJNI.HOpCameraManipulate_OperatorStartedSwigExplicitHOpCameraManipulate(swigCPtr, this);
  }

  public HOpCameraOrbit GetOrbitOperator() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_GetOrbitOperator(swigCPtr, this);
    return (cPtr == 0) ? null : new HOpCameraOrbit(cPtr, false);
  }

  public void HandleDblClk(float requested_time, float actual_time) {
    HJMVOJNI.HOpCameraManipulate_HandleDblClk(swigCPtr, this, requested_time, actual_time);
  }

  public boolean GetLButtonDown() {
    return HJMVOJNI.HOpCameraManipulate_GetLButtonDown(swigCPtr, this);
  }

  protected void setM_pDblClkTimer(HTClient value) {
    HJMVOJNI.HOpCameraManipulate_m_pDblClkTimer_set(swigCPtr, this, HTClient.getCPtr(value), value);
  }

  protected HTClient getM_pDblClkTimer() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_pDblClkTimer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HTClient(cPtr, false);
  }

  protected void setM_pOrbitOperator(HBaseOperator value) {
    HJMVOJNI.HOpCameraManipulate_m_pOrbitOperator_set(swigCPtr, this, HBaseOperator.getCPtr(value), value);
  }

  protected HBaseOperator getM_pOrbitOperator() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_pOrbitOperator_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void setM_pRelativeOrbitOperator(HBaseOperator value) {
    HJMVOJNI.HOpCameraManipulate_m_pRelativeOrbitOperator_set(swigCPtr, this, HBaseOperator.getCPtr(value), value);
  }

  protected HBaseOperator getM_pRelativeOrbitOperator() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_pRelativeOrbitOperator_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void setM_pPanOperator(HBaseOperator value) {
    HJMVOJNI.HOpCameraManipulate_m_pPanOperator_set(swigCPtr, this, HBaseOperator.getCPtr(value), value);
  }

  protected HBaseOperator getM_pPanOperator() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_pPanOperator_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void setM_pZoomOperator(HBaseOperator value) {
    HJMVOJNI.HOpCameraManipulate_m_pZoomOperator_set(swigCPtr, this, HBaseOperator.getCPtr(value), value);
  }

  protected HBaseOperator getM_pZoomOperator() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_pZoomOperator_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected void setM_ptRealOld(HPoint value) {
    HJMVOJNI.HOpCameraManipulate_m_ptRealOld_set(swigCPtr, this, HPoint.getCPtr(value), value);
  }

  protected HPoint getM_ptRealOld() {
    long cPtr = HJMVOJNI.HOpCameraManipulate_m_ptRealOld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HPoint(cPtr, false);
  }

}
