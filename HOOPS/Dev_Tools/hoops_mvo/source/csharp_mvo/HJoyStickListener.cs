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


public class HJoyStickListener : HEventListener {
  private HandleRef swigCPtr;

  public HJoyStickListener(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HJoyStickListenerUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HJoyStickListener obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HJoyStickListener() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HJoyStickListener(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public static HEventListenerType GetEventType() {
    HEventListenerType ret = (HEventListenerType)HCSMVOPINVOKE.HJoyStickListener_GetEventType();
    return ret;
  }

  public override HEventListener CreateListenerManager() {
    IntPtr cPtr = ((this.GetType() == typeof(HJoyStickListener)) ? HCSMVOPINVOKE.HJoyStickListener_CreateListenerManager(swigCPtr) : HCSMVOPINVOKE.HJoyStickListener_CreateListenerManagerSwigExplicitHJoyStickListener(swigCPtr));
    HEventListener ret = (cPtr == IntPtr.Zero) ? null : new HEventListener(cPtr, false);
    return ret;
  }

  public virtual int OnJoyStickRotation(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HJoyStickListener)) ? HCSMVOPINVOKE.HJoyStickListener_OnJoyStickRotation(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HJoyStickListener_OnJoyStickRotationSwigExplicitHJoyStickListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnJoyStickTranslation(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HJoyStickListener)) ? HCSMVOPINVOKE.HJoyStickListener_OnJoyStickTranslation(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HJoyStickListener_OnJoyStickTranslationSwigExplicitHJoyStickListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnJoyStickButton(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HJoyStickListener)) ? HCSMVOPINVOKE.HJoyStickListener_OnJoyStickButton(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HJoyStickListener_OnJoyStickButtonSwigExplicitHJoyStickListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public HJoyStickListener() : this(HCSMVOPINVOKE.new_HJoyStickListener(), true) {
    SwigDirectorConnect();
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("CreateListenerManager", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateHJoyStickListener_0(SwigDirectorCreateListenerManager);
    if (SwigDerivedClassHasMethod("OnJoyStickRotation", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateHJoyStickListener_1(SwigDirectorOnJoyStickRotation);
    if (SwigDerivedClassHasMethod("OnJoyStickTranslation", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateHJoyStickListener_2(SwigDirectorOnJoyStickTranslation);
    if (SwigDerivedClassHasMethod("OnJoyStickButton", swigMethodTypes3))
      swigDelegate3 = new SwigDelegateHJoyStickListener_3(SwigDirectorOnJoyStickButton);
    HCSMVOPINVOKE.HJoyStickListener_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2, swigDelegate3);
  }

  private bool SwigDerivedClassHasMethod(string methodName, Type[] methodTypes) {
    System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(HJoyStickListener));
    return hasDerivedMethod;
  }

  private IntPtr SwigDirectorCreateListenerManager() {
    return HEventListener.getCPtr(CreateListenerManager()).Handle;
  }

  private int SwigDirectorOnJoyStickRotation(IntPtr param_1) {
    return OnJoyStickRotation(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnJoyStickTranslation(IntPtr param_1) {
    return OnJoyStickTranslation(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnJoyStickButton(IntPtr param_1) {
    return OnJoyStickButton(new HEventInfo(param_1, false));
  }

  public delegate IntPtr SwigDelegateHJoyStickListener_0();
  public delegate int SwigDelegateHJoyStickListener_1(IntPtr param_1);
  public delegate int SwigDelegateHJoyStickListener_2(IntPtr param_1);
  public delegate int SwigDelegateHJoyStickListener_3(IntPtr param_1);

  private SwigDelegateHJoyStickListener_0 swigDelegate0;
  private SwigDelegateHJoyStickListener_1 swigDelegate1;
  private SwigDelegateHJoyStickListener_2 swigDelegate2;
  private SwigDelegateHJoyStickListener_3 swigDelegate3;

  private static Type[] swigMethodTypes0 = new Type[] {  };
  private static Type[] swigMethodTypes1 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes2 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes3 = new Type[] { typeof(HEventInfo) };
}
