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


public class HKeyframeChannel : HKeyframe {
  private HandleRef swigCPtr;

  public HKeyframeChannel(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HKeyframeChannelUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HKeyframeChannel obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HKeyframeChannel() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HKeyframeChannel(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HKeyframeChannel() : this(HCSMVOPINVOKE.new_HKeyframeChannel(), true) {
  }

  public override HKeyframe Clone() {
    IntPtr cPtr = HCSMVOPINVOKE.HKeyframeChannel_Clone(swigCPtr);
    HKeyframe ret = (cPtr == IntPtr.Zero) ? null : new HKeyframe(cPtr, false);
    return ret;
  }

  public virtual void Interpolate(SWIGTYPE_p_p_HKeyframeChannel posarray, int keyframe, float fraction, int length, HPoint res) {
    HCSMVOPINVOKE.HKeyframeChannel_Interpolate(swigCPtr, SWIGTYPE_p_p_HKeyframeChannel.getCPtr(posarray), keyframe, fraction, length, HPoint.getCPtr(res));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public HPoint m_cp {
    set {
      HCSMVOPINVOKE.HKeyframeChannel_m_cp_set(swigCPtr, HPoint.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HKeyframeChannel_m_cp_get(swigCPtr);
      HPoint ret = (cPtr == IntPtr.Zero) ? null : new HPoint(cPtr, false);
      return ret;
    } 
  }

  public HANIChannelType m_channeltype {
    set {
      HCSMVOPINVOKE.HKeyframeChannel_m_channeltype_set(swigCPtr, (int)value);
    } 
    get {
      HANIChannelType ret = (HANIChannelType)HCSMVOPINVOKE.HKeyframeChannel_m_channeltype_get(swigCPtr);
      return ret;
    } 
  }

}
