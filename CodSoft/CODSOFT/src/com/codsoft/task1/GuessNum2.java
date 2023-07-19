package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;
public class GuessNum2 {
	public int GuessNumber()
	{
		Random r=new Random();
		int guess = r.nextInt(100);
		return guess;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Guess Number:");
		int number=sc.nextInt();
		GuessNum2 g=new GuessNum2();
		int  num= g.GuessNumber();
		System.out.println("Random Number:"+num);
		if(num==number)
		{
			System.out.println("You Guess the Number Correct Number...");
		}
		else
		{
			System.out.println("You not Guess correct Number Try Again....");
		}
		sc.close();
	}
}