package com.mirim.test;

// import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AbstractApplicationContext ctx = new GenericXmlApplicationContext();  // Up casting
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();		// AbstractApplicationContext 보다 상위 클래스
	
		ctx.load("classpath:applicationCTX.xml");
		
		
		ctx.refresh();		// 변화 있으면 reload 가능함  
		
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getName());	// 홍길동 출력
		
		ctx.close();
	}

}
