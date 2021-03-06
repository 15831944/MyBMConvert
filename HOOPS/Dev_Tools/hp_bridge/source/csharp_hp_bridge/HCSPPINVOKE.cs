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
#else
using HLONG = System.Int32;
#endif

unsafe public class  HCSPPINVOKE {

#if DEBUG
#    if _M_X64
internal const string HCSPDLL = "hcsp_bridge2120_x64d";
#    else
internal const string HCSPDLL = "hcsp_bridge2120d";
#    endif
#else
#    if _M_X64
internal const string HCSPDLL = "hcsp_bridge2120_x64";
#    else
internal const string HCSPDLL = "hcsp_bridge2120";
#    endif
#endif


  protected class SWIGExceptionHelper {

    public delegate void ExceptionDelegate(string message);
    public delegate void ExceptionArgumentDelegate(string message, string paramName);

    static ExceptionDelegate applicationDelegate = new ExceptionDelegate(SetPendingApplicationException);
    static ExceptionDelegate arithmeticDelegate = new ExceptionDelegate(SetPendingArithmeticException);
    static ExceptionDelegate divideByZeroDelegate = new ExceptionDelegate(SetPendingDivideByZeroException);
    static ExceptionDelegate indexOutOfRangeDelegate = new ExceptionDelegate(SetPendingIndexOutOfRangeException);
    static ExceptionDelegate invalidCastDelegate = new ExceptionDelegate(SetPendingInvalidCastException);
    static ExceptionDelegate invalidOperationDelegate = new ExceptionDelegate(SetPendingInvalidOperationException);
    static ExceptionDelegate ioDelegate = new ExceptionDelegate(SetPendingIOException);
    static ExceptionDelegate nullReferenceDelegate = new ExceptionDelegate(SetPendingNullReferenceException);
    static ExceptionDelegate outOfMemoryDelegate = new ExceptionDelegate(SetPendingOutOfMemoryException);
    static ExceptionDelegate overflowDelegate = new ExceptionDelegate(SetPendingOverflowException);
    static ExceptionDelegate systemDelegate = new ExceptionDelegate(SetPendingSystemException);

    static ExceptionArgumentDelegate argumentDelegate = new ExceptionArgumentDelegate(SetPendingArgumentException);
    static ExceptionArgumentDelegate argumentNullDelegate = new ExceptionArgumentDelegate(SetPendingArgumentNullException);
    static ExceptionArgumentDelegate argumentOutOfRangeDelegate = new ExceptionArgumentDelegate(SetPendingArgumentOutOfRangeException);

    [DllImport(HCSPDLL, EntryPoint="SWIGRegisterExceptionCallbacks_HCSP")]
    public static extern void SWIGRegisterExceptionCallbacks_HCSP(
                                ExceptionDelegate applicationDelegate,
                                ExceptionDelegate arithmeticDelegate,
                                ExceptionDelegate divideByZeroDelegate, 
                                ExceptionDelegate indexOutOfRangeDelegate, 
                                ExceptionDelegate invalidCastDelegate,
                                ExceptionDelegate invalidOperationDelegate,
                                ExceptionDelegate ioDelegate,
                                ExceptionDelegate nullReferenceDelegate,
                                ExceptionDelegate outOfMemoryDelegate, 
                                ExceptionDelegate overflowDelegate, 
                                ExceptionDelegate systemExceptionDelegate);

    [DllImport(HCSPDLL, EntryPoint="SWIGRegisterExceptionArgumentCallbacks_HCSP")]
    public static extern void SWIGRegisterExceptionCallbacksArgument_HCSP(
                                ExceptionArgumentDelegate argumentDelegate,
                                ExceptionArgumentDelegate argumentNullDelegate,
                                ExceptionArgumentDelegate argumentOutOfRangeDelegate);

