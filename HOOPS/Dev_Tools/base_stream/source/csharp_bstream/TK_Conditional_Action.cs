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


public class TK_Conditional_Action : BBaseOpcodeHandler {
  private HandleRef swigCPtr;

  internal TK_Conditional_Action(IntPtr cPtr, bool cMemoryOwn) : base(HCSBSTREAMPINVOKE.TK_Conditional_ActionUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(TK_Conditional_Action obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_Conditional_Action() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSBSTREAMPINVOKE.delete_TK_Conditional_Action(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_Conditional_Action() : this(HCSBSTREAMPINVOKE.new_TK_Conditional_Action(), true) {
  }

  public override TK_Status Read(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Conditional_Action_Read(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Write(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Conditional_Action_Write(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Conditional_Action_Clone(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Conditional_Action_ReadAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Conditional_Action_WriteAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override void Reset() {
    HCSBSTREAMPINVOKE.TK_Conditional_Action_Reset(swigCPtr);
  }

  public void SetCondition(string options) {
    HCSBSTREAMPINVOKE.TK_Conditional_Action_SetCondition__SWIG_0(swigCPtr, options);
  }

  public void SetCondition(int length) {
    HCSBSTREAMPINVOKE.TK_Conditional_Action_SetCondition__SWIG_1(swigCPtr, length);
  }

  public string GetCondition() {return HCSBSTREAMPINVOKE.TK_Conditional_Action_GetCondition__SWIG_0(swigCPtr);}

  public int GetLength() {
    int ret = HCSBSTREAMPINVOKE.TK_Conditional_Action_GetLength(swigCPtr);
    return ret;
  }

  public void SetAction(int at) {
    HCSBSTREAMPINVOKE.TK_Conditional_Action_SetAction(swigCPtr, at);
  }

  public int GetAction() {
    int ret = HCSBSTREAMPINVOKE.TK_Conditional_Action_GetAction(swigCPtr);
    return ret;
  }

  public void SetOptions(int at) {
    HCSBSTREAMPINVOKE.TK_Conditional_Action_SetOptions(swigCPtr, at);
  }

  public int GetOptions() {
    int ret = HCSBSTREAMPINVOKE.TK_Conditional_Action_GetOptions(swigCPtr);
    return ret;
  }

}
