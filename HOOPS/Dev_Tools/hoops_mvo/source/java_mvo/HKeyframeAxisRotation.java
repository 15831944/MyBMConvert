/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HKeyframeAxisRotation extends HKeyframeRotation {
  private long swigCPtr;

  public HKeyframeAxisRotation(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HKeyframeAxisRotation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HKeyframeAxisRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HKeyframeAxisRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HKeyframeAxisRotation(float angle) {
    this(HJMVOJNI.new_HKeyframeAxisRotation__SWIG_0(angle), true);
  }

  public HKeyframeAxisRotation() {
    this(HJMVOJNI.new_HKeyframeAxisRotation__SWIG_1(), true);
  }

  public HKeyframe Clone() {
    long cPtr = HJMVOJNI.HKeyframeAxisRotation_Clone(swigCPtr, this);
    return (cPtr == 0) ? null : new HKeyframe(cPtr, false);
  }

  public void Serialize(SWIGTYPE_p_HUtilityXMLTag xmlgen) {
    HJMVOJNI.HKeyframeAxisRotation_Serialize(swigCPtr, this, SWIGTYPE_p_HUtilityXMLTag.getCPtr(xmlgen));
  }

  public void setM_angle(float value) {
    HJMVOJNI.HKeyframeAxisRotation_m_angle_set(swigCPtr, this, value);
  }

  public float getM_angle() {
    return HJMVOJNI.HKeyframeAxisRotation_m_angle_get(swigCPtr, this);
  }

}