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


public class HGraphAxis : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HGraphAxis(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HGraphAxis obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HGraphAxis() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HGraphAxis(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public HGraphAxis() : this(HCSMVOPINVOKE.new_HGraphAxis(), true) {
  }

  public double min {
    set {
      HCSMVOPINVOKE.HGraphAxis_min_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_min_get(swigCPtr);
      return ret;
    } 
  }

  public double max {
    set {
      HCSMVOPINVOKE.HGraphAxis_max_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_max_get(swigCPtr);
      return ret;
    } 
  }

  public double axis_scale_factor {
    set {
      HCSMVOPINVOKE.HGraphAxis_axis_scale_factor_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_axis_scale_factor_get(swigCPtr);
      return ret;
    } 
  }

  public double tick_frequency {
    set {
      HCSMVOPINVOKE.HGraphAxis_tick_frequency_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_tick_frequency_get(swigCPtr);
      return ret;
    } 
  }

  public double tick_size {
    set {
      HCSMVOPINVOKE.HGraphAxis_tick_size_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_tick_size_get(swigCPtr);
      return ret;
    } 
  }

  public double grid_frequency {
    set {
      HCSMVOPINVOKE.HGraphAxis_grid_frequency_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_grid_frequency_get(swigCPtr);
      return ret;
    } 
  }

  public double grid_min {
    set {
      HCSMVOPINVOKE.HGraphAxis_grid_min_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_grid_min_get(swigCPtr);
      return ret;
    } 
  }

  public double grid_max {
    set {
      HCSMVOPINVOKE.HGraphAxis_grid_max_set(swigCPtr, value);
    } 
    get {
      double ret = HCSMVOPINVOKE.HGraphAxis_grid_max_get(swigCPtr);
      return ret;
    } 
  }

  public MVO_POINTER_SIZED_INT segment {
	set { HCSMVOPINVOKE.HGraphAxis_segment_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.HGraphAxis_segment_get(swigCPtr); } 
  }

  public int precision {
    set {
      HCSMVOPINVOKE.HGraphAxis_precision_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HGraphAxis_precision_get(swigCPtr);
      return ret;
    } 
  }

  public HGraphAxisScale axis_scale {
    set {
      HCSMVOPINVOKE.HGraphAxis_axis_scale_set(swigCPtr, (int)value);
    } 
    get {
      HGraphAxisScale ret = (HGraphAxisScale)HCSMVOPINVOKE.HGraphAxis_axis_scale_get(swigCPtr);
      return ret;
    } 
  }

  public bool show_labels {
    set {
      HCSMVOPINVOKE.HGraphAxis_show_labels_set(swigCPtr, value);
    } 
    get {
      bool ret = HCSMVOPINVOKE.HGraphAxis_show_labels_get(swigCPtr);
      return ret;
    } 
  }

  public bool visible {
    set {
      HCSMVOPINVOKE.HGraphAxis_visible_set(swigCPtr, value);
    } 
    get {
      bool ret = HCSMVOPINVOKE.HGraphAxis_visible_get(swigCPtr);
      return ret;
    } 
  }

}
