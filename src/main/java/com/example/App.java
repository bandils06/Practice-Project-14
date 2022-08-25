package com.example;

import java.util.Scanner;

public abstract class App
{
	
	public static Scanner sc = new Scanner(System.in);
	public static String D_id = "test@gmail.com";
	public static String D_pwd = "123456";
	public static String pwd;
	public static String id;
	
	public static boolean authenticate() {
		if(id.equals(D_id) && pwd.equals(D_pwd))
			return true;
		else return false;
	}
	
	static void inputID() {
		System.out.println("Enter ID: ");
		id=sc.next();	
	}
	
	static void inputPassword() {
		System.out.println("Enter Password: ");
		pwd=sc.next();
	}
	
}
