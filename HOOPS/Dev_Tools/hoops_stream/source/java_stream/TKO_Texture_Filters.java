/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public final class TKO_Texture_Filters {
  public final static TKO_Texture_Filters TKO_Texture_Filter_None = new TKO_Texture_Filters("TKO_Texture_Filter_None");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Bilinear = new TKO_Texture_Filters("TKO_Texture_Filter_Bilinear");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Trilinear = new TKO_Texture_Filters("TKO_Texture_Filter_Trilinear");
  public final static TKO_Texture_Filters TKO_Texture_Filter_MipMap = new TKO_Texture_Filters("TKO_Texture_Filter_MipMap");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Summed_Areas = new TKO_Texture_Filters("TKO_Texture_Filter_Summed_Areas");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Gaussian = new TKO_Texture_Filters("TKO_Texture_Filter_Gaussian");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Stochastic = new TKO_Texture_Filters("TKO_Texture_Filter_Stochastic");
  public final static TKO_Texture_Filters TKO_Texture_Filter_Anisotropic = new TKO_Texture_Filters("TKO_Texture_Filter_Anisotropic");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TKO_Texture_Filters swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TKO_Texture_Filters.class + " with value " + swigValue);
  }

  private TKO_Texture_Filters(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TKO_Texture_Filters(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TKO_Texture_Filters(String swigName, TKO_Texture_Filters swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TKO_Texture_Filters[] swigValues = { TKO_Texture_Filter_None, TKO_Texture_Filter_Bilinear, TKO_Texture_Filter_Trilinear, TKO_Texture_Filter_MipMap, TKO_Texture_Filter_Summed_Areas, TKO_Texture_Filter_Gaussian, TKO_Texture_Filter_Stochastic, TKO_Texture_Filter_Anisotropic };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
