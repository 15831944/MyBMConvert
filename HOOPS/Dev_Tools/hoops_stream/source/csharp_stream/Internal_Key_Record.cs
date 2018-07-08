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


public class Internal_Key_Record : BControlledMemoryObject {
  private HandleRef swigCPtr;

  public Internal_Key_Record(IntPtr cPtr, bool cMemoryOwn) : base(HCSSTREAMPINVOKE.Internal_Key_RecordUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(Internal_Key_Record obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~Internal_Key_Record() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSSTREAMPINVOKE.delete_Internal_Key_Record(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public Internal_Key_Record() : this(HCSSTREAMPINVOKE.new_Internal_Key_Record(), true) {
  }

  public TK_Status add_key(ID_Key key) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.Internal_Key_Record_add_key(swigCPtr, key);
    return ret;
  }

  public TK_Status find_key(ID_Key key) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.Internal_Key_Record_find_key(swigCPtr, key);
    return ret;
  }

  public void clean() {
    HCSSTREAMPINVOKE.Internal_Key_Record_clean(swigCPtr);
  }

}