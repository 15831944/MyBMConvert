/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HFrExtent extends HConstFRSimpType {
  private long swigCPtr;

  public HFrExtent(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HFrExtent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HFrExtent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HFrExtent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HFrExtent() {
    this(HJMVOJNI.new_HFrExtent__SWIG_0(), true);
  }

  public HFrExtent(int min, int max) {
    this(HJMVOJNI.new_HFrExtent__SWIG_1(min, max), true);
  }

  public void SetMultiplier(int mp) {
    HJMVOJNI.HFrExtent_SetMultiplier(swigCPtr, this, mp);
  }

  public void Set(HConstantFrameRate pCfr, int SimpLevel) {
    HJMVOJNI.HFrExtent_Set(swigCPtr, this, HConstantFrameRate.getCPtr(pCfr), pCfr, SimpLevel);
  }

  public void SetUseLod(boolean ul) {
    HJMVOJNI.HFrExtent_SetUseLod(swigCPtr, this, ul);
  }

  public boolean GetUseLod() {
    return HJMVOJNI.HFrExtent_GetUseLod(swigCPtr, this);
  }

  public ConstFRType GetFRType() {
    return ConstFRType.swigToEnum(HJMVOJNI.HFrExtent_GetFRType(swigCPtr, this));
  }

  public static HConstFRSimpType Create(int min, int max) {
    long cPtr = HJMVOJNI.HFrExtent_Create(min, max);
    return (cPtr == 0) ? null : new HConstFRSimpType(cPtr, false);
  }

}
