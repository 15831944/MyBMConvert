/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HOldSelItem extends HSelectionItem {
  private long swigCPtr;

  public HOldSelItem(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HOldSelItem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HOldSelItem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HOldSelItem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HOldSelItem(long key, HSelectionSet selection_set, String selection_path, long include_key, long includer_key) {
    this(HJMVOJNI.new_HOldSelItem(key, HSelectionSet.getCPtr(selection_set), selection_set, selection_path, include_key, includer_key), true);
  }

  public String GetName() {
    return HJMVOJNI.HOldSelItem_GetName(swigCPtr, this);
  }

  public boolean Equals(HSelectionItem i2) {
    return HJMVOJNI.HOldSelItem_Equals(swigCPtr, this, HSelectionItem.getCPtr(i2), i2);
  }

  public boolean Highlight() {
    return HJMVOJNI.HOldSelItem_Highlight(swigCPtr, this);
  }

  public boolean UnHighlight() {
    return HJMVOJNI.HOldSelItem_UnHighlight(swigCPtr, this);
  }

  public boolean IsHighlighted() {
    return HJMVOJNI.HOldSelItem_IsHighlighted(swigCPtr, this);
  }

  public boolean Delete() {
    return HJMVOJNI.HOldSelItem_Delete(swigCPtr, this);
  }

  public boolean IsInstanced() {
    return HJMVOJNI.HOldSelItem_IsInstanced(swigCPtr, this);
  }

  public int GetIncludeCount() {
    return HJMVOJNI.HOldSelItem_GetIncludeCount(swigCPtr, this);
  }

  public void GetIncludeKeys(long[] arg0) {
    HJMVOJNI.HOldSelItem_GetIncludeKeys(swigCPtr, this, arg0);
  }

  public boolean QueryIncludeDependency(long include_key, long[] ret_dependent_key) {
    return HJMVOJNI.HOldSelItem_QueryIncludeDependency(swigCPtr, this, include_key, ret_dependent_key);
  }

  public boolean UpdateIncludeDependency(long include_key, long dependent_key, long replacement_key) {
    return HJMVOJNI.HOldSelItem_UpdateIncludeDependency(swigCPtr, this, include_key, dependent_key, replacement_key);
  }

}
