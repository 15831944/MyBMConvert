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
using ID_Key = System.Int64;
#else
using HLONG = System.Int32;
using ID_Key = System.Int32;
#endif


public class mtable_info : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public mtable_info(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(mtable_info obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~mtable_info() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_mtable_info(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public int flags {
    set {
      HCSSTREAMPINVOKE.mtable_info_flags_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_flags_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr mlengths {
   set {
	 HCSSTREAMPINVOKE.mtable_info_mlengths_set(swigCPtr, value);
   } 
   get {
	 return HCSSTREAMPINVOKE.mtable_info_mlengths_get(swigCPtr);
   } 
  }

  public int mlengths_used {
    set {
      HCSSTREAMPINVOKE.mtable_info_mlengths_used_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_mlengths_used_get(swigCPtr);
      return ret;
    } 
  }

  public int mlengths_allocated {
    set {
      HCSSTREAMPINVOKE.mtable_info_mlengths_allocated_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_mlengths_allocated_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr m2stackoffsets {
   set {
	 HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_set(swigCPtr, value);
   } 
   get {
	 return HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_get(swigCPtr);
   } 
  }

  public int m2stackoffsets_used {
    set {
      HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_used_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_used_get(swigCPtr);
      return ret;
    } 
  }

  public int m2stackoffsets_allocated {
    set {
      HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_allocated_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_m2stackoffsets_allocated_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr m2gateoffsets {
   set {
	 HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_set(swigCPtr, value);
   } 
   get {
	 return HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_get(swigCPtr);
   } 
  }

  public int m2gateoffsets_used {
    set {
      HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_used_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_used_get(swigCPtr);
      return ret;
    } 
  }

  public int m2gateoffsets_allocated {
    set {
      HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_allocated_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_m2gateoffsets_allocated_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr dummies {
   set {
	 HCSSTREAMPINVOKE.mtable_info_dummies_set(swigCPtr, value);
   } 
   get {
	 return HCSSTREAMPINVOKE.mtable_info_dummies_get(swigCPtr);
   } 
  }

  public int dummies_used {
    set {
      HCSSTREAMPINVOKE.mtable_info_dummies_used_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_dummies_used_get(swigCPtr);
      return ret;
    } 
  }

  public int dummies_allocated {
    set {
      HCSSTREAMPINVOKE.mtable_info_dummies_allocated_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_dummies_allocated_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr patches {
   set {
	 HCSSTREAMPINVOKE.mtable_info_patches_set(swigCPtr, value);
   } 
   get {
	 return HCSSTREAMPINVOKE.mtable_info_patches_get(swigCPtr);
   } 
  }

  public int patches_used {
    set {
      HCSSTREAMPINVOKE.mtable_info_patches_used_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_patches_used_get(swigCPtr);
      return ret;
    } 
  }

  public int patches_allocated {
    set {
      HCSSTREAMPINVOKE.mtable_info_patches_allocated_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_patches_allocated_get(swigCPtr);
      return ret;
    } 
  }

  public ET_Bounding bounding {
    set {
      HCSSTREAMPINVOKE.mtable_info_bounding_set(swigCPtr, ET_Bounding.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSSTREAMPINVOKE.mtable_info_bounding_get(swigCPtr);
      ET_Bounding ret = (cPtr == IntPtr.Zero) ? null : new ET_Bounding(cPtr, false);
      return ret;
    } 
  }

  public int x_quantization {
    set {
      HCSSTREAMPINVOKE.mtable_info_x_quantization_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_x_quantization_get(swigCPtr);
      return ret;
    } 
  }

  public int y_quantization {
    set {
      HCSSTREAMPINVOKE.mtable_info_y_quantization_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_y_quantization_get(swigCPtr);
      return ret;
    } 
  }

  public int z_quantization {
    set {
      HCSSTREAMPINVOKE.mtable_info_z_quantization_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_z_quantization_get(swigCPtr);
      return ret;
    } 
  }

  public int x_quantization_normals {
    set {
      HCSSTREAMPINVOKE.mtable_info_x_quantization_normals_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_x_quantization_normals_get(swigCPtr);
      return ret;
    } 
  }

  public int y_quantization_normals {
    set {
      HCSSTREAMPINVOKE.mtable_info_y_quantization_normals_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_y_quantization_normals_get(swigCPtr);
      return ret;
    } 
  }

  public int z_quantization_normals {
    set {
      HCSSTREAMPINVOKE.mtable_info_z_quantization_normals_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.mtable_info_z_quantization_normals_get(swigCPtr);
      return ret;
    } 
  }

  public mtable_info() : this(HCSSTREAMPINVOKE.new_mtable_info(), true) {
  }

}
