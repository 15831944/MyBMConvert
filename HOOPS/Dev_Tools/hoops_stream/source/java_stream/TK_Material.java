/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_Material extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected TK_Material(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_MaterialUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_Material obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_Material(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TK_Material() {
    this(HJSTREAMJNI.new_TK_Material(), true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public void Reset() {
    HJSTREAMJNI.TK_Material_Reset(swigCPtr, this);
  }

  public TK_Status PushUserData(String buffer, int buffer_size, boolean tally_total_size) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_PushUserData__SWIG_0(swigCPtr, this, buffer, buffer_size, tally_total_size));
  }

  public TK_Status PushUserData(String buffer, int buffer_size) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_PushUserData__SWIG_1(swigCPtr, this, buffer, buffer_size));
  }

  public TK_Status GetBlock(SWIGTYPE_p_p_char ptr, int[] buffer_size) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Material_GetBlock(swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(ptr), buffer_size));
  }

}
