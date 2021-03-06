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


public class HTK_Polyhedron : TK_Polyhedron {
  private HandleRef swigCPtr;

  public HTK_Polyhedron(IntPtr cPtr, bool cMemoryOwn) : base(HCSSTREAMPINVOKE.HTK_PolyhedronUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HTK_Polyhedron obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HTK_Polyhedron() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_HTK_Polyhedron(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_Status HExecute(BStreamFileToolkit tk, int mesh_columns) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Polyhedron_HExecute__SWIG_0(swigCPtr, BStreamFileToolkit.getCPtr(tk), mesh_columns);
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status HExecute(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Polyhedron_HExecute__SWIG_1(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status HInterpret(BStreamFileToolkit tk, SWIGTYPE_p_HC_KEY key, int lod, int mesh_columns) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Polyhedron_HInterpret__SWIG_0(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_HC_KEY.getCPtr(key), lod, mesh_columns);
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status HInterpret(BStreamFileToolkit tk, SWIGTYPE_p_HC_KEY key, int lod) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Polyhedron_HInterpret__SWIG_1(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_HC_KEY.getCPtr(key), lod);
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status HInterpret(BStreamFileToolkit tk, SWIGTYPE_p_HC_KEY key) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Polyhedron_HInterpret__SWIG_2(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_HC_KEY.getCPtr(key));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public bool match_points(Recorded_Instance instance, float[] instance_points) {
    bool ret = HCSSTREAMPINVOKE.HTK_Polyhedron_match_points(swigCPtr, Recorded_Instance.getCPtr(instance), instance_points);
    return ret;
  }

  public bool match_attributes(Recorded_Instance instance) {
    bool ret = HCSSTREAMPINVOKE.HTK_Polyhedron_match_attributes(swigCPtr, Recorded_Instance.getCPtr(instance));
    return ret;
  }

}
