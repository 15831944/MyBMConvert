/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class BBaseOpcodeHandler extends BControlledMemoryObject {
  private long swigCPtr;

  protected BBaseOpcodeHandler(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGBBaseOpcodeHandlerUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BBaseOpcodeHandler obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_BBaseOpcodeHandler(swigCPtr);
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
    HJSTREAMJNI.BBaseOpcodeHandler_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.BBaseOpcodeHandler_change_ownership(this, swigCPtr, true);
  }

  protected void setM_stage(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_stage_set(swigCPtr, this, value);
  }

  protected int getM_stage() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_stage_get(swigCPtr, this);
  }

  protected void setM_progress(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_progress_set(swigCPtr, this, value);
  }

  protected int getM_progress() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_progress_get(swigCPtr, this);
  }

  protected void setM_opcode(short value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_opcode_set(swigCPtr, this, value);
  }

  protected short getM_opcode() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_opcode_get(swigCPtr, this);
  }

  protected void setM_general_flags(short value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_general_flags_set(swigCPtr, this, value);
  }

  protected short getM_general_flags() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_general_flags_get(swigCPtr, this);
  }

  protected void setM_needs_tag(boolean value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_needs_tag_set(swigCPtr, this, value);
  }

  protected boolean getM_needs_tag() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_needs_tag_get(swigCPtr, this);
  }

  protected void setM_debug_length(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_debug_length_set(swigCPtr, this, value);
  }

  protected int getM_debug_length() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_debug_length_get(swigCPtr, this);
  }

  protected void setM_debug_allocated(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_debug_allocated_set(swigCPtr, this, value);
  }

  protected int getM_debug_allocated() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_debug_allocated_get(swigCPtr, this);
  }

  protected void setM_ascii_size(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_size_set(swigCPtr, this, value);
  }

  protected int getM_ascii_size() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_size_get(swigCPtr, this);
  }

  protected void setM_ascii_length(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_length_set(swigCPtr, this, value);
  }

  protected int getM_ascii_length() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_length_get(swigCPtr, this);
  }

  protected void setM_ascii_stage(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_stage_set(swigCPtr, this, value);
  }

  protected int getM_ascii_stage() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_stage_get(swigCPtr, this);
  }

  protected void setM_ascii_progress(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_progress_set(swigCPtr, this, value);
  }

  protected int getM_ascii_progress() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_ascii_progress_get(swigCPtr, this);
  }

  protected void setM_byte(short value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_byte_set(swigCPtr, this, value);
  }

  protected short getM_byte() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_byte_get(swigCPtr, this);
  }

  protected void setM_unsigned_short(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_unsigned_short_set(swigCPtr, this, value);
  }

  protected int getM_unsigned_short() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_unsigned_short_get(swigCPtr, this);
  }

  protected void setM_int(int value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_int_set(swigCPtr, this, value);
  }

  protected int getM_int() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_int_get(swigCPtr, this);
  }

  protected void setM_char(char value) {
    HJSTREAMJNI.BBaseOpcodeHandler_m_char_set(swigCPtr, this, value);
  }

  protected char getM_char() {
    return HJSTREAMJNI.BBaseOpcodeHandler_m_char_get(swigCPtr, this);
  }

  public BBaseOpcodeHandler(int op) {
    this(HJSTREAMJNI.new_BBaseOpcodeHandler(op), true);
    HJSTREAMJNI.BBaseOpcodeHandler_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Execute(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Execute(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.BBaseOpcodeHandler_ExecuteSwigExplicitBBaseOpcodeHandler(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, int variant) {
    return TK_Status.swigToEnum((getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Interpret__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant) : HJSTREAMJNI.BBaseOpcodeHandler_InterpretSwigExplicitBBaseOpcodeHandler__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key) {
    return TK_Status.swigToEnum((getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Interpret__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key) : HJSTREAMJNI.BBaseOpcodeHandler_InterpretSwigExplicitBBaseOpcodeHandler__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key));
  }

  public TK_Status Interpret(BStreamFileToolkit tk, int key, String special) {
    return TK_Status.swigToEnum((getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Interpret__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special) : HJSTREAMJNI.BBaseOpcodeHandler_InterpretSwigExplicitBBaseOpcodeHandler__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, special));
  }

  public void Reset() {
    if (getClass() == BBaseOpcodeHandler.class) HJSTREAMJNI.BBaseOpcodeHandler_Reset(swigCPtr, this); else HJSTREAMJNI.BBaseOpcodeHandler_ResetSwigExplicitBBaseOpcodeHandler(swigCPtr, this);
  }

  public boolean Match_Instance(BStreamFileToolkit tk, Recorded_Instance instance) {
    return (getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Match_Instance(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, Recorded_Instance.getCPtr(instance), instance) : HJSTREAMJNI.BBaseOpcodeHandler_Match_InstanceSwigExplicitBBaseOpcodeHandler(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, Recorded_Instance.getCPtr(instance), instance);
  }

  public short Opcode() {
    return HJSTREAMJNI.BBaseOpcodeHandler_Opcode(swigCPtr, this);
  }

  public short General_Flags() {
    return HJSTREAMJNI.BBaseOpcodeHandler_General_Flags(swigCPtr, this);
  }

  public void Set_General_Flags(int f) {
    HJSTREAMJNI.BBaseOpcodeHandler_Set_General_Flags(swigCPtr, this, f);
  }

  public int Pass(BStreamFileToolkit tk) {
    return HJSTREAMJNI.BBaseOpcodeHandler_Pass(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  public TK_Status Tag(BStreamFileToolkit tk, int variant) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_Tag__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, variant));
  }

  public TK_Status Tag(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_Tag__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public boolean Tagging(BStreamFileToolkit tk) {
    return HJSTREAMJNI.BBaseOpcodeHandler_Tagging(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  public void SetNeedsTag(boolean n) {
    HJSTREAMJNI.BBaseOpcodeHandler_SetNeedsTag(swigCPtr, this, n);
  }

  public boolean NeedsTag() {
    return HJSTREAMJNI.BBaseOpcodeHandler_NeedsTag(swigCPtr, this);
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.BBaseOpcodeHandler_CloneSwigExplicitBBaseOpcodeHandler(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public boolean NeedsContext(BStreamFileToolkit tk) {
    return (getClass() == BBaseOpcodeHandler.class) ? HJSTREAMJNI.BBaseOpcodeHandler_NeedsContext(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.BBaseOpcodeHandler_NeedsContextSwigExplicitBBaseOpcodeHandler(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  public void SetLoggingString(String segment) {
    HJSTREAMJNI.BBaseOpcodeHandler_SetLoggingString__SWIG_0(swigCPtr, this, segment);
  }

  public void SetLoggingString(int length) {
    HJSTREAMJNI.BBaseOpcodeHandler_SetLoggingString__SWIG_1(swigCPtr, this, length);
  }

  public String GetLoggingString() {return HJSTREAMJNI.BBaseOpcodeHandler_GetLoggingString__SWIG_0(swigCPtr, this);}

  public void LogDebug(BStreamFileToolkit tk, String string) {
    HJSTREAMJNI.BBaseOpcodeHandler_LogDebug__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, string);
  }

  public void LogDebug(BStreamFileToolkit tk) {
    HJSTREAMJNI.BBaseOpcodeHandler_LogDebug__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, byte[] b, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_0(BStreamFileToolkit.getCPtr(tk), tk, b, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, short[] s, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_1(BStreamFileToolkit.getCPtr(tk), tk, s, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, int[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_2(BStreamFileToolkit.getCPtr(tk), tk, i, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, float[] f, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_3(BStreamFileToolkit.getCPtr(tk), tk, f, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, double[] d, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_4(BStreamFileToolkit.getCPtr(tk), tk, d, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, long[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_7(BStreamFileToolkit.getCPtr(tk), tk, i, n));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, byte[] c) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_8(BStreamFileToolkit.getCPtr(tk), tk, c));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, short[] s) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_9(BStreamFileToolkit.getCPtr(tk), tk, s));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, int[] i) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_10(BStreamFileToolkit.getCPtr(tk), tk, i));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, long[] i) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_13(BStreamFileToolkit.getCPtr(tk), tk, i));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, float[] f) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_14(BStreamFileToolkit.getCPtr(tk), tk, f));
  }

  protected static TK_Status GetData(BStreamFileToolkit tk, double[] d) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetData__SWIG_15(BStreamFileToolkit.getCPtr(tk), tk, d));
  }

  protected TK_Status GetGeneral(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetGeneral(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected static TK_Status LookatData(BStreamFileToolkit tk, byte[] b) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_LookatData(BStreamFileToolkit.getCPtr(tk), tk, b));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, String b, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_0(BStreamFileToolkit.getCPtr(tk), tk, b, n));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, short[] s, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_1(BStreamFileToolkit.getCPtr(tk), tk, s, n));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, int[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_2(BStreamFileToolkit.getCPtr(tk), tk, i, n));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, float[] f, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_3(BStreamFileToolkit.getCPtr(tk), tk, f, n));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, double[] d, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_4(BStreamFileToolkit.getCPtr(tk), tk, d, n));
  }

  protected static TK_Status PutData(BStreamFileToolkit tk, long[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutData__SWIG_7(BStreamFileToolkit.getCPtr(tk), tk, i, n));
  }

  protected TK_Status PutOpcode(BStreamFileToolkit tk, int adjust) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutOpcode__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, adjust));
  }

  protected TK_Status PutOpcode(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutOpcode__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status PutGeneral(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutGeneral(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected static short flip(short s) {
    return HJSTREAMJNI.BBaseOpcodeHandler_flip__SWIG_0(s);
  }

  protected static int flip(int i) {
    return HJSTREAMJNI.BBaseOpcodeHandler_flip__SWIG_1(i);
  }

  protected static void fix(int[] i, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix__SWIG_0(i, n);
  }

  protected static void fix(short[] s, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix__SWIG_1(s, n);
  }

  protected static void fix_in(float[] f, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix_in__SWIG_0(f, n);
  }

  protected static void fix_in(double[] d, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix_in__SWIG_1(d, n);
  }

  protected static void fix_out(float[] f, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix_out__SWIG_0(f, n);
  }

  protected static void fix_out(double[] d, int n) {
    HJSTREAMJNI.BBaseOpcodeHandler_fix_out__SWIG_1(d, n);
  }

  protected void log_opcode(BStreamFileToolkit tk, long sequence, short opcode) {
    HJSTREAMJNI.BBaseOpcodeHandler_log_opcode(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, sequence, opcode);
  }

  protected void floats_to_bytes(float[] in, byte[] out, int count) {
    HJSTREAMJNI.BBaseOpcodeHandler_floats_to_bytes(swigCPtr, this, in, out, count);
  }

  protected void bytes_to_floats(byte[] in, float[] out, int count) {
    HJSTREAMJNI.BBaseOpcodeHandler_bytes_to_floats(swigCPtr, this, in, out, count);
  }

  protected void add_segment(BStreamFileToolkit tk, int key) {
    HJSTREAMJNI.BBaseOpcodeHandler_add_segment(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key);
  }

  protected int remove_segment(BStreamFileToolkit tk) {
    return HJSTREAMJNI.BBaseOpcodeHandler_remove_segment(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  protected void set_last_key(BStreamFileToolkit tk, int key) {
    HJSTREAMJNI.BBaseOpcodeHandler_set_last_key(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key);
  }

  protected int last_key(BStreamFileToolkit tk) {
    return HJSTREAMJNI.BBaseOpcodeHandler_last_key(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  protected void adjust_written(BStreamFileToolkit tk, int count) {
    HJSTREAMJNI.BBaseOpcodeHandler_adjust_written(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, count);
  }

  protected void increase_nesting(BStreamFileToolkit tk, int amount) {
    HJSTREAMJNI.BBaseOpcodeHandler_increase_nesting__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, amount);
  }

  protected void increase_nesting(BStreamFileToolkit tk) {
    HJSTREAMJNI.BBaseOpcodeHandler_increase_nesting__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  protected void decrease_nesting(BStreamFileToolkit tk, int amount) {
    HJSTREAMJNI.BBaseOpcodeHandler_decrease_nesting__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, amount);
  }

  protected void decrease_nesting(BStreamFileToolkit tk) {
    HJSTREAMJNI.BBaseOpcodeHandler_decrease_nesting__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk);
  }

  protected BBaseOpcodeHandler Opcode_Handler(BStreamFileToolkit tk, short op) {
    long cPtr = HJSTREAMJNI.BBaseOpcodeHandler_Opcode_Handler(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, op);
    return (cPtr == 0) ? null : new BBaseOpcodeHandler(cPtr, false);
  }

  protected void Record_Instance(BStreamFileToolkit tk, int key, int variant, int val1, int val2, int val3) {
    HJSTREAMJNI.BBaseOpcodeHandler_Record_Instance(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key, variant, val1, val2, val3);
  }

  protected boolean Find_Instance(BStreamFileToolkit tk, int val1, int val2, int val3) {
    return HJSTREAMJNI.BBaseOpcodeHandler_Find_Instance(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, val1, val2, val3);
  }

  protected void Remember_Item(BStreamFileToolkit tk, int key) {
    HJSTREAMJNI.BBaseOpcodeHandler_Remember_Item(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key);
  }

  protected boolean Find_Item(BStreamFileToolkit tk, int key) {
    return HJSTREAMJNI.BBaseOpcodeHandler_Find_Item(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, key);
  }

  protected boolean validate_count(int count, int limit) {
    return HJSTREAMJNI.BBaseOpcodeHandler_validate_count__SWIG_0(swigCPtr, this, count, limit);
  }

  protected boolean validate_count(int count) {
    return HJSTREAMJNI.BBaseOpcodeHandler_validate_count__SWIG_1(swigCPtr, this, count);
  }

  protected TK_Status SkipNewlineAndTabs(BStreamFileToolkit tk, long[] readSize) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_SkipNewlineAndTabs__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, readSize));
  }

  protected TK_Status SkipNewlineAndTabs(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_SkipNewlineAndTabs__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status ReadAsciiLine(BStreamFileToolkit tk, long[] readSize) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_ReadAsciiLine__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, readSize));
  }

  protected TK_Status ReadAsciiLine(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_ReadAsciiLine__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status ReadAsciiWord(BStreamFileToolkit tk, long[] readSize) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_ReadAsciiWord__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, readSize));
  }

  protected TK_Status ReadAsciiWord(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_ReadAsciiWord__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status ReadEndOpcode(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_ReadEndOpcode(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected boolean RemoveAngularBrackets(byte[] string) {
    return HJSTREAMJNI.BBaseOpcodeHandler_RemoveAngularBrackets(swigCPtr, this, string);
  }

  protected boolean RemoveQuotes(byte[] string) {
    return HJSTREAMJNI.BBaseOpcodeHandler_RemoveQuotes(swigCPtr, this, string);
  }

  protected TK_Status Read_Referenced_Segment(BStreamFileToolkit tk, int[] i_progress) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_Read_Referenced_Segment(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, i_progress));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, int[] rInts, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, rInts, n));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, byte[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, int[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_3(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, short[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_4(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, float[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_6(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, float[] rFloats, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_7(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, rFloats, n));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, byte[] m_string, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_8(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, m_string, n));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, int[] rInts, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_10(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, rInts, n));
  }

  protected TK_Status GetAsciiData(BStreamFileToolkit tk, String tag, short[] rShorts, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiData__SWIG_11(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, rShorts, n));
  }

  protected TK_Status GetAsciiHex(BStreamFileToolkit tk, String tag, byte[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiHex__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiHex(BStreamFileToolkit tk, String tag, int[] value) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiHex__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, value));
  }

  protected TK_Status GetAsciiImageData(BStreamFileToolkit tk, String tag, byte[] rValues, long n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_GetAsciiImageData(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, rValues, n));
  }

  protected TK_Status PutAsciiOpcode(BStreamFileToolkit tk, int adjust, boolean is_end, boolean want_newline) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiOpcode__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, adjust, is_end, want_newline));
  }

  protected TK_Status PutAsciiOpcode(BStreamFileToolkit tk, int adjust, boolean is_end) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiOpcode__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, adjust, is_end));
  }

  protected TK_Status PutAsciiOpcode(BStreamFileToolkit tk, int adjust) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiOpcode__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, adjust));
  }

  protected TK_Status PutAsciiOpcode(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiOpcode__SWIG_3(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status PutAsciiData(BStreamFileToolkit tk, String tag, String b, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiData__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, b, n));
  }

  protected TK_Status PutAsciiData(BStreamFileToolkit tk, String tag, short[] s, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiData__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, s, n));
  }

  protected TK_Status PutAsciiData(BStreamFileToolkit tk, String tag, int[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiData__SWIG_2(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, i, n));
  }

  protected TK_Status PutAsciiData(BStreamFileToolkit tk, String tag, float[] f, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiData__SWIG_3(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, f, n));
  }

  protected TK_Status PutAsciiData(BStreamFileToolkit tk, String tag, long[] i, int n) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutAsciiData__SWIG_6(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag, i, n));
  }

  protected TK_Status PutStartXMLTag(BStreamFileToolkit tk, String tag) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutStartXMLTag(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag));
  }

  protected TK_Status PutEndXMLTag(BStreamFileToolkit tk, String tag) {
    return TK_Status.swigToEnum(HJSTREAMJNI.BBaseOpcodeHandler_PutEndXMLTag(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, tag));
  }

}
