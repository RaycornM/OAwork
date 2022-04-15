package com.tedu.mapper;

import java.util.List;

import com.tedu.bean.OaBookBean;
import com.tedu.bean.OaRootBean;

/**
 * ��������ɾ�Ĳ�Ȳ���
 * @author RaycornM
 *
 */
public interface BookMapper {
//���� �����mapper������д��sql��䣬ֻ���Ǵ���ֵ�ͷ���ֵ
	public int insertBook(OaBookBean bean);
//�޸�
	public int updateBook(OaBookBean bean);
//ɾ�� ɾ������ֻ��Ҫ��������
	public int deleteBook(int id);
//��ѯALL
	public List<OaBookBean> selectAll();
//������ѯ
	public OaBookBean selectBookByTitle(String title);

}
