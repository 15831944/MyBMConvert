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


public class HGraphPieSlice : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HGraphPieSlice(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HGraphPieSlice obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HGraphPieSlice() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HGraphPieSlice(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public double amount {
    set {
      HCSMVOPINVOKE.HGraphPieSlice_amount_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphPieSlice_amount_get(swigCPtr);
      return ret;
    } 
  }

  public MVO_POINTER_SIZED_INT segment {
	set { HCSMVOPINVOKE.HGraphPieSlice_segment_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.HGraphPieSlice_segment_get(swigCPtr); } 
  }

  public MVO_POINTER_SIZED_INT text_key {
	set { HCSMVOPINVOKE.HGraphPieSlice_text_key_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.HGraphPieSlice_text_key_get(swigCPtr); } 
  }

  public HGraphPieSlice() : this(HCSMVOPINVOKE.new_HGraphPieSlice(), true) {
  }

}
