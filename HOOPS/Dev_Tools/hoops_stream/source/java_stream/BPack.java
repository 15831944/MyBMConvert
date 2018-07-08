/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class BPack {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BPack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BPack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_BPack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BPack() {
    this(HJSTREAMJNI.new_BPack(), true);
  }

  public void InitWrite(int size, SWIGTYPE_p_void pointer) {
    HJSTREAMJNI.BPack_InitWrite(swigCPtr, this, size, SWIGTYPE_p_void.getCPtr(pointer));
  }

  public void InitRead(int size, SWIGTYPE_p_void pointer) {
    HJSTREAMJNI.BPack_InitRead(swigCPtr, this, size, SWIGTYPE_p_void.getCPtr(pointer));
  }

  public void Put(int numbits, int val) {
    HJSTREAMJNI.BPack_Put(swigCPtr, this, numbits, val);
  }

  public int Get(int numbits) {
    return HJSTREAMJNI.BPack_Get(swigCPtr, this, numbits);
  }

  public int NumBytes() {
    return HJSTREAMJNI.BPack_NumBytes(swigCPtr, this);
  }

  public void SetCanReallocate(int val) {
    HJSTREAMJNI.BPack_SetCanReallocate(swigCPtr, this, val);
  }

  public int GetStatus() {
    return HJSTREAMJNI.BPack_GetStatus(swigCPtr, this);
  }

  public void SwapBytes() {
    HJSTREAMJNI.BPack_SwapBytes(swigCPtr, this);
  }

}