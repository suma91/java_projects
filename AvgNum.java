package com.basic;

import java.util.Scanner;

public class AvgNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("ENter second number");
		int num2 = sc.nextInt();
		
		System.out.println("ENter second number");
		int num3 = sc.nextInt();
		
		int result = (num1+num2+num3) / 3;
		
		System.out.println("THe average of 3 numbers is: "+result);
		
	}

}
