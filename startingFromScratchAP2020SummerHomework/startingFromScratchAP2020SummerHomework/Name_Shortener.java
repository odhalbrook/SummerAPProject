package startingFromScratchAP2020SummerHomework;
import java.util.Scanner;

public class Name_Shortener {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner (System.in);
		System.out.println("Welcome to the Name Machine!");
		System.out.println("Please tell me your first name and then press enter");
		String firstName = userInput.nextLine();
		System.out.println("Now please tell me your last name and press enter");
		String lastName = userInput.nextLine();
		
		System.out.println("Here is your shortened name: " + firstName.substring(0,3) + lastName.subSequence(0, 3));
	}


}
