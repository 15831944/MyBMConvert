/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_PolyCylinder extends TK_Polyhedron {
  private long swigCPtr;

  protected TK_PolyCylinder(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_PolyCylinderUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_PolyCylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_PolyCylinder(swigCPtr);
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
    HJSTREAMJNI.TK_PolyCylinder_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.TK_PolyCylinder_change_ownership(this, swigCPtr, true);
  }

  protected void setM_count(int value) {
    HJSTREAMJNI.TK_PolyCylinder_m_count_set(swigCPtr, this, value);
  }

  protected int getM_count() {
    return HJSTREAMJNI.TK_PolyCylinder_m_count_get(swigCPtr, this);
  }

  protected void setM_dpoints(double[] value) {
    HJSTREAMJNI.TK_PolyCylinder_m_dpoints_set(swigCPtr, this, value);
  }

  protected double[] getM_dpoints() {return HJSTREAMJNI.TK_PolyCylinder_m_dpoints_get(swigCPtr, this);}

  protected void setM_radius_count(int value) {
    HJSTREAMJNI.TK_PolyCylinder_m_radius_count_set(swigCPtr, this, value);
  }

  protected int getM_radius_count() {
    return HJSTREAMJNI.TK_PolyCylinder_m_radius_count_get(swigCPtr, this);
  }

  protected void setM_dradii(double[] value) {
    HJSTREAMJNI.TK_PolyCylinder_m_dradii_set(swigCPtr, this, value);
  }

  protected double[] getM_dradii() {return HJSTREAMJNI.TK_PolyCylinder_m_dradii_get(swigCPtr, this);}

  protected void setM_flags(short value) {
    HJSTREAMJNI.TK_PolyCylinder_m_flags_set(swigCPtr, this, value);
  }

  protected short getM_flags() {
    return HJSTREAMJNI.TK_PolyCylinder_m_flags_get(swigCPtr, this);
  }

  protected void setM_normals(SWIGTYPE_p_float value) {
    HJSTREAMJNI.TK_PolyCylinder_m_normals_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  protected SWIGTYPE_p_float getM_normals() {
    long cPtr = HJSTREAMJNI.TK_PolyCylinder_m_normals_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public TK_PolyCylinder() {
    this(HJSTREAMJNI.new_TK_PolyCylinder(), true);
    HJSTREAMJNI.TK_PolyCylinder_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_PolyCylinder_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_PolyCylinder_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_PolyCylinder_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_PolyCylinder_ReadAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_PolyCylinder_WriteAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public void Reset() {
    if (getClass() == TK_PolyCylinder.class) HJSTREAMJNI.TK_PolyCylinder_Reset(swigCPtr, this); else HJSTREAMJNI.TK_PolyCylinder_ResetSwigExplicitTK_PolyCylinder(swigCPtr, this);
  }

  public void SetRadii(int count, float[] radii) {
    HJSTREAMJNI.TK_PolyCylinder_SetRadii__SWIG_0(swigCPtr, this, count, radii);
  }

  public void SetRadii(int count) {
    HJSTREAMJNI.TK_PolyCylinder_SetRadii__SWIG_1(swigCPtr, this, count);
  }

  public void SetRadius(float radius) {
    HJSTREAMJNI.TK_PolyCylinder_SetRadius(swigCPtr, this, radius);
  }

  public double[] GetDPoints() {return HJSTREAMJNI.TK_PolyCylinder_GetDPoints__SWIG_0(swigCPtr, this);}

  public void SetDRadii(int count, double[] radii) {
    HJSTREAMJNI.TK_PolyCylinder_SetDRadii__SWIG_0(swigCPtr, this, count, radii);
  }

  public void SetDRadii(int count) {
    HJSTREAMJNI.TK_PolyCylinder_SetDRadii__SWIG_1(swigCPtr, this, count);
  }

  public void SetDRadius(double radius) {
    HJSTREAMJNI.TK_PolyCylinder_SetDRadius(swigCPtr, this, radius);
  }

  public double[] GetDRadii() {return HJSTREAMJNI.TK_PolyCylinder_GetDRadii__SWIG_0(swigCPtr, this);}

  public int GetCount() {
    return HJSTREAMJNI.TK_PolyCylinder_GetCount(swigCPtr, this);
  }

  public int GetRadiusCount() {
    return HJSTREAMJNI.TK_PolyCylinder_GetRadiusCount(swigCPtr, this);
  }

  public void SetCaps(int f) {
    HJSTREAMJNI.TK_PolyCylinder_SetCaps(swigCPtr, this, f);
  }

  public int GetCaps() {
    return HJSTREAMJNI.TK_PolyCylinder_GetCaps(swigCPtr, this);
  }

  public void SetEndNormal(int index, float[] normal) {
    HJSTREAMJNI.TK_PolyCylinder_SetEndNormal__SWIG_0(swigCPtr, this, index, normal);
  }

  public void SetEndNormal(int index) {
    HJSTREAMJNI.TK_PolyCylinder_SetEndNormal__SWIG_1(swigCPtr, this, index);
  }

  public final static class Capping_Options {
    public final static Capping_Options TKCYL_NORMAL_FIRST = new Capping_Options("TKCYL_NORMAL_FIRST", HJSTREAMJNI.TK_PolyCylinder_TKCYL_NORMAL_FIRST_get());
    public final static Capping_Options TKCYL_NORMAL_SECOND = new Capping_Options("TKCYL_NORMAL_SECOND", HJSTREAMJNI.TK_PolyCylinder_TKCYL_NORMAL_SECOND_get());
    public final static Capping_Options TKCYL_OPTIONALS = new Capping_Options("TKCYL_OPTIONALS", HJSTREAMJNI.TK_PolyCylinder_TKCYL_OPTIONALS_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Capping_Options swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Capping_Options.class + " with value " + swigValue);
    }

    private Capping_Options(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Capping_Options(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Capping_Options(String swigName, Capping_Options swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Capping_Options[] swigValues = { TKCYL_NORMAL_FIRST, TKCYL_NORMAL_SECOND, TKCYL_OPTIONALS };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
