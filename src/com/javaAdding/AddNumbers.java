package com.javaAdding;

import java.util.Scanner;

public class AddNumbers {
	int a;
	int b;
	public String sum(int a , int b) {
		double sum=a+b;
		return "sum of these two numbers "+sum;
		
	}
     private static Scanner sc = new Scanner(System.in);
     
	public static void main(String[] args) {
		AddNumbers add=new AddNumbers();
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(add.sum(a, b));
		
	}

}
