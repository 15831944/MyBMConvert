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


public class HKeyframeChannelDiscrete : HKeyframeChannel {
  private HandleRef swigCPtr;

  public HKeyframeChannelDiscrete(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HKeyframeChannelDiscreteUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HKeyframeChannelDiscrete obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HKeyframeChannelDiscrete() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HKeyframeChannelDiscrete(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HKeyframeChannelDiscrete(float x, float y, float z) : this(HCSMVOPINVOKE.new_HKeyframeChannelDiscrete__SWIG_0(x, y, z), true) {
  }

  public HKeyframeChannelDiscrete(float x, float y) : this(HCSMVOPINVOKE.new_HKeyframeChannelDiscrete__SWIG_1(x, y), true) {
  }

  public HKeyframeChannelDiscrete(float x) : this(HCSMVOPINVOKE.new_HKeyframeChannelDiscrete__SWIG_2(x), true) {
  }

  public HKeyframeChannelDiscrete() : this(HCSMVOPINVOKE.new_HKeyframeChannelDiscrete__SWIG_3(), true) {
  }

  public override HKeyframe Clone() {
    IntPtr cPtr = HCSMVOPINVOKE.HKeyframeChannelDiscrete_Clone(swigCPtr);
    HKeyframe ret = (cPtr == IntPtr.Zero) ? null : new HKeyframe(cPtr, false);
    return ret;
  }

  public override void Interpolate(SWIGTYPE_p_p_HKeyframeChannel posarray, int keyframe, float fraction, int length, HPoint res) {
    HCSMVOPINVOKE.HKeyframeChannelDiscrete_Interpolate(swigCPtr, SWIGTYPE_p_p_HKeyframeChannel.getCPtr(posarray), keyframe, fraction, length, HPoint.getCPtr(res));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public override void Serialize(SWIGTYPE_p_HUtilityXMLTag xmlgen) {
    HCSMVOPINVOKE.HKeyframeChannelDiscrete_Serialize(swigCPtr, SWIGTYPE_p_HUtilityXMLTag.getCPtr(xmlgen));
  }

}
