package com.sh.st1.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Robot 객체 선언
@Component
public class Robot {

	//로봇이 왼팔, 오른팔을 가지고 있다 = 멤버변수로 선언
	//집어 넣어주기. 단, 한 개당 하나
	@Autowired
	@Qualifier("al")
	//private Arm_Left lf;
	private Arm arm_Left;
	//객체의 이름을 바꾸어도 출력이 된다.
	//autowired는 같은 데이터 타입을 찾아 주입하기 때문!
	
	@Autowired
	//private Arm_Right arm_Right;
	@Qualifier("ar")
	//ar이라는 이름을 주입시켜라
	private Arm arm_Right;

	public Arm getArm_Left() {
		return arm_Left;
	}

	public void setArm_Left(Arm arm_Left) {
		this.arm_Left = arm_Left;
	}

	public Arm getArm_Right() {
		return arm_Right;
	}

	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}

	
	
	
	
}
