#pragma once
#include "../GLTFAsset.h"
#include "BMQuadtreeNode.h"
#include <stack>
//
namespace GLTF {
	class BMConvert
	{
	public:
		BMConvert(BMMesh* pBMMesh, std::string& strTileSetFileFolder)
		{
			m_pBMMesh = pBMMesh;
			m_TileSetFileFolder = strTileSetFileFolder;
		}
		BMConvert()
		{
		}
		~BMConvert()
		{
			freeMemory();
		}
		BMMesh* m_pBMMesh = nullptr;
		Asset* m_pAsset = nullptr;
		//
		std::string m_TileSetFileFolder = "D:/";
		std::string m_strGLTFFilePath; //D:\\test.glb
		std::string m_strB3DMFilePath; //D:\\test.b3dm
		bool m_EmbeddedTextures = true;
		//
		BMVertex m_MinPt = BMVertex(100000.0f, 100000.0f, 100000.0f);
		BMVertex m_MaxPt = BMVertex(-100000.0f, -100000.0f, -100000.0f);
		//
		bool ConvertBMMeshToGLTF();
		bool ConvertBMMeshToB3DM();
	private:
		bool ConvertB3DMTo3DTile();
		bool ConvertGLTFToB3DM();
		bool writeAssetToFile();
		void freeMemory();
		//
		vector<GLTF::MaterialPBR*> m_vMaterials;
		GLTF::MaterialPBR* GetMaterial(GLTF::BMColor& color, string& texturePath, std::map<std::string, GLTF::Texture*>& vTextureMaps);
	};
	//////////////////////////////////////////////////////////////////////////
	class BMConvert3DTile
	{
	public:
		HC_KEY m_RootKey = INVALID_KEY;
		HC_KEY m_HoopsModelKey;// = m_pViewer->GetModel()->GetModelKey();
		std::string m_TileSetFileFolder = "D:\\";
		std::string m_DBFilePath;
		BMVertex m_Cartesian;//ģ�͵ѿ�������
		BMVertex m_Cartographic;//ģ�;�γ������
		//
		BMVertex m_CartesianS;//ģ�͵ѿ�������2---������ת��
		BMVertex m_CartographicS;//ģ�;�γ������2---������ת��
		//
		BMQuadtreeManager m_QuadtreeManager;
		int m_TesseNum = 6;
		bool m_EmbeddedTextures = true;
		std::string m_TileGUID;
		//
		bool Convert();
	private:
		void ConvertB3DM(BMQuadtreeNode* pQuadtreeNode);
		void WriteJSON(double _transform[16]);
	private:
		//origin = {104.07048834,30.66109327,0.0}---cesium
		void EastNorthUpToFixedFrame(BMVertexDD& origin, double matrix[16]);
		//matrix ��ʣ pt
		BMVertexDD MatrixMultiplyVector(BMVertexDD& pt, double matrix[16]);
		//�������ת�ѿ�������---cesium
		BMVertexDD FromRadians(double longitude, double latitude, double height);
		//
		void ComputeRotation(double matrix[16]);
		//matrixS = matrixA * matrixB
		void MatrixMultiplyMatrix(double matrixA[16], double matrixB[16], double matrixS[16]);
		//
		std::string GetGUIDStr();
		//�������ݿ��нڵ��Χ��
		void GetGUIDInDB();
		void GetGUIDInDBEX(const std::string& pid);
		void ComputeRegionBoxInDB();
		std::vector<std::string> m_vGUIDs;
	};

};
