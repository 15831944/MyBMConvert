/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;
import com.techsoft.hoops.*;
public class Polygon {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Polygon(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Polygon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_Polygon(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected static long[] cArrayUnwrap(Polygon[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = Polygon.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static Polygon[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    Polygon[] arrayWrapper = new Polygon[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new Polygon(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public Polygon() {
    this(HJMVOJNI.new_Polygon__SWIG_0(), true);
  }

  public Polygon(Polygon that) {
    this(HJMVOJNI.new_Polygon__SWIG_1(Polygon.getCPtr(that), that), true);
  }

  public void Set(Polygon that) {
    HJMVOJNI.Polygon_Set(swigCPtr, this, Polygon.getCPtr(that), that);
  }

  public void GetRGBColor(HPoint out_color) {
    HJMVOJNI.Polygon_GetRGBColor__SWIG_0(swigCPtr, this, HPoint.getCPtr(out_color), out_color);
  }

  public void GetRGBColor(float[] out_r, float[] out_g, float[] out_b) {
    HJMVOJNI.Polygon_GetRGBColor__SWIG_1(swigCPtr, this, out_r, out_g, out_b);
  }

  public void SetRGBColor(HPoint in_color) {
    HJMVOJNI.Polygon_SetRGBColor__SWIG_0(swigCPtr, this, HPoint.getCPtr(in_color), in_color);
  }

  public void SetRGBColor(float in_r, float in_g, float in_b) {
    HJMVOJNI.Polygon_SetRGBColor__SWIG_1(swigCPtr, this, in_r, in_g, in_b);
  }

  public int GetPointCount() {return HJMVOJNI.Polygon_GetPointCount(swigCPtr, this);}

  public void GetPoints(int[] out_count, HPoint[] out_points) {
    HJMVOJNI.Polygon_GetPoints__SWIG_0(swigCPtr, this, out_count, HPoint.cArrayUnwrap(out_points));
  }

  public void GetPoints(int[] out_count, float[] out_points) {
    HJMVOJNI.Polygon_GetPoints__SWIG_1(swigCPtr, this, out_count, out_points);
  }

  public void SetPoints(int in_count, HPoint[] in_points) {
    HJMVOJNI.Polygon_SetPoints__SWIG_0(swigCPtr, this, in_count, HPoint.cArrayUnwrap(in_points));
  }

  public void SetPoints(int in_count, float[] in_points) {
    HJMVOJNI.Polygon_SetPoints__SWIG_1(swigCPtr, this, in_count, in_points);
  }

}
