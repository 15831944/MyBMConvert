/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class TKO_Font_Preferences {
  public final static TKO_Font_Preferences TKO_Font_Preference_Undefined = new TKO_Font_Preferences("TKO_Font_Preference_Undefined", HJSTREAMJNI.TKO_Font_Preference_Undefined_get());
  public final static TKO_Font_Preferences TKO_Font_Preference_Default = new TKO_Font_Preferences("TKO_Font_Preference_Default", HJSTREAMJNI.TKO_Font_Preference_Default_get());
  public final static TKO_Font_Preferences TKO_Font_Preference_Bitmap = new TKO_Font_Preferences("TKO_Font_Preference_Bitmap", HJSTREAMJNI.TKO_Font_Preference_Bitmap_get());
  public final static TKO_Font_Preferences TKO_Font_Preference_Outline = new TKO_Font_Preferences("TKO_Font_Preference_Outline", HJSTREAMJNI.TKO_Font_Preference_Outline_get());
  public final static TKO_Font_Preferences TKO_Font_Preference_Exterior = new TKO_Font_Preferences("TKO_Font_Preference_Exterior", HJSTREAMJNI.TKO_Font_Preference_Exterior_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TKO_Font_Preferences swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TKO_Font_Preferences.class + " with value " + swigValue);
  }

  private TKO_Font_Preferences(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TKO_Font_Preferences(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TKO_Font_Preferences(String swigName, TKO_Font_Preferences swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TKO_Font_Preferences[] swigValues = { TKO_Font_Preference_Undefined, TKO_Font_Preference_Default, TKO_Font_Preference_Bitmap, TKO_Font_Preference_Outline, TKO_Font_Preference_Exterior };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

