
#ifndef _SQLITEHELPER_H
#define _SQLITEHELPER_H
#include <sqlite3.h>
#include <iostream>
class SqliteHelper
{
public:
	SqliteHelper(void);
	~SqliteHelper(void);
	//////////////////////////////////////////////////////////////////////////
	//�˰�װ���кܶ����ⲻ�����---JGB
	//////////////////////////////////////////////////////////////////////////
	// �����ݿ�
	int OpenDB( bool bIsMemory);
	// �ر����ݿ�
	int CloseDB();
	// ����һ�ű�
	int CreateTable(const char* table_name_and_field);
	// ɾ��һ�ű�
	int DropTable(const char *table_name);
	// ��ѯ����
	int Select(const char *select_state);
	// �������
	int Insert(const char *insert_state);
	// ɾ������
	int Delete(const char *delete_state);
	// ���²���
	int Update(const char *update_state);
	//�����ڴ����ݿ�
	int SaveFile(const char* path);
	// ִ��sql���
	int SqlStateExec(const char *sql_state);
	// ִ��sql��� Lizhensheng 2015/10/20 Ϊ�˴���ص��ӿ�
	int SqlStateExec(const char *sql_state, int(*callback)(void*, int, char**, char**));
	//�ϲ����ݿ�
	int SqlMergeDataFile(const char* sMergeFilePath);
	// �Ƿ�ر�
	bool GetIsClose();
	sqlite3* GetSQLite(){ return sqlite_db_; }

	//int SqliteHelper::CommitTransaction()
	int CommitTransaction();
	int BeginTransaction();
	//
	std::string m_DBPath;
private:
	sqlite3 *sqlite_db_;// ���ݿ��ָ��
	char* err_msg_;		// ������Ϣ
	bool is_close_;		// �ر����ݵı�ʶ

protected:
	// ��Ҫ����selece�����е���ʾ����Ԫ��
	static int CallBackFunc(void *NotUsed, int argc, char **argv, char **azColName);
	//
	int loadOrSaveDb(sqlite3 *pInMemeory, const char *zFilename, int isSave);

};


#endif // _SQLITEHELPER_H


