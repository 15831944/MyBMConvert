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


public class HPlot2D : HBaseGraph {
  private HandleRef swigCPtr;

  public HPlot2D(IntPtr cPtr, bool cMemoryOwn) : base(HCSMVOPINVOKE.HPlot2DUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  public static HandleRef getCPtr(HPlot2D obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~HPlot2D() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          HCSMVOPINVOKE.delete_HPlot2D(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public HPlot2D(MVO_POINTER_SIZED_INT plot_seg, HGraphPlotType plot_type) : this(HCSMVOPINVOKE.new_HPlot2D__SWIG_0(plot_seg, (int)plot_type), true) {
  }

  public HPlot2D(MVO_POINTER_SIZED_INT plot_seg) : this(HCSMVOPINVOKE.new_HPlot2D__SWIG_1(plot_seg), true) {
  }

  public override void SetPlotTitle(string title) {
    HCSMVOPINVOKE.HPlot2D_SetPlotTitle(swigCPtr, title);
  }

  public override void SetPlotUnicodeTitle(ushort[] title) {
    HCSMVOPINVOKE.HPlot2D_SetPlotUnicodeTitle(swigCPtr, title);
  }

  public HGraphPlotType GetPlotType() {
    HGraphPlotType ret = (HGraphPlotType)HCSMVOPINVOKE.HPlot2D_GetPlotType(swigCPtr);
    return ret;
  }

  public new void SetPlotOrigin(HPoint origin) {
    HCSMVOPINVOKE.HPlot2D_SetPlotOrigin(swigCPtr, HPoint.getCPtr(origin));
    if (HCSMVOPINVOKE.SWIGPendingException.Pending) throw HCSMVOPINVOKE.SWIGPendingException.Retrieve();
  }

  public HGraphGridType GetGridType() {
    HGraphGridType ret = (HGraphGridType)HCSMVOPINVOKE.HPlot2D_GetGridType(swigCPtr);
    return ret;
  }

  public void SetGridType(HGraphGridType gtype) {
    HCSMVOPINVOKE.HPlot2D_SetGridType(swigCPtr, (int)gtype);
  }

  public bool GetGridVisibility() {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetGridVisibility(swigCPtr);
    return ret;
  }

  public void SetGridVisibility(bool value) {
    HCSMVOPINVOKE.HPlot2D_SetGridVisibility(swigCPtr, value);
  }

  public void GetGridPattern(System.Text.StringBuilder pattern) {
    HCSMVOPINVOKE.HPlot2D_GetGridPattern(swigCPtr, pattern);
  }

  public void SetGridPattern(string pattern) {
    HCSMVOPINVOKE.HPlot2D_SetGridPattern(swigCPtr, pattern);
  }

  public void GetGridColor(System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetGridColor(swigCPtr, color);
  }

  public void SetGridColor(string color) {
    HCSMVOPINVOKE.HPlot2D_SetGridColor(swigCPtr, color);
  }

  public HGraphAxisScale GetAxisScale(HGraphAxisSelection axis, double[] factor) {
    HGraphAxisScale ret = (HGraphAxisScale)HCSMVOPINVOKE.HPlot2D_GetAxisScale__SWIG_0(swigCPtr, (int)axis, factor);
    return ret;
  }

  public HGraphAxisScale GetAxisScale(HGraphAxisSelection axis) {
    HGraphAxisScale ret = (HGraphAxisScale)HCSMVOPINVOKE.HPlot2D_GetAxisScale__SWIG_1(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisScale(HGraphAxisSelection axis, HGraphAxisScale scale, double factor) {
    HCSMVOPINVOKE.HPlot2D_SetAxisScale__SWIG_0(swigCPtr, (int)axis, (int)scale, factor);
  }

  public void SetAxisScale(HGraphAxisSelection axis, HGraphAxisScale scale) {
    HCSMVOPINVOKE.HPlot2D_SetAxisScale__SWIG_1(swigCPtr, (int)axis, (int)scale);
  }

  public void GetAxisRange(HGraphAxisSelection axis, double[] min, double[] max) {
    HCSMVOPINVOKE.HPlot2D_GetAxisRange(swigCPtr, (int)axis, min, max);
  }

  public void SetAxisRange(HGraphAxisSelection axis, double min, double max) {
    HCSMVOPINVOKE.HPlot2D_SetAxisRange(swigCPtr, (int)axis, min, max);
  }

  public bool GetAxisVisibility(HGraphAxisSelection axis) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetAxisVisibility(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisVisibility(HGraphAxisSelection axis, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetAxisVisibility(swigCPtr, (int)axis, vis);
  }

  public void GetAxisColor(HGraphAxisSelection axis, System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetAxisColor(swigCPtr, (int)axis, color);
  }

  public void SetAxisColor(HGraphAxisSelection axis, string color) {
    HCSMVOPINVOKE.HPlot2D_SetAxisColor(swigCPtr, (int)axis, color);
  }

  public float GetAxisWeight(HGraphAxisSelection axis) {
    float ret = HCSMVOPINVOKE.HPlot2D_GetAxisWeight(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisWeight(HGraphAxisSelection axis, float weight) {
    HCSMVOPINVOKE.HPlot2D_SetAxisWeight(swigCPtr, (int)axis, weight);
  }

  public double GetAxisTickFrequency(HGraphAxisSelection axis) {
    double ret = HCSMVOPINVOKE.HPlot2D_GetAxisTickFrequency(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisTickFrequency(HGraphAxisSelection axis, double freq) {
    HCSMVOPINVOKE.HPlot2D_SetAxisTickFrequency(swigCPtr, (int)axis, freq);
  }

  public int GetAxisPrecision(HGraphAxisSelection axis) {
    int ret = HCSMVOPINVOKE.HPlot2D_GetAxisPrecision(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisPrecision(HGraphAxisSelection axis, int precision) {
    HCSMVOPINVOKE.HPlot2D_SetAxisPrecision(swigCPtr, (int)axis, precision);
  }

  public double GetAxisTickSize(HGraphAxisSelection axis) {
    double ret = HCSMVOPINVOKE.HPlot2D_GetAxisTickSize(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisTickSize(HGraphAxisSelection axis, double size) {
    HCSMVOPINVOKE.HPlot2D_SetAxisTickSize(swigCPtr, (int)axis, size);
  }

  public double GetAxisGridFrequency(HGraphAxisSelection axis) {
    double ret = HCSMVOPINVOKE.HPlot2D_GetAxisGridFrequency(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisGridFrequency(HGraphAxisSelection axis, double freq) {
    HCSMVOPINVOKE.HPlot2D_SetAxisGridFrequency(swigCPtr, (int)axis, freq);
  }

  public void GetAxisGridRange(HGraphAxisSelection axis, double[] min, double[] max) {
    HCSMVOPINVOKE.HPlot2D_GetAxisGridRange(swigCPtr, (int)axis, min, max);
  }

  public void SetAxisGridRange(HGraphAxisSelection axis, double min, double max) {
    HCSMVOPINVOKE.HPlot2D_SetAxisGridRange(swigCPtr, (int)axis, min, max);
  }

  public bool GetAxisLabelVisibility(HGraphAxisSelection axis) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetAxisLabelVisibility(swigCPtr, (int)axis);
    return ret;
  }

  public void SetAxisLabelVisibility(HGraphAxisSelection axis, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetAxisLabelVisibility(swigCPtr, (int)axis, vis);
  }

  public void GetAxisLabelTextFont(HGraphAxisSelection axis, System.Text.StringBuilder font) {
    HCSMVOPINVOKE.HPlot2D_GetAxisLabelTextFont(swigCPtr, (int)axis, font);
  }

  public void SetAxisLabelTextFont(HGraphAxisSelection axis, string font) {
    HCSMVOPINVOKE.HPlot2D_SetAxisLabelTextFont(swigCPtr, (int)axis, font);
  }

  public void GetAxisLabelTextColor(HGraphAxisSelection axis, System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetAxisLabelTextColor(swigCPtr, (int)axis, color);
  }

  public void SetAxisLabelTextColor(HGraphAxisSelection axis, string color) {
    HCSMVOPINVOKE.HPlot2D_SetAxisLabelTextColor(swigCPtr, (int)axis, color);
  }

  public void SetAxisLabelTextPath(HGraphAxisSelection axis, float xvector, float yvector, float zvector) {
    HCSMVOPINVOKE.HPlot2D_SetAxisLabelTextPath(swigCPtr, (int)axis, xvector, yvector, zvector);
  }

  public void GetAxisLabelTextPath(HGraphAxisSelection axis, float[] xvector, float[] yvector, float[] zvector) {
    HCSMVOPINVOKE.HPlot2D_GetAxisLabelTextPath(swigCPtr, (int)axis, xvector, yvector, zvector);
  }

  public int AddDataSet(int points_count, float[] points, HGraphPointFormat format, float[] colors) {
    int ret = HCSMVOPINVOKE.HPlot2D_AddDataSet__SWIG_0(swigCPtr, points_count, points, (int)format, colors);
    return ret;
  }

  public int AddDataSet(int points_count, float[] points, HGraphPointFormat format) {
    int ret = HCSMVOPINVOKE.HPlot2D_AddDataSet__SWIG_1(swigCPtr, points_count, points, (int)format);
    return ret;
  }

  public int AddDataSet(int points_count, float[] points) {
    int ret = HCSMVOPINVOKE.HPlot2D_AddDataSet__SWIG_2(swigCPtr, points_count, points);
    return ret;
  }

  public void RemoveDataSet(int data_set) {
    HCSMVOPINVOKE.HPlot2D_RemoveDataSet(swigCPtr, data_set);
  }

  public int GetDataSetSize(int data_set) {
    int ret = HCSMVOPINVOKE.HPlot2D_GetDataSetSize(swigCPtr, data_set);
    return ret;
  }

  public HGraphPointFormat GetDataSetFormat(int data_set) {
    HGraphPointFormat ret = (HGraphPointFormat)HCSMVOPINVOKE.HPlot2D_GetDataSetFormat(swigCPtr, data_set);
    return ret;
  }

  public void GetDataSet(int data_set, float[] points) {
    HCSMVOPINVOKE.HPlot2D_GetDataSet(swigCPtr, data_set, points);
  }

  public void ReplaceDataSet(int data_set, int points_count, float[] points, HGraphPointFormat format, float[] colors) {
    HCSMVOPINVOKE.HPlot2D_ReplaceDataSet__SWIG_0(swigCPtr, data_set, points_count, points, (int)format, colors);
  }

  public void ReplaceDataSet(int data_set, int points_count, float[] points, HGraphPointFormat format) {
    HCSMVOPINVOKE.HPlot2D_ReplaceDataSet__SWIG_1(swigCPtr, data_set, points_count, points, (int)format);
  }

  public void ReplaceDataSet(int data_set, int points_count, float[] points) {
    HCSMVOPINVOKE.HPlot2D_ReplaceDataSet__SWIG_2(swigCPtr, data_set, points_count, points);
  }

  public void SetPointColor(int data_set, string color) {
    HCSMVOPINVOKE.HPlot2D_SetPointColor(swigCPtr, data_set, color);
  }

  public void GetPointColor(int data_set, System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetPointColor(swigCPtr, data_set, color);
  }

  public void SetPointSymbol(int data_set, string symbol) {
    HCSMVOPINVOKE.HPlot2D_SetPointSymbol(swigCPtr, data_set, symbol);
  }

  public void GetPointSymbol(int data_set, System.Text.StringBuilder symbol) {
    HCSMVOPINVOKE.HPlot2D_GetPointSymbol(swigCPtr, data_set, symbol);
  }

  public void SetPointSize(int data_set, double size) {
    HCSMVOPINVOKE.HPlot2D_SetPointSize(swigCPtr, data_set, size);
  }

  public float GetPointSize(int data_set) {
    float ret = HCSMVOPINVOKE.HPlot2D_GetPointSize(swigCPtr, data_set);
    return ret;
  }

  public bool GetPointVisibility(int data_set) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetPointVisibility(swigCPtr, data_set);
    return ret;
  }

  public void SetPointVisibility(int data_set, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetPointVisibility(swigCPtr, data_set, vis);
  }

  public bool GetLineVisibility(int data_set) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetLineVisibility(swigCPtr, data_set);
    return ret;
  }

  public void SetLineVisibility(int data_set, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetLineVisibility(swigCPtr, data_set, vis);
  }

  public void SetLinePattern(int data_set, string pattern) {
    HCSMVOPINVOKE.HPlot2D_SetLinePattern(swigCPtr, data_set, pattern);
  }

  public void GetLinePattern(int data_set, System.Text.StringBuilder pattern) {
    HCSMVOPINVOKE.HPlot2D_GetLinePattern(swigCPtr, data_set, pattern);
  }

  public void SetLineColor(int data_set, string color) {
    HCSMVOPINVOKE.HPlot2D_SetLineColor(swigCPtr, data_set, color);
  }

  public void GetLineColor(int data_set, System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetLineColor(swigCPtr, data_set, color);
  }

  public float GetLineWeight(int data_set) {
    float ret = HCSMVOPINVOKE.HPlot2D_GetLineWeight(swigCPtr, data_set);
    return ret;
  }

  public void SetLineWeight(int data_set, float weight) {
    HCSMVOPINVOKE.HPlot2D_SetLineWeight(swigCPtr, data_set, weight);
  }

  public bool GetBarVisibility(int data_set) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetBarVisibility(swigCPtr, data_set);
    return ret;
  }

  public void SetBarVisibility(int data_set, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetBarVisibility(swigCPtr, data_set, vis);
  }

  public void SetBarColorMap(int data_set, string map) {
    HCSMVOPINVOKE.HPlot2D_SetBarColorMap(swigCPtr, data_set, map);
  }

  public void GetBarColorMap(int data_set, System.Text.StringBuilder map) {
    HCSMVOPINVOKE.HPlot2D_GetBarColorMap(swigCPtr, data_set, map);
  }

  public void SetBarColorMapByValue(int data_set, int count, float[] values, string color_space) {
    HCSMVOPINVOKE.HPlot2D_SetBarColorMapByValue__SWIG_0(swigCPtr, data_set, count, values, color_space);
  }

  public void SetBarColorMapByValue(int data_set, int count, float[] values) {
    HCSMVOPINVOKE.HPlot2D_SetBarColorMapByValue__SWIG_1(swigCPtr, data_set, count, values);
  }

  public void GetBarColorMapByValue(int data_set, int[] count, float[] values, System.Text.StringBuilder color_space) {
    HCSMVOPINVOKE.HPlot2D_GetBarColorMapByValue(swigCPtr, data_set, count, values, color_space);
  }

  public double GetBarWidth(int data_set) {
    double ret = HCSMVOPINVOKE.HPlot2D_GetBarWidth(swigCPtr, data_set);
    return ret;
  }

  public void SetBarWidth(int data_set, double width) {
    HCSMVOPINVOKE.HPlot2D_SetBarWidth(swigCPtr, data_set, width);
  }

  public bool GetBarEdgeVisibility(int data_set) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetBarEdgeVisibility(swigCPtr, data_set);
    return ret;
  }

  public void SetBarEdgeVisibility(int data_set, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetBarEdgeVisibility(swigCPtr, data_set, vis);
  }

  public bool GetPolygonVisibility(int data_set) {
    bool ret = HCSMVOPINVOKE.HPlot2D_GetPolygonVisibility(swigCPtr, data_set);
    return ret;
  }

  public void SetPolygonVisibility(int data_set, bool vis) {
    HCSMVOPINVOKE.HPlot2D_SetPolygonVisibility(swigCPtr, data_set, vis);
  }

  public void GetPolygonColor(int data_set, System.Text.StringBuilder color) {
    HCSMVOPINVOKE.HPlot2D_GetPolygonColor(swigCPtr, data_set, color);
  }

  public void SetPolygonColor(int data_set, string color) {
    HCSMVOPINVOKE.HPlot2D_SetPolygonColor(swigCPtr, data_set, color);
  }

  public override void Update() {
    HCSMVOPINVOKE.HPlot2D_Update(swigCPtr);
  }

  public double GetAspectRatio() {
    double ret = HCSMVOPINVOKE.HPlot2D_GetAspectRatio(swigCPtr);
    return ret;
  }

  public void SetAspectRatio(double ratio) {
    HCSMVOPINVOKE.HPlot2D_SetAspectRatio(swigCPtr, ratio);
  }

  public void UnSetAspectRatio() {
    HCSMVOPINVOKE.HPlot2D_UnSetAspectRatio(swigCPtr);
  }

}
