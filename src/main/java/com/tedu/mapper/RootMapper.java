package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.OaRootBean;

/**
 * ��������ɾ�Ĳ�Ȳ���
 * @author RaycornM
 *
 */
public interface RootMapper {
//���� �����mapper������д��sql��䣬ֻ���Ǵ���ֵ�ͷ���ֵ
	public int insertRoot(OaRootBean bean);
//�޸�
	public int updateRoot(OaRootBean bean);
//ɾ�� ɾ������ֻ��Ҫ��������
	public int deleteRoot(int id);
//��ѯALL
	public List<OaRootBean> selectAll();
//�û�����ѯ
	public OaRootBean selectRootByUname(String uname);
//��¼
	public OaRootBean seleRootByUnameAndUpwd(String uname,String upwd);
}
