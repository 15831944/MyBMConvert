/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class TKO_Geometry_Options {
  public final static TKO_Geometry_Options TKO_Geometry_Options_Orientation = new TKO_Geometry_Options("TKO_Geometry_Options_Orientation", HJSTREAMJNI.TKO_Geometry_Options_Orientation_get());
  public final static TKO_Geometry_Options TKO_Geometry_Options_Camera_Relative = new TKO_Geometry_Options("TKO_Geometry_Options_Camera_Relative", HJSTREAMJNI.TKO_Geometry_Options_Camera_Relative_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TKO_Geometry_Options swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TKO_Geometry_Options.class + " with value " + swigValue);
  }

  private TKO_Geometry_Options(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TKO_Geometry_Options(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TKO_Geometry_Options(String swigName, TKO_Geometry_Options swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TKO_Geometry_Options[] swigValues = { TKO_Geometry_Options_Orientation, TKO_Geometry_Options_Camera_Relative };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

