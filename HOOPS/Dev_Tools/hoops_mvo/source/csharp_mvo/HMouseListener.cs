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


public class HMouseListener : HEventListener {
  private HandleRef swigCPtr;

  public HMouseListener(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HMouseListenerUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HMouseListener obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HMouseListener() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HMouseListener(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public static HEventListenerType GetEventType() {
    HEventListenerType ret = (HEventListenerType)HCSMVOPINVOKE.HMouseListener_GetEventType();
    return ret;
  }

  public override HEventListener CreateListenerManager() {
    IntPtr cPtr = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_CreateListenerManager(swigCPtr) : HCSMVOPINVOKE.HMouseListener_CreateListenerManagerSwigExplicitHMouseListener(swigCPtr));
    HEventListener ret = (cPtr == IntPtr.Zero) ? null : new HEventListener(cPtr, false);
    return ret;
  }

  public virtual int OnLButtonDown(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnLButtonDown(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnLButtonDownSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnMouseMove(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnMouseMove(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnMouseMoveSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnLButtonUp(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnLButtonUp(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnLButtonUpSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnLButtonDblClk(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnLButtonDblClk(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnLButtonDblClkSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnMButtonDown(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnMButtonDown(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnMButtonDownSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnMButtonUp(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnMButtonUp(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnMButtonUpSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnMButtonDblClk(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnMButtonDblClk(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnMButtonDblClkSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnRButtonDown(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnRButtonDown(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnRButtonDownSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnRButtonUp(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnRButtonUp(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnRButtonUpSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnRButtonDblClk(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnRButtonDblClk(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnRButtonDblClkSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnMouseWheel(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnMouseWheel(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnMouseWheelSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnKeyDown(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnKeyDown(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnKeyDownSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnKeyUp(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnKeyUp(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnKeyUpSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnTouchesDown(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnTouchesDown(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnTouchesDownSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnTouchesMove(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnTouchesMove(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnTouchesMoveSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public virtual int OnTouchesUp(HEventInfo param_1) {
    int ret = ((this.GetType() == typeof(HMouseListener)) ? HCSMVOPINVOKE.HMouseListener_OnTouchesUp(swigCPtr, HEventInfo.getCPtr(param_1)) : HCSMVOPINVOKE.HMouseListener_OnTouchesUpSwigExplicitHMouseListener(swigCPtr, HEventInfo.getCPtr(param_1)));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public HMouseListener() : this(HCSMVOPINVOKE.new_HMouseListener(), true) {
    SwigDirectorConnect();
  }

  private void SwigDirectorConnect() {
    if (SwigDerivedClassHasMethod("CreateListenerManager", swigMethodTypes0))
      swigDelegate0 = new SwigDelegateHMouseListener_0(SwigDirectorCreateListenerManager);
    if (SwigDerivedClassHasMethod("OnLButtonDown", swigMethodTypes1))
      swigDelegate1 = new SwigDelegateHMouseListener_1(SwigDirectorOnLButtonDown);
    if (SwigDerivedClassHasMethod("OnMouseMove", swigMethodTypes2))
      swigDelegate2 = new SwigDelegateHMouseListener_2(SwigDirectorOnMouseMove);
    if (SwigDerivedClassHasMethod("OnLButtonUp", swigMethodTypes3))
      swigDelegate3 = new SwigDelegateHMouseListener_3(SwigDirectorOnLButtonUp);
    if (SwigDerivedClassHasMethod("OnLButtonDblClk", swigMethodTypes4))
      swigDelegate4 = new SwigDelegateHMouseListener_4(SwigDirectorOnLButtonDblClk);
    if (SwigDerivedClassHasMethod("OnMButtonDown", swigMethodTypes5))
      swigDelegate5 = new SwigDelegateHMouseListener_5(SwigDirectorOnMButtonDown);
    if (SwigDerivedClassHasMethod("OnMButtonUp", swigMethodTypes6))
      swigDelegate6 = new SwigDelegateHMouseListener_6(SwigDirectorOnMButtonUp);
    if (SwigDerivedClassHasMethod("OnMButtonDblClk", swigMethodTypes7))
      swigDelegate7 = new SwigDelegateHMouseListener_7(SwigDirectorOnMButtonDblClk);
    if (SwigDerivedClassHasMethod("OnRButtonDown", swigMethodTypes8))
      swigDelegate8 = new SwigDelegateHMouseListener_8(SwigDirectorOnRButtonDown);
    if (SwigDerivedClassHasMethod("OnRButtonUp", swigMethodTypes9))
      swigDelegate9 = new SwigDelegateHMouseListener_9(SwigDirectorOnRButtonUp);
    if (SwigDerivedClassHasMethod("OnRButtonDblClk", swigMethodTypes10))
      swigDelegate10 = new SwigDelegateHMouseListener_10(SwigDirectorOnRButtonDblClk);
    if (SwigDerivedClassHasMethod("OnMouseWheel", swigMethodTypes11))
      swigDelegate11 = new SwigDelegateHMouseListener_11(SwigDirectorOnMouseWheel);
    if (SwigDerivedClassHasMethod("OnKeyDown", swigMethodTypes12))
      swigDelegate12 = new SwigDelegateHMouseListener_12(SwigDirectorOnKeyDown);
    if (SwigDerivedClassHasMethod("OnKeyUp", swigMethodTypes13))
      swigDelegate13 = new SwigDelegateHMouseListener_13(SwigDirectorOnKeyUp);
    if (SwigDerivedClassHasMethod("OnTouchesDown", swigMethodTypes14))
      swigDelegate14 = new SwigDelegateHMouseListener_14(SwigDirectorOnTouchesDown);
    if (SwigDerivedClassHasMethod("OnTouchesMove", swigMethodTypes15))
      swigDelegate15 = new SwigDelegateHMouseListener_15(SwigDirectorOnTouchesMove);
    if (SwigDerivedClassHasMethod("OnTouchesUp", swigMethodTypes16))
      swigDelegate16 = new SwigDelegateHMouseListener_16(SwigDirectorOnTouchesUp);
    HCSMVOPINVOKE.HMouseListener_director_connect(swigCPtr, swigDelegate0, swigDelegate1, swigDelegate2, swigDelegate3, swigDelegate4, swigDelegate5, swigDelegate6, swigDelegate7, swigDelegate8, swigDelegate9, swigDelegate10, swigDelegate11, swigDelegate12, swigDelegate13, swigDelegate14, swigDelegate15, swigDelegate16);
  }

  private bool SwigDerivedClassHasMethod(string methodName, Type[] methodTypes) {
    System.Reflection.MethodInfo methodInfo = this.GetType().GetMethod(methodName, System.Reflection.BindingFlags.Public | System.Reflection.BindingFlags.NonPublic | System.Reflection.BindingFlags.Instance, null, methodTypes, null);
    bool hasDerivedMethod = methodInfo.DeclaringType.IsSubclassOf(typeof(HMouseListener));
    return hasDerivedMethod;
  }

  private IntPtr SwigDirectorCreateListenerManager() {
    return HEventListener.getCPtr(CreateListenerManager()).Handle;
  }

  private int SwigDirectorOnLButtonDown(IntPtr param_1) {
    return OnLButtonDown(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnMouseMove(IntPtr param_1) {
    return OnMouseMove(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnLButtonUp(IntPtr param_1) {
    return OnLButtonUp(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnLButtonDblClk(IntPtr param_1) {
    return OnLButtonDblClk(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnMButtonDown(IntPtr param_1) {
    return OnMButtonDown(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnMButtonUp(IntPtr param_1) {
    return OnMButtonUp(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnMButtonDblClk(IntPtr param_1) {
    return OnMButtonDblClk(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnRButtonDown(IntPtr param_1) {
    return OnRButtonDown(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnRButtonUp(IntPtr param_1) {
    return OnRButtonUp(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnRButtonDblClk(IntPtr param_1) {
    return OnRButtonDblClk(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnMouseWheel(IntPtr param_1) {
    return OnMouseWheel(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnKeyDown(IntPtr param_1) {
    return OnKeyDown(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnKeyUp(IntPtr param_1) {
    return OnKeyUp(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnTouchesDown(IntPtr param_1) {
    return OnTouchesDown(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnTouchesMove(IntPtr param_1) {
    return OnTouchesMove(new HEventInfo(param_1, false));
  }

  private int SwigDirectorOnTouchesUp(IntPtr param_1) {
    return OnTouchesUp(new HEventInfo(param_1, false));
  }

  public delegate IntPtr SwigDelegateHMouseListener_0();
  public delegate int SwigDelegateHMouseListener_1(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_2(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_3(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_4(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_5(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_6(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_7(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_8(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_9(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_10(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_11(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_12(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_13(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_14(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_15(IntPtr param_1);
  public delegate int SwigDelegateHMouseListener_16(IntPtr param_1);

  private SwigDelegateHMouseListener_0 swigDelegate0;
  private SwigDelegateHMouseListener_1 swigDelegate1;
  private SwigDelegateHMouseListener_2 swigDelegate2;
  private SwigDelegateHMouseListener_3 swigDelegate3;
  private SwigDelegateHMouseListener_4 swigDelegate4;
  private SwigDelegateHMouseListener_5 swigDelegate5;
  private SwigDelegateHMouseListener_6 swigDelegate6;
  private SwigDelegateHMouseListener_7 swigDelegate7;
  private SwigDelegateHMouseListener_8 swigDelegate8;
  private SwigDelegateHMouseListener_9 swigDelegate9;
  private SwigDelegateHMouseListener_10 swigDelegate10;
  private SwigDelegateHMouseListener_11 swigDelegate11;
  private SwigDelegateHMouseListener_12 swigDelegate12;
  private SwigDelegateHMouseListener_13 swigDelegate13;
  private SwigDelegateHMouseListener_14 swigDelegate14;
  private SwigDelegateHMouseListener_15 swigDelegate15;
  private SwigDelegateHMouseListener_16 swigDelegate16;

  private static Type[] swigMethodTypes0 = new Type[] {  };
  private static Type[] swigMethodTypes1 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes2 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes3 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes4 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes5 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes6 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes7 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes8 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes9 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes10 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes11 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes12 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes13 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes14 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes15 = new Type[] { typeof(HEventInfo) };
  private static Type[] swigMethodTypes16 = new Type[] { typeof(HEventInfo) };
}
