package startingFromScratchAP2020SummerHomework;

public class Array_Program_One {

	public static void main(String[] args) {
		
		double [] num = new double [10];
		
		double avg = 0;
		
		for(int i = 0; i < num.length; i++)
			{
				num [i] = Math.random();
				avg = avg + num[i];
				System.out.println(num[i]);
			}
		avg = avg / num.length;
		System.out.println("Here is the Average of the ten decimals = " + avg);
	}

}
