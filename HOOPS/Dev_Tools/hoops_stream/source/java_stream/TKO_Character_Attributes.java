/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class TKO_Character_Attributes {
  public final static TKO_Character_Attributes TKO_Character_Name = new TKO_Character_Attributes("TKO_Character_Name", HJSTREAMJNI.TKO_Character_Name_get());
  public final static TKO_Character_Attributes TKO_Character_Size = new TKO_Character_Attributes("TKO_Character_Size", HJSTREAMJNI.TKO_Character_Size_get());
  public final static TKO_Character_Attributes TKO_Character_Vertical_Offset = new TKO_Character_Attributes("TKO_Character_Vertical_Offset", HJSTREAMJNI.TKO_Character_Vertical_Offset_get());
  public final static TKO_Character_Attributes TKO_Character_Omitted = new TKO_Character_Attributes("TKO_Character_Omitted", HJSTREAMJNI.TKO_Character_Omitted_get());
  public final static TKO_Character_Attributes TKO_Character_Invisible = new TKO_Character_Attributes("TKO_Character_Invisible", HJSTREAMJNI.TKO_Character_Invisible_get());
  public final static TKO_Character_Attributes TKO_Character_Slant = new TKO_Character_Attributes("TKO_Character_Slant", HJSTREAMJNI.TKO_Character_Slant_get());
  public final static TKO_Character_Attributes TKO_Character_Width_Scale = new TKO_Character_Attributes("TKO_Character_Width_Scale", HJSTREAMJNI.TKO_Character_Width_Scale_get());
  public final static TKO_Character_Attributes TKO_Character_Rotation = new TKO_Character_Attributes("TKO_Character_Rotation", HJSTREAMJNI.TKO_Character_Rotation_get());
  public final static TKO_Character_Attributes TKO_Character_Rotation_Fixed = new TKO_Character_Attributes("TKO_Character_Rotation_Fixed", HJSTREAMJNI.TKO_Character_Rotation_Fixed_get());
  public final static TKO_Character_Attributes TKO_Character_Horizontal_Offset = new TKO_Character_Attributes("TKO_Character_Horizontal_Offset", HJSTREAMJNI.TKO_Character_Horizontal_Offset_get());
  public final static TKO_Character_Attributes TKO_Character_Color = new TKO_Character_Attributes("TKO_Character_Color", HJSTREAMJNI.TKO_Character_Color_get());
  public final static TKO_Character_Attributes TKO_Character_Extended = new TKO_Character_Attributes("TKO_Character_Extended", HJSTREAMJNI.TKO_Character_Extended_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TKO_Character_Attributes swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TKO_Character_Attributes.class + " with value " + swigValue);
  }

  private TKO_Character_Attributes(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TKO_Character_Attributes(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TKO_Character_Attributes(String swigName, TKO_Character_Attributes swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TKO_Character_Attributes[] swigValues = { TKO_Character_Name, TKO_Character_Size, TKO_Character_Vertical_Offset, TKO_Character_Omitted, TKO_Character_Invisible, TKO_Character_Slant, TKO_Character_Width_Scale, TKO_Character_Rotation, TKO_Character_Rotation_Fixed, TKO_Character_Horizontal_Offset, TKO_Character_Color, TKO_Character_Extended };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

