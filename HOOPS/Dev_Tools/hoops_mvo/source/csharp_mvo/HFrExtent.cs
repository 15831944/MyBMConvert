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


public class HFrExtent : HConstFRSimpType {
  private HandleRef swigCPtr;

  public HFrExtent(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HFrExtentUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HFrExtent obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HFrExtent() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HFrExtent(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HFrExtent() : this(HCSMVOPINVOKE.new_HFrExtent__SWIG_0(), true) {
  }

  public HFrExtent(int min, int max) : this(HCSMVOPINVOKE.new_HFrExtent__SWIG_1(min, max), true) {
  }

  public void SetMultiplier(int mp) {
    HCSMVOPINVOKE.HFrExtent_SetMultiplier(swigCPtr, mp);
  }

  public override void Set(HConstantFrameRate pCfr, int SimpLevel) {
    HCSMVOPINVOKE.HFrExtent_Set(swigCPtr, HConstantFrameRate.getCPtr(pCfr), SimpLevel);
  }

  public void SetUseLod(bool ul) {
    HCSMVOPINVOKE.HFrExtent_SetUseLod(swigCPtr, ul);
  }

  public bool GetUseLod() {
    bool ret = HCSMVOPINVOKE.HFrExtent_GetUseLod(swigCPtr);
    return ret;
  }

  public override ConstFRType GetFRType() {
    ConstFRType ret = (ConstFRType)HCSMVOPINVOKE.HFrExtent_GetFRType(swigCPtr);
    return ret;
  }

  public static HConstFRSimpType Create(int min, int max) {
    IntPtr cPtr = HCSMVOPINVOKE.HFrExtent_Create(min, max);
    HConstFRSimpType ret = (cPtr == IntPtr.Zero) ? null : new HConstFRSimpType(cPtr, false);
    return ret;
  }

}
