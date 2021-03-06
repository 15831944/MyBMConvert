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


public class HUserOptions : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HUserOptions(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HUserOptions obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HUserOptions() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HUserOptions(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public System.Text.StringBuilder m_data {
	set { HCSMVOPINVOKE.HUserOptions_m_data_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.HUserOptions_m_data_get(swigCPtr); } 
  }

  public int m_length {
    set {
      HCSMVOPINVOKE.HUserOptions_m_length_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HUserOptions_m_length_get(swigCPtr);
      return ret;
    } 
  }

  public bool m_valid {
    set {
      HCSMVOPINVOKE.HUserOptions_m_valid_set(swigCPtr, value);
    } 
    get {
      bool ret = HCSMVOPINVOKE.HUserOptions_m_valid_get(swigCPtr);
      return ret;
    } 
  }

  public HUserOptions() : this(HCSMVOPINVOKE.new_HUserOptions__SWIG_0(), true) {
  }

  public HUserOptions(HUserOptions in_data) : this(HCSMVOPINVOKE.new_HUserOptions__SWIG_1(HUserOptions.getCPtr(in_data)), true) {
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public bool IsValid() {
    bool ret = HCSMVOPINVOKE.HUserOptions_IsValid(swigCPtr);
    return ret;
  }

  public string Show_User_Options() {
    string ret = HCSMVOPINVOKE.HUserOptions_Show_User_Options(swigCPtr);
    return ret;
  }

  public string Show_One_Net_User_Option(string which) {
    string ret = HCSMVOPINVOKE.HUserOptions_Show_One_Net_User_Option(swigCPtr, which);
    return ret;
  }

  public string Show_One_User_Option(string which) {
    string ret = HCSMVOPINVOKE.HUserOptions_Show_One_User_Option(swigCPtr, which);
    return ret;
  }

  public string Show_Net_User_Options() {
    string ret = HCSMVOPINVOKE.HUserOptions_Show_Net_User_Options(swigCPtr);
    return ret;
  }

}
