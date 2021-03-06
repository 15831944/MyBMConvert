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
using MVO_POINTER_SIZED_INT = System.Int64;
using MVO_POINTER_SIZED_UINT = System.UInt64;
using ID_Key = System.Int64;
#else
using MVO_POINTER_SIZED_INT = System.Int32;
using MVO_POINTER_SIZED_UINT = System.UInt32;
using ID_Key = System.Int32;
#endif
public class  HCSMVO {

	// Helper methods for methods/properties returning array as IntPtr
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
	public delegate bool HSignalNotifyFunction(int signal, IntPtr signal_data, IntPtr user_data);

  public static readonly int MVO_BIGENDIAN = HCSMVOPINVOKE.MVO_BIGENDIAN_get();
  public static readonly double H_M_PI = HCSMVOPINVOKE.H_M_PI_get();
  public static readonly int INVALID_KEY = HCSMVOPINVOKE.INVALID_KEY_get();
  public static readonly int NO_RELATED_SELECTION_LIMIT = HCSMVOPINVOKE.NO_RELATED_SELECTION_LIMIT_get();
  public static readonly double MVO_SQRT_MAX_FLOAT = HCSMVOPINVOKE.MVO_SQRT_MAX_FLOAT_get();
  public static readonly int MVO_MESSAGE_BUFFER_SIZE = HCSMVOPINVOKE.MVO_MESSAGE_BUFFER_SIZE_get();
  public static readonly int MVO_SEGMENT_PATHNAME_BUFFER = HCSMVOPINVOKE.MVO_SEGMENT_PATHNAME_BUFFER_get();
  public static readonly int MVO_BUFFER_SIZE = HCSMVOPINVOKE.MVO_BUFFER_SIZE_get();
  public static readonly int MVO_SMALL_BUFFER_SIZE = HCSMVOPINVOKE.MVO_SMALL_BUFFER_SIZE_get();
  public static readonly int MVO_BIG_BUFFER_SIZE = HCSMVOPINVOKE.MVO_BIG_BUFFER_SIZE_get();
  public static readonly double HPOINT_EPSILON = HCSMVOPINVOKE.HPOINT_EPSILON_get();
  public static readonly int HLISTENER_PASS_EVENT = HCSMVOPINVOKE.HLISTENER_PASS_EVENT_get();
  public static readonly int HLISTENER_CONSUME_EVENT = HCSMVOPINVOKE.HLISTENER_CONSUME_EVENT_get();
  public static readonly int HLISTENER_PRIORITY_NORMAL = HCSMVOPINVOKE.HLISTENER_PRIORITY_NORMAL_get();
  public static readonly int HLISTENER_PRIORITY_HIGH = HCSMVOPINVOKE.HLISTENER_PRIORITY_HIGH_get();
  public static readonly int HLISTENER_PRIORITY_LOW = HCSMVOPINVOKE.HLISTENER_PRIORITY_LOW_get();
  public static readonly int MVO_CONTROL = HCSMVOPINVOKE.MVO_CONTROL_get();
  public static readonly int MVO_SHIFT = HCSMVOPINVOKE.MVO_SHIFT_get();
  public static readonly int MVO_ALT = HCSMVOPINVOKE.MVO_ALT_get();
  public static readonly int MVO_LBUTTON = HCSMVOPINVOKE.MVO_LBUTTON_get();
  public static readonly int MVO_MBUTTON = HCSMVOPINVOKE.MVO_MBUTTON_get();
  public static readonly int MVO_RBUTTON = HCSMVOPINVOKE.MVO_RBUTTON_get();
  public static readonly int MVO_RIGHT_CONTROL = HCSMVOPINVOKE.MVO_RIGHT_CONTROL_get();
  public static readonly int MVO_RIGHT_SHIFT = HCSMVOPINVOKE.MVO_RIGHT_SHIFT_get();
  public static readonly int MVO_RIGHT_ALT = HCSMVOPINVOKE.MVO_RIGHT_ALT_get();
  public static readonly int MVO_LEFT_CONTROL = HCSMVOPINVOKE.MVO_LEFT_CONTROL_get();
  public static readonly int MVO_LEFT_SHIFT = HCSMVOPINVOKE.MVO_LEFT_SHIFT_get();
  public static readonly int MVO_LEFT_ALT = HCSMVOPINVOKE.MVO_LEFT_ALT_get();
  public static readonly int MVO_LEFT_ARROW = HCSMVOPINVOKE.MVO_LEFT_ARROW_get();
  public static readonly int MVO_UP_ARROW = HCSMVOPINVOKE.MVO_UP_ARROW_get();
  public static readonly int MVO_RIGHT_ARROW = HCSMVOPINVOKE.MVO_RIGHT_ARROW_get();
  public static readonly int MVO_DOWN_ARROW = HCSMVOPINVOKE.MVO_DOWN_ARROW_get();
  public static readonly int MVO_JOYSTICK_BUTTON_1 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_1_get();
  public static readonly int MVO_JOYSTICK_BUTTON_2 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_2_get();
  public static readonly int MVO_JOYSTICK_BUTTON_3 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_3_get();
  public static readonly int MVO_JOYSTICK_BUTTON_4 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_4_get();
  public static readonly int MVO_JOYSTICK_BUTTON_5 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_5_get();
  public static readonly int MVO_JOYSTICK_BUTTON_6 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_6_get();
  public static readonly int MVO_JOYSTICK_BUTTON_7 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_7_get();
  public static readonly int MVO_JOYSTICK_BUTTON_8 = HCSMVOPINVOKE.MVO_JOYSTICK_BUTTON_8_get();
  public static readonly double EPSILON = HCSMVOPINVOKE.EPSILON_get();
  public static readonly uint HInputOpNone = HCSMVOPINVOKE.HInputOpNone_get();
  public static readonly uint HInputOpFileInputByKey = HCSMVOPINVOKE.HInputOpFileInputByKey_get();
  public static readonly uint HInputOpFileInputToImageKey = HCSMVOPINVOKE.HInputOpFileInputToImageKey_get();
  public static readonly uint HOutputOpNone = HCSMVOPINVOKE.HOutputOpNone_get();
  public static readonly uint HOutputOpFileOutputByKey = HCSMVOPINVOKE.HOutputOpFileOutputByKey_get();
  public static readonly uint HOutputOpFileOutputFromImageKey = HCSMVOPINVOKE.HOutputOpFileOutputFromImageKey_get();
  public static readonly int VI_BITS = HCSMVOPINVOKE.VI_BITS_get();
  public static readonly int VI_MASK = HCSMVOPINVOKE.VI_MASK_get();
  public static readonly int MAX_SI_INDEX = HCSMVOPINVOKE.MAX_SI_INDEX_get();
  public static readonly int UNUSED_INDEX_TO_PAIR = HCSMVOPINVOKE.UNUSED_INDEX_TO_PAIR_get();
  public static readonly double _PI = HCSMVOPINVOKE._PI_get();
  public static readonly int BOOLEAN_TYPE_NONE = HCSMVOPINVOKE.BOOLEAN_TYPE_NONE_get();
  public static readonly int BOOLEAN_TYPE_INTERSECT = HCSMVOPINVOKE.BOOLEAN_TYPE_INTERSECT_get();
  public static readonly int BOOLEAN_TYPE_SUBTRACT = HCSMVOPINVOKE.BOOLEAN_TYPE_SUBTRACT_get();
  public static readonly int BOOLEAN_TYPE_UNION = HCSMVOPINVOKE.BOOLEAN_TYPE_UNION_get();
  public static readonly int HSUBENTITY_FACES = HCSMVOPINVOKE.HSUBENTITY_FACES_get();
  public static readonly int HSUBENTITY_VERTICES = HCSMVOPINVOKE.HSUBENTITY_VERTICES_get();
  public static readonly int HSUBENTITY_EDGES = HCSMVOPINVOKE.HSUBENTITY_EDGES_get();
  public static readonly int BG_CIRCLE = HCSMVOPINVOKE.BG_CIRCLE_get();
  public static readonly int BG_QUAD = HCSMVOPINVOKE.BG_QUAD_get();
  public static readonly int BG_CLOUD = HCSMVOPINVOKE.BG_CLOUD_get();
  public static readonly int BG_NONE = HCSMVOPINVOKE.BG_NONE_get();
  public static readonly int BHV_MAX_NAME_LENGTH = HCSMVOPINVOKE.BHV_MAX_NAME_LENGTH_get();
  public static readonly int BHV_MAX_VERSION_LENGTH = HCSMVOPINVOKE.BHV_MAX_VERSION_LENGTH_get();
  public static readonly int BHV_MAX_VENDOR_LENGTH = HCSMVOPINVOKE.BHV_MAX_VENDOR_LENGTH_get();
  public static readonly int BHV_MAX_TYPE_LENGTH = HCSMVOPINVOKE.BHV_MAX_TYPE_LENGTH_get();
}
