import java.util.*;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Random rand = new Random();
		
		System.out.print("Enter Range: 1-");
		int range = sc.nextInt();
		int n = rand.nextInt(range)+1;
		System.out.println("\n\nGuess The Number From 0 to " + range + ":");
		int a = sc.nextInt();
		if(a==n){
			System.out.println("\nYou Won By Answering " + a + ", The Number Was " + n + ".");
		}else{
			System.out.println("\nYou Lost! The Number Was " + n + " Not " + a + ".");
		}
		sc.close();
		
	}

}
