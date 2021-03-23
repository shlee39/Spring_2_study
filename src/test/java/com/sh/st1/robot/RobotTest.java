package com.sh.st1.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"}) 
public class RobotTest {
	
	@Autowired
	private Robot robot;

	@Test
	public void test() {
		//left_arm의 name
		System.out.println(robot.getArm_Left().getName());
		//right_arm name
		System.out.println(robot.getArm_Right().getName());
	}

}
