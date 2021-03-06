/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class HActivityType {
  public final static HActivityType NoActivity = new HActivityType("NoActivity");
  public final static HActivityType MovementActivity = new HActivityType("MovementActivity");
  public final static HActivityType CuttingPlaneActivity = new HActivityType("CuttingPlaneActivity");
  public final static HActivityType GeneralActivity = new HActivityType("GeneralActivity");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static HActivityType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + HActivityType.class + " with value " + swigValue);
  }

  private HActivityType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private HActivityType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private HActivityType(String swigName, HActivityType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static HActivityType[] swigValues = { NoActivity, MovementActivity, CuttingPlaneActivity, GeneralActivity };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

