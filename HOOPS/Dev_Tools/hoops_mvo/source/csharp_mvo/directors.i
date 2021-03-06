
%feature("director") HAnimationListener;
%feature("director") HBaseModel;
%feature("director") HBaseOperator;
%feature("director") HBaseView;
%feature("director") HDB;
%feature("director") HEventListener;
%feature("director") HFitWorldListener;
%feature("director") HInputHandler;
%feature("director") HIONoticeCallback;
%feature("director") HIOPercentNoticeCallback;
%feature("director") HJoyStickListener;
%feature("director") HMarkupManager;
%feature("director") HMouseListener;
%feature("director") HObject;
%feature("director") HObjectManipulationListener;
%feature("director") HOpCameraManipulate;
%feature("director") HOpCameraOrbit;
%feature("director") HOpCameraOrbitTurntable;
%feature("director") HOpCameraPan;
%feature("director") HOpCameraRelativeOrbit;
%feature("director") HOpCameraWalk;
%feature("director") HOpCameraZoom;
%feature("director") HOpCameraZoomBox;
%feature("director") HOpConstructCircle;
%feature("director") HOpConstructCone;
%feature("director") HOpConstructCuboid;
%feature("director") HOpConstructCylinder;
%feature("director") HOpConstructNurbsCurve;
%feature("director") HOpConstructPolyline;
%feature("director") HOpConstructRectangle;
%feature("director") HOpConstructSphere;
%feature("director") HOpCreateBoolean;
%feature("director") HOpCreateCircle;
%feature("director") HOpCreateCone;
%feature("director") HOpCreateCuboid;
%feature("director") HOpCreateCuttingPlane;
%feature("director") HOpCreateCylinder;
%feature("director") HOpCreateNurbs3D;
%feature("director") HOpCreateNurbsCurve;
%feature("director") HOpCreatePolyline;
%feature("director") HOpCreateRectangle;
%feature("director") HOpCreateSphere;
%feature("director") HOpMarkupAnnotate;
%feature("director") HOpMarkupCircle;
%feature("director") HOpMarkupFreehand;
%feature("director") HOpMarkupMeasure;
%feature("director") HOpMarkupPostIt;
%feature("director") HOpMarkupRectangle;
%feature("director") HOpMoveHandle;
%feature("director") HOpNavCube;
%feature("director") HOpNetwork;
%feature("director") HOpObjectAnnotate;
%feature("director") HOpObjectClash;
%feature("director") HOpObjectRotate;
%feature("director") HOpObjectTranslate;
%feature("director") HOpObjectTranslate;
%feature("director") HOpSelectAperture;
%feature("director") HOpSelectArea;
%feature("director") HOpSelectPolygon;
%feature("director") HOpSelectPolyline;
%feature("director") HOutputHandler;
%feature("director") HPDFOptions;
%feature("director") HSelectionSet;
%feature("director") HSensorListener;
%feature("director") HUndoItem;
%feature("director") HUpdateListener;

// Disable problematic director methods
%feature("nodirector") HMarkupManager::FindValidLayerName;
%feature("nodirector") HMarkupManager::GetPreviewImage;

