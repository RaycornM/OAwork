package com.tedu.test;

import java.util.List;

import org.junit.Test;

import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;
import com.tedu.mapper.EmpMapperImpl;

/**
 * ������ר������mapper���Ե�
 * @author RaycornM
 *
 */
public class TestMapper {
	@Test
	public void selectEmpByNameAndPwd() {
		//�ӿ����� = ʵ�����
		EmpMapper mapper = new EmpMapperImpl();
		//��ȷ��
		EmpBean bean = mapper.seleEmpByNameAndPwd("����", "1234");
		System.out.println(bean);
		//�����
		bean = mapper.seleEmpByNameAndPwd("114", "514");
		System.out.println(bean);
		
	}
	@Test
	public void selectAll() {
		EmpMapper mapper = new EmpMapperImpl();
		List<EmpBean> all = mapper.selectAll();
		for(EmpBean bean:all) {
			System.out.println(bean);
		}
	}
}
