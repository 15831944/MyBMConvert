/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTK_Glyph_Definitions extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected HTK_Glyph_Definitions(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGHTK_Glyph_DefinitionsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HTK_Glyph_Definitions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_HTK_Glyph_Definitions(swigCPtr);
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
    HJSTREAMJNI.HTK_Glyph_Definitions_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.HTK_Glyph_Definitions_change_ownership(this, swigCPtr, true);
  }

  protected void setM_parts(SWIGTYPE_p_p_BBaseOpcodeHandler value) {
    HJSTREAMJNI.HTK_Glyph_Definitions_m_parts_set(swigCPtr, this, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(value));
  }

  protected SWIGTYPE_p_p_BBaseOpcodeHandler getM_parts() {
    long cPtr = HJSTREAMJNI.HTK_Glyph_Definitions_m_parts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_BBaseOpcodeHandler(cPtr, false);
  }

  protected void setM_num_parts(int value) {
    HJSTREAMJNI.HTK_Glyph_Definitions_m_num_parts_set(swigCPtr, this, value);
  }

  protected int getM_num_parts() {
    return HJSTREAMJNI.HTK_Glyph_Definitions_m_num_parts_get(swigCPtr, this);
  }

  public HTK_Glyph_Definitions() {
    this(HJSTREAMJNI.new_HTK_Glyph_Definitions(), true);
    HJSTREAMJNI.HTK_Glyph_Definitions_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.HTK_Glyph_Definitions_ReadSwigExplicitHTK_Glyph_Definitions(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.HTK_Glyph_Definitions_WriteSwigExplicitHTK_Glyph_Definitions(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Execute(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Execute(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.HTK_Glyph_Definitions_ExecuteSwigExplicitHTK_Glyph_Definitions(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, int variant) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Interpret__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant) : HJSTREAMJNI.HTK_Glyph_Definitions_InterpretSwigExplicitHTK_Glyph_Definitions__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Interpret__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key) : HJSTREAMJNI.HTK_Glyph_Definitions_InterpretSwigExplicitHTK_Glyph_Definitions__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, String special) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Interpret__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special) : HJSTREAMJNI.HTK_Glyph_Definitions_InterpretSwigExplicitHTK_Glyph_Definitions__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == HTK_Glyph_Definitions.class) ? HJSTREAMJNI.HTK_Glyph_Definitions_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.HTK_Glyph_Definitions_CloneSwigExplicitHTK_Glyph_Definitions(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

}
