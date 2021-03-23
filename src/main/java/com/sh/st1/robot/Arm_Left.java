package com.sh.st1.robot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Arm 상속받기
@Component
//이름 지정
@Qualifier("al")
public class Arm_Left extends Arm{
	
	//생성자 준비, 미리 이름 선언 
	public Arm_Left() {
		this.setName("Left Arm");
	}
}
