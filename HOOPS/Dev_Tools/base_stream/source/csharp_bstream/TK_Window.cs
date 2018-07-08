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


public class TK_Window : BBaseOpcodeHandler {
  private HandleRef swigCPtr;

  internal TK_Window(IntPtr cPtr, bool cMemoryOwn) : base(HCSBSTREAMPINVOKE.TK_WindowUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(TK_Window obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~TK_Window() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSBSTREAMPINVOKE.delete_TK_Window(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public TK_Window() : this(HCSBSTREAMPINVOKE.new_TK_Window(), true) {
    SwigDirectorConnect();
  }

  public override TK_Status Read(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)((this.GetType() == typeof(TK_Window)) ? HCSBSTREAMPINVOKE.TK_Window_Read(swigCPtr, BStreamFileToolkit.getCPtr(tk)) : HCSBSTREAMPINVOKE.TK_Window_ReadSwigExplicitTK_Window(swigCPtr, BStreamFileToolkit.getCPtr(tk)));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Write(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)((this.GetType() == typeof(TK_Window)) ? HCSBSTREAMPINVOKE.TK_Window_Write(swigCPtr, BStreamFileToolkit.getCPtr(tk)) : HCSBSTREAMPINVOKE.TK_Window_WriteSwigExplicitTK_Window(swigCPtr, BStreamFileToolkit.getCPtr(tk)));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public override TK_Status Clone(BStreamFileToolkit tk, SWIGTYPE_p_p_BBaseOpcodeHandler handler) {
    TK_Status ret = (TK_Status)((this.GetType() == typeof(TK_Window)) ? HCSBSTREAMPINVOKE.TK_Window_Clone(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)) : HCSBSTREAMPINVOKE.TK_Window_CloneSwigExplicitTK_Window(swigCPtr, BStreamFileToolkit.getCPtr(tk), SWIGTYPE_p_p_BBaseOpcodeHandler.getCPtr(handler)));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status ReadAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Window_ReadAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public TK_Status WriteAscii(BStreamFileToolkit tk) {
    TK_Status ret = (TK_Status)HCSBSTREAMPINVOKE.TK_Window_WriteAscii(swigCPtr, BStreamFileToolkit.getCPtr(tk));
    if (HCSBSTREAMPINVOKE.SWIGPendingException.Pending) throw HCSBSTREAMPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public void SetWindow(float l, float r, float b, float t) {
    HCSBSTREAMPINVOKE.TK_Window_SetWindow__SWIG_0(swigCPtr, l, r, b, t);
  }

  public void SetWindow(float[] w) {
    HCSBSTREAMPINVOKE.TK_Window_SetWindow__SWIG_1(swigCPtr, w);
  }

  public IntPtr GetWindow() {return HCSBSTREAMPINVOKE.TK_Window_GetWindow(swigCPtr);}

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("Read", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateTK_Window_0(SwigDirectorRead);
    if (SwigDerivedClassHasMethod("Write", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateTK_Window_1(SwigDirectorWrite);
    if (SwigDerivedClassHasMethod("Execute", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateTK_Window_2(SwigDirectorExecute);
    if (SwigDerivedClassHasMethod("Interpret", swigMethodTypes3))
      swigDelegate3 = new SwigDelegateTK_Window_3(SwigDirectorInterpret__SWIG_0);
    if (SwigDerivedClassHasMethod("Interpret", swigMethodTypes4))
      swigDelegate4 = new SwigDelegateTK_Window_4(SwigDirectorInterpret__SWIG_1);
    if (SwigDerivedClassHasMethod("Interpret_special", swigMethodTypes5))
      swigDelegate5 = new SwigDelegateTK_Window_5(SwigDirectorInterpret_special);
    if (SwigDerivedClassHasMethod("Reset", swigMethodTypes6))
      swigDelegate6 = new SwigDelegateTK_Window_6(SwigDirectorReset);
    if (SwigDerivedClassHasMethod("Match_Instance", swigMethodTypes7))
      swigDelegate7 = new SwigDelegateTK_Window_7(SwigDirectorMatch_Instance);
    if (SwigDerivedClassHasMethod("Clone", swigMethodTypes8))
      swigDelegate8 = new SwigDelegateTK_Window_8(SwigDirectorClone);
    if (SwigDerivedClassHasMethod("NeedsContext", swigMethodTypes9))
      swigDelegate9 = new SwigDelegateTK_Window_9(SwigDirectorNeedsContext);
    HCSBSTREAMPINVOKE.TK_Window_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2, swigDelegate3, swigDelegate4, swigDelegate5, swigDelegate6, swigDelegate7, swigDelegate8, swigDelegate9);
  }

  private bool SwigDerivedClassHasMethod(string methodName, Type[] methodTypes) {
    System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(TK_Window));
    return hasDerivedMethod;
  }

  private int SwigDirectorRead(IntPtr tk) {
    return (int)Read(new BStreamFileToolkit(tk, false));
  }

  private int SwigDirectorWrite(IntPtr tk) {
    return (int)Write(new BStreamFileToolkit(tk, false));
  }

  private int SwigDirectorExecute(IntPtr tk) {
    return (int)Execute(new BStreamFileToolkit(tk, false));
  }

  private int SwigDirectorInterpret__SWIG_0(IntPtr tk, int key, int variant) {
    return (int)Interpret(new BStreamFileToolkit(tk, false), key, variant);
  }

  private int SwigDirectorInterpret__SWIG_1(IntPtr tk, int key) {
    return (int)Interpret(new BStreamFileToolkit(tk, false), key);
  }

  private int SwigDirectorInterpret_special(IntPtr tk, int key, string special) {
    return (int)Interpret_special(new BStreamFileToolkit(tk, false), key, special);
  }

  private void SwigDirectorReset() {
    Reset();
  }

  private bool SwigDirectorMatch_Instance(IntPtr tk, IntPtr instance) {
    return Match_Instance(new BStreamFileToolkit(tk, false), (instance == IntPtr.Zero) ? null : new Recorded_Instance(instance, false));
  }

  private int SwigDirectorClone(IntPtr tk, IntPtr handler) {
    return (int)Clone(new BStreamFileToolkit(tk, false), (handler == IntPtr.Zero) ? null : new SWIGTYPE_p_p_BBaseOpcodeHandler(handler, false));
  }

  private bool SwigDirectorNeedsContext(IntPtr tk) {
    return NeedsContext(new BStreamFileToolkit(tk, false));
  }

  public delegate int SwigDelegateTK_Window_0(IntPtr tk);
  public delegate int SwigDelegateTK_Window_1(IntPtr tk);
  public delegate int SwigDelegateTK_Window_2(IntPtr tk);
  public delegate int SwigDelegateTK_Window_3(IntPtr tk, int key, int variant);
  public delegate int SwigDelegateTK_Window_4(IntPtr tk, int key);
  public delegate int SwigDelegateTK_Window_5(IntPtr tk, int key, string special);
  public delegate void SwigDelegateTK_Window_6();
  public delegate bool SwigDelegateTK_Window_7(IntPtr tk, IntPtr instance);
  public delegate int SwigDelegateTK_Window_8(IntPtr tk, IntPtr handler);
  public delegate bool SwigDelegateTK_Window_9(IntPtr tk);

  private SwigDelegateTK_Window_0 swigDelegate0;
  private SwigDelegateTK_Window_1 swigDelegate1;
  private SwigDelegateTK_Window_2 swigDelegate2;
  private SwigDelegateTK_Window_3 swigDelegate3;
  private SwigDelegateTK_Window_4 swigDelegate4;
  private SwigDelegateTK_Window_5 swigDelegate5;
  private SwigDelegateTK_Window_6 swigDelegate6;
  private SwigDelegateTK_Window_7 swigDelegate7;
  private SwigDelegateTK_Window_8 swigDelegate8;
  private SwigDelegateTK_Window_9 swigDelegate9;

  private static Type[] swigMethodTypes0 = new Type[] { typeof(BStreamFileToolkit) };
  private static Type[] swigMethodTypes1 = new Type[] { typeof(BStreamFileToolkit) };
  private static Type[] swigMethodTypes2 = new Type[] { typeof(BStreamFileToolkit) };
  private static Type[] swigMethodTypes3 = new Type[] { typeof(BStreamFileToolkit), typeof(int), typeof(int) };
  private static Type[] swigMethodTypes4 = new Type[] { typeof(BStreamFileToolkit), typeof(int) };
  private static Type[] swigMethodTypes5 = new Type[] { typeof(BStreamFileToolkit), typeof(int), typeof(string) };
  private static Type[] swigMethodTypes6 = new Type[] {  };
  private static Type[] swigMethodTypes7 = new Type[] { typeof(BStreamFileToolkit), typeof(Recorded_Instance) };
  private static Type[] swigMethodTypes8 = new Type[] { typeof(BStreamFileToolkit), typeof(SWIGTYPE_p_p_BBaseOpcodeHandler) };
  private static Type[] swigMethodTypes9 = new Type[] { typeof(BStreamFileToolkit) };
}