/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class ET_Bounding {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ET_Bounding(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ET_Bounding obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_ET_Bounding(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX1(float value) {
    HJSTREAMJNI.ET_Bounding_x1_set(swigCPtr, this, value);
  }

  public float getX1() {
    return HJSTREAMJNI.ET_Bounding_x1_get(swigCPtr, this);
  }

  public void setY1(float value) {
    HJSTREAMJNI.ET_Bounding_y1_set(swigCPtr, this, value);
  }

  public float getY1() {
    return HJSTREAMJNI.ET_Bounding_y1_get(swigCPtr, this);
  }

  public void setZ1(float value) {
    HJSTREAMJNI.ET_Bounding_z1_set(swigCPtr, this, value);
  }

  public float getZ1() {
    return HJSTREAMJNI.ET_Bounding_z1_get(swigCPtr, this);
  }

  public void setX2(float value) {
    HJSTREAMJNI.ET_Bounding_x2_set(swigCPtr, this, value);
  }

  public float getX2() {
    return HJSTREAMJNI.ET_Bounding_x2_get(swigCPtr, this);
  }

  public void setY2(float value) {
    HJSTREAMJNI.ET_Bounding_y2_set(swigCPtr, this, value);
  }

  public float getY2() {
    return HJSTREAMJNI.ET_Bounding_y2_get(swigCPtr, this);
  }

  public void setZ2(float value) {
    HJSTREAMJNI.ET_Bounding_z2_set(swigCPtr, this, value);
  }

  public float getZ2() {
    return HJSTREAMJNI.ET_Bounding_z2_get(swigCPtr, this);
  }

  public ET_Bounding() {
    this(HJSTREAMJNI.new_ET_Bounding(), true);
  }

}
