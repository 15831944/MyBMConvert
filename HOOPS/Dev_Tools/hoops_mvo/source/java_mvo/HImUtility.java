/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HImUtility {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HImUtility(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HImUtility obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HImUtility(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void RegisterCallbacks() {
    HJMVOJNI.HImUtility_RegisterCallbacks();
  }

  public static void set_clip_rectangle(SWIGTYPE_p_HIC_Rendition nr, SWIGTYPE_p_HIC_Segment_Info si) {
    HJMVOJNI.HImUtility_set_clip_rectangle(SWIGTYPE_p_HIC_Rendition.getCPtr(nr), SWIGTYPE_p_HIC_Segment_Info.getCPtr(si));
  }

  public static void suppress_3d_geometry(SWIGTYPE_p_HIC_Rendition rendition, SWIGTYPE_p_HIC_Geometry geo3) {
    HJMVOJNI.HImUtility_suppress_3d_geometry(SWIGTYPE_p_HIC_Rendition.getCPtr(rendition), SWIGTYPE_p_HIC_Geometry.getCPtr(geo3));
  }

  public static void draw_gradiated_window_background(SWIGTYPE_p_HIC_Rendition rendition, SWIGTYPE_p_HIC_Int_Rectangle extent) {
    HJMVOJNI.HImUtility_draw_gradiated_window_background(SWIGTYPE_p_HIC_Rendition.getCPtr(rendition), SWIGTYPE_p_HIC_Int_Rectangle.getCPtr(extent));
  }

  public static void draw_annotation_lines(SWIGTYPE_p_HIC_Rendition nr, SWIGTYPE_p_HIC_Polyline poly) {
    HJMVOJNI.HImUtility_draw_annotation_lines(SWIGTYPE_p_HIC_Rendition.getCPtr(nr), SWIGTYPE_p_HIC_Polyline.getCPtr(poly));
  }

  public static void drawTextInfront(SWIGTYPE_p_HIC_Rendition rendition, SWIGTYPE_p_HIC_Text_Info text_info) {
    HJMVOJNI.HImUtility_drawTextInfront(SWIGTYPE_p_HIC_Rendition.getCPtr(rendition), SWIGTYPE_p_HIC_Text_Info.getCPtr(text_info));
  }

}
