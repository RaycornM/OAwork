package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.EmpBean;

/**
 * ��������ɾ�Ĳ�Ȳ���
 * @author RaycornM
 *
 */
public interface EmpMapper {
//���� �����mapper������д��sql��䣬ֻ���Ǵ���ֵ�ͷ���ֵ
	public int insertEmp(EmpBean bean);
//�޸�
	public int updateEmp(EmpBean bean);
//ɾ�� ɾ������ֻ��Ҫ��������
	public int deleteEmp(int id);
//��ѯALL
	public List<EmpBean> selectAll();
//�û�����ѯ
	public EmpBean selectEmpByName(String name);
//��¼
	public EmpBean seleEmpByNameAndPwd(String name,String pwd);
}
