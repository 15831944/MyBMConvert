/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HTClient {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public HTClient(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(HTClient obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HTClient(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    HJMVOJNI.HTClient_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJMVOJNI.HTClient_change_ownership(this, swigCPtr, true);
  }

  public HTClient(float interval, HTCStyle style, SWIGTYPE_p_f_float_float_p_void__bool tick_function, long user_data) {
    this(HJMVOJNI.new_HTClient__SWIG_0(interval, style.swigValue(), SWIGTYPE_p_f_float_float_p_void__bool.getCPtr(tick_function), user_data), true);
    HJMVOJNI.HTClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HTClient(float interval, HTCStyle style, SWIGTYPE_p_f_float_float_p_void__bool tick_function) {
    this(HJMVOJNI.new_HTClient__SWIG_1(interval, style.swigValue(), SWIGTYPE_p_f_float_float_p_void__bool.getCPtr(tick_function)), true);
    HJMVOJNI.HTClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HTClient(float interval, HTCStyle style) {
    this(HJMVOJNI.new_HTClient__SWIG_2(interval, style.swigValue()), true);
    HJMVOJNI.HTClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HTClient(float interval) {
    this(HJMVOJNI.new_HTClient__SWIG_3(interval), true);
    HJMVOJNI.HTClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public HTClient() {
    this(HJMVOJNI.new_HTClient__SWIG_4(), true);
    HJMVOJNI.HTClient_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public boolean Tick(float request_time, float actual_time) {
    return (getClass() == HTClient.class) ? HJMVOJNI.HTClient_Tick(swigCPtr, this, request_time, actual_time) : HJMVOJNI.HTClient_TickSwigExplicitHTClient(swigCPtr, this, request_time, actual_time);
  }

  public void SetInterval(float interval) {
    HJMVOJNI.HTClient_SetInterval(swigCPtr, this, interval);
  }

  public float GetInterval() {
    return HJMVOJNI.HTClient_GetInterval(swigCPtr, this);
  }

  public void SetStyle(HTCStyle style) {
    HJMVOJNI.HTClient_SetStyle(swigCPtr, this, style.swigValue());
  }

  public HTCStyle GetStyle() {
    return HTCStyle.swigToEnum(HJMVOJNI.HTClient_GetStyle(swigCPtr, this));
  }

  public void SetNextRequest(float nr) {
    HJMVOJNI.HTClient_SetNextRequest(swigCPtr, this, nr);
  }

  public float GetNextRequest() {
    return HJMVOJNI.HTClient_GetNextRequest(swigCPtr, this);
  }

  public int GetPriority() {
    return HJMVOJNI.HTClient_GetPriority(swigCPtr, this);
  }

  public void SetPriorityLowest() {
    HJMVOJNI.HTClient_SetPriorityLowest(swigCPtr, this);
  }

  public void SetUserData(long user_data) {
    HJMVOJNI.HTClient_SetUserData(swigCPtr, this, user_data);
  }

  public long GetUserData() {return (long)HJMVOJNI.HTClient_GetUserData(swigCPtr, this);}

  public void SetTickFunction(SWIGTYPE_p_f_float_float_p_void__bool tick_function) {
    HJMVOJNI.HTClient_SetTickFunction(swigCPtr, this, SWIGTYPE_p_f_float_float_p_void__bool.getCPtr(tick_function));
  }

  public SWIGTYPE_p_f_float_float_p_void__bool GetTickFunction() {
    long cPtr = HJMVOJNI.HTClient_GetTickFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_float_float_p_void__bool(cPtr, false);
  }

  protected void setMt_style(HTCStyle value) {
    HJMVOJNI.HTClient_mt_style_set(swigCPtr, this, value.swigValue());
  }

  protected HTCStyle getMt_style() {
    return HTCStyle.swigToEnum(HJMVOJNI.HTClient_mt_style_get(swigCPtr, this));
  }

  protected void setMt_interval(float value) {
    HJMVOJNI.HTClient_mt_interval_set(swigCPtr, this, value);
  }

  protected float getMt_interval() {
    return HJMVOJNI.HTClient_mt_interval_get(swigCPtr, this);
  }

  protected void setMt_next_request(float value) {
    HJMVOJNI.HTClient_mt_next_request_set(swigCPtr, this, value);
  }

  protected float getMt_next_request() {
    return HJMVOJNI.HTClient_mt_next_request_get(swigCPtr, this);
  }

  protected void setMt_priority(int value) {
    HJMVOJNI.HTClient_mt_priority_set(swigCPtr, this, value);
  }

  protected int getMt_priority() {
    return HJMVOJNI.HTClient_mt_priority_get(swigCPtr, this);
  }

  protected void setMt_user_data(long value) {
    HJMVOJNI.HTClient_mt_user_data_set(swigCPtr, this, value);
  }

  protected long getMt_user_data() {return (long)HJMVOJNI.HTClient_mt_user_data_get(swigCPtr, this);}

  protected void setMt_tick_function(SWIGTYPE_p_f_float_float_p_void__bool value) {
    HJMVOJNI.HTClient_mt_tick_function_set(swigCPtr, this, SWIGTYPE_p_f_float_float_p_void__bool.getCPtr(value));
  }

  protected SWIGTYPE_p_f_float_float_p_void__bool getMt_tick_function() {
    long cPtr = HJMVOJNI.HTClient_mt_tick_function_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_float_float_p_void__bool(cPtr, false);
  }

}