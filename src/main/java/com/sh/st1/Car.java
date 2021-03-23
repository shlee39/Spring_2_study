package com.sh.st1;

import org.springframework.stereotype.Component;

//new car 객체 선언
@Component
public class Car {
	
	
	private String name="Test Car";
	
	private Engine engine; //엔진을 가지고 있다 선언
	//자동자는 engine을 멤버로 가지고 있다. -> 자동차는 engine에 대해 의존적이다
	
	

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
