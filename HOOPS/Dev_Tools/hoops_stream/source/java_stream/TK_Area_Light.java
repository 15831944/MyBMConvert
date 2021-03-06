/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_Area_Light extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected TK_Area_Light(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_Area_LightUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_Area_Light obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_Area_Light(swigCPtr);
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
    HJSTREAMJNI.TK_Area_Light_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.TK_Area_Light_change_ownership(this, swigCPtr, true);
  }

  protected void setM_count(int value) {
    HJSTREAMJNI.TK_Area_Light_m_count_set(swigCPtr, this, value);
  }

  protected int getM_count() {
    return HJSTREAMJNI.TK_Area_Light_m_count_get(swigCPtr, this);
  }

  protected void setM_dpoints(double[] value) {
    HJSTREAMJNI.TK_Area_Light_m_dpoints_set(swigCPtr, this, value);
  }

  protected double[] getM_dpoints() {return HJSTREAMJNI.TK_Area_Light_m_dpoints_get(swigCPtr, this);}

  protected void setM_options(char value) {
    HJSTREAMJNI.TK_Area_Light_m_options_set(swigCPtr, this, value);
  }

  protected char getM_options() {
    return HJSTREAMJNI.TK_Area_Light_m_options_get(swigCPtr, this);
  }

  protected void set_points(int count, float[] points) {
    HJSTREAMJNI.TK_Area_Light_set_points__SWIG_0(swigCPtr, this, count, points);
  }

  protected void set_points(int count) {
    HJSTREAMJNI.TK_Area_Light_set_points__SWIG_1(swigCPtr, this, count);
  }

  public TK_Area_Light() {
    this(HJSTREAMJNI.new_TK_Area_Light(), true);
    HJSTREAMJNI.TK_Area_Light_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Area_Light.class) ? HJSTREAMJNI.TK_Area_Light_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Area_Light_ReadSwigExplicitTK_Area_Light(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Area_Light.class) ? HJSTREAMJNI.TK_Area_Light_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Area_Light_WriteSwigExplicitTK_Area_Light(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == TK_Area_Light.class) ? HJSTREAMJNI.TK_Area_Light_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.TK_Area_Light_CloneSwigExplicitTK_Area_Light(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Area_Light_ReadAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Area_Light_WriteAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public void Reset() {
    if (getClass() == TK_Area_Light.class) HJSTREAMJNI.TK_Area_Light_Reset(swigCPtr, this); else HJSTREAMJNI.TK_Area_Light_ResetSwigExplicitTK_Area_Light(swigCPtr, this);
  }

  public void SetPoints(int count, float[] points) {
    HJSTREAMJNI.TK_Area_Light_SetPoints__SWIG_0(swigCPtr, this, count, points);
  }

  public void SetPoints(int count) {
    HJSTREAMJNI.TK_Area_Light_SetPoints__SWIG_1(swigCPtr, this, count);
  }

  public void SetDPoints(int count, double[] points) {
    HJSTREAMJNI.TK_Area_Light_SetDPoints__SWIG_0(swigCPtr, this, count, points);
  }

  public void SetDPoints(int count) {
    HJSTREAMJNI.TK_Area_Light_SetDPoints__SWIG_1(swigCPtr, this, count);
  }

  public double[] GetDPoints() {return HJSTREAMJNI.TK_Area_Light_GetDPoints__SWIG_0(swigCPtr, this);}

  public int GetCount() {
    return HJSTREAMJNI.TK_Area_Light_GetCount(swigCPtr, this);
  }

  public void SetOptions(int o) {
    HJSTREAMJNI.TK_Area_Light_SetOptions(swigCPtr, this, o);
  }

  public int GetOptions() {
    return HJSTREAMJNI.TK_Area_Light_GetOptions(swigCPtr, this);
  }

}
