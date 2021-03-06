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
using HLONG = System.Int64;
#else
using HLONG = System.Int32;
#endif


public class edgebreaker_header1 : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  internal edgebreaker_header1(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(edgebreaker_header1 obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~edgebreaker_header1() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSBSTREAMPINVOKE.delete_edgebreaker_header1(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public edgebreaker_header0 v0 {
    set {
      HCSBSTREAMPINVOKE.edgebreaker_header1_v0_set(swigCPtr, edgebreaker_header0.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSBSTREAMPINVOKE.edgebreaker_header1_v0_get(swigCPtr);
      edgebreaker_header0 ret = (cPtr == IntPtr.Zero) ? null : new edgebreaker_header0(cPtr, false);
      return ret;
    } 
  }

  public int normalslen {
    set {
      HCSBSTREAMPINVOKE.edgebreaker_header1_normalslen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSBSTREAMPINVOKE.edgebreaker_header1_normalslen_get(swigCPtr);
      return ret;
    } 
  }

  public edgebreaker_header1() : this(HCSBSTREAMPINVOKE.new_edgebreaker_header1(), true) {
  }

}
