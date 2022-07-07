package com.mirim.test;

// import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AbstractApplicationContext ctx = new GenericXmlApplicationContext();  // Up casting
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();		// AbstractApplicationContext ���� ���� Ŭ����
	
		ctx.load("classpath:applicationCTX.xml");
		
		
		ctx.refresh();		// ��ȭ ������ reload ������  
		
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getName());	// ȫ�浿 ���
		
		ctx.close();
	}

}
