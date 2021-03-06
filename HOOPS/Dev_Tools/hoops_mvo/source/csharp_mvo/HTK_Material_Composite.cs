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


public class HTK_Material_Composite : TK_Material {
  private HandleRef swigCPtr;

  public HTK_Material_Composite(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HTK_Material_CompositeUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HTK_Material_Composite obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HTK_Material_Composite() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HTK_Material_Composite(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HTK_Material_Composite(HMaterialLibrary hmat, MVO_POINTER_SIZED_INT key) : this(HCSMVOPINVOKE.new_HTK_Material_Composite__SWIG_0(HMaterialLibrary.getCPtr(hmat), key), true) {
  }

  public HTK_Material_Composite(HMaterialLibrary hmat) : this(HCSMVOPINVOKE.new_HTK_Material_Composite__SWIG_1(HMaterialLibrary.getCPtr(hmat)), true) {
  }

  public override TK_Status Interpret(BStreamFileToolkit tk, int key, int variant) {
    TK_Status ret = (TK_Status)HCSMVOPINVOKE.HTK_Material_Composite_Interpret(swigCPtr, BStreamFileToolkit.getCPtr(tk), key, variant);
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Execute(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSMVOPINVOKE.HTK_Material_Composite_Execute(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

}
