/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HBestImageDriver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HBestImageDriver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HBestImageDriver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HBestImageDriver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HBestImageDriver(String prefer_type) {
    this(HJMVOJNI.new_HBestImageDriver__SWIG_0(prefer_type), true);
  }

  public HBestImageDriver() {
    this(HJMVOJNI.new_HBestImageDriver__SWIG_1(), true);
  }

  public long GetKey() {return HJMVOJNI.HBestImageDriver_GetKey(swigCPtr, this);}

}
