package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;
public class GuessNumber3 {
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
				System.out.println("The Guess is Correct...");
			}
			else if(number>num)
			{
				System.out.println("Too High....");
			}
			else
			{
				System.out.println("Too Low....");
			}
			sc.close();
		}
	}