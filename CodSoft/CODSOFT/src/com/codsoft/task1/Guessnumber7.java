package com.codsoft.task1;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber7 {
			static int guess=0;//You have maxmimum 5 chance to guess the number
			static int round = 1;// you have maximum 3 round to won the game
			static int number = 0;
			static int score=30;//if you won in 1st round then your score will be 30, in 2nd 20, and last score will be 10;
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
							System.out.println("You Won in "+round+" Round"+" Your score is->"+score);
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
				score=score-10;;
			}
			public static void main(String[] args) {
				int round=3;
				Guessnumber7 g = new Guessnumber7();
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
