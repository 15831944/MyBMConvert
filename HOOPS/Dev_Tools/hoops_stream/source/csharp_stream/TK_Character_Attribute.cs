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


public class TK_Character_Attribute : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public TK_Character_Attribute(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(TK_Character_Attribute obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_Character_Attribute() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_TK_Character_Attribute(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public float size {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_size_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_size_get(swigCPtr);
      return ret;
    } 
  }

  public float vertical_offset {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_vertical_offset_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_vertical_offset_get(swigCPtr);
      return ret;
    } 
  }

  public float horizontal_offset {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_horizontal_offset_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_horizontal_offset_get(swigCPtr);
      return ret;
    } 
  }

  public float slant {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_slant_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_slant_get(swigCPtr);
      return ret;
    } 
  }

  public float rotation {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_rotation_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_rotation_get(swigCPtr);
      return ret;
    } 
  }

  public float width_scale {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_width_scale_set(swigCPtr, value);
    } 
    get {
      float ret = HCSSTREAMPINVOKE.TK_Character_Attribute_width_scale_get(swigCPtr);
      return ret;
    } 
  }

  public ushort mask {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_mask_set(swigCPtr, value);
    } 
    get {
      ushort ret = HCSSTREAMPINVOKE.TK_Character_Attribute_mask_get(swigCPtr);
      return ret;
    } 
  }

  public ushort value {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_value_set(swigCPtr, value);
    } 
    get {
      ushort ret = HCSSTREAMPINVOKE.TK_Character_Attribute_value_get(swigCPtr);
      return ret;
    } 
  }

  public byte size_units {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_size_units_set(swigCPtr, value);
    } 
    get {
      byte ret = HCSSTREAMPINVOKE.TK_Character_Attribute_size_units_get(swigCPtr);
      return ret;
    } 
  }

  public byte vertical_offset_units {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_vertical_offset_units_set(swigCPtr, value);
    } 
    get {
      byte ret = HCSSTREAMPINVOKE.TK_Character_Attribute_vertical_offset_units_get(swigCPtr);
      return ret;
    } 
  }

  public byte horizontal_offset_units {
    set {
      HCSSTREAMPINVOKE.TK_Character_Attribute_horizontal_offset_units_set(swigCPtr, value);
    } 
    get {
      byte ret = HCSSTREAMPINVOKE.TK_Character_Attribute_horizontal_offset_units_get(swigCPtr);
      return ret;
    } 
  }

  public TK_Character_Attribute() : this(HCSSTREAMPINVOKE.new_TK_Character_Attribute(), true) {
  }

}
