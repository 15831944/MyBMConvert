/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


using System;
using System.Runtime.InteropServices;


#if _M_X64
using HLONG = System.Int64;
using ID_Key = System.Int64;
#else
using HLONG = System.Int32;
using ID_Key = System.Int32;
#endif
public class  HCSSTREAM {

    public static float[] ExtractFloatArray(IntPtr source, int count)
    {
        float[] array = new float[count];
        Marshal.Copy(source, array, 0, count);
        return array;
    }

    public static int[] ExtractIntArray(IntPtr source, int count)
    {
        int[] array = new int[count];
        Marshal.Copy(source, array, 0, count);
        return array;
    }

    public static T[] ExtractArray<T>(IntPtr source, int count)
    {   
        // This function can handle everything to two above can, but it copies elements one at a
        // time so it's not very efficient to use for copying raw floats or ints.
        Type type = typeof(T);
        int size = Marshal.SizeOf(type);
        T[] array = new T[count];

        IntPtr ptr = source;

        for (int i = 0; i < count; i++)
        {
            array[i] = (T)Marshal.PtrToStructure(ptr, type);
            ptr = new IntPtr((long)ptr + size);
        }

        return array;
    }

	[UnmanagedFunctionPointer(CallingConvention.Cdecl)]
	[return: MarshalAs(UnmanagedType.U1)]
	public delegate bool TK_Progress_Callback(uint so_far, uint expected, IntPtr user_data);

  public static TK_Status TK_Read_Stream_File(string filename, BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Read_Stream_File__SWIG_0(filename, BStreamFileToolkit.getCPtr(tk));
    return ret;
  }

