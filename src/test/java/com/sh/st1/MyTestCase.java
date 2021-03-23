package com.sh.st1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"}) 
//spring의 설정 파일 위치
public class MyTestCase {
	
	//car 출력해보기 위해 선언
	//선언만 하면 null이 들어간다.
	//앞서 Car 클래스에서 Component에 의해 만들어진 객체가 존재한다
	//만들어진 객체를 집어넣어주는 Annotation 사용한다
	//주입하는 annotation
	
	@Autowired
	private Car car;

	
	
	@Test
	public void test1() {
		System.out.println(car.getEngine().getFuel());
	}

}
