/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HUserOptions {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HUserOptions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HUserOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HUserOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_data(StringBuffer value) {
    HJMVOJNI.HUserOptions_m_data_set(swigCPtr, this, value);
  }

  public StringBuffer getM_data() {
    return HJMVOJNI.HUserOptions_m_data_get(swigCPtr, this);
  }

  public void setM_length(int value) {
    HJMVOJNI.HUserOptions_m_length_set(swigCPtr, this, value);
  }

  public int getM_length() {
    return HJMVOJNI.HUserOptions_m_length_get(swigCPtr, this);
  }

  public void setM_valid(boolean value) {
    HJMVOJNI.HUserOptions_m_valid_set(swigCPtr, this, value);
  }

  public boolean getM_valid() {
    return HJMVOJNI.HUserOptions_m_valid_get(swigCPtr, this);
  }

  public HUserOptions() {
    this(HJMVOJNI.new_HUserOptions__SWIG_0(), true);
  }

  public HUserOptions(HUserOptions in_data) {
    this(HJMVOJNI.new_HUserOptions__SWIG_1(HUserOptions.getCPtr(in_data), in_data), true);
  }

  public boolean IsValid() {
    return HJMVOJNI.HUserOptions_IsValid(swigCPtr, this);
  }

  public String Show_User_Options() {
    return HJMVOJNI.HUserOptions_Show_User_Options(swigCPtr, this);
  }

  public String Show_One_Net_User_Option(String which) {
    return HJMVOJNI.HUserOptions_Show_One_Net_User_Option(swigCPtr, this, which);
  }

  public String Show_One_User_Option(String which) {
    return HJMVOJNI.HUserOptions_Show_One_User_Option(swigCPtr, this, which);
  }

  public String Show_Net_User_Options() {
    return HJMVOJNI.HUserOptions_Show_Net_User_Options(swigCPtr, this);
  }

}