  public static TK_Status TK_Read_Stream_File(string filename, int flags) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Read_Stream_File__SWIG_1(filename, flags);
    return ret;
  }

  public static TK_Status TK_Read_Stream_File(string filename) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.TK_Read_Stream_File__SWIG_2(filename);
    return ret;
  }

  public static void dprintf(string format) {
    HCSSTREAMPINVOKE.dprintf(format);
  }

  public static void wcsstrcpy(SWIGTYPE_p_wchar_t dp, string sp) {
    HCSSTREAMPINVOKE.wcsstrcpy(SWIGTYPE_p_wchar_t.getCPtr(dp), sp);
  }

  public static string wcschr2(string str, SWIGTYPE_p_wchar_t c1, SWIGTYPE_p_wchar_t c2) {return HCSSTREAMPINVOKE.wcschr2__SWIG_0(str, SWIGTYPE_p_wchar_t.getCPtr(c1), SWIGTYPE_p_wchar_t.getCPtr(c2));}

  public static string wcsrchr2(string str, SWIGTYPE_p_wchar_t c1, SWIGTYPE_p_wchar_t c2) {return HCSSTREAMPINVOKE.wcsrchr2__SWIG_0(str, SWIGTYPE_p_wchar_t.getCPtr(c1), SWIGTYPE_p_wchar_t.getCPtr(c2));}

  public static TK_Status HTK_Read_Stream_File(string filename, HStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Read_Stream_File__SWIG_0(filename, HStreamFileToolkit.getCPtr(tk));
    return ret;
  }

  public static TK_Status HTK_Read_Stream_File(string filename, int flags) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Read_Stream_File__SWIG_1(filename, flags);
    return ret;
  }

  public static TK_Status HTK_Read_Stream_File(string filename) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Read_Stream_File__SWIG_2(filename);
    return ret;
  }

  public static TK_Status HTK_Write_Stream_File(string filename, HStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Write_Stream_File__SWIG_0(filename, HStreamFileToolkit.getCPtr(tk));
    return ret;
  }

  public static TK_Status HTK_Write_Stream_File(string filename, int flags) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Write_Stream_File__SWIG_1(filename, flags);
    return ret;
  }

  public static TK_Status HTK_Write_Stream_File(string filename) {
    TK_Status ret = (TK_Status)HCSSTREAMPINVOKE.HTK_Write_Stream_File__SWIG_2(filename);
    return ret;
  }

  public static readonly int TK_File_Format_Version = HCSSTREAMPINVOKE.TK_File_Format_Version_get();
  public static readonly int TK_DEFAULT_BUFFER_SIZE = HCSSTREAMPINVOKE.TK_DEFAULT_BUFFER_SIZE_get();
  public static readonly int STATUS_ERROR = HCSSTREAMPINVOKE.STATUS_ERROR_get();
  public static readonly int STATUS_NORMAL = HCSSTREAMPINVOKE.STATUS_NORMAL_get();
  public static readonly int CS_INVALID = HCSSTREAMPINVOKE.CS_INVALID_get();
  public static readonly int CS_TRIVIAL = HCSSTREAMPINVOKE.CS_TRIVIAL_get();
  public static readonly int CS_TRIVIAL_IMPLICIT = HCSSTREAMPINVOKE.CS_TRIVIAL_IMPLICIT_get();
  public static readonly int CS_REPULSE = HCSSTREAMPINVOKE.CS_REPULSE_get();
  public static readonly int CS_NONE = HCSSTREAMPINVOKE.CS_NONE_get();
  public static readonly int CS_EDGEBREAKER = HCSSTREAMPINVOKE.CS_EDGEBREAKER_get();
  public static readonly int CS_LINE_EXTEND = HCSSTREAMPINVOKE.CS_LINE_EXTEND_get();
  public static readonly int CS_TRIVIAL_POLAR = HCSSTREAMPINVOKE.CS_TRIVIAL_POLAR_get();
  public static readonly int MAXU10 = HCSSTREAMPINVOKE.MAXU10_get();
  public static readonly int MAXV10 = HCSSTREAMPINVOKE.MAXV10_get();
  public static readonly int MAXU8 = HCSSTREAMPINVOKE.MAXU8_get();
  public static readonly int MAXV8 = HCSSTREAMPINVOKE.MAXV8_get();
  public static readonly int EB_DEFAULT = HCSSTREAMPINVOKE.EB_DEFAULT_get();
  public static readonly int HINT_ONE_PIECE = HCSSTREAMPINVOKE.HINT_ONE_PIECE_get();
  public static readonly int HINT_WATERTIGHT = HCSSTREAMPINVOKE.HINT_WATERTIGHT_get();
  public static readonly int HINT_MANIFOLD = HCSSTREAMPINVOKE.HINT_MANIFOLD_get();
  public static readonly int HINT_NO_HANDLES = HCSSTREAMPINVOKE.HINT_NO_HANDLES_get();
  public static readonly int HINT_NO_BACKWARDS_OR_HOLES = HCSSTREAMPINVOKE.HINT_NO_BACKWARDS_OR_HOLES_get();
  public static readonly int HINT_INPUT_BY_TRISTRIPS = HCSSTREAMPINVOKE.HINT_INPUT_BY_TRISTRIPS_get();
  public static readonly int STATUS_COMPLETE = HCSSTREAMPINVOKE.STATUS_COMPLETE_get();
  public static readonly int STATUS_WATERTIGHT = HCSSTREAMPINVOKE.STATUS_WATERTIGHT_get();
  public static readonly int STATUS_TRY_AGAIN = HCSSTREAMPINVOKE.STATUS_TRY_AGAIN_get();
  public static readonly int MTABLE_HAS_LENGTHS = HCSSTREAMPINVOKE.MTABLE_HAS_LENGTHS_get();
  public static readonly int MTABLE_HAS_M2STACKOFFSETS = HCSSTREAMPINVOKE.MTABLE_HAS_M2STACKOFFSETS_get();
  public static readonly int MTABLE_HAS_M2GATEOFFSETS = HCSSTREAMPINVOKE.MTABLE_HAS_M2GATEOFFSETS_get();
  public static readonly int MTABLE_HAS_DUMMIES = HCSSTREAMPINVOKE.MTABLE_HAS_DUMMIES_get();
  public static readonly int MTABLE_HAS_PATCHES = HCSSTREAMPINVOKE.MTABLE_HAS_PATCHES_get();
  public static readonly int MTABLE_HAS_BOUNDING = HCSSTREAMPINVOKE.MTABLE_HAS_BOUNDING_get();
  public static readonly int MTABLE_HAS_QUANTIZATION = HCSSTREAMPINVOKE.MTABLE_HAS_QUANTIZATION_get();
  public static readonly int MTABLE_HAS_QUANTIZATION_NORMALS = HCSSTREAMPINVOKE.MTABLE_HAS_QUANTIZATION_NORMALS_get();
  public static readonly int CASE_C = HCSSTREAMPINVOKE.CASE_C_get();
  public static readonly int CASE_L = HCSSTREAMPINVOKE.CASE_L_get();
  public static readonly int CASE_E = HCSSTREAMPINVOKE.CASE_E_get();
  public static readonly int CASE_R = HCSSTREAMPINVOKE.CASE_R_get();
  public static readonly int CASE_S = HCSSTREAMPINVOKE.CASE_S_get();
  public static readonly int CASE_M = HCSSTREAMPINVOKE.CASE_M_get();
  public static readonly int CASE_M2 = HCSSTREAMPINVOKE.CASE_M2_get();
  public static readonly double BIG_FLOAT = HCSSTREAMPINVOKE.BIG_FLOAT_get();
  public static readonly int DEFAULT_QUANTIZATION = HCSSTREAMPINVOKE.DEFAULT_QUANTIZATION_get();
  public static readonly double DEFAULT_POINT_FACTOR = HCSSTREAMPINVOKE.DEFAULT_POINT_FACTOR_get();
  public static readonly int DEFAULT_HINTS = HCSSTREAMPINVOKE.DEFAULT_HINTS_get();
  public static readonly int POINTSIZE = HCSSTREAMPINVOKE.POINTSIZE_get();
  public static readonly int TKLOD_ESCAPE = HCSSTREAMPINVOKE.TKLOD_ESCAPE_get();
  public static readonly int NC_HAS_WEIGHTS = HCSSTREAMPINVOKE.NC_HAS_WEIGHTS_get();
  public static readonly int NC_HAS_KNOTS = HCSSTREAMPINVOKE.NC_HAS_KNOTS_get();
  public static readonly int NC_HAS_START = HCSSTREAMPINVOKE.NC_HAS_START_get();
  public static readonly int NC_HAS_END = HCSSTREAMPINVOKE.NC_HAS_END_get();
  public static readonly int NS_HAS_WEIGHTS = HCSSTREAMPINVOKE.NS_HAS_WEIGHTS_get();
  public static readonly int NS_HAS_KNOTS = HCSSTREAMPINVOKE.NS_HAS_KNOTS_get();
  public static readonly int NS_HAS_TRIMS = HCSSTREAMPINVOKE.NS_HAS_TRIMS_get();
  public static readonly int NS_TRIM_END = HCSSTREAMPINVOKE.NS_TRIM_END_get();
  public static readonly int NS_TRIM_POLY = HCSSTREAMPINVOKE.NS_TRIM_POLY_get();
  public static readonly int NS_TRIM_CURVE = HCSSTREAMPINVOKE.NS_TRIM_CURVE_get();
  public static readonly int NS_TRIM_COLLECTION = HCSSTREAMPINVOKE.NS_TRIM_COLLECTION_get();
  public static readonly int NS_TRIM_LAST_KNOWN_TYPE = HCSSTREAMPINVOKE.NS_TRIM_LAST_KNOWN_TYPE_get();
  public static readonly int NS_TRIM_KEEP = HCSSTREAMPINVOKE.NS_TRIM_KEEP_get();
  public static readonly int NS_TRIM_HAS_WEIGHTS = HCSSTREAMPINVOKE.NS_TRIM_HAS_WEIGHTS_get();
  public static readonly int NS_TRIM_HAS_KNOTS = HCSSTREAMPINVOKE.NS_TRIM_HAS_KNOTS_get();
  public static readonly int TKPP_X_2D_MASK = HCSSTREAMPINVOKE.TKPP_X_2D_MASK_get();
  public static readonly int TKPP_Y_2D_MASK = HCSSTREAMPINVOKE.TKPP_Y_2D_MASK_get();
  public static readonly int TKPP_Z_2D_MASK = HCSSTREAMPINVOKE.TKPP_Z_2D_MASK_get();
  public static readonly int TKPP_ANY_2D_MASK = HCSSTREAMPINVOKE.TKPP_ANY_2D_MASK_get();
  public static readonly int TKPP_EXPLICIT_PRIMITIVE_MASK = HCSSTREAMPINVOKE.TKPP_EXPLICIT_PRIMITIVE_MASK_get();
}
