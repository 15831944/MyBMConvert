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


public class HKeyframeQuatSquad : HKeyframeRotation {
  private HandleRef swigCPtr;

  public HKeyframeQuatSquad(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HKeyframeQuatSquadUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HKeyframeQuatSquad obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HKeyframeQuatSquad() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HKeyframeQuatSquad(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HKeyframeQuatSquad(float x, float y, float z, float w) : this(HCSMVOPINVOKE.new_HKeyframeQuatSquad__SWIG_0(x, y, z, w), true) {
  }

  public HKeyframeQuatSquad(float x, float y, float z) : this(HCSMVOPINVOKE.new_HKeyframeQuatSquad__SWIG_1(x, y, z), true) {
  }

  public HKeyframeQuatSquad(float x, float y) : this(HCSMVOPINVOKE.new_HKeyframeQuatSquad__SWIG_2(x, y), true) {
  }

  public HKeyframeQuatSquad(float x) : this(HCSMVOPINVOKE.new_HKeyframeQuatSquad__SWIG_3(x), true) {
  }

  public HKeyframeQuatSquad() : this(HCSMVOPINVOKE.new_HKeyframeQuatSquad__SWIG_4(), true) {
  }

  public override HKeyframe Clone() {
    IntPtr cPtr = HCSMVOPINVOKE.HKeyframeQuatSquad_Clone(swigCPtr);
    HKeyframe ret = (cPtr == IntPtr.Zero) ? null : new HKeyframe(cPtr, false);
    return ret;
  }

  public override void Serialize(SWIGTYPE_p_HUtilityXMLTag xmlgen) {
    HCSMVOPINVOKE.HKeyframeQuatSquad_Serialize(swigCPtr, SWIGTYPE_p_HUtilityXMLTag.getCPtr(xmlgen));
  }

  public HQuat m_quat {
    set {
      HCSMVOPINVOKE.HKeyframeQuatSquad_m_quat_set(swigCPtr, HQuat.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HKeyframeQuatSquad_m_quat_get(swigCPtr);
      HQuat ret = (cPtr == IntPtr.Zero) ? null : new HQuat(cPtr, false);
      return ret;
    } 
  }

  public int m_ExtraSpins {
    set {
      HCSMVOPINVOKE.HKeyframeQuatSquad_m_ExtraSpins_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HKeyframeQuatSquad_m_ExtraSpins_get(swigCPtr);
      return ret;
    } 
  }

}
