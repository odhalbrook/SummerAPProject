package startingFromScratchAP2020SummerHomework;
import java.util.Scanner;


public class String_Equal {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Do you like dogs or cats?");
		String answer = userInput.nextLine();
		if (answer.equals("dogs")) {
			System.out.println("Good Choice!");
		}
		else if(answer.equals("cats")) {
			System.out.println("not as good as dogs but still ok");
		}
		else {
			System.out.println("You must have entered something else, please restart the program and try again");
		}
	}

}
