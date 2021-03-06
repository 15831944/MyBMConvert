/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class Internal_Data_Accumulator extends BControlledMemoryObject {
  private long swigCPtr;

  protected Internal_Data_Accumulator(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGInternal_Data_AccumulatorUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Internal_Data_Accumulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_Internal_Data_Accumulator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Internal_Data_Accumulator() {
    this(HJSTREAMJNI.new_Internal_Data_Accumulator(), true);
  }

  public void set_data(byte[] b, int s) {
    HJSTREAMJNI.Internal_Data_Accumulator_set_data(swigCPtr, this, b, s);
  }

  public void save() {
    HJSTREAMJNI.Internal_Data_Accumulator_save(swigCPtr, this);
  }

  public TK_Status consume() {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_consume(swigCPtr, this));
  }

  public TK_Status read(byte[] b, int s) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_read(swigCPtr, this, b, s));
  }

  public TK_Status write(String b, int s) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_write(swigCPtr, this, b, s));
  }

  public TK_Status lookat(byte[] b) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_lookat(swigCPtr, this, b));
  }

  public int get_original_buffer_size() {
    return HJSTREAMJNI.Internal_Data_Accumulator_get_original_buffer_size(swigCPtr, this);
  }

  public void restart() {
    HJSTREAMJNI.Internal_Data_Accumulator_restart(swigCPtr, this);
  }

  public void clean() {
    HJSTREAMJNI.Internal_Data_Accumulator_clean(swigCPtr, this);
  }

  public int unused() {
    return HJSTREAMJNI.Internal_Data_Accumulator_unused(swigCPtr, this);
  }

  public int generated() {
    return HJSTREAMJNI.Internal_Data_Accumulator_generated(swigCPtr, this);
  }

  public TK_Status start_compression() {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_start_compression(swigCPtr, this));
  }

  public TK_Status stop_compression(boolean flush) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_stop_compression(swigCPtr, this, flush));
  }

  public TK_Status start_decompression() {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_start_decompression(swigCPtr, this));
  }

  public TK_Status stop_decompression(boolean force) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_stop_decompression(swigCPtr, this, force));
  }

  public boolean compressed() {
    return HJSTREAMJNI.Internal_Data_Accumulator_compressed(swigCPtr, this);
  }

  public TK_Status error(String msg) {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_error__SWIG_0(swigCPtr, this, msg));
  }

  public TK_Status error() {
    return TK_Status.swigToEnum(HJSTREAMJNI.Internal_Data_Accumulator_error__SWIG_1(swigCPtr, this));
  }

}
