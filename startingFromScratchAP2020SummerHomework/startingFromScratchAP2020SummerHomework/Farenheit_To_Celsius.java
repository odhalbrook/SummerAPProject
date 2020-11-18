package startingFromScratchAP2020SummerHomework;

import java.util.Scanner;

public class Farenheit_To_Celsius {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Hello, please enter a temprature you desire to be converted to Celsius from Farenheit");
		int requested = userInput.nextInt();
		requested = requested - 32;
		requested = requested * 5;
		requested = requested / 9;
		System.out.println("That temprature in Farenheit converts to " + requested + " in Celsius");
	}

}
