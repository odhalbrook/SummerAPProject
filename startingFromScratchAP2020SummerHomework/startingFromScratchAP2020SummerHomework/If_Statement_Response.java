package startingFromScratchAP2020SummerHomework;

import java.util.Scanner;

public class If_Statement_Response {

	public static void main(String[] args) {

		Scanner userInput = new Scanner (System.in);
		System.out.println("Please tell me your name and then press enter");
		String fullName = userInput.nextLine();
		System.out.println("Welcome " + fullName + ", what is your favorite animal, please enter the number associated with that animal.");
		System.out.println("1. Dogs		2.Cats		3.Parrots");
		int choice = userInput.nextInt();
		if(choice == 1)
		{
			
			System.out.println("Awesome, dogs are the best!");
			
		}
	
		else if (choice == 2) {
			System.out.println("Cats are ok...");
		}
		
		else if (choice == 3) {
			System.out.println("Niceeeeee Choice!");
		}
		else {
			System.out.println("Why can't you follow instructions, well joke's on you, now you can't tell me, bye!");
		}
	}

}
