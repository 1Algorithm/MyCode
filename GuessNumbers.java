package week2;

import java.util.Scanner;

public class GuessNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int randomNumber, limit;
		String continuePlay;

		do {
			int myGuess;
			randomNumber = 1 + (int) (Math.random() * 1000);
			System.out.println("The randomNumber is " + randomNumber);
			System.out.print("Only permit times:");
			limit = scan.nextInt();
			for (int i = 1; i <= limit; i++) {
				System.out.print("Give your Guess:");
				myGuess = scan.nextInt();
				if (myGuess == randomNumber) {
					System.out.println("Bravo! you are right!");
					break;
				} else if (myGuess > randomNumber) {
					System.out.println("Too High.Try it again!");
					System.out.println("left   " + (limit - i) + "   times");
				}

				else {
					System.out.println("Too low.Try it again!");
					System.out.println("left   " + (limit - i) + "   times");
				}

			}
			System.out.println("Game Over!");
			System.out.print("If wanna continue(y/n):");
			continuePlay = scan.next();
			System.out.println("\n");
		} while ((continuePlay.equals("y")));
		System.out.println("You Can Go!");
	}

}
