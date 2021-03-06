/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTK_Clip_Rectangle extends TK_Clip_Rectangle {
  private long swigCPtr;

  protected HTK_Clip_Rectangle(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGHTK_Clip_RectangleUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HTK_Clip_Rectangle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_HTK_Clip_Rectangle(swigCPtr);
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
    HJSTREAMJNI.HTK_Clip_Rectangle_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.HTK_Clip_Rectangle_change_ownership(this, swigCPtr, true);
  }

  public TK_Status Execute(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == HTK_Clip_Rectangle.class) ? HJSTREAMJNI.HTK_Clip_Rectangle_Execute(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.HTK_Clip_Rectangle_ExecuteSwigExplicitHTK_Clip_Rectangle(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == HTK_Clip_Rectangle.class) ? HJSTREAMJNI.HTK_Clip_Rectangle_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.HTK_Clip_Rectangle_CloneSwigExplicitHTK_Clip_Rectangle(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public HTK_Clip_Rectangle() {
    this(HJSTREAMJNI.new_HTK_Clip_Rectangle(), true);
    HJSTREAMJNI.HTK_Clip_Rectangle_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
