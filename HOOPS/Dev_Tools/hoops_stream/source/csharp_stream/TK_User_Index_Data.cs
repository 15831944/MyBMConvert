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


public class TK_User_Index_Data : BBaseOpcodeHandler {
  private HandleRef swigCPtr;

  public TK_User_Index_Data(IntPtr cPtr, bool cMemoryOwn) : base(HCSSTREAMPINVOKE.TK_User_Index_DataUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(TK_User_Index_Data obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_User_Index_Data() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_TK_User_Index_Data(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_User_Index_Data() : this(HCSSTREAMPINVOKE.new_TK_User_Index_Data(), true) {
  }

  public override TK_Status Read(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_User_Index_Data_Read(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Write(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_User_Index_Data_Write(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_User_Index_Data_Clone(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler));
    if (HCSSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override void Reset() {
    HCSSTREAMPINVOKE.TK_User_Index_Data_Reset(swigCPtr);
  }

  public void SetIndices(int count, int[] indices, SWIGTYPE_p_p_void values, int[] sizes) {
    HCSSTREAMPINVOKE.TK_User_Index_Data_SetIndices__SWIG_0(swigCPtr, count, indices, SWIGTYPE_p_p_void.getCPtr(values), sizes);
  }

  public void SetIndices(int count) {
    HCSSTREAMPINVOKE.TK_User_Index_Data_SetIndices__SWIG_1(swigCPtr, count);
  }

  public int GetCount() {
    int ret = HCSSTREAMPINVOKE.TK_User_Index_Data_GetCount(swigCPtr);
    return ret;
  }

  public IntPtr GetIndices() {return HCSSTREAMPINVOKE.TK_User_Index_Data_GetIndices__SWIG_0(swigCPtr);}

  public SWIGTYPE_p_p_void GetValues() {
    IntPtr cPtr = HCSSTREAMPINVOKE.TK_User_Index_Data_GetValues__SWIG_0(swigCPtr);
    SWIGTYPE_p_p_void ret = (cPtr == IntPtr.Zero) ? null : new SWIGTYPE_p_p_void(cPtr, false);
    return ret;
  }

  public IntPtr GetSizes() {return HCSSTREAMPINVOKE.TK_User_Index_Data_GetSizes__SWIG_0(swigCPtr);}

}