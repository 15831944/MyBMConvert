/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;
import com.techsoft.hoops.*;
public class Frame {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Frame(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Frame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_Frame(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Frame() {
    this(HJMVOJNI.new_Frame__SWIG_0(), true);
  }

  public Frame(Frame that) {
    this(HJMVOJNI.new_Frame__SWIG_1(Frame.getCPtr(that), that), true);
  }

  public void Set(Frame that) {
    HJMVOJNI.Frame_Set(swigCPtr, this, Frame.getCPtr(that), that);
  }

  public int GetPolylineCount() {return HJMVOJNI.Frame_GetPolylineCount(swigCPtr, this);}

  public void GetPolylines(int[] out_count, Polyline[] out_polylines) {
    HJMVOJNI.Frame_GetPolylines(swigCPtr, this, out_count, Polyline.cArrayUnwrap(out_polylines));
  }

  public void SetPolylines(int in_count, Polyline[] in_polylines) {
    HJMVOJNI.Frame_SetPolylines(swigCPtr, this, in_count, Polyline.cArrayUnwrap(in_polylines));
  }

}
