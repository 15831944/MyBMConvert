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


public class TK_External_Reference_Unicode : BBaseOpcodeHandler {
  private HandleRef swigCPtr;

  internal TK_External_Reference_Unicode(IntPtr cPtr, bool cMemoryOwn) : base(HCSBSTREAMPINVOKE.TK_External_Reference_UnicodeUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(TK_External_Reference_Unicode obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_External_Reference_Unicode() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSBSTREAMPINVOKE.delete_TK_External_Reference_Unicode(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_External_Reference_Unicode() : this(HCSBSTREAMPINVOKE.new_TK_External_Reference_Unicode(), true) {
  }

  public override TK_Status Read(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_Read(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Write(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_Write(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_Clone(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Execute(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_Execute(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override void Reset() {
    HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_Reset(swigCPtr);
  }

  public void SetString(SWIGTYPE_p_wchar_t arg0) {
    HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_SetString__SWIG_0(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(arg0));
  }

  public void SetString(int length) {
    HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_SetString__SWIG_1(swigCPtr, length);
  }

  public SWIGTYPE_p_wchar_t GetString() {
    IntPtr cPtr = HCSBSTREAMPINVOKE.TK_External_Reference_Unicode_GetString__SWIG_0(swigCPtr);
    SWIGTYPE_p_wchar_t ret = (cPtr == IntPtr.Zero) ? null : new SWIGTYPE_p_wchar_t(cPtr, false);
    return ret;
  }

}
