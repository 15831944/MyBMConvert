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


public class HMergeShellFace : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HMergeShellFace(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HMergeShellFace obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HMergeShellFace() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HMergeShellFace(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public HMergeShellFace() : this(HCSMVOPINVOKE.new_HMergeShellFace(), true) {
  }

  public void Init(int[] flist) {
    HCSMVOPINVOKE.HMergeShellFace_Init(swigCPtr, flist);
  }

  public void MakeChildFaces(int[] addpoint, HPoint points, bool AddExtraPoints, int[] newpoints, int[] newpointslen) {
    HCSMVOPINVOKE.HMergeShellFace_MakeChildFaces(swigCPtr, addpoint, HPoint.getCPtr(points), AddExtraPoints, newpoints, newpointslen);
  }

  public void Divide(int pnum, HPoint points) {
    HCSMVOPINVOKE.HMergeShellFace_Divide(swigCPtr, pnum, HPoint.getCPtr(points));
  }

  public bool CheckHit(HPoint p, HPoint normal, HPoint plist, HPoint pres) {
    bool ret = HCSMVOPINVOKE.HMergeShellFace_CheckHit(swigCPtr, HPoint.getCPtr(p), HPoint.getCPtr(normal), HPoint.getCPtr(plist), HPoint.getCPtr(pres));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public HMergeShellFace FindHitFaceRecursive(HPoint p, HPoint normal, HPoint plist, HPoint respoint) {
    IntPtr cPtr = HCSMVOPINVOKE.HMergeShellFace_FindHitFaceRecursive(swigCPtr, HPoint.getCPtr(p), HPoint.getCPtr(normal), HPoint.getCPtr(plist), HPoint.getCPtr(respoint));
    HMergeShellFace ret = (cPtr == IntPtr.Zero) ? null : new HMergeShellFace(cPtr, false);
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public HMergeShellFace FindHitFace(HPoint p, HPoint normal, HPoint plist, HPoint respoint) {
    IntPtr cPtr = HCSMVOPINVOKE.HMergeShellFace_FindHitFace(swigCPtr, HPoint.getCPtr(p), HPoint.getCPtr(normal), HPoint.getCPtr(plist), HPoint.getCPtr(respoint));
    HMergeShellFace ret = (cPtr == IntPtr.Zero) ? null : new HMergeShellFace(cPtr, false);
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public bool CheckIfColinear(HPoint point) {
    bool ret = HCSMVOPINVOKE.HMergeShellFace_CheckIfColinear(swigCPtr, HPoint.getCPtr(point));
    return ret;
  }

  public int GetLengthRecursive(int l) {
    int ret = HCSMVOPINVOKE.HMergeShellFace_GetLengthRecursive(swigCPtr, l);
    return ret;
  }

  public int GetLength() {
    int ret = HCSMVOPINVOKE.HMergeShellFace_GetLength(swigCPtr);
    return ret;
  }

  public int AddToFacelistRecursive(int[] start, int l) {
    int ret = HCSMVOPINVOKE.HMergeShellFace_AddToFacelistRecursive(swigCPtr, start, l);
    return ret;
  }

  public int AddToFacelist(int[] start) {
    int ret = HCSMVOPINVOKE.HMergeShellFace_AddToFacelist(swigCPtr, start);
    return ret;
  }

}
