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


public class segmentanimation : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public segmentanimation(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(segmentanimation obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~segmentanimation() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_segmentanimation(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public MVO_POINTER_SIZED_INT segkey {
	set { HCSMVOPINVOKE.segmentanimation_segkey_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.segmentanimation_segkey_get(swigCPtr); } 
  }

  public IntPtr matrix {
	set { HCSMVOPINVOKE.segmentanimation_matrix_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.segmentanimation_matrix_get(swigCPtr); } 
  }

  public HBhvAnimation anim {
    set {
      HCSMVOPINVOKE.segmentanimation_anim_set(swigCPtr, HBhvAnimation.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSMVOPINVOKE.segmentanimation_anim_get(swigCPtr);
      HBhvAnimation ret = (cPtr == IntPtr.Zero) ? null : new HBhvAnimation(cPtr, false);
      return ret;
    } 
  }

  public HBhvAnimation anim2 {
    set {
      HCSMVOPINVOKE.segmentanimation_anim2_set(swigCPtr, HBhvAnimation.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSMVOPINVOKE.segmentanimation_anim2_get(swigCPtr);
      HBhvAnimation ret = (cPtr == IntPtr.Zero) ? null : new HBhvAnimation(cPtr, false);
      return ret;
    } 
  }

  public int tick {
    set {
      HCSMVOPINVOKE.segmentanimation_tick_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.segmentanimation_tick_get(swigCPtr);
      return ret;
    } 
  }

  public int tick2 {
    set {
      HCSMVOPINVOKE.segmentanimation_tick2_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.segmentanimation_tick2_get(swigCPtr);
      return ret;
    } 
  }

  public System.Text.StringBuilder path {
	set { HCSMVOPINVOKE.segmentanimation_path_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.segmentanimation_path_get(swigCPtr); } 
  }

  public segmentanimation() : this(HCSMVOPINVOKE.new_segmentanimation(), true) {
  }

}
