/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

class HJPJNI {
  public final static native int HP_ERROR_key_out_of_range_get();
  public final static native int HP_ERROR_non_circle_key_out_of_range_get();
  public final static native int HP_ERROR_key_does_not_exist_get();
  public final static native int HP_ERROR_unable_to_determine_entity_class_get();
  public final static native int HP_ERROR_non_mappable_entity_class_get();
  public final static native int HP_ERROR_unknown_entity_class_get();
  public final static native int HP_ERROR_not_implemented_get();
  public final static native int HP_ERROR_hoops_key_maps_to_invalid_entity_class_get();
  public final static native int HP_ERROR_incorrect_face_tag_mapping_get();
  public final static native void Init__SWIG_0(String jarg1, short jarg2, boolean jarg3);
  public final static native void Init__SWIG_1(String jarg1, short jarg2);
  public final static native void Update();
  public final static native void Close();
  public final static native void Delete_Entity_Geometry__SWIG_0(long jarg1, int[] jarg2, boolean jarg3);
  public final static native void Delete_Entity_Geometry__SWIG_1(long jarg1, int[] jarg2);
  public final static native boolean Update_Entity__SWIG_0(int jarg1, int jarg2, int jarg3);
  public final static native boolean Update_Entity__SWIG_1(int jarg1, int jarg2);
  public final static native boolean Update_Entity__SWIG_2(int jarg1);
  public final static native int Compute_Geometry_Keys(int jarg1, int jarg2, int[] jarg3, String jarg4);
  public final static native int Compute_Geometry_Key_Count(int jarg1, StringBuffer jarg2);
  public final static native int Compute_TagID(long jarg1, int jarg2);
  public final static native void Set_Rendering_Options(String jarg1);
  public final static native void Show_Rendering_Options(StringBuffer jarg1);
  public final static native void Show_One_Rendering_Option(String jarg1, StringBuffer jarg2);
  public final static native void Set_Schema_Path(String jarg1);
  public final static native void Set_Hash_Level(short jarg1);
  public final static native void Set_Instances_To_Bodies(boolean jarg1);
  public final static native boolean Get_Instances_To_Bodies();
  public final static native int Check_Consistency();
  public final static native boolean Associate_Key_To_Entity(int jarg1, long jarg2);
  public final static native void Compute_Selected_Entity_List(long jarg1, int[] jarg2);
  public final static native short Get_Hash_Level();
  public final static native long Get_Schema_Path();
  public final static native void HP_Internal_Open_Assembly(int jarg1, boolean jarg2, int jarg3);
  public final static native void HP_Internal_Merge_Body_Faces(int[] jarg1, long jarg2);
  public final static native void insert_vertices_for_body(int jarg1);
}
