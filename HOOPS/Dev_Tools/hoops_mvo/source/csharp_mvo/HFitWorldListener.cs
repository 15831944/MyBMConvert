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


public class HFitWorldListener : HEventListener {
  private HandleRef swigCPtr;

  public HFitWorldListener(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HFitWorldListenerUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HFitWorldListener obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HFitWorldListener() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HFitWorldListener(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public static HEventListenerType GetEventType() {
    HEventListenerType ret = (HEventListenerType)HCSMVOPINVOKE.HFitWorldListener_GetEventType();
    return ret;
  }

  public override HEventListener CreateListenerManager() {
    IntPtr cPtr = ((this.GetType() == typeof(HFitWorldListener)) ? HCSMVOPINVOKE.HFitWorldListener_CreateListenerManager(swigCPtr) : HCSMVOPINVOKE.HFitWorldListener_CreateListenerManagerSwigExplicitHFitWorldListener(swigCPtr));
    HEventListener ret = (cPtr == IntPtr.Zero) ? null : new HEventListener(cPtr, false);
    return ret;
  }

  public virtual int PreFitWorldEvent(HBaseView param_1) {
    int ret = ((this.GetType() == typeof(HFitWorldListener)) ? HCSMVOPINVOKE.HFitWorldListener_PreFitWorldEvent(swigCPtr, HBaseView.getCPtr(param_1)) : HCSMVOPINVOKE.HFitWorldListener_PreFitWorldEventSwigExplicitHFitWorldListener(swigCPtr, HBaseView.getCPtr(param_1)));
    return ret;
  }

  public virtual int PostFitWorldEvent(HBaseView param_1) {
    int ret = ((this.GetType() == typeof(HFitWorldListener)) ? HCSMVOPINVOKE.HFitWorldListener_PostFitWorldEvent(swigCPtr, HBaseView.getCPtr(param_1)) : HCSMVOPINVOKE.HFitWorldListener_PostFitWorldEventSwigExplicitHFitWorldListener(swigCPtr, HBaseView.getCPtr(param_1)));
    return ret;
  }

  public HFitWorldListener() : this(HCSMVOPINVOKE.new_HFitWorldListener(), true) {
    SwigDirectorConnect();
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("CreateListenerManager", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateHFitWorldListener_0(SwigDirectorCreateListenerManager);
    if (SwigDerivedClassHasMethod("PreFitWorldEvent", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateHFitWorldListener_1(SwigDirectorPreFitWorldEvent);
    if (SwigDerivedClassHasMethod("PostFitWorldEvent", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateHFitWorldListener_2(SwigDirectorPostFitWorldEvent);
    HCSMVOPINVOKE.HFitWorldListener_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2);
  }

  private bool SwigDerivedClassHasMethod(string methodName, Type[] methodTypes) {
    System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(HFitWorldListener));
    return hasDerivedMethod;
  }

  private IntPtr SwigDirectorCreateListenerManager() {
    return HEventListener.getCPtr(CreateListenerManager()).Handle;
  }

  private int SwigDirectorPreFitWorldEvent(IntPtr param_1) {
    return PreFitWorldEvent((param_1 == IntPtr.Zero) ? null : new HBaseView(param_1, false));
  }

  private int SwigDirectorPostFitWorldEvent(IntPtr param_1) {
    return PostFitWorldEvent((param_1 == IntPtr.Zero) ? null : new HBaseView(param_1, false));
  }

  public delegate IntPtr SwigDelegateHFitWorldListener_0();
  public delegate int SwigDelegateHFitWorldListener_1(IntPtr param_1);
  public delegate int SwigDelegateHFitWorldListener_2(IntPtr param_1);

  private SwigDelegateHFitWorldListener_0 swigDelegate0;
  private SwigDelegateHFitWorldListener_1 swigDelegate1;
  private SwigDelegateHFitWorldListener_2 swigDelegate2;

  private static Type[] swigMethodTypes0 = new Type[] {  };
  private static Type[] swigMethodTypes1 = new Type[] { typeof(HBaseView) };
  private static Type[] swigMethodTypes2 = new Type[] { typeof(HBaseView) };
}
