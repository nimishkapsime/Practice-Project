package com.simplilearn;

import java.util.Scanner;

public class EmailArrraySearch {
	
	public static void main(String[] args) {
		String email [] = {"abc@gmail.com","def@gmail.com","ghi@gmail.com"};
		String esearch;
		boolean flag =false;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter email to search");
		esearch=sc.next();
		
		for (int i =0; i < email.length;i++)
		{
			String avalue = email[i];

			if(esearch.equals(avalue))
			{
				flag= true;
				break;
			}

		}
		if(flag)
		{
			System.out.println("Email id found in Array: "+esearch);
		}
		else 
		{ 
			System.out.println("Email id not found in Array: "+esearch);
		}


	}
}
