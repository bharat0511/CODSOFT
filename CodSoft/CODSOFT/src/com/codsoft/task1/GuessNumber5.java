package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber5 {
			public int GuessNumber()
			{
				Random r=new Random();
				int guess = r.nextInt(20);
				return guess;	
			}
			public static void main(String[] args) {
				
				int counter=1;
				Scanner sc=new Scanner(System.in);
				while(counter<=5)
				{
					System.out.println("-------------------------------");
					System.out.println("Enter The Guess Number You have a 5 chance:");
					int number=sc.nextInt();

					GuessNumber5 g=new GuessNumber5();
					int  num= g.GuessNumber();
					System.out.println("Random Number:"+num);
					if(counter<=5)
					{
					if(num==number)
					{
						System.out.println("The Guess is Correct...");
						counter++;
						break;
					}
					else if(number>num)
					{
						System.out.println("Too High....");
						System.out.println("You have left "+(5-counter)+" Chance");
						counter++;
					}
					else
					{
						System.out.println("Too Low....");
						System.out.println("You have left "+(5-counter)+" Chance");
						counter++;
					}	
				  }	
				}
				if(counter==6)
				{
					System.out.println("You Cross The Guess Limit....");
				}
				
				sc.close();
			}
}
		