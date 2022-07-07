package com.mirim.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{		// Bean�� �ʱ�ȭ, ������Ű�°� ��ӹ���

	private String name;
	private int age;
	
	public Student(String name, int age) {	// ������
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void destroy() throws Exception {			// DisposableBean, Bean container�� �����Ǹ鼭 �ڵ� ȣ��
		// TODO Auto-generated method stub
		System.out.println("***** destroy() ����� *****");
		
	} // �ڵ� ȣ���

	@Override
	public void afterPropertiesSet() throws Exception {	// InitializingBean, Bean�� �Ӽ��� ������ ��(�ʱ�ȭ) �ڵ� ȣ��,
		// TODO Auto-generated method stub
		System.out.println("***** afterPropertiesSet() ����� *****");
	} // �ڵ� ȣ���
	
	
	
}
