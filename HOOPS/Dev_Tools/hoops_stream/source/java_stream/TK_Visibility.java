/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_Visibility extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected TK_Visibility(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_VisibilityUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_Visibility obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_Visibility(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    HJSTREAMJNI.TK_Visibility_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.TK_Visibility_change_ownership(this, swigCPtr, true);
  }

  protected void setM_mask(int value) {
    HJSTREAMJNI.TK_Visibility_m_mask_set(swigCPtr, this, value);
  }

  protected int getM_mask() {
    return HJSTREAMJNI.TK_Visibility_m_mask_get(swigCPtr, this);
  }

  protected void setM_value(int value) {
    HJSTREAMJNI.TK_Visibility_m_value_set(swigCPtr, this, value);
  }

  protected int getM_value() {
    return HJSTREAMJNI.TK_Visibility_m_value_get(swigCPtr, this);
  }

  public TK_Visibility() {
    this(HJSTREAMJNI.new_TK_Visibility(), true);
    HJSTREAMJNI.TK_Visibility_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Visibility.class) ? HJSTREAMJNI.TK_Visibility_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Visibility_ReadSwigExplicitTK_Visibility(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Visibility.class) ? HJSTREAMJNI.TK_Visibility_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Visibility_WriteSwigExplicitTK_Visibility(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == TK_Visibility.class) ? HJSTREAMJNI.TK_Visibility_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.TK_Visibility_CloneSwigExplicitTK_Visibility(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Visibility_ReadAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Visibility_WriteAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public void SetGeometry(int m) {
    HJSTREAMJNI.TK_Visibility_SetGeometry(swigCPtr, this, m);
  }

  public int GetGeometry() {
    return HJSTREAMJNI.TK_Visibility_GetGeometry(swigCPtr, this);
  }

  public void SetValue(int m) {
    HJSTREAMJNI.TK_Visibility_SetValue(swigCPtr, this, m);
  }

  public int GetValue() {
    return HJSTREAMJNI.TK_Visibility_GetValue(swigCPtr, this);
  }

}