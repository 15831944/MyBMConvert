#pragma once
#include "../../BM23DTile/base.h"
#include "../BMFile/BMNode.h"
#include "vector"
#include<unordered_map>
using namespace std;

class ObjMtl
{
public:
	GLTF::BMColor m_Color = GLTF::BMColor(0.0, 1.0, 0.0);
	std::string m_TextureImagePath = "";
};
class ObjShellPrimitive
{
public:
	vector<GLTF::BMVertex> m_vPositions;
	GLTF::BMColor m_Color = GLTF::BMColor(0.0, 1.0, 0.0);
	vector<GLTF::BMTriangle> m_vTris;
	vector<GLTF::BMVertex> m_vCoords;
	vector<GLTF::BMVertex> m_vNormals;
	std::string m_TextureImagePath = "";
	void ComputeNormals();
private:
	GLTF::BMVertex ComputeNormal(GLTF::BMVertex& p0, GLTF::BMVertex& p1, GLTF::BMVertex& p2);
};
class ObjQuadtreeManager;
class ObjContent
{
public:
	~ObjContent()
	{
		for (size_t i = 0; i < m_vpShellPris.size(); i++)
		{
			delete m_vpShellPris[i];
		}
		m_vpShellPris.clear();
	}
	string m_ObjFilePath;//E:\CityEngineTest\models\_bb77e6e8_bed6_45bf_be9c_b1850d0993b2.obj
	string m_ObjFileName;//bb77e6e8_bed6_45bf_be9c_b1850d0993b2
	ObjQuadtreeManager* m_pMana;
	//
	HPoint m_MinPt;
	HPoint m_MaxPt;
	//
	vector<ObjShellPrimitive*> m_vpShellPris;
	void ComputeShellPris(double offsetX, double offsetY, double offsetZ);
};
//�Ĳ����ڵ�
class ObjQuadtreeNode
{
public:
	ObjQuadtreeNode()
	{
	}
	~ObjQuadtreeNode()
	{
		if (m_pLeft_Up != NULL)
			delete m_pLeft_Up;
		if (m_pLeft_Down != NULL)
			delete m_pLeft_Down;
		if (m_pRight_Up != NULL)
			delete m_pRight_Up;
		if (m_pRight_Down != NULL)
			delete m_pRight_Down;
	}
	//
	std::string m_Name;
	//�Ĳ����ڵ��Χ��---tile-boundingVolume
	HPoint m_MaxPt = HPoint(-1000000000.0, -1000000000.0, -1000000000.0);
	HPoint m_MinPt = HPoint(1000000000.0, 1000000000.0, 1000000000.0);
	HPoint m_CenterPt;
	//�Ĳ����ڵ����ݰ�Χ��---tile-content-boundingVolume
	HPoint m_ContentMaxPt = HPoint(-1000000000.0, -1000000000.0, -1000000000.0);
	HPoint m_ContentMinPt = HPoint(1000000000.0, 1000000000.0, 1000000000.0);
	/*
	leftUp    | rightUp
	----------------------
	leftDown  | rightDown
	*/
	ObjQuadtreeNode* m_pLeft_Up = nullptr;
	ObjQuadtreeNode* m_pLeft_Down = nullptr;
	ObjQuadtreeNode* m_pRight_Up = nullptr;
	ObjQuadtreeNode* m_pRight_Down = nullptr;
	ObjQuadtreeNode* m_pParent = nullptr;
	ObjQuadtreeManager* m_pTreeMana = nullptr;
	//
	void SetBoundAndCenter(const HPoint& minPt, const HPoint& maxPt);
	void InitChildNode();
	//
	ObjQuadtreeNode* GetShellLocationOctreeNode(const HPoint& minPt, const HPoint& maxPt);
	//
	//ÿһ��BMQuadtreeNode���Ĳ����ڵ� ת��Ϊһ�� b3dm�ļ���
	GLTF::BMMesh m_BMMesh;
	vector<ObjContent*> m_vShellPrimitives;
	//��m_vShellPrimitives ���� m_BMMesh
	void CreateBMMesh();
	//
	bool m_Invalide = false;
	//
	float ComputeGeometricError();
	//
	void writeJSON(void* writer, bool inOBJ = false);
	void ComputeBoxBoundingVolume(float box[12]);
	void ComputeContentBoxBoundingVolume(float box[12]);
};
class ObjQuadtreeManager
{
public:
	ObjQuadtreeManager()
	{
	}
	~ObjQuadtreeManager()
	{
		if (m_Root) delete m_Root;
	}
	//
	ObjQuadtreeNode* m_Root = NULL;
	bool m_HasCreate = false;
	GLTF::BMVertex m_Cartesian;//ģ�͵ѿ�������
	std::string m_TileSetFileFolder = "D:\\";
	std::string m_ObjFileFolder = "D:\\";
	//
	double m_transform[16];
	std::map<std::string, ObjMtl> m_MtlMaps;
	
	//�����Ĳ���
	bool CreateQuadtree();
	void InitRootNode(GLTF::BMVertex& minPt, GLTF::BMVertex& maxPt);
	//
	void CreateBMMesh(ObjQuadtreeNode* _pNode);
private:
	void CreatMtlMap();
public:
	std::string MultiByteToUTF8(std::string& mutlStr);
	//matrix ��ʣ pt
	void MatrixMultiplyVector(double x, double y, double z, double& outX, double& outY, double& outZ);
};

