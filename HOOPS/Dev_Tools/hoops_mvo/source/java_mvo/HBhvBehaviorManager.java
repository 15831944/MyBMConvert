/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.techsoft.hoops;

public class HBhvBehaviorManager extends HTClient {
  private long swigCPtr;

  public HBhvBehaviorManager(long cPtr, boolean cMemoryOwn) {
    super(HJMVOJNI.HBhvBehaviorManager_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(HBhvBehaviorManager obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        HJMVOJNI.delete_HBhvBehaviorManager(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HBhvBehaviorManager(HBaseModel model, int tps, int delay, String name, String version, String vendor) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_0(HBaseModel.getCPtr(model), model, tps, delay, name, version, vendor), true);
  }

  public HBhvBehaviorManager(HBaseModel model, int tps, int delay, String name, String version) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_1(HBaseModel.getCPtr(model), model, tps, delay, name, version), true);
  }

  public HBhvBehaviorManager(HBaseModel model, int tps, int delay, String name) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_2(HBaseModel.getCPtr(model), model, tps, delay, name), true);
  }

  public HBhvBehaviorManager(HBaseModel model, int tps, int delay) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_3(HBaseModel.getCPtr(model), model, tps, delay), true);
  }

  public HBhvBehaviorManager(HBaseModel model, int tps) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_4(HBaseModel.getCPtr(model), model, tps), true);
  }

  public HBhvBehaviorManager(HBaseModel model) {
    this(HJMVOJNI.new_HBhvBehaviorManager__SWIG_5(HBaseModel.getCPtr(model), model), true);
  }

  public void SetTicksPerSecond(int tps) {
    HJMVOJNI.HBhvBehaviorManager_SetTicksPerSecond(swigCPtr, this, tps);
  }

  public int GetTicksPerSecond() {
    return HJMVOJNI.HBhvBehaviorManager_GetTicksPerSecond(swigCPtr, this);
  }

  public void Serialize(SWIGTYPE_p_HUtilityXMLGenerator xmlgen) {
    HJMVOJNI.HBhvBehaviorManager_Serialize(swigCPtr, this, SWIGTYPE_p_HUtilityXMLGenerator.getCPtr(xmlgen));
  }

  public void ScheduleAnimation(HBhvAnimation animation, float currenttime) {
    HJMVOJNI.HBhvBehaviorManager_ScheduleAnimation(swigCPtr, this, HBhvAnimation.getCPtr(animation), animation, currenttime);
  }

  public HBhvAnimation AddAnimation(String name, String target, SWIGTYPE_p_HBhvTimeline timeline, SWIGTYPE_p_HBhvInterpolator interpolator) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_AddAnimation__SWIG_0(swigCPtr, this, name, target, SWIGTYPE_p_HBhvTimeline.getCPtr(timeline), SWIGTYPE_p_HBhvInterpolator.getCPtr(interpolator));
    return (cPtr == 0) ? null : new HBhvAnimation(cPtr, false);
  }

  public void AddAnimation(HBhvAnimation animation) {
    HJMVOJNI.HBhvBehaviorManager_AddAnimation__SWIG_1(swigCPtr, this, HBhvAnimation.getCPtr(animation), animation);
  }

  public boolean Tick(float request_time, float actual_time) {
    return HJMVOJNI.HBhvBehaviorManager_Tick(swigCPtr, this, request_time, actual_time);
  }

  public SWIGTYPE_p_vlist_s GetAnimationList() {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_GetAnimationList(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_vlist_s(cPtr, false);
  }

  public int GetFreeName() {
    return HJMVOJNI.HBhvBehaviorManager_GetFreeName(swigCPtr, this);
  }

  public void DeleteAllAnimations() {
    HJMVOJNI.HBhvBehaviorManager_DeleteAllAnimations(swigCPtr, this);
  }

  public HBhvAnimation FindAnimation(String target, String interpolatortype) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_FindAnimation(swigCPtr, this, target, interpolatortype);
    return (cPtr == 0) ? null : new HBhvAnimation(cPtr, false);
  }

  public HBhvAnimation FindAnimationByName(String name) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_FindAnimationByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : new HBhvAnimation(cPtr, false);
  }

  public void ScheduleAllAnimations(boolean reset) {
    HJMVOJNI.HBhvBehaviorManager_ScheduleAllAnimations__SWIG_0(swigCPtr, this, reset);
  }

  public void ScheduleAllAnimations() {
    HJMVOJNI.HBhvBehaviorManager_ScheduleAllAnimations__SWIG_1(swigCPtr, this);
  }

  public void DeleteAnimation(HBhvAnimation animation) {
    HJMVOJNI.HBhvBehaviorManager_DeleteAnimation(swigCPtr, this, HBhvAnimation.getCPtr(animation), animation);
  }

  public HBhvTargetObject CreateTargetObjectByPath(String name, String path) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_CreateTargetObjectByPath(swigCPtr, this, name, path);
    return (cPtr == 0) ? null : new HBhvTargetObject(cPtr, false);
  }

  public void AddTargetObject(HBhvTargetObject targetobject) {
    HJMVOJNI.HBhvBehaviorManager_AddTargetObject(swigCPtr, this, HBhvTargetObject.getCPtr(targetobject), targetobject);
  }

  public HBhvTargetObject FindTargetObjectByName(String name) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_FindTargetObjectByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : new HBhvTargetObject(cPtr, false);
  }

  public HBhvTargetObject FindTargetObjectByPath(String path) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_FindTargetObjectByPath(swigCPtr, this, path);
    return (cPtr == 0) ? null : new HBhvTargetObject(cPtr, false);
  }

  public void WriteToFile(SWIGTYPE_p_wchar_t filename) {
    HJMVOJNI.HBhvBehaviorManager_WriteToFile__SWIG_0(swigCPtr, this, SWIGTYPE_p_wchar_t.getCPtr(filename));
  }

  public void WriteToFile(String filename) {
    HJMVOJNI.HBhvBehaviorManager_WriteToFile__SWIG_1(swigCPtr, this, filename);
  }

  public static void ReadFromFile(HBaseModel model, SWIGTYPE_p_wchar_t filename) {
    HJMVOJNI.HBhvBehaviorManager_ReadFromFile__SWIG_0(HBaseModel.getCPtr(model), model, SWIGTYPE_p_wchar_t.getCPtr(filename));
  }

  public static void ReadFromFile(HBaseModel model, String filename) {
    HJMVOJNI.HBhvBehaviorManager_ReadFromFile__SWIG_1(HBaseModel.getCPtr(model), model, filename);
  }

  public static void ProcessXMLData(HBaseModel model, String buffer) {
    HJMVOJNI.HBhvBehaviorManager_ProcessXMLData(HBaseModel.getCPtr(model), model, buffer);
  }

  public static long XMLCallback(SWIGTYPE_p_HUtilityXMLTag xt, boolean open, long m_pExtraData) {return (long)HJMVOJNI.HBhvBehaviorManager_XMLCallback(SWIGTYPE_p_HUtilityXMLTag.getCPtr(xt), open, m_pExtraData);}

  public HBaseModel GetModel() {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_GetModel(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseModel(cPtr, false);
  }

  public void SetCurrentTickByTime(float t) {
    HJMVOJNI.HBhvBehaviorManager_SetCurrentTickByTime(swigCPtr, this, t);
  }

  public void SetCurrentTick(float tick) {
    HJMVOJNI.HBhvBehaviorManager_SetCurrentTick__SWIG_0(swigCPtr, this, tick);
  }

  public void SetCurrentTick() {
    HJMVOJNI.HBhvBehaviorManager_SetCurrentTick__SWIG_1(swigCPtr, this);
  }

  public float GetCurrentTick() {
    return HJMVOJNI.HBhvBehaviorManager_GetCurrentTick(swigCPtr, this);
  }

  public void SetCurrentTickByPercentage(float percentage) {
    HJMVOJNI.HBhvBehaviorManager_SetCurrentTickByPercentage(swigCPtr, this, percentage);
  }

  public float GetCurrentTickByPercentage() {
    return HJMVOJNI.HBhvBehaviorManager_GetCurrentTickByPercentage(swigCPtr, this);
  }

  public void Rewind() {
    HJMVOJNI.HBhvBehaviorManager_Rewind(swigCPtr, this);
  }

  public boolean IsPlaying() {
    return HJMVOJNI.HBhvBehaviorManager_IsPlaying(swigCPtr, this);
  }

  public long GetActiveSceneKey() {return HJMVOJNI.HBhvBehaviorManager_GetActiveSceneKey(swigCPtr, this);}

  public void SetActiveView(HBaseView view) {
    HJMVOJNI.HBhvBehaviorManager_SetActiveView(swigCPtr, this, HBaseView.getCPtr(view), view);
  }

  public HBaseView GetActiveView() {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_GetActiveView(swigCPtr, this);
    return (cPtr == 0) ? null : new HBaseView(cPtr, false);
  }

  public boolean GetRenderEveryTick() {
    return HJMVOJNI.HBhvBehaviorManager_GetRenderEveryTick(swigCPtr, this);
  }

  public void SetRenderEveryTick(boolean everytick) {
    HJMVOJNI.HBhvBehaviorManager_SetRenderEveryTick(swigCPtr, this, everytick);
  }

  public boolean GetUpdateCamera() {
    return HJMVOJNI.HBhvBehaviorManager_GetUpdateCamera(swigCPtr, this);
  }

  public boolean IsAtFinalTick() {
    return HJMVOJNI.HBhvBehaviorManager_IsAtFinalTick(swigCPtr, this);
  }

  public void SetUpdateCamera(boolean updatecamera) {
    HJMVOJNI.HBhvBehaviorManager_SetUpdateCamera(swigCPtr, this, updatecamera);
  }

  public int GetNextKeyframe(int ticknum, boolean forward) {
    return HJMVOJNI.HBhvBehaviorManager_GetNextKeyframe(swigCPtr, this, ticknum, forward);
  }

  public void AddSensor(SWIGTYPE_p_HBhvSensor sensor) {
    HJMVOJNI.HBhvBehaviorManager_AddSensor(swigCPtr, this, SWIGTYPE_p_HBhvSensor.getCPtr(sensor));
  }

  public void RemoveScheduledAnimation(HBhvAnimation animation) {
    HJMVOJNI.HBhvBehaviorManager_RemoveScheduledAnimation(swigCPtr, this, HBhvAnimation.getCPtr(animation), animation);
  }

  public boolean HasAnimations() {
    return HJMVOJNI.HBhvBehaviorManager_HasAnimations(swigCPtr, this);
  }

  public int GetLastTick() {
    return HJMVOJNI.HBhvBehaviorManager_GetLastTick(swigCPtr, this);
  }

  public SWIGTYPE_p_HBhvSensor FindSensorByName(String name) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_FindSensorByName(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_HBhvSensor(cPtr, false);
  }

  public void ExecuteAnimations(float currenttick, float starttick) {
    HJMVOJNI.HBhvBehaviorManager_ExecuteAnimations(swigCPtr, this, currenttick, starttick);
  }

  public void SetContinuousPlay(boolean cont) {
    HJMVOJNI.HBhvBehaviorManager_SetContinuousPlay(swigCPtr, this, cont);
  }

  public void SetInfinitePlay(boolean inf) {
    HJMVOJNI.HBhvBehaviorManager_SetInfinitePlay(swigCPtr, this, inf);
  }

  public boolean GetContinuousPlay() {
    return HJMVOJNI.HBhvBehaviorManager_GetContinuousPlay(swigCPtr, this);
  }

  public void CameraUpdated() {
    HJMVOJNI.HBhvBehaviorManager_CameraUpdated(swigCPtr, this);
  }

  public boolean GetCameraUpdated() {
    return HJMVOJNI.HBhvBehaviorManager_GetCameraUpdated(swigCPtr, this);
  }

  public void Play() {
    HJMVOJNI.HBhvBehaviorManager_Play(swigCPtr, this);
  }

  public void Stop() {
    HJMVOJNI.HBhvBehaviorManager_Stop(swigCPtr, this);
  }

  public void Continue() {
    HJMVOJNI.HBhvBehaviorManager_Continue(swigCPtr, this);
  }

  public void SetPositionMatrix(float[] mat) {
    HJMVOJNI.HBhvBehaviorManager_SetPositionMatrix(swigCPtr, this, mat);
  }

  public void GetPositionMatrix(float[] mat) {
    HJMVOJNI.HBhvBehaviorManager_GetPositionMatrix(swigCPtr, this, mat);
  }

  public void SetTargetMatrix(float[] mat) {
    HJMVOJNI.HBhvBehaviorManager_SetTargetMatrix(swigCPtr, this, mat);
  }

  public void GetTargetMatrix(float[] mat) {
    HJMVOJNI.HBhvBehaviorManager_GetTargetMatrix(swigCPtr, this, mat);
  }

  public void SetFov(float fov) {
    HJMVOJNI.HBhvBehaviorManager_SetFov(swigCPtr, this, fov);
  }

  public void GetFov(float fov) {
    HJMVOJNI.HBhvBehaviorManager_GetFov(swigCPtr, this, fov);
  }

  public void Reset() {
    HJMVOJNI.HBhvBehaviorManager_Reset(swigCPtr, this);
  }

  public void DeactivateAllAnimations() {
    HJMVOJNI.HBhvBehaviorManager_DeactivateAllAnimations(swigCPtr, this);
  }

  public void ActivateAllAnimations() {
    HJMVOJNI.HBhvBehaviorManager_ActivateAllAnimations(swigCPtr, this);
  }

  public void ActivateAnimationByName(String name, boolean AllowPartial) {
    HJMVOJNI.HBhvBehaviorManager_ActivateAnimationByName__SWIG_0(swigCPtr, this, name, AllowPartial);
  }

  public void ActivateAnimationByName(String name) {
    HJMVOJNI.HBhvBehaviorManager_ActivateAnimationByName__SWIG_1(swigCPtr, this, name);
  }

  public void DeactivateAnimationByName(String name, boolean AllowPartial) {
    HJMVOJNI.HBhvBehaviorManager_DeactivateAnimationByName__SWIG_0(swigCPtr, this, name, AllowPartial);
  }

  public void DeactivateAnimationByName(String name) {
    HJMVOJNI.HBhvBehaviorManager_DeactivateAnimationByName__SWIG_1(swigCPtr, this, name);
  }

  public void SetStartTime(float time) {
    HJMVOJNI.HBhvBehaviorManager_SetStartTime(swigCPtr, this, time);
  }

  public void SetMerge(boolean merge) {
    HJMVOJNI.HBhvBehaviorManager_SetMerge(swigCPtr, this, merge);
  }

  public boolean GetMerge() {
    return HJMVOJNI.HBhvBehaviorManager_GetMerge(swigCPtr, this);
  }

  public HBhvAnimation AddAnimation(String name, String targetpath, HPoint pivot) {
    long cPtr = HJMVOJNI.HBhvBehaviorManager_AddAnimation__SWIG_2(swigCPtr, this, name, targetpath, HPoint.getCPtr(pivot), pivot);
    return (cPtr == 0) ? null : new HBhvAnimation(cPtr, false);
  }

  public void AddPositionKeyframe(String animname, int tick, HPoint pos, boolean linear) {
    HJMVOJNI.HBhvBehaviorManager_AddPositionKeyframe(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear);
  }

  public void AddQuatSquadKeyframe(String animname, int tick, HQuat rot, boolean linear) {
    HJMVOJNI.HBhvBehaviorManager_AddQuatSquadKeyframe(swigCPtr, this, animname, tick, HQuat.getCPtr(rot), rot, linear);
  }

  public void AddMatrixKeyframe(String animname, int tick, float[] matrix) {
    HJMVOJNI.HBhvBehaviorManager_AddMatrixKeyframe(swigCPtr, this, animname, tick, matrix);
  }

  public void AddSegmentMoveKeyframe(String animname, int tick, StringBuffer path) {
    HJMVOJNI.HBhvBehaviorManager_AddSegmentMoveKeyframe(swigCPtr, this, animname, tick, path);
  }

  public void AddTrailKeyframe(String animname, int tick, HPoint pos, boolean linear, SWIGTYPE_p_TrailInterpolatorType trailtype, int[] weight, String style, String color) {
    HJMVOJNI.HBhvBehaviorManager_AddTrailKeyframe__SWIG_0(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear, SWIGTYPE_p_TrailInterpolatorType.getCPtr(trailtype), weight, style, color);
  }

  public void AddTrailKeyframe(String animname, int tick, HPoint pos, boolean linear, SWIGTYPE_p_TrailInterpolatorType trailtype, int[] weight, String style) {
    HJMVOJNI.HBhvBehaviorManager_AddTrailKeyframe__SWIG_1(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear, SWIGTYPE_p_TrailInterpolatorType.getCPtr(trailtype), weight, style);
  }

  public void AddTrailKeyframe(String animname, int tick, HPoint pos, boolean linear, SWIGTYPE_p_TrailInterpolatorType trailtype, int[] weight) {
    HJMVOJNI.HBhvBehaviorManager_AddTrailKeyframe__SWIG_2(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear, SWIGTYPE_p_TrailInterpolatorType.getCPtr(trailtype), weight);
  }

  public void AddTrailKeyframe(String animname, int tick, HPoint pos, boolean linear, SWIGTYPE_p_TrailInterpolatorType trailtype) {
    HJMVOJNI.HBhvBehaviorManager_AddTrailKeyframe__SWIG_3(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear, SWIGTYPE_p_TrailInterpolatorType.getCPtr(trailtype));
  }

  public void AddTrailKeyframe(String animname, int tick, HPoint pos, boolean linear) {
    HJMVOJNI.HBhvBehaviorManager_AddTrailKeyframe__SWIG_4(swigCPtr, this, animname, tick, HPoint.getCPtr(pos), pos, linear);
  }

  public void AddAxisRotateKeyframe(String animname, int tick, float rot, HPoint axis) {
    HJMVOJNI.HBhvBehaviorManager_AddAxisRotateKeyframe__SWIG_0(swigCPtr, this, animname, tick, rot, HPoint.getCPtr(axis), axis);
  }

  public void AddAxisRotateKeyframe(String animname, int tick, float rot) {
    HJMVOJNI.HBhvBehaviorManager_AddAxisRotateKeyframe__SWIG_1(swigCPtr, this, animname, tick, rot);
  }

  public void AddColorKeyframe(String animname, int tick, HPoint color, String colorcomponent, String geomtype) {
    HJMVOJNI.HBhvBehaviorManager_AddColorKeyframe__SWIG_0(swigCPtr, this, animname, tick, HPoint.getCPtr(color), color, colorcomponent, geomtype);
  }

  public void AddColorKeyframe(String animname, int tick, HPoint color, String colorcomponent) {
    HJMVOJNI.HBhvBehaviorManager_AddColorKeyframe__SWIG_1(swigCPtr, this, animname, tick, HPoint.getCPtr(color), color, colorcomponent);
  }

  public void AddColorKeyframe(String animname, int tick, HPoint color) {
    HJMVOJNI.HBhvBehaviorManager_AddColorKeyframe__SWIG_2(swigCPtr, this, animname, tick, HPoint.getCPtr(color), color);
  }

  public void AddScaleKeyframe(String animname, int tick, HPoint scale) {
    HJMVOJNI.HBhvBehaviorManager_AddScaleKeyframe(swigCPtr, this, animname, tick, HPoint.getCPtr(scale), scale);
  }

  public void AddAttributeSwitchKeyframe(String animname, int tick, String att) {
    HJMVOJNI.HBhvBehaviorManager_AddAttributeSwitchKeyframe(swigCPtr, this, animname, tick, att);
  }

  public void AddVertexMorphInterpolator(String animname, int tick, String mident, boolean discrete) {
    HJMVOJNI.HBhvBehaviorManager_AddVertexMorphInterpolator(swigCPtr, this, animname, tick, mident, discrete);
  }

  public void AddColorMorphInterpolator(String animname, int tick, String mident, boolean discrete) {
    HJMVOJNI.HBhvBehaviorManager_AddColorMorphInterpolator(swigCPtr, this, animname, tick, mident, discrete);
  }

  public void AddSegmentSwitchKeyframe(String animname, int tick, String ss) {
    HJMVOJNI.HBhvBehaviorManager_AddSegmentSwitchKeyframe(swigCPtr, this, animname, tick, ss);
  }

  public void AddInstanceCreateKeyframe(String animname, int tick, String instance) {
    HJMVOJNI.HBhvBehaviorManager_AddInstanceCreateKeyframe(swigCPtr, this, animname, tick, instance);
  }

  public void AddVertexMorphDataToAnimation(String animname, HPoint md, int pnum, HBaseModel model, int pos) {
    HJMVOJNI.HBhvBehaviorManager_AddVertexMorphDataToAnimation__SWIG_0(swigCPtr, this, animname, HPoint.getCPtr(md), md, pnum, HBaseModel.getCPtr(model), model, pos);
  }

  public void AddVertexMorphDataToAnimation(String animname, HPoint md, int pnum, HBaseModel model) {
    HJMVOJNI.HBhvBehaviorManager_AddVertexMorphDataToAnimation__SWIG_1(swigCPtr, this, animname, HPoint.getCPtr(md), md, pnum, HBaseModel.getCPtr(model), model);
  }

  public void AddColorMorphDataToAnimation(String animname, HPoint md, int pnum, HBaseModel model, int pos) {
    HJMVOJNI.HBhvBehaviorManager_AddColorMorphDataToAnimation__SWIG_0(swigCPtr, this, animname, HPoint.getCPtr(md), md, pnum, HBaseModel.getCPtr(model), model, pos);
  }

  public void AddColorMorphDataToAnimation(String animname, HPoint md, int pnum, HBaseModel model) {
    HJMVOJNI.HBhvBehaviorManager_AddColorMorphDataToAnimation__SWIG_1(swigCPtr, this, animname, HPoint.getCPtr(md), md, pnum, HBaseModel.getCPtr(model), model);
  }

}
