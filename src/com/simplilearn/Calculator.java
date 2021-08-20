package com.simplilearn;

import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {

		int no_1;
		int no_2;
		String oper;

		System.out.println("Enter Operation you want to perform +,-,/,*");

		Scanner op =new Scanner(System.in); 
		oper= op.next() ;


		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter First Number");
		no_1=sc.nextInt();
		System.out.println("Enter Second Number");
		no_2= sc.nextInt();

		if(oper.equals("+"))

		{
			System.out.println("Addition of " +no_1 +" and "+no_2 +" = "+(no_1+no_2));

		}
		else if(oper.equals("-")) 
		{
			System.out.println("Substraction of " +no_1 +" and "+no_2 +" = "+(no_1-no_2));
		}
		else if(oper.equals("/")) 
		{
			System.out.println("Division of " +no_1 +" and "+no_2 +" = "+(no_1/no_2));
		}
		else if(oper.equals("*")) 
		{
			System.out.println("Multiplication of " +no_1 +" and "+no_2 +" = "+(no_1*no_2));
		}
		else
		{
			System.out.println("Please enter correct option");
		}

	}
}
