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


public class HShellWrapper : IDisposable {
  private HandleRef swigCPtr;
  protected bool swigCMemOwn;

  public HShellWrapper(IntPtr cPtr, bool cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HShellWrapper obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }
  
  public void owns_memory(bool ownMemory) {
	swigCMemOwn = ownMemory;
  }

  ~HShellWrapper() {
    Dispose();
  }

  public virtual void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HShellWrapper(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
    }
  }

  public HShellWrapper(MVO_POINTER_SIZED_INT key) : this(HCSMVOPINVOKE.new_HShellWrapper__SWIG_0(key), true) {
  }

  public HShellWrapper() : this(HCSMVOPINVOKE.new_HShellWrapper__SWIG_1(), true) {
  }

  public MVO_POINTER_SIZED_INT Insert(int plen, float[] points, int flen, int[] flist, MVO_POINTER_SIZED_INT insertkey) {return HCSMVOPINVOKE.HShellWrapper_Insert__SWIG_0(swigCPtr, plen, points, flen, flist, insertkey);}

  public MVO_POINTER_SIZED_INT Insert(int plen, float[] points, int flen, int[] flist) {return HCSMVOPINVOKE.HShellWrapper_Insert__SWIG_1(swigCPtr, plen, points, flen, flist);}

  public MVO_POINTER_SIZED_INT Show(int[] plen, SWIGTYPE_p_p_HPoint points, int[] flen, SWIGTYPE_p_p_int flist) {return HCSMVOPINVOKE.HShellWrapper_Show(swigCPtr, plen, SWIGTYPE_p_p_HPoint.getCPtr(points), flen, SWIGTYPE_p_p_int.getCPtr(flist));}

  public MVO_POINTER_SIZED_INT GetKey() {return HCSMVOPINVOKE.HShellWrapper_GetKey(swigCPtr);}

  public void TransformPoints(float[] matrix) {
    HCSMVOPINVOKE.HShellWrapper_TransformPoints(swigCPtr, matrix);
  }

  public MVO_POINTER_SIZED_INT Optimize(System.Text.StringBuilder options) {return HCSMVOPINVOKE.HShellWrapper_Optimize(swigCPtr, options);}

  public MVO_POINTER_SIZED_INT Optimize2(System.Text.StringBuilder options) {return HCSMVOPINVOKE.HShellWrapper_Optimize2(swigCPtr, options);}

  public void MakePolygon(int facelen, int[] face, float[] points) {
    HCSMVOPINVOKE.HShellWrapper_MakePolygon(swigCPtr, facelen, face, points);
  }

  public void OpenOwnerSegment() {
    HCSMVOPINVOKE.HShellWrapper_OpenOwnerSegment(swigCPtr);
  }

  public void BeginFaceIteration() {
    HCSMVOPINVOKE.HShellWrapper_BeginFaceIteration(swigCPtr);
  }

  public void EndFaceIteration() {
    HCSMVOPINVOKE.HShellWrapper_EndFaceIteration(swigCPtr);
  }

  public int GetFace(int facenum, SWIGTYPE_p_p_int face) {
    int ret = HCSMVOPINVOKE.HShellWrapper_GetFace(swigCPtr, facenum, SWIGTYPE_p_p_int.getCPtr(face));
    return ret;
  }

  public int NextFace(SWIGTYPE_p_p_int face) {
    int ret = HCSMVOPINVOKE.HShellWrapper_NextFace(swigCPtr, SWIGTYPE_p_p_int.getCPtr(face));
    return ret;
  }

  public void CalculateFaceCenter(int[] face, int flen, HPoint mid) {
    HCSMVOPINVOKE.HShellWrapper_CalculateFaceCenter(swigCPtr, face, flen, HPoint.getCPtr(mid));
  }

  public void AddPoints(float[] points, int pnum, float[] param, float[] normals, bool AddImmediately) {
    HCSMVOPINVOKE.HShellWrapper_AddPoints__SWIG_0(swigCPtr, points, pnum, param, normals, AddImmediately);
  }

  public void AddPoints(float[] points, int pnum, float[] param, float[] normals) {
    HCSMVOPINVOKE.HShellWrapper_AddPoints__SWIG_1(swigCPtr, points, pnum, param, normals);
  }

  public void AddPoints(float[] points, int pnum, float[] param) {
    HCSMVOPINVOKE.HShellWrapper_AddPoints__SWIG_2(swigCPtr, points, pnum, param);
  }

  public void AddPoints(float[] points, int pnum) {
    HCSMVOPINVOKE.HShellWrapper_AddPoints__SWIG_3(swigCPtr, points, pnum);
  }

  public void AddFace(int[] face, int fnum, int regionnum, float[] points, float[] normals, bool AddImediately) {
    HCSMVOPINVOKE.HShellWrapper_AddFace__SWIG_0(swigCPtr, face, fnum, regionnum, points, normals, AddImediately);
  }

  public void AddFace(int[] face, int fnum, int regionnum, float[] points, float[] normals) {
    HCSMVOPINVOKE.HShellWrapper_AddFace__SWIG_1(swigCPtr, face, fnum, regionnum, points, normals);
  }

  public void AddFace(int[] face, int fnum, int regionnum, float[] points) {
    HCSMVOPINVOKE.HShellWrapper_AddFace__SWIG_2(swigCPtr, face, fnum, regionnum, points);
  }

  public void AddFaceDirect(int[] face, int fnum, bool reverse, bool AddImmediatly) {
    HCSMVOPINVOKE.HShellWrapper_AddFaceDirect__SWIG_0(swigCPtr, face, fnum, reverse, AddImmediatly);
  }

  public void AddFaceDirect(int[] face, int fnum, bool reverse) {
    HCSMVOPINVOKE.HShellWrapper_AddFaceDirect__SWIG_1(swigCPtr, face, fnum, reverse);
  }

  public void AddFaceDirect(int[] face, int fnum) {
    HCSMVOPINVOKE.HShellWrapper_AddFaceDirect__SWIG_2(swigCPtr, face, fnum);
  }

  public void AddFace(float[] points, int fnum, bool AddImmediatly) {
    HCSMVOPINVOKE.HShellWrapper_AddFace__SWIG_3(swigCPtr, points, fnum, AddImmediatly);
  }

  public void AddFace(float[] points, int fnum) {
    HCSMVOPINVOKE.HShellWrapper_AddFace__SWIG_4(swigCPtr, points, fnum);
  }

  public void Set(MVO_POINTER_SIZED_INT key) {
    HCSMVOPINVOKE.HShellWrapper_Set(swigCPtr, key);
  }

  public void Regenerate(MVO_POINTER_SIZED_INT newowner, bool makeSegment, bool regenerate) {
    HCSMVOPINVOKE.HShellWrapper_Regenerate__SWIG_0(swigCPtr, newowner, makeSegment, regenerate);
  }

  public void Regenerate(MVO_POINTER_SIZED_INT newowner, bool makeSegment) {
    HCSMVOPINVOKE.HShellWrapper_Regenerate__SWIG_1(swigCPtr, newowner, makeSegment);
  }

  public void Regenerate(MVO_POINTER_SIZED_INT newowner) {
    HCSMVOPINVOKE.HShellWrapper_Regenerate__SWIG_2(swigCPtr, newowner);
  }

  public void Regenerate() {
    HCSMVOPINVOKE.HShellWrapper_Regenerate__SWIG_3(swigCPtr);
  }

  public void GrowArrays(int fnum) {
    HCSMVOPINVOKE.HShellWrapper_GrowArrays(swigCPtr, fnum);
  }

  public void GrowPointArray(int fnum, bool gorwvparams, bool grownormals) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray__SWIG_0(swigCPtr, fnum, gorwvparams, grownormals);
  }

  public void GrowPointArray(int fnum, bool gorwvparams) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray__SWIG_1(swigCPtr, fnum, gorwvparams);
  }

  public void GrowPointArray(int fnum) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray__SWIG_2(swigCPtr, fnum);
  }

  public void GrowPointArray2(int fnum, bool growparamarray, bool grownormalarray, bool growfnarray, bool growcolorarray) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray2__SWIG_0(swigCPtr, fnum, growparamarray, grownormalarray, growfnarray, growcolorarray);
  }

  public void GrowPointArray2(int fnum, bool growparamarray, bool grownormalarray, bool growfnarray) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray2__SWIG_1(swigCPtr, fnum, growparamarray, grownormalarray, growfnarray);
  }

  public void GrowPointArray2(int fnum, bool growparamarray, bool grownormalarray) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray2__SWIG_2(swigCPtr, fnum, growparamarray, grownormalarray);
  }

  public void GrowPointArray2(int fnum, bool growparamarray) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray2__SWIG_3(swigCPtr, fnum, growparamarray);
  }

  public void GrowPointArray2(int fnum) {
    HCSMVOPINVOKE.HShellWrapper_GrowPointArray2__SWIG_4(swigCPtr, fnum);
  }

  public void AddNextFaceWithDistinctNormals(HPoint points, HPoint normals, int[] face1, int[] face2, int fnum) {
    HCSMVOPINVOKE.HShellWrapper_AddNextFaceWithDistinctNormals(swigCPtr, HPoint.getCPtr(points), HPoint.getCPtr(normals), face1, face2, fnum);
  }

  public void AddNextFaceWithDistinctNormalsAndTexture(HPoint points, HPoint normals, HPoint texcor, int[] face1, int[] face2, int[] face3, int fnum) {
    HCSMVOPINVOKE.HShellWrapper_AddNextFaceWithDistinctNormalsAndTexture(swigCPtr, HPoint.getCPtr(points), HPoint.getCPtr(normals), HPoint.getCPtr(texcor), face1, face2, face3, fnum);
  }

  public void AddNextFaceWithDistinctNormalsAndColor(HPoint points, HPoint normals, int[] face1, int[] face2, HPoint face3, int fnum) {
    HCSMVOPINVOKE.HShellWrapper_AddNextFaceWithDistinctNormalsAndColor(swigCPtr, HPoint.getCPtr(points), HPoint.getCPtr(normals), face1, face2, HPoint.getCPtr(face3), fnum);
  }

  public void BeginAddFaces(int pnum) {
    HCSMVOPINVOKE.HShellWrapper_BeginAddFaces(swigCPtr, pnum);
  }

  public void EndAddFaces() {
    HCSMVOPINVOKE.HShellWrapper_EndAddFaces(swigCPtr);
  }

  public void GrowFaceArray(int fnum) {
    HCSMVOPINVOKE.HShellWrapper_GrowFaceArray(swigCPtr, fnum);
  }

  public void SubdivideOneQuadFace(int[] face, HShellWrapper wrapper, bool generateIsolines, int[] facecolorlist, int[] fclnum) {
    HCSMVOPINVOKE.HShellWrapper_SubdivideOneQuadFace(swigCPtr, face, HShellWrapper.getCPtr(wrapper), generateIsolines, facecolorlist, fclnum);
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public void SubdivideOneQuadFace2(int[] face) {
    HCSMVOPINVOKE.HShellWrapper_SubdivideOneQuadFace2(swigCPtr, face);
  }

  public void SubdivideQuadFaces(bool GenerateIsolines) {
    HCSMVOPINVOKE.HShellWrapper_SubdivideQuadFaces(swigCPtr, GenerateIsolines);
  }

  public void SetVertexColors(HPoint color) {
    HCSMVOPINVOKE.HShellWrapper_SetVertexColors__SWIG_0(swigCPtr, HPoint.getCPtr(color));
  }

  public void ShowVertexColors(HPoint color) {
    HCSMVOPINVOKE.HShellWrapper_ShowVertexColors__SWIG_0(swigCPtr, HPoint.getCPtr(color));
  }

  public void SetVertexColors(float[] findex) {
    HCSMVOPINVOKE.HShellWrapper_SetVertexColors__SWIG_1(swigCPtr, findex);
  }

  public void ShowVertexColors(float[] color) {
    HCSMVOPINVOKE.HShellWrapper_ShowVertexColors__SWIG_1(swigCPtr, color);
  }

  public void MakeLod(int lodnum, int percent) {
    HCSMVOPINVOKE.HShellWrapper_MakeLod(swigCPtr, lodnum, percent);
  }

  public void FindExtents(HPoint center, HPoint min, HPoint max) {
    HCSMVOPINVOKE.HShellWrapper_FindExtents(swigCPtr, HPoint.getCPtr(center), HPoint.getCPtr(min), HPoint.getCPtr(max));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals, float[] arg5, int paranum, float[] vcolors, bool emptyshell) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_0(swigCPtr, plen, points, flen, flist, normals, arg5, paranum, vcolors, emptyshell);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals, float[] arg5, int paranum, float[] vcolors) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_1(swigCPtr, plen, points, flen, flist, normals, arg5, paranum, vcolors);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals, float[] arg5, int paranum) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_2(swigCPtr, plen, points, flen, flist, normals, arg5, paranum);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals, float[] arg5) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_3(swigCPtr, plen, points, flen, flist, normals, arg5);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_4(swigCPtr, plen, points, flen, flist, normals);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_5(swigCPtr, plen, points, flen, flist);
  }

  public void ReplaceWithParameters(int plen, float[] points, int flen, int[] flist, float[] normals, float[] arg5, int paranum, bool emptyshell) {
    HCSMVOPINVOKE.HShellWrapper_ReplaceWithParameters__SWIG_6(swigCPtr, plen, points, flen, flist, normals, arg5, paranum, emptyshell);
  }

  public void Replace(int plen, float[] points, int flen, int[] flist, float[] normals, bool emptyshell) {
    HCSMVOPINVOKE.HShellWrapper_Replace__SWIG_0(swigCPtr, plen, points, flen, flist, normals, emptyshell);
  }

  public void Replace(int plen, float[] points, int flen, int[] flist, float[] normals) {
    HCSMVOPINVOKE.HShellWrapper_Replace__SWIG_1(swigCPtr, plen, points, flen, flist, normals);
  }

  public void Replace(int plen, float[] points, int flen, int[] flist) {
    HCSMVOPINVOKE.HShellWrapper_Replace__SWIG_2(swigCPtr, plen, points, flen, flist);
  }

  public void SetFaceRegion(int regionnum) {
    HCSMVOPINVOKE.HShellWrapper_SetFaceRegion(swigCPtr, regionnum);
  }

  public void SetEmptyShell(MVO_POINTER_SIZED_INT segmentkey, bool MakeSegment) {
    HCSMVOPINVOKE.HShellWrapper_SetEmptyShell(swigCPtr, segmentkey, MakeSegment);
  }

  public int m_plen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_plen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_plen_get(swigCPtr);
      return ret;
    } 
  }

  public int m_flen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_flen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_flen_get(swigCPtr);
      return ret;
    } 
  }

  public HPoint m_Points {
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HShellWrapper_m_Points_get(swigCPtr);
      HPoint ret = (cPtr == IntPtr.Zero) ? null : new HPoint(cPtr, false);
      return ret;
    } 
  }

  public HPoint m_VParams {
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HShellWrapper_m_VParams_get(swigCPtr);
      HPoint ret = (cPtr == IntPtr.Zero) ? null : new HPoint(cPtr, false);
      return ret;
    } 
  }

  public HPoint m_VColors {
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HShellWrapper_m_VColors_get(swigCPtr);
      HPoint ret = (cPtr == IntPtr.Zero) ? null : new HPoint(cPtr, false);
      return ret;
    } 
  }

  public HPoint m_VNormals {
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HShellWrapper_m_VNormals_get(swigCPtr);
      HPoint ret = (cPtr == IntPtr.Zero) ? null : new HPoint(cPtr, false);
      return ret;
    } 
  }

  public IntPtr m_Flist {
	get { return HCSMVOPINVOKE.HShellWrapper_m_Flist_get(swigCPtr); } 
  }

  public MVO_POINTER_SIZED_INT m_Key {
	set { HCSMVOPINVOKE.HShellWrapper_m_Key_set(swigCPtr, value); } 
	get { return HCSMVOPINVOKE.HShellWrapper_m_Key_get(swigCPtr); } 
  }

  public int m_facepointer {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_facepointer_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_facepointer_get(swigCPtr);
      return ret;
    } 
  }

  public int m_totalflen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_totalflen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_totalflen_get(swigCPtr);
      return ret;
    } 
  }

  public int m_totalplen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_totalplen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_totalplen_get(swigCPtr);
      return ret;
    } 
  }

  public int m_totalnumfaceslen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_totalnumfaceslen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_totalnumfaceslen_get(swigCPtr);
      return ret;
    } 
  }

  public int m_numfaceslen {
    set {
      HCSMVOPINVOKE.HShellWrapper_m_numfaceslen_set(swigCPtr, value);
    } 
    get {
      int ret = HCSMVOPINVOKE.HShellWrapper_m_numfaceslen_get(swigCPtr);
      return ret;
    } 
  }

  public IntPtr m_faceregion {
	get { return HCSMVOPINVOKE.HShellWrapper_m_faceregion_get(swigCPtr); } 
  }

  public IntPtr m_faceindirect {
	get { return HCSMVOPINVOKE.HShellWrapper_m_faceindirect_get(swigCPtr); } 
  }

  public FaceWithNormalInfo m_FNArray {
    get {
      IntPtr cPtr = HCSMVOPINVOKE.HShellWrapper_m_FNArray_get(swigCPtr);
      FaceWithNormalInfo ret = (cPtr == IntPtr.Zero) ? null : new FaceWithNormalInfo(cPtr, false);
      return ret;
    } 
  }

}
