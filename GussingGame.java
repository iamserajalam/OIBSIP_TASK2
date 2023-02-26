package com.oasis;

import java.util.Random;
import java.util.Scanner;

public class GussingGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random Random_number = new Random();
		int guess_number = Random_number.nextInt(100);
		System.out.println("Guess a number between 1 to 100, You will have 10 attempt");
		System.out.println("Best of luck!");
		int attempt = 0;
		int guess;
		int i = 0;
		boolean win = false;
		while (win == false) {
			guess = sc.nextInt();
			attempt++;

			if (guess == guess_number) {
				win = true;
				System.out.println("**** YOU WIN *****");
				System.out.println("The number was " + guess_number);
				System.out.println("You used " + attempt + " attempt to guess the right number");
				System.out.println("Your score is " + ((11 - attempt) * 10) + " out of 100");
			} else if (i > 8) {
				System.out.println("You have exceeded the maximum attempt.Please try again!!! the right answer was: "
						+ guess_number);
				return;
			} else if (guess < guess_number) {
				i++;
				System.out.println("Your Guess Number is lower than the right guess_number.");
			} else if (guess > guess_number) {
				i++;
				System.out.println("Your Guess Number is higher than the right guess_number.");
			}

		}

	}
}