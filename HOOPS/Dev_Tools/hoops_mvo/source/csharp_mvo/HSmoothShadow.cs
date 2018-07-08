/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;

#if _M_X64
using MVO_POINTER_SIZED_INT = System.Int64;
using MVO_POINTER_SIZED_UINT = System.UInt64;
using ID_Key = System.Int64;
#else
using MVO_POINTER_SIZED_INT = System.Int32;
using MVO_POINTER_SIZED_UINT = System.UInt32;
using ID_Key = System.Int32;
#endif


public class HSmoothShadow : HShadow {
  private HandleRef swigCPtr;

  public HSmoothShadow(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HSmoothShadowUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HSmoothShadow obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HSmoothShadow() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HSmoothShadow(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HSmoothShadow(MVO_POINTER_SIZED_INT ModelSegmentKey, MVO_POINTER_SIZED_INT ShadowBaseSegmentKey, bool UseOglShadow) : this(HCSMVOPINVOKE.new_HSmoothShadow__SWIG_0(ModelSegmentKey, ShadowBaseSegmentKey, UseOglShadow), true) {
  }

  public HSmoothShadow(MVO_POINTER_SIZED_INT ModelSegmentKey, MVO_POINTER_SIZED_INT ShadowBaseSegmentKey) : this(HCSMVOPINVOKE.new_HSmoothShadow__SWIG_1(ModelSegmentKey, ShadowBaseSegmentKey), true) {
  }

  public void CleanUp() {
    HCSMVOPINVOKE.HSmoothShadow_CleanUp(swigCPtr);
  }

  public void Create(ShadowPlaneType ptype, int TextureSize, int FilterSize, int[] filter) {
    HCSMVOPINVOKE.HSmoothShadow_Create__SWIG_0(swigCPtr, (int)ptype, TextureSize, FilterSize, filter);
  }

  public void Create(ShadowPlaneType ptype, int TextureSize, int FilterSize) {
    HCSMVOPINVOKE.HSmoothShadow_Create__SWIG_1(swigCPtr, (int)ptype, TextureSize, FilterSize);
  }

  public void Create(ShadowPlaneType ptype, int TextureSize) {
    HCSMVOPINVOKE.HSmoothShadow_Create__SWIG_2(swigCPtr, (int)ptype, TextureSize);
  }

  public void Create(ShadowPlaneType ptype) {
    HCSMVOPINVOKE.HSmoothShadow_Create__SWIG_3(swigCPtr, (int)ptype);
  }

  public void Create() {
    HCSMVOPINVOKE.HSmoothShadow_Create__SWIG_4(swigCPtr);
  }

  public int GetFilterSize() {
    int ret = HCSMVOPINVOKE.HSmoothShadow_GetFilterSize(swigCPtr);
    return ret;
  }

  public int GetTextureSize() {
    int ret = HCSMVOPINVOKE.HSmoothShadow_GetTextureSize(swigCPtr);
    return ret;
  }

  public void SetTextureSize(int TextureSize) {
    HCSMVOPINVOKE.HSmoothShadow_SetTextureSize(swigCPtr, TextureSize);
  }

  public void SetFilter(int[] filter, int FilterSize) {
    HCSMVOPINVOKE.HSmoothShadow_SetFilter(swigCPtr, filter, FilterSize);
  }

  public void UnDefineShadowTexture() {
    HCSMVOPINVOKE.HSmoothShadow_UnDefineShadowTexture(swigCPtr);
  }

  public static void UnDefineAllShadowTextures(MVO_POINTER_SIZED_INT modelsegmentkey) {
    HCSMVOPINVOKE.HSmoothShadow_UnDefineAllShadowTextures(modelsegmentkey);
  }

  public void SetAllowOpenglShadow(bool AllowOpenglShadow) {
    HCSMVOPINVOKE.HSmoothShadow_SetAllowOpenglShadow(swigCPtr, AllowOpenglShadow);
  }

}