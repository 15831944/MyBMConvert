/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOpCameraZoomBox extends HOpConstructRectangle {
  private long swigCPtr;

  public HOpCameraZoomBox(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOpCameraZoomBox_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOpCameraZoomBox obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOpCameraZoomBox(swigCPtr);
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
    HJMVOJNI.HOpCameraZoomBox_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HOpCameraZoomBox_change_ownership(this, swigCPtr, true);
  }

  public HOpCameraZoomBox(HBaseView view, int DoRepeat, int DoCapture) {
    this(HJMVOJNI.new_HOpCameraZoomBox__SWIG_0(HBaseView.getCPtr(view), view, DoRepeat, DoCapture), true);
    HJMVOJNI.HOpCameraZoomBox_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraZoomBox(HBaseView view, int DoRepeat) {
    this(HJMVOJNI.new_HOpCameraZoomBox__SWIG_1(HBaseView.getCPtr(view), view, DoRepeat), true);
    HJMVOJNI.HOpCameraZoomBox_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HOpCameraZoomBox(HBaseView view) {
    this(HJMVOJNI.new_HOpCameraZoomBox__SWIG_2(HBaseView.getCPtr(view), view), true);
    HJMVOJNI.HOpCameraZoomBox_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String GetName() {
    return (getClass() == HOpCameraZoomBox.class) ? HJMVOJNI.HOpCameraZoomBox_GetName(swigCPtr, this) : HJMVOJNI.HOpCameraZoomBox_GetNameSwigExplicitHOpCameraZoomBox(swigCPtr, this);
  }

  public int OnLButtonUp(HEventInfo hevent) {
    return (getClass() == HOpCameraZoomBox.class) ? HJMVOJNI.HOpCameraZoomBox_OnLButtonUp(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraZoomBox_OnLButtonUpSwigExplicitHOpCameraZoomBox(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public int OnLButtonDblClk(HEventInfo hevent) {
    return (getClass() == HOpCameraZoomBox.class) ? HJMVOJNI.HOpCameraZoomBox_OnLButtonDblClk(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent) : HJMVOJNI.HOpCameraZoomBox_OnLButtonDblClkSwigExplicitHOpCameraZoomBox(swigCPtr, this, HEventInfo.getCPtr(hevent), hevent);
  }

  public void SetLightFollowsCamera(boolean follow) {
    HJMVOJNI.HOpCameraZoomBox_SetLightFollowsCamera(swigCPtr, this, follow);
  }

  public boolean GetLightFollowsCamera() {
    return HJMVOJNI.HOpCameraZoomBox_GetLightFollowsCamera(swigCPtr, this);
  }

  public HBaseOperator Clone() {
    long cPtr = (getClass() == HOpCameraZoomBox.class) ? HJMVOJNI.HOpCameraZoomBox_Clone(swigCPtr, this) : HJMVOJNI.HOpCameraZoomBox_CloneSwigExplicitHOpCameraZoomBox(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseOperator(cPtr, false);
  }

  protected boolean ComputeReasonableTarget(HPoint new_tar, HPoint min, HPoint max, HPoint tar_orig) {
    return HJMVOJNI.HOpCameraZoomBox_ComputeReasonableTarget(swigCPtr, this, HPoint.getCPtr(new_tar), new_tar, HPoint.getCPtr(min), min, HPoint.getCPtr(max), max, HPoint.getCPtr(tar_orig), tar_orig);
  }

  protected void ComputeNewField(float[] width, float[] height, HPoint min, HPoint max, HPoint new_tar) {
    HJMVOJNI.HOpCameraZoomBox_ComputeNewField(swigCPtr, this, width, height, HPoint.getCPtr(min), min, HPoint.getCPtr(max), max, HPoint.getCPtr(new_tar), new_tar);
  }

  protected void setM_LightFollowsCamera(boolean value) {
    HJMVOJNI.HOpCameraZoomBox_m_LightFollowsCamera_set(swigCPtr, this, value);
  }

  protected boolean getM_LightFollowsCamera() {
    return HJMVOJNI.HOpCameraZoomBox_m_LightFollowsCamera_get(swigCPtr, this);
  }

}