package startingFromScratchAP2020SummerHomework;
import java.util.Scanner;

public class Secret_Number_Game {

	static boolean playing = true;
	static int guess = 0;
	static int secretNumber = (int) ( Math.random() * 10);
	static Scanner UserInput = new Scanner(System.in);
	
	public static void main(String[] args) {

	
		GreetUser();
		while(playing == true) {
			playGuess();
		}
		EndGame();
	}


	private static void GreetUser() {

		System.out.println("Hello and welome to the number guessing game!");
		System.out.println("I have picked a number between one and ten, guess the number and you win!");
	}
	private static void playGuess() {

		System.out.println("Please enter your guess, make sure it is between one and ten.");
		guess = UserInput.nextInt();
		
		if(guess > secretNumber) {
			System.out.println("That number is too High!");
		}
		else if(guess < secretNumber) {
			System.out.println("That number is too Low!");
		}
		else if(guess == secretNumber) {
			System.out.println("Congrats, you guessed the right number!");
			playing = false;
		}
	}
	private static void EndGame() {

		System.out.println("Enjoy your day!");
	}
}
