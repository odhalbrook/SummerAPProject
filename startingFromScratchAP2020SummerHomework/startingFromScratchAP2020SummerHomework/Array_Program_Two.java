package startingFromScratchAP2020SummerHomework;
import java.util.Scanner;

public class Array_Program_Two {

	public static void main(String[] args) {
		
		String [] months = new String [12];
			
			months [0] = "January";
			months [1] = "February";
			months [2] = "March";
			months [3] = "April";
			months [4] = "May";
			months [5] = "June";
			months [6] = "July";
			months [7] = "August";
			months [8] = "September";
			months [9] = "October";
			months [10] = "November";
			months [11] = "December";
			
			Scanner UserInput = new Scanner (System.in);
			
			System.out.println("Please enter a number that corresponds with a month and I will tell you the month");
			int number = UserInput.nextInt();
			number = number - 1;
			System.out.println(months [number]);
		
	}

}
