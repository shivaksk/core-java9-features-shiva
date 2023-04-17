package com.java8.examples;

public class IAccountTest implements IAccountLeft,IAccountRight{

	public static void main(String[] args) {
		IAccountTest accountTest = new IAccountTest();
		accountTest.method1();
	}

	@Override
	public void method1() {
		//IAccountRight.super.method1();
		IAccountLeft.super.method1();
	}

}
