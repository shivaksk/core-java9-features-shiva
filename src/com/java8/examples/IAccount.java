package com.java8.examples;

public interface IAccount {

	default void createAccount() {
		System.out.println("Account Crated");
	}
	
	public static void method1() {
		System.out.println("Utitlity methods");
	}
}
