/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class Recorded_Instance extends BControlledMemoryObject {
  private long swigCPtr;

  protected Recorded_Instance(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGRecorded_InstanceUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Recorded_Instance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_Recorded_Instance(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setM_next(Recorded_Instance value) {
    HJSTREAMJNI.Recorded_Instance_m_next_set(swigCPtr, this, Recorded_Instance.getCPtr(value), value);
  }

  public Recorded_Instance getM_next() {
    long cPtr = HJSTREAMJNI.Recorded_Instance_m_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Recorded_Instance(cPtr, false);
  }

  public void setM_key(int value) {
    HJSTREAMJNI.Recorded_Instance_m_key_set(swigCPtr, this, value);
  }

  public int getM_key() {
    return HJSTREAMJNI.Recorded_Instance_m_key_get(swigCPtr, this);
  }

  public void setM_variant(int value) {
    HJSTREAMJNI.Recorded_Instance_m_variant_set(swigCPtr, this, value);
  }

  public int getM_variant() {
    return HJSTREAMJNI.Recorded_Instance_m_variant_get(swigCPtr, this);
  }

  public void setM_values(SWIGTYPE_p_int value) {
    HJSTREAMJNI.Recorded_Instance_m_values_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getM_values() {
    long cPtr = HJSTREAMJNI.Recorded_Instance_m_values_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setM_local_basis(SWIGTYPE_p_float value) {
    HJSTREAMJNI.Recorded_Instance_m_local_basis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getM_local_basis() {
    long cPtr = HJSTREAMJNI.Recorded_Instance_m_local_basis_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setM_basis_indices(SWIGTYPE_p_int value) {
    HJSTREAMJNI.Recorded_Instance_m_basis_indices_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getM_basis_indices() {
    long cPtr = HJSTREAMJNI.Recorded_Instance_m_basis_indices_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setM_arbitrary_point(SWIGTYPE_p_float value) {
    HJSTREAMJNI.Recorded_Instance_m_arbitrary_point_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getM_arbitrary_point() {
    long cPtr = HJSTREAMJNI.Recorded_Instance_m_arbitrary_point_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setM_arbitrary_index(int value) {
    HJSTREAMJNI.Recorded_Instance_m_arbitrary_index_set(swigCPtr, this, value);
  }

  public int getM_arbitrary_index() {
    return HJSTREAMJNI.Recorded_Instance_m_arbitrary_index_get(swigCPtr, this);
  }

  public void setM_basis_valid(boolean value) {
    HJSTREAMJNI.Recorded_Instance_m_basis_valid_set(swigCPtr, this, value);
  }

  public boolean getM_basis_valid() {
    return HJSTREAMJNI.Recorded_Instance_m_basis_valid_get(swigCPtr, this);
  }

  public void setM_opcode(short value) {
    HJSTREAMJNI.Recorded_Instance_m_opcode_set(swigCPtr, this, value);
  }

  public short getM_opcode() {
    return HJSTREAMJNI.Recorded_Instance_m_opcode_get(swigCPtr, this);
  }

  public Recorded_Instance(int key, int variant, short op, int val1, int val2, int val3) {
    this(HJSTREAMJNI.new_Recorded_Instance(key, variant, op, val1, val2, val3), true);
  }

  public boolean basis_valid() {
    return HJSTREAMJNI.Recorded_Instance_basis_valid(swigCPtr, this);
  }

  public boolean generate_basis(int count, float[] points) {
    return HJSTREAMJNI.Recorded_Instance_generate_basis(swigCPtr, this, count, points);
  }

}
