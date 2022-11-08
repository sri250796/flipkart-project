package com.pojorunner;

import com.pojo.Pojotopic;

public class POJO_RUNNER {

	public static void main(String[] args) {

		Pojotopic obj = new Pojotopic();//object creation for POJO class from src/main/java
		obj.setAge(20);
		obj.setName("Sridhar");

		int value2 = obj.getAge();
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
