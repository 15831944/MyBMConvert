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


public class Recorded_Instance : BControlledMemoryObject {
  private HandleRef swigCPtr;

  public Recorded_Instance(IntPtr cPtr, bool cMemoryOwn) : base(HCSSTREAMPINVOKE.Recorded_InstanceUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(Recorded_Instance obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~Recorded_Instance() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_Recorded_Instance(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public Recorded_Instance m_next {
    set {
      HCSSTREAMPINVOKE.Recorded_Instance_m_next_set(swigCPtr, Recorded_Instance.getCPtr(value));
    } 
    get {
      IntPtr cPtr = HCSSTREAMPINVOKE.Recorded_Instance_m_next_get(swigCPtr);
      Recorded_Instance ret = (cPtr == IntPtr.Zero) ? null : new Recorded_Instance(cPtr, false);
      return ret;
    } 
  }

  public int m_variant {
    set {
      HCSSTREAMPINVOKE.Recorded_Instance_m_variant_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.Recorded_Instance_m_variant_get(swigCPtr);
      return ret;
    } 
  }

  public int m_arbitrary_index {
    set {
      HCSSTREAMPINVOKE.Recorded_Instance_m_arbitrary_index_set(swigCPtr, value);
    } 
    get {
      int ret = HCSSTREAMPINVOKE.Recorded_Instance_m_arbitrary_index_get(swigCPtr);
      return ret;
    } 
  }

  public bool m_basis_valid {
    set {
      HCSSTREAMPINVOKE.Recorded_Instance_m_basis_valid_set(swigCPtr, value);
    } 
    get {
      bool ret = HCSSTREAMPINVOKE.Recorded_Instance_m_basis_valid_get(swigCPtr);
      return ret;
    } 
  }

  public byte m_opcode {
    set {
      HCSSTREAMPINVOKE.Recorded_Instance_m_opcode_set(swigCPtr, value);
    } 
    get {
      byte ret = HCSSTREAMPINVOKE.Recorded_Instance_m_opcode_get(swigCPtr);
      return ret;
    } 
  }

  public Recorded_Instance(ID_Key key, int variant, byte op, int val1, int val2, int val3) : this(HCSSTREAMPINVOKE.new_Recorded_Instance(key, variant, op, val1, val2, val3), true) {
  }

  public bool basis_valid() {
    bool ret = HCSSTREAMPINVOKE.Recorded_Instance_basis_valid(swigCPtr);
    return ret;
  }

  public bool generate_basis(int count, float[] points) {
    bool ret = HCSSTREAMPINVOKE.Recorded_Instance_generate_basis(swigCPtr, count, points);
    return ret;
  }

}
