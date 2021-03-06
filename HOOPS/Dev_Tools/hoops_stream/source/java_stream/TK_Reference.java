/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_Reference extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected TK_Reference(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_ReferenceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_Reference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_Reference(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TK_Reference() {
    this(HJSTREAMJNI.new_TK_Reference(), true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Reference_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Reference_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Reference_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Reference_ReadAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Reference_WriteAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public void Reset() {
    HJSTREAMJNI.TK_Reference_Reset(swigCPtr, this);
  }

  public void SetIndex(int index) {
    HJSTREAMJNI.TK_Reference_SetIndex(swigCPtr, this, index);
  }

  public int GetIndex() {
    return HJSTREAMJNI.TK_Reference_GetIndex(swigCPtr, this);
  }

  public void SetCondition(String condition) {
    HJSTREAMJNI.TK_Reference_SetCondition__SWIG_0(swigCPtr, this, condition);
  }

  public void SetCondition(int length) {
    HJSTREAMJNI.TK_Reference_SetCondition__SWIG_1(swigCPtr, this, length);
  }

  public String GetCondition() {return HJSTREAMJNI.TK_Reference_GetCondition__SWIG_0(swigCPtr, this);}

  public void SetFollow(boolean f) {
    HJSTREAMJNI.TK_Reference_SetFollow(swigCPtr, this, f);
  }

  public boolean GetFollow() {
    return HJSTREAMJNI.TK_Reference_GetFollow(swigCPtr, this);
  }

}
