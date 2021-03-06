/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class ShellToRegionMapper {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ShellToRegionMapper(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ShellToRegionMapper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_ShellToRegionMapper(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShellToRegionMapper() {
    this(HJMVOJNI.new_ShellToRegionMapper(), true);
  }

  public void AddRegion(long originalshell, long newshell, int regionnum, boolean check) {
    HJMVOJNI.ShellToRegionMapper_AddRegion__SWIG_0(swigCPtr, this, originalshell, newshell, regionnum, check);
  }

  public void AddRegion(long originalshell, long newshell, int regionnum) {
    HJMVOJNI.ShellToRegionMapper_AddRegion__SWIG_1(swigCPtr, this, originalshell, newshell, regionnum);
  }

  public long GetOriginalShell(long newshell, int regionnum) {return HJMVOJNI.ShellToRegionMapper_GetOriginalShell(swigCPtr, this, newshell, regionnum);}

  public int GetRegionsFromOriginalShell(long originalshell, SWIGTYPE_p_p_HC_KEY newshells, int[] regionnum) {
    return HJMVOJNI.ShellToRegionMapper_GetRegionsFromOriginalShell(swigCPtr, this, originalshell, SWIGTYPE_p_p_HC_KEY.getCPtr(newshells), regionnum);
  }

  public void BuildSegmentTreeRecursive(long okey, long nkey) {
    HJMVOJNI.ShellToRegionMapper_BuildSegmentTreeRecursive(swigCPtr, this, okey, nkey);
  }

  public void MapSegmentTree(long modelkey) {
    HJMVOJNI.ShellToRegionMapper_MapSegmentTree(swigCPtr, this, modelkey);
  }

  public void AddSegmentMapping(long originalshell, long segmentkey) {
    HJMVOJNI.ShellToRegionMapper_AddSegmentMapping(swigCPtr, this, originalshell, segmentkey);
  }

  public void setM_RegionToShellHash(SWIGTYPE_p_vhash_s value) {
    HJMVOJNI.ShellToRegionMapper_m_RegionToShellHash_set(swigCPtr, this, SWIGTYPE_p_vhash_s.getCPtr(value));
  }

  public SWIGTYPE_p_vhash_s getM_RegionToShellHash() {
    long cPtr = HJMVOJNI.ShellToRegionMapper_m_RegionToShellHash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_vhash_s(cPtr, false);
  }

  public void setM_ShellToRegionHash(SWIGTYPE_p_vhash_s value) {
    HJMVOJNI.ShellToRegionMapper_m_ShellToRegionHash_set(swigCPtr, this, SWIGTYPE_p_vhash_s.getCPtr(value));
  }

  public SWIGTYPE_p_vhash_s getM_ShellToRegionHash() {
    long cPtr = HJMVOJNI.ShellToRegionMapper_m_ShellToRegionHash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_vhash_s(cPtr, false);
  }

  public void setM_ShellToSegmentHash(SWIGTYPE_p_vhash_s value) {
    HJMVOJNI.ShellToRegionMapper_m_ShellToSegmentHash_set(swigCPtr, this, SWIGTYPE_p_vhash_s.getCPtr(value));
  }

  public SWIGTYPE_p_vhash_s getM_ShellToSegmentHash() {
    long cPtr = HJMVOJNI.ShellToRegionMapper_m_ShellToSegmentHash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_vhash_s(cPtr, false);
  }

}
