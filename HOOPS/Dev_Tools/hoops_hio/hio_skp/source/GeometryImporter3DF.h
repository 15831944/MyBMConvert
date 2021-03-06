// Copyright (c) Tech Soft 3D
//
// The information contained herein is confidential and proprietary to Tech Soft 3D, Inc.,
// and considered a trade secret as defined under civil and criminal statutes.
// Tech Soft 3D, Inc. shall pursue its civil and criminal remedies in the event of
// unauthorized use or misappropriation of its trade secrets.  Use of this information
// by anyone other than authorized employees of Tech Soft 3D, Inc. is granted only under
// a written non-disclosure agreement, expressly prescribing the scope and manner of such use.

#pragma once

#include "GeometryImporter.h"

class GeometryImporter3DF : public GeometryImporter
{
public:
	GeometryImporter3DF(StyleRepository& styleRepository, VisibilityChecker& visibilityChecker, InheritanceManager& inheritanceManager);

private:
	virtual CurvesImporter *				CreateCurvesImporter(SegmentOrganizer & segmentOrganizer);
	virtual PolylinesImporter *				CreatePolylinesImporter(SegmentOrganizer & segmentOrganizer);
	virtual LinesImporter *					CreateLinesImporter(SegmentOrganizer & segmentOrganizer);
	virtual SegmentOrganizer *				CreateSegmentOrganizer(StyleRepository& styleRepository, VisibilityChecker& visibilityChecker);
	virtual ShellImporter *					CreateShellImporter(SegmentOrganizer& segmentOrganizer, TextureWriter& textureWriter, InheritanceManager& inheritanceManager);
	virtual ImageTexturedShellImporter *	CreateImageTexturedShellImporter(SegmentOrganizer& segmentOrganizer, ImageRepository& imageRepository, TextureRepository& textureRepository);
};

