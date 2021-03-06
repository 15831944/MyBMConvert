/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class HDwgViewVector {
  public final static HDwgViewVector DwgTopView = new HDwgViewVector("DwgTopView");
  public final static HDwgViewVector DwgIsoView = new HDwgViewVector("DwgIsoView");
  public final static HDwgViewVector DwgViewportInherit = new HDwgViewVector("DwgViewportInherit");
  public final static HDwgViewVector DwgSceneInherit = new HDwgViewVector("DwgSceneInherit");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HDwgViewVector swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HDwgViewVector.class + " with value " + swigValue);
  }

  private HDwgViewVector(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HDwgViewVector(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HDwgViewVector(String swigName, HDwgViewVector swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HDwgViewVector[] swigValues = { DwgTopView, DwgIsoView, DwgViewportInherit, DwgSceneInherit };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

