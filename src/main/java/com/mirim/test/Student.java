package com.mirim.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{		// Bean을 초기화, 삭제시키는걸 상속받음

	private String name;
	private int age;
	
	public Student(String name, int age) {	// 생성자
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
	public void destroy() throws Exception {			// DisposableBean, Bean container가 삭제되면서 자동 호출
		// TODO Auto-generated method stub
		System.out.println("***** destroy() 실행됨 *****");
		
	} // 자동 호출됨

	@Override
	public void afterPropertiesSet() throws Exception {	// InitializingBean, Bean의 속성을 셋팅한 후(초기화) 자동 호출,
		// TODO Auto-generated method stub
		System.out.println("***** afterPropertiesSet() 실행됨 *****");
	} // 자동 호출됨
	
	
	
}
