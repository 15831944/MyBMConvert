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


public class HUtilityTextParser : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HUtilityTextParser(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HUtilityTextParser obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HUtilityTextParser() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HUtilityTextParser(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public HUtilityTextParser() : this(HCSMVOPINVOKE.new_HUtilityTextParser(), true) {
  }

  public void SetDelimiterList(delimiter_t dlist, uint length) {
    HCSMVOPINVOKE.HUtilityTextParser_SetDelimiterList(swigCPtr, delimiter_t.getCPtr(dlist), length);
  }

  public char GetStartDelimiter() {
    char ret = HCSMVOPINVOKE.HUtilityTextParser_GetStartDelimiter(swigCPtr);
    return ret;
  }

  public char GetEndDelimiter() {
    char ret = HCSMVOPINVOKE.HUtilityTextParser_GetEndDelimiter(swigCPtr);
    return ret;
  }

  public char PeekAt(uint i) {
    char ret = HCSMVOPINVOKE.HUtilityTextParser_PeekAt__SWIG_0(swigCPtr, i);
    return ret;
  }

  public char PeekAt() {
    char ret = HCSMVOPINVOKE.HUtilityTextParser_PeekAt__SWIG_1(swigCPtr);
    return ret;
  }

  public void Rewind() {
    HCSMVOPINVOKE.HUtilityTextParser_Rewind(swigCPtr);
  }

  public void SkipAhead(int snum) {
    HCSMVOPINVOKE.HUtilityTextParser_SkipAhead(swigCPtr, snum);
  }

  public bool ParseBuffer(System.Text.StringBuilder tempbuf, int[] dnum, delimiter_t dlist, uint length, bool checkforquote) {
    bool ret = HCSMVOPINVOKE.HUtilityTextParser_ParseBuffer__SWIG_0(swigCPtr, tempbuf, dnum, delimiter_t.getCPtr(dlist), length, checkforquote);
    return ret;
  }

  public bool ParseBuffer(System.Text.StringBuilder tempbuf, int[] dnum, delimiter_t dlist, uint length) {
    bool ret = HCSMVOPINVOKE.HUtilityTextParser_ParseBuffer__SWIG_1(swigCPtr, tempbuf, dnum, delimiter_t.getCPtr(dlist), length);
    return ret;
  }

  public bool ParseBuffer(string searchbuffer, System.Text.StringBuilder tempbuf, int[] dnum, delimiter_t dlist, uint length, bool checkforquote) {
    bool ret = HCSMVOPINVOKE.HUtilityTextParser_ParseBuffer__SWIG_2(swigCPtr, searchbuffer, tempbuf, dnum, delimiter_t.getCPtr(dlist), length, checkforquote);
    return ret;
  }

  public bool ParseBuffer(string searchbuffer, System.Text.StringBuilder tempbuf, int[] dnum, delimiter_t dlist, uint length) {
    bool ret = HCSMVOPINVOKE.HUtilityTextParser_ParseBuffer__SWIG_3(swigCPtr, searchbuffer, tempbuf, dnum, delimiter_t.getCPtr(dlist), length);
    return ret;
  }

  public void InsertBuffer(string buffer, uint bufferlength) {
    HCSMVOPINVOKE.HUtilityTextParser_InsertBuffer(swigCPtr, buffer, bufferlength);
  }

}
