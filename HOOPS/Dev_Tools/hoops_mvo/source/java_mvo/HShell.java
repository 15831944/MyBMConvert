/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HShell {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HShell(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HShell obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HShell(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HShell() {
    this(HJMVOJNI.new_HShell(), true);
  }

  public void setPoint_list_len(int value) {
    HJMVOJNI.HShell_point_list_len_set(swigCPtr, this, value);
  }

  public int getPoint_list_len() {
    return HJMVOJNI.HShell_point_list_len_get(swigCPtr, this);
  }

  public void setFace_list_len(int value) {
    HJMVOJNI.HShell_face_list_len_set(swigCPtr, this, value);
  }

  public int getFace_list_len() {
    return HJMVOJNI.HShell_face_list_len_get(swigCPtr, this);
  }

  public void setFace_count(int value) {
    HJMVOJNI.HShell_face_count_set(swigCPtr, this, value);
  }

  public int getFace_count() {
    return HJMVOJNI.HShell_face_count_get(swigCPtr, this);
  }

  public void setRegion_count(int value) {
    HJMVOJNI.HShell_region_count_set(swigCPtr, this, value);
  }

  public int getRegion_count() {
    return HJMVOJNI.HShell_region_count_get(swigCPtr, this);
  }

  public void get_point_list(HPoint[] values, int count) {
    HJMVOJNI.HShell_get_point_list(swigCPtr, this, HPoint.cArrayUnwrap(values), count);
  }

  public void get_normal_list(HPoint[] values, int count) {
    HJMVOJNI.HShell_get_normal_list(swigCPtr, this, HPoint.cArrayUnwrap(values), count);
  }

  public void get_face_list(int[] values, int count) {
    HJMVOJNI.HShell_get_face_list(swigCPtr, this, values, count);
  }

  public void get_region_list(int[] values, int count) {
    HJMVOJNI.HShell_get_region_list(swigCPtr, this, values, count);
  }

}
