/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class TK_Image extends BBaseOpcodeHandler {
  private long swigCPtr;

  protected TK_Image(long cPtr, boolean cMemoryOwn) {
    super(HJSTREAMJNI.SWIGTK_ImageUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TK_Image obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJSTREAMJNI.delete_TK_Image(swigCPtr);
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
    HJSTREAMJNI.TK_Image_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    HJSTREAMJNI.TK_Image_change_ownership(this, swigCPtr, true);
  }

  protected void setM_position(SWIGTYPE_p_float value) {
    HJSTREAMJNI.TK_Image_m_position_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  protected SWIGTYPE_p_float getM_position() {
    long cPtr = HJSTREAMJNI.TK_Image_m_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  protected void setM_dposition(SWIGTYPE_p_double value) {
    HJSTREAMJNI.TK_Image_m_dposition_set(swigCPtr, this, SWIGTYPE_p_double.getCPtr(value));
  }

  protected SWIGTYPE_p_double getM_dposition() {
    long cPtr = HJSTREAMJNI.TK_Image_m_dposition_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  protected void setM_size(SWIGTYPE_p_int value) {
    HJSTREAMJNI.TK_Image_m_size_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  protected SWIGTYPE_p_int getM_size() {
    long cPtr = HJSTREAMJNI.TK_Image_m_size_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  protected void setM_data_size(int value) {
    HJSTREAMJNI.TK_Image_m_data_size_set(swigCPtr, this, value);
  }

  protected int getM_data_size() {
    return HJSTREAMJNI.TK_Image_m_data_size_get(swigCPtr, this);
  }

  protected void setM_name_length(int value) {
    HJSTREAMJNI.TK_Image_m_name_length_set(swigCPtr, this, value);
  }

  protected int getM_name_length() {
    return HJSTREAMJNI.TK_Image_m_name_length_get(swigCPtr, this);
  }

  protected void setM_reference_length(int value) {
    HJSTREAMJNI.TK_Image_m_reference_length_set(swigCPtr, this, value);
  }

  protected int getM_reference_length() {
    return HJSTREAMJNI.TK_Image_m_reference_length_get(swigCPtr, this);
  }

  protected void setM_format(short value) {
    HJSTREAMJNI.TK_Image_m_format_set(swigCPtr, this, value);
  }

  protected short getM_format() {
    return HJSTREAMJNI.TK_Image_m_format_get(swigCPtr, this);
  }

  protected void setM_options(long value) {
    HJSTREAMJNI.TK_Image_m_options_set(swigCPtr, this, value);
  }

  protected long getM_options() {
    return HJSTREAMJNI.TK_Image_m_options_get(swigCPtr, this);
  }

  protected void setM_compression(short value) {
    HJSTREAMJNI.TK_Image_m_compression_set(swigCPtr, this, value);
  }

  protected short getM_compression() {
    return HJSTREAMJNI.TK_Image_m_compression_get(swigCPtr, this);
  }

  protected void setM_bytes_format(short value) {
    HJSTREAMJNI.TK_Image_m_bytes_format_set(swigCPtr, this, value);
  }

  protected short getM_bytes_format() {
    return HJSTREAMJNI.TK_Image_m_bytes_format_get(swigCPtr, this);
  }

  protected void setM_explicit_size(SWIGTYPE_p_float value) {
    HJSTREAMJNI.TK_Image_m_explicit_size_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  protected SWIGTYPE_p_float getM_explicit_size() {
    long cPtr = HJSTREAMJNI.TK_Image_m_explicit_size_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  protected void setM_explicit_units(SWIGTYPE_p_unsigned_char value) {
    HJSTREAMJNI.TK_Image_m_explicit_units_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  protected SWIGTYPE_p_unsigned_char getM_explicit_units() {
    long cPtr = HJSTREAMJNI.TK_Image_m_explicit_units_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  protected void setM_work_area(TK_Image_Data_Buffer value) {
    HJSTREAMJNI.TK_Image_m_work_area_set(swigCPtr, this, TK_Image_Data_Buffer.getCPtr(value), value);
  }

  protected TK_Image_Data_Buffer getM_work_area() {
    long cPtr = HJSTREAMJNI.TK_Image_m_work_area_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TK_Image_Data_Buffer(cPtr, false);
  }

  protected void setM_compression_quality(float value) {
    HJSTREAMJNI.TK_Image_m_compression_quality_set(swigCPtr, this, value);
  }

  protected float getM_compression_quality() {
    return HJSTREAMJNI.TK_Image_m_compression_quality_get(swigCPtr, this);
  }

  protected void setM_jpeg_native(boolean value) {
    HJSTREAMJNI.TK_Image_m_jpeg_native_set(swigCPtr, this, value);
  }

  protected boolean getM_jpeg_native() {
    return HJSTREAMJNI.TK_Image_m_jpeg_native_get(swigCPtr, this);
  }

  protected void set_data(int size, String bytes, short data_format) {
    HJSTREAMJNI.TK_Image_set_data__SWIG_0(swigCPtr, this, size, bytes, data_format);
  }

  protected void set_data(int size, String bytes) {
    HJSTREAMJNI.TK_Image_set_data__SWIG_1(swigCPtr, this, size, bytes);
  }

  protected void set_data(int size) {
    HJSTREAMJNI.TK_Image_set_data__SWIG_2(swigCPtr, this, size);
  }

  protected void set_name(String string) {
    HJSTREAMJNI.TK_Image_set_name__SWIG_0(swigCPtr, this, string);
  }

  protected void set_name(int length) {
    HJSTREAMJNI.TK_Image_set_name__SWIG_1(swigCPtr, this, length);
  }

  protected TK_Status compress_image(BStreamFileToolkit tk, int active_work_area) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_compress_image__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, active_work_area));
  }

  protected TK_Status compress_image(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_compress_image__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status decompress_image(BStreamFileToolkit tk, int active_work_area) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_decompress_image__SWIG_0(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, active_work_area));
  }

  protected TK_Status decompress_image(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_decompress_image__SWIG_1(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  protected TK_Status read_jpeg_header() {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_read_jpeg_header(swigCPtr, this));
  }

  public TK_Image() {
    this(HJSTREAMJNI.new_TK_Image(), true);
    HJSTREAMJNI.TK_Image_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public TK_Status Read(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Image.class) ? HJSTREAMJNI.TK_Image_Read(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Image_ReadSwigExplicitTK_Image(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Write(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum((getClass() == TK_Image.class) ? HJSTREAMJNI.TK_Image_Write(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk) : HJSTREAMJNI.TK_Image_WriteSwigExplicitTK_Image(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    return TK_Status.swigToEnum((getClass() == TK_Image.class) ? HJSTREAMJNI.TK_Image_Clone(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HJSTREAMJNI.TK_Image_CloneSwigExplicitTK_Image(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk, SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_ReadAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_WriteAscii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public TK_Status compress_image_ascii(BStreamFileToolkit tk) {
    return TK_Status.swigToEnum(HJSTREAMJNI.TK_Image_compress_image_ascii(swigCPtr, this, BStreamFileToolkit.getCPtr(tk), tk));
  }

  public void Reset() {
    if (getClass() == TK_Image.class) HJSTREAMJNI.TK_Image_Reset(swigCPtr, this); else HJSTREAMJNI.TK_Image_ResetSwigExplicitTK_Image(swigCPtr, this);
  }

  public void SetBytes(int size, String bytes, short data_format) {
    HJSTREAMJNI.TK_Image_SetBytes__SWIG_0(swigCPtr, this, size, bytes, data_format);
  }

  public void SetBytes(int size, String bytes) {
    HJSTREAMJNI.TK_Image_SetBytes__SWIG_1(swigCPtr, this, size, bytes);
  }

  public void SetBytes(int size) {
    HJSTREAMJNI.TK_Image_SetBytes__SWIG_2(swigCPtr, this, size);
  }

  public void SetName(String string) {
    HJSTREAMJNI.TK_Image_SetName__SWIG_0(swigCPtr, this, string);
  }

  public void SetName(int length) {
    HJSTREAMJNI.TK_Image_SetName__SWIG_1(swigCPtr, this, length);
  }

  public String GetName() {return HJSTREAMJNI.TK_Image_GetName__SWIG_0(swigCPtr, this);}

  public void SetReference(String string) {
    HJSTREAMJNI.TK_Image_SetReference__SWIG_0(swigCPtr, this, string);
  }

  public void SetReference(int length) {
    HJSTREAMJNI.TK_Image_SetReference__SWIG_1(swigCPtr, this, length);
  }

  public String GetReference() {return HJSTREAMJNI.TK_Image_GetReference__SWIG_0(swigCPtr, this);}

  public void SetPosition(float x, float y, float z) {
    HJSTREAMJNI.TK_Image_SetPosition__SWIG_0(swigCPtr, this, x, y, z);
  }

  public void SetPosition(float[] p) {
    HJSTREAMJNI.TK_Image_SetPosition__SWIG_1(swigCPtr, this, p);
  }

  public void SetDPosition(double x, double y, double z) {
    HJSTREAMJNI.TK_Image_SetDPosition__SWIG_0(swigCPtr, this, x, y, z);
  }

  public void SetDPosition(double[] p) {
    HJSTREAMJNI.TK_Image_SetDPosition__SWIG_1(swigCPtr, this, p);
  }

  public double[] GetDPosition() {return HJSTREAMJNI.TK_Image_GetDPosition(swigCPtr, this);}

  public void SetSize(int w, int h) {
    HJSTREAMJNI.TK_Image_SetSize__SWIG_0(swigCPtr, this, w, h);
  }

  public void SetSize(int[] s) {
    HJSTREAMJNI.TK_Image_SetSize__SWIG_1(swigCPtr, this, s);
  }

  public void SetFormat(int f) {
    HJSTREAMJNI.TK_Image_SetFormat(swigCPtr, this, f);
  }

  public int GetFormat() {
    return HJSTREAMJNI.TK_Image_GetFormat(swigCPtr, this);
  }

  public void SetOptions(int f) {
    HJSTREAMJNI.TK_Image_SetOptions(swigCPtr, this, f);
  }

  public int GetOptions() {
    return HJSTREAMJNI.TK_Image_GetOptions(swigCPtr, this);
  }

  public void SetCompression(int c) {
    HJSTREAMJNI.TK_Image_SetCompression(swigCPtr, this, c);
  }

  public int GetCompression() {
    return HJSTREAMJNI.TK_Image_GetCompression(swigCPtr, this);
  }

  public void GetSize(int[] values, int count) {
    HJSTREAMJNI.TK_Image_GetSize(swigCPtr, this, values, count);
  }

}
