/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

#if _M_X64
using MVO_POINTER_SIZED_INT = System.Int64;
using MVO_POINTER_SIZED_UINT = System.UInt64;
using ID_Key = System.Int64;
#else
using MVO_POINTER_SIZED_INT = System.Int32;
using MVO_POINTER_SIZED_UINT = System.UInt32;
using ID_Key = System.Int32;
#endif


public class HConstantFrameRate : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HConstantFrameRate(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HConstantFrameRate obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HConstantFrameRate() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HConstantFrameRate(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public HConstantFrameRate(HBaseView view) : this(HCSMVOPINVOKE.new_HConstantFrameRate(HBaseView.getCPtr(view)), true) {
  }

  public HBaseView GetView() {
    IntPtr cPtr = HCSMVOPINVOKE.HConstantFrameRate_GetView(swigCPtr);
    HBaseView ret = (cPtr == IntPtr.Zero) ? null : new HBaseView(cPtr, false);
    return ret;
  }

  public void UpdateLevel(int SimpLevel, int SimpListPos) {
    HCSMVOPINVOKE.HConstantFrameRate_UpdateLevel(swigCPtr, SimpLevel, SimpListPos);
  }

  public bool GetMode(SWIGTYPE_p_p_p_HConstFRSimpType sd, float[] target_framerate, int[] length) {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetMode__SWIG_0(swigCPtr, SWIGTYPE_p_p_p_HConstFRSimpType.getCPtr(sd), target_framerate, length);
    return ret;
  }

  public bool GetMode(SWIGTYPE_p_p_p_HConstFRSimpType sd, float[] target_framerate) {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetMode__SWIG_1(swigCPtr, SWIGTYPE_p_p_p_HConstFRSimpType.getCPtr(sd), target_framerate);
    return ret;
  }

  public bool GetMode(SWIGTYPE_p_p_p_HConstFRSimpType sd) {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetMode__SWIG_2(swigCPtr, SWIGTYPE_p_p_p_HConstFRSimpType.getCPtr(sd));
    return ret;
  }

  public bool GetMode() {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetMode__SWIG_3(swigCPtr);
    return ret;
  }

  public void Init(float target_framerate, SWIGTYPE_p_p_HConstFRSimpType sd, int length, float deadzone) {
    HCSMVOPINVOKE.HConstantFrameRate_Init__SWIG_0(swigCPtr, target_framerate, SWIGTYPE_p_p_HConstFRSimpType.getCPtr(sd), length, deadzone);
  }

  public void Init(float target_framerate, SWIGTYPE_p_p_HConstFRSimpType sd, int length) {
    HCSMVOPINVOKE.HConstantFrameRate_Init__SWIG_1(swigCPtr, target_framerate, SWIGTYPE_p_p_HConstFRSimpType.getCPtr(sd), length);
  }

  public void Init(float target_framerate, SWIGTYPE_p_p_HConstFRSimpType sd) {
    HCSMVOPINVOKE.HConstantFrameRate_Init__SWIG_2(swigCPtr, target_framerate, SWIGTYPE_p_p_HConstFRSimpType.getCPtr(sd));
  }

  public void Init(float target_framerate) {
    HCSMVOPINVOKE.HConstantFrameRate_Init__SWIG_3(swigCPtr, target_framerate);
  }

  public void Init() {
    HCSMVOPINVOKE.HConstantFrameRate_Init__SWIG_4(swigCPtr);
  }

  public void Shutdown() {
    HCSMVOPINVOKE.HConstantFrameRate_Shutdown(swigCPtr);
  }

  public bool GetActive() {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetActive(swigCPtr);
    return ret;
  }

  public void Watch() {
    HCSMVOPINVOKE.HConstantFrameRate_Watch(swigCPtr);
  }

  public void Start() {
    HCSMVOPINVOKE.HConstantFrameRate_Start(swigCPtr);
  }

  public void Stop() {
    HCSMVOPINVOKE.HConstantFrameRate_Stop(swigCPtr);
  }

  public void IncreaseDetailTemp() {
    HCSMVOPINVOKE.HConstantFrameRate_IncreaseDetailTemp(swigCPtr);
  }

  public bool ViewpointHasChanged(bool update) {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_ViewpointHasChanged__SWIG_0(swigCPtr, update);
    return ret;
  }

  public bool ViewpointHasChanged() {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_ViewpointHasChanged__SWIG_1(swigCPtr);
    return ret;
  }

  public void SetDetailIncMode(DetailChangeMode mode) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDetailIncMode(swigCPtr, (int)mode);
  }

  public void SetDetailIncOnIdleMode(DetailChangeMode mode) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDetailIncOnIdleMode(swigCPtr, (int)mode);
  }

  public DetailChangeMode GetDetailIncMode() {
    DetailChangeMode ret = (DetailChangeMode)HCSMVOPINVOKE.HConstantFrameRate_GetDetailIncMode(swigCPtr);
    return ret;
  }

  public void SetDetailDecMode(DetailChangeMode mode) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDetailDecMode(swigCPtr, (int)mode);
  }

  public DetailChangeMode GetDetailDecMode() {
    DetailChangeMode ret = (DetailChangeMode)HCSMVOPINVOKE.HConstantFrameRate_GetDetailDecMode(swigCPtr);
    return ret;
  }

  public void ResetListPointers() {
    HCSMVOPINVOKE.HConstantFrameRate_ResetListPointers(swigCPtr);
  }

  public float GetTargetFrameRate() {
    float ret = HCSMVOPINVOKE.HConstantFrameRate_GetTargetFrameRate(swigCPtr);
    return ret;
  }

  public void SetTargetFrameRate(float framerate) {
    HCSMVOPINVOKE.HConstantFrameRate_SetTargetFrameRate(swigCPtr, framerate);
  }

  public void SetDeadZone(float deadzone) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDeadZone(swigCPtr, deadzone);
  }

  public void SetEmergencyDetailDecrease(bool detaildecrease) {
    HCSMVOPINVOKE.HConstantFrameRate_SetEmergencyDetailDecrease(swigCPtr, detaildecrease);
  }

  public void SetActivityType(HActivityType at) {
    HCSMVOPINVOKE.HConstantFrameRate_SetActivityType(swigCPtr, (int)at);
  }

  public HActivityType GetActivityType() {
    HActivityType ret = (HActivityType)HCSMVOPINVOKE.HConstantFrameRate_GetActivityType(swigCPtr);
    return ret;
  }

  public int GetSimpLevel() {
    int ret = HCSMVOPINVOKE.HConstantFrameRate_GetSimpLevel(swigCPtr);
    return ret;
  }

  public void AdjustLodOptions() {
    HCSMVOPINVOKE.HConstantFrameRate_AdjustLodOptions(swigCPtr);
  }

  public bool GetDetailIncreaseState() {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_GetDetailIncreaseState(swigCPtr);
    return ret;
  }

  public void SetDetailLevel(int listpos, int simplevel) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDetailLevel(swigCPtr, listpos, simplevel);
  }

  public HConstFRSimpType GetSimpType(ConstFRType stype) {
    IntPtr cPtr = HCSMVOPINVOKE.HConstantFrameRate_GetSimpType(swigCPtr, (int)stype);
    HConstFRSimpType ret = (cPtr == IntPtr.Zero) ? null : new HConstFRSimpType(cPtr, false);
    return ret;
  }

  public void SetSimpLevel(int simplevel) {
    HCSMVOPINVOKE.HConstantFrameRate_SetSimpLevel(swigCPtr, simplevel);
  }

  public void AdjustDefaultDetailLevelToModel() {
    HCSMVOPINVOKE.HConstantFrameRate_AdjustDefaultDetailLevelToModel(swigCPtr);
  }

  public static bool Tick(float request_time, float actual_time, IntPtr user_data) {
    bool ret = HCSMVOPINVOKE.HConstantFrameRate_Tick(request_time, actual_time, user_data);
    return ret;
  }

  public void SetDisableIncreaseTemp(bool it) {
    HCSMVOPINVOKE.HConstantFrameRate_SetDisableIncreaseTemp(swigCPtr, it);
  }

  public void InitiateDelay() {
    HCSMVOPINVOKE.HConstantFrameRate_InitiateDelay(swigCPtr);
  }

  public int GetDetailLevelNum() {
    int ret = HCSMVOPINVOKE.HConstantFrameRate_GetDetailLevelNum(swigCPtr);
    return ret;
  }

  public int GetTotalDetailLevelNum() {
    int ret = HCSMVOPINVOKE.HConstantFrameRate_GetTotalDetailLevelNum(swigCPtr);
    return ret;
  }

  public void SetWatchActivity(bool wa) {
    HCSMVOPINVOKE.HConstantFrameRate_SetWatchActivity(swigCPtr, wa);
  }

  public void MajorDetailDecrease() {
    HCSMVOPINVOKE.HConstantFrameRate_MajorDetailDecrease(swigCPtr);
  }

  public void MajorDetailIncrease() {
    HCSMVOPINVOKE.HConstantFrameRate_MajorDetailIncrease(swigCPtr);
  }

}