    static void SetPendingApplicationException(string message) {
      SWIGPendingException.Set(new System.ApplicationException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingArithmeticException(string message) {
      SWIGPendingException.Set(new System.ArithmeticException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingDivideByZeroException(string message) {
      SWIGPendingException.Set(new System.DivideByZeroException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingIndexOutOfRangeException(string message) {
      SWIGPendingException.Set(new System.IndexOutOfRangeException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingInvalidCastException(string message) {
      SWIGPendingException.Set(new System.InvalidCastException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingInvalidOperationException(string message) {
      SWIGPendingException.Set(new System.InvalidOperationException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingIOException(string message) {
      SWIGPendingException.Set(new System.IO.IOException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingNullReferenceException(string message) {
      SWIGPendingException.Set(new System.NullReferenceException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingOutOfMemoryException(string message) {
      SWIGPendingException.Set(new System.OutOfMemoryException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingOverflowException(string message) {
      SWIGPendingException.Set(new System.OverflowException(message, SWIGPendingException.Retrieve()));
    }
    static void SetPendingSystemException(string message) {
      SWIGPendingException.Set(new System.SystemException(message, SWIGPendingException.Retrieve()));
    }

    static void SetPendingArgumentException(string message, string paramName) {
      SWIGPendingException.Set(new System.ArgumentException(message, paramName, SWIGPendingException.Retrieve()));
    }
    static void SetPendingArgumentNullException(string message, string paramName) {
      Exception e = SWIGPendingException.Retrieve();
      if (e != null) message = message + " Inner Exception: " + e.Message;
      SWIGPendingException.Set(new System.ArgumentNullException(paramName, message));
    }
    static void SetPendingArgumentOutOfRangeException(string message, string paramName) {
      Exception e = SWIGPendingException.Retrieve();
      if (e != null) message = message + " Inner Exception: " + e.Message;
      SWIGPendingException.Set(new System.ArgumentOutOfRangeException(paramName, message));
    }

    static SWIGExceptionHelper() {
      SWIGRegisterExceptionCallbacks_HCSP(
                                applicationDelegate,
                                arithmeticDelegate,
                                divideByZeroDelegate,
                                indexOutOfRangeDelegate,
                                invalidCastDelegate,
                                invalidOperationDelegate,
                                ioDelegate,
                                nullReferenceDelegate,
                                outOfMemoryDelegate,
                                overflowDelegate,
                                systemDelegate);

      SWIGRegisterExceptionCallbacksArgument_HCSP(
                                argumentDelegate,
                                argumentNullDelegate,
                                argumentOutOfRangeDelegate);
    }
  }

  protected static SWIGExceptionHelper swigExceptionHelper = new SWIGExceptionHelper();

  public class SWIGPendingException {
    [ThreadStatic]
    private static Exception pendingException = null;
    private static int numExceptionsPending = 0;

    public static bool Pending {
      get {
        bool pending = false;
        if (numExceptionsPending > 0)
          if (pendingException != null)
            pending = true;
        return pending;
      } 
    }

    public static void Set(Exception e) {
      if (pendingException != null)
        throw new ApplicationException("FATAL: An earlier pending exception from unmanaged code was missed and thus not thrown (" + pendingException.ToString() + ")", e);
      pendingException = e;
      lock(typeof(HCSPPINVOKE)) {
        numExceptionsPending++;
      }
    }

    public static Exception Retrieve() {
      Exception e = null;
      if (numExceptionsPending > 0) {
        if (pendingException != null) {
          e = pendingException;
          pendingException = null;
          lock(typeof(HCSPPINVOKE)) {
            numExceptionsPending--;
          }
        }
      }
      return e;
    }
  }


  protected class SWIGStringHelper {

    public delegate string SWIGStringDelegate(string message);
    static SWIGStringDelegate stringDelegate = new SWIGStringDelegate(CreateString);

    [DllImport(HCSPDLL, EntryPoint="SWIGRegisterStringCallback_HCSP")]
    public static extern void SWIGRegisterStringCallback_HCSP(SWIGStringDelegate stringDelegate);

    static string CreateString(string cString) {
      return cString;
    }

    static SWIGStringHelper() {
      SWIGRegisterStringCallback_HCSP(stringDelegate);
    }
  }

  static protected SWIGStringHelper swigStringHelper = new SWIGStringHelper();


  static HCSPPINVOKE() {
   if (swigStringHelper == null)
    swigStringHelper = new SWIGStringHelper();
  }


  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_key_out_of_range_get")]
  public static extern int HP_ERROR_key_out_of_range_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_non_circle_key_out_of_range_get")]
  public static extern int HP_ERROR_non_circle_key_out_of_range_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_key_does_not_exist_get")]
  public static extern int HP_ERROR_key_does_not_exist_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_unable_to_determine_entity_class_get")]
  public static extern int HP_ERROR_unable_to_determine_entity_class_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_non_mappable_entity_class_get")]
  public static extern int HP_ERROR_non_mappable_entity_class_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_unknown_entity_class_get")]
  public static extern int HP_ERROR_unknown_entity_class_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_not_implemented_get")]
  public static extern int HP_ERROR_not_implemented_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_hoops_key_maps_to_invalid_entity_class_get")]
  public static extern int HP_ERROR_hoops_key_maps_to_invalid_entity_class_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_HP_ERROR_incorrect_face_tag_mapping_get")]
  public static extern int HP_ERROR_incorrect_face_tag_mapping_get();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Init__SWIG_0")]
  public static extern void Init__SWIG_0(string jarg1, byte jarg2, bool jarg3);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Init__SWIG_1")]
  public static extern void Init__SWIG_1(string jarg1, byte jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Update")]
  public static extern void Update();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Close")]
  public static extern void Close();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Delete_Entity_Geometry__SWIG_0")]
  public static extern void Delete_Entity_Geometry__SWIG_0(uint jarg1, int* jarg2, bool jarg3);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Delete_Entity_Geometry__SWIG_1")]
  public static extern void Delete_Entity_Geometry__SWIG_1(uint jarg1, int* jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Update_Entity__SWIG_0")]
  public static extern bool Update_Entity__SWIG_0(int jarg1, int jarg2, int jarg3);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Update_Entity__SWIG_1")]
  public static extern bool Update_Entity__SWIG_1(int jarg1, int jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Update_Entity__SWIG_2")]
  public static extern bool Update_Entity__SWIG_2(int jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Compute_Geometry_Keys")]
  public static extern int Compute_Geometry_Keys(int jarg1, int jarg2, HLONG* jarg3, string jarg4);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Compute_Geometry_Key_Count")]
  public static extern int Compute_Geometry_Key_Count(int jarg1, System.Text.StringBuilder jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Compute_TagID")]
  public static extern int Compute_TagID(HLONG jarg1, int jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Set_Rendering_Options")]
  public static extern void Set_Rendering_Options(string jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Show_Rendering_Options")]
  public static extern void Show_Rendering_Options(System.Text.StringBuilder jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Show_One_Rendering_Option")]
  public static extern void Show_One_Rendering_Option(string jarg1, System.Text.StringBuilder jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Set_Schema_Path")]
  public static extern void Set_Schema_Path(string jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Set_Hash_Level")]
  public static extern void Set_Hash_Level(byte jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Set_Instances_To_Bodies")]
  public static extern void Set_Instances_To_Bodies(bool jarg1);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Get_Instances_To_Bodies")]
  public static extern bool Get_Instances_To_Bodies();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Check_Consistency")]
  public static extern int Check_Consistency();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Associate_Key_To_Entity")]
  public static extern bool Associate_Key_To_Entity(int jarg1, HLONG jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Compute_Selected_Entity_List")]
  public static extern void Compute_Selected_Entity_List(int ** jarg1, int* jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_Get_Hash_Level")]
  public static extern byte Get_Hash_Level();

  [DllImport(HCSPDLL, EntryPoint="CSharp_Get_Schema_Path")]
  public static extern IntPtr Get_Schema_Path();

  [DllImport(HCSPDLL, EntryPoint="CSharp_open_assembly_internal")]
  public static extern void open_assembly_internal(int jarg1, bool jarg2, int jarg3);

  [DllImport(HCSPDLL, EntryPoint="CSharp_merge_body_faces_internal")]
  public static extern void merge_body_faces_internal(int* jarg1, uint jarg2);

  [DllImport(HCSPDLL, EntryPoint="CSharp_insert_vertices_for_body")]
  public static extern void insert_vertices_for_body(int jarg1);
}
