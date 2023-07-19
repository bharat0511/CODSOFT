package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber6 
{
	static int guess=0;
	static int round = 1;
	static int number = 0;
	public int GuessNumber() {
		Random r = new Random();
		 guess = r.nextInt(2);
		return guess;
	}
	public void GuessChance() {
		int counter = 1;
		Scanner sc = new Scanner(System.in);
		int num = this.GuessNumber();
		System.out.println("Round -> "+round+" Started");
		while (counter <= 5) {
			System.out.println("Enter The Guess Number You have 5 chance with 3 round:");
			number = sc.nextInt();
			System.out.println("Random Number:" + num);
			if (counter <= 5) {
				if (num == number) {
					System.out.println("The Guess is Correct...");
					counter++;
					break;
				} else if (number > num) {
					System.out.println("Too High....");
					System.out.println("You have left " + (5 - counter) + " Chance");
					counter++;
				} else {
					System.out.println("Too Low....");
					System.out.println("You have left " + (5 - counter) + " Chance");
					counter++;
				}
			}
		}
		if (counter == 6) {
			System.out.println("You Cross The Guess Limit...");
			System.out.println("----------------------------- -------------------");
		}
		round++;
	}
	public static void main(String[] args) {
		int round=3;
		GuessNumber6 g = new GuessNumber6();
		g.GuessNumber();
		g.GuessChance();
		
		for (int i = 1; i <round; i++) 
			{
			if (guess != number)
			   {
				g.GuessChance();
			   }
			else
			{
				break;
			}
				
		 }
	}
}
