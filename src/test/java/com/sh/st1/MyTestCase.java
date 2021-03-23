package com.sh.st1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml  "}) //spring의 설정 파일 위치
public class MyTestCase {

	@Test
	public void test1() {
		System.out.println("Test Method ------");
	}

}
