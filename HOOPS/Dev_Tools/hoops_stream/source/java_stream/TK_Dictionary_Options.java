/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class TK_Dictionary_Options {
  public final static TK_Dictionary_Options TK_Dictionary_Bounding_Volumes = new TK_Dictionary_Options("TK_Dictionary_Bounding_Volumes", HJSTREAMJNI.TK_Dictionary_Bounding_Volumes_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TK_Dictionary_Options swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TK_Dictionary_Options.class + " with value " + swigValue);
  }

  private TK_Dictionary_Options(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TK_Dictionary_Options(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TK_Dictionary_Options(String swigName, TK_Dictionary_Options swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TK_Dictionary_Options[] swigValues = { TK_Dictionary_Bounding_Volumes };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

