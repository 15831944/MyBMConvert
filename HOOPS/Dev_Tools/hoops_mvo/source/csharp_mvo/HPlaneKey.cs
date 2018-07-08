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


public class HPlaneKey : HPlane {
  private HandleRef swigCPtr;

  public HPlaneKey(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HPlaneKeyUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HPlaneKey obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HPlaneKey() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HPlaneKey(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HPlaneKey(float A, float B, float C, float D) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_0(A, B, C, D), true) {
  }

  public HPlaneKey(float A, float B, float C) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_1(A, B, C), true) {
  }

  public HPlaneKey(float A, float B) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_2(A, B), true) {
  }

  public HPlaneKey(float A) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_3(A), true) {
  }

  public HPlaneKey() : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_4(), true) {
  }

  public HPlaneKey(HPoint normal, float D) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_5(HPoint.getCPtr(normal), D), true) {
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public HPlaneKey(HPlane p) : this(HCSMVOPINVOKE.new_HPlaneKey__SWIG_6(HPlane.getCPtr(p)), true) {
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

}