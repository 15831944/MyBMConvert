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


public class TK_Reference : BBaseOpcodeHandler {
  private HandleRef swigCPtr;

  public TK_Reference(IntPtr cPtr, bool cMemoryOwn) : base(HCSSTREAMPINVOKE.TK_ReferenceUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(TK_Reference obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_Reference() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_TK_Reference(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_Reference() : this(HCSSTREAMPINVOKE.new_TK_Reference(), true) {
  }

  public override TK_Status Read(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Reference_Read(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Write(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Reference_Write(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Reference_Clone(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Reference_ReadAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Reference_WriteAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override void Reset() {
    HCSSTREAMPINVOKE.TK_Reference_Reset(swigCPtr);
  }

  public void SetIndex(int index) {
    HCSSTREAMPINVOKE.TK_Reference_SetIndex(swigCPtr, index);
  }

  public ID_Key GetIndex() {return HCSSTREAMPINVOKE.TK_Reference_GetIndex(swigCPtr);}

  public void SetCondition(string condition) {
    HCSSTREAMPINVOKE.TK_Reference_SetCondition__SWIG_0(swigCPtr, condition);
  }

  public void SetCondition(int length) {
    HCSSTREAMPINVOKE.TK_Reference_SetCondition__SWIG_1(swigCPtr, length);
  }

  public string GetCondition() {return HCSSTREAMPINVOKE.TK_Reference_GetCondition__SWIG_0(swigCPtr);}

  public void SetFollow(bool f) {
    HCSSTREAMPINVOKE.TK_Reference_SetFollow(swigCPtr, f);
  }

  public bool GetFollow() {
    bool ret = HCSSTREAMPINVOKE.TK_Reference_GetFollow(swigCPtr);
    return ret;
  }

}
