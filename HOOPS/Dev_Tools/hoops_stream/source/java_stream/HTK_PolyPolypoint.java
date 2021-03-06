/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTK_PolyPolypoint extends TK_PolyPolypoint {
  private long swigCPtr;

  protected HTK_PolyPolypoint(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGHTK_PolyPolypointUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HTK_PolyPolypoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_HTK_PolyPolypoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    HJSTREAMJNI.HTK_PolyPolypoint_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.HTK_PolyPolypoint_change_ownership(this, swigCPtr, true);
  }

  public HTK_PolyPolypoint(short op) {
    this(HJSTREAMJNI.new_HTK_PolyPolypoint(op), true);
    HJSTREAMJNI.HTK_PolyPolypoint_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Execute(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == HTK_PolyPolypoint.class) ? HJSTREAMJNI.HTK_PolyPolypoint_Execute(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.HTK_PolyPolypoint_ExecuteSwigExplicitHTK_PolyPolypoint(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, int variant) {
    return TK_Status.swigToEnum((getClass() == HTK_PolyPolypoint.class) ? HJSTREAMJNI.HTK_PolyPolypoint_Interpret__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant) : HJSTREAMJNI.HTK_PolyPolypoint_InterpretSwigExplicitHTK_PolyPolypoint__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key) {
    return TK_Status.swigToEnum((getClass() == HTK_PolyPolypoint.class) ? HJSTREAMJNI.HTK_PolyPolypoint_Interpret__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key) : HJSTREAMJNI.HTK_PolyPolypoint_InterpretSwigExplicitHTK_PolyPolypoint__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, String special) {
    return TK_Status.swigToEnum((getClass() == HTK_PolyPolypoint.class) ? HJSTREAMJNI.HTK_PolyPolypoint_Interpret__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special) : HJSTREAMJNI.HTK_PolyPolypoint_InterpretSwigExplicitHTK_PolyPolypoint__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == HTK_PolyPolypoint.class) ? HJSTREAMJNI.HTK_PolyPolypoint_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.HTK_PolyPolypoint_CloneSwigExplicitHTK_PolyPolypoint(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public void Reset() {
    if (getClass() == HTK_PolyPolypoint.class) HJSTREAMJNI.HTK_PolyPolypoint_Reset(swigCPtr, this); else HJSTREAMJNI.HTK_PolyPolypoint_ResetSwigExplicitHTK_PolyPolypoint(swigCPtr, this);
  }

}
