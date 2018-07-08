/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class HWindowCorner {
  public final static HWindowCorner TopLeft = new HWindowCorner("TopLeft");
  public final static HWindowCorner BottomLeft = new HWindowCorner("BottomLeft");
  public final static HWindowCorner BottomRight = new HWindowCorner("BottomRight");
  public final static HWindowCorner TopRight = new HWindowCorner("TopRight");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HWindowCorner swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HWindowCorner.class + " with value " + swigValue);
  }

  private HWindowCorner(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HWindowCorner(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HWindowCorner(String swigName, HWindowCorner swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HWindowCorner[] swigValues = { TopLeft, BottomLeft, BottomRight, TopRight };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
