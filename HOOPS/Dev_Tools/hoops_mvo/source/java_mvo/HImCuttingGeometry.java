/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HImCuttingGeometry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HImCuttingGeometry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HImCuttingGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HImCuttingGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HImCuttingGeometry() {
    this(HJMVOJNI.new_HImCuttingGeometry(), true);
  }

  public void CreateCuttingGeometry(long source_key, long target_key, int cutting_type, int body_level) {
    HJMVOJNI.HImCuttingGeometry_CreateCuttingGeometry__SWIG_0(swigCPtr, this, source_key, target_key, cutting_type, body_level);
  }

  public void CreateCuttingGeometry(long source_key, long target_key, int cutting_type) {
    HJMVOJNI.HImCuttingGeometry_CreateCuttingGeometry__SWIG_1(swigCPtr, this, source_key, target_key, cutting_type);
  }

  public void CreateCuttingGeometry(long source_key, long target_key) {
    HJMVOJNI.HImCuttingGeometry_CreateCuttingGeometry__SWIG_2(swigCPtr, this, source_key, target_key);
  }

  public void CreateCuttingGeometry(long source_key, long target_key, boolean honor_modelling_matrices) {
    HJMVOJNI.HImCuttingGeometry_CreateCuttingGeometry__SWIG_3(swigCPtr, this, source_key, target_key, honor_modelling_matrices);
  }

  public static void RegisterCallbacks() {
    HJMVOJNI.HImCuttingGeometry_RegisterCallbacks();
  }

  public void SetSmallestFeature(float smallest_feature) {
    HJMVOJNI.HImCuttingGeometry_SetSmallestFeature(swigCPtr, this, smallest_feature);
  }

  public float GetSmallestFeature() {
    return HJMVOJNI.HImCuttingGeometry_GetSmallestFeature(swigCPtr, this);
  }

  public void SetTolerance(float tolerance) {
    HJMVOJNI.HImCuttingGeometry_SetTolerance(swigCPtr, this, tolerance);
  }

  public float GetTolerance() {
    return HJMVOJNI.HImCuttingGeometry_GetTolerance(swigCPtr, this);
  }

}
