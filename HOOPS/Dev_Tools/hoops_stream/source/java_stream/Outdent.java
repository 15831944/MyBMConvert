/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class Outdent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Outdent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Outdent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_Outdent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Outdent(BStreamFileToolkit tk, int n_tabs) {
    this(HJSTREAMJNI.new_Outdent__SWIG_0(BStreamFileToolkit.getCPtr(tk), tk, n_tabs), true);
  }

  public Outdent(BStreamFileToolkit tk) {
    this(HJSTREAMJNI.new_Outdent__SWIG_1(BStreamFileToolkit.getCPtr(tk), tk), true);
  }

}
