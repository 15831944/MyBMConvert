#pragma once
#include <stdio.h>
#include <iostream>
#include <fstream>
#include <sstream> 
#include "../BMFile/SqliteHelper.h"
#include "../BMFile/BMConvert.h"
//
class WriteShap
{
public:
	std::string m_TxtFile;
	std::string m_ShpFile;
	SqliteHelper m_SQLHelper;
	void Write();
	GLTF::BMVertex m_Cartesian;//ģ�͵ѿ�������
	GLTF::BMVertex m_Cartographic;//ģ�;�γ������
	GLTF::BMVertex m_CartesianS;//ģ�͵ѿ�������2---������ת��
	GLTF::BMVertex m_CartographicS;//ģ�;�γ������2---������ת��
	//
	double m_transform[16];
private:
	std::string MultiByteToUTF8(std::string& mutlStr);
	std::string GetGUIDStr(); 
	void MatrixMultiplyVector(double x, double y, double z, double& outX, double& outY, double& outZ);
};
