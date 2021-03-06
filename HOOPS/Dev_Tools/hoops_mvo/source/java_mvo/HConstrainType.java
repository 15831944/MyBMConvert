/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class HConstrainType {
  public final static HConstrainType HConstrainNone = new HConstrainType("HConstrainNone");
  public final static HConstrainType HConstrainToRay = new HConstrainType("HConstrainToRay");
  public final static HConstrainType HConstrainToRotationVector = new HConstrainType("HConstrainToRotationVector");
  public final static HConstrainType HConstrainToPlane = new HConstrainType("HConstrainToPlane");
  public final static HConstrainType HConstrainToViewplane = new HConstrainType("HConstrainToViewplane");
  public final static HConstrainType HConstrainToScale = new HConstrainType("HConstrainToScale");
  public final static HConstrainType HConstrainToOnOff = new HConstrainType("HConstrainToOnOff");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HConstrainType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HConstrainType.class + " with value " + swigValue);
  }

  private HConstrainType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HConstrainType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HConstrainType(String swigName, HConstrainType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HConstrainType[] swigValues = { HConstrainNone, HConstrainToRay, HConstrainToRotationVector, HConstrainToPlane, HConstrainToViewplane, HConstrainToScale, HConstrainToOnOff };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

