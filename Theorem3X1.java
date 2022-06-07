import java.util.Scanner;  
public class Theorem3X1{
	
public static void main(String args[]){ 
	new Theorem3X1();
}

	public Theorem3X1(){
		
		//variable that denotes the starting point of the sequence      
		int N;   
		//variable to count the number of terms  
		int count;   
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the starting point for the sequence: ");  
		//reads an integer from the user  
		N=sc.nextInt();  
		while (N <= 0)   
		{  
		System.out.println("The starting point must be positive. Please re-enter the number: ");  
		N=sc.nextInt();  
		}  
		count = 0;  
		//executes when N is greater than 0  
		while (N != 1)   
		{  
		if (N % 2 == 0)  
		N = N / 2;  
		//executes when N is an odd number  
		else  
		N = 3 * N + 1;  
		System.out.print(N + "\t");  
		//increments count variable by 1  
		count = count + 1;  
		}  
		System.out.println();  
		System.out.println("There are "+count+" terms in the sequence.\n\n\n\n");
		sc.close();
		new Theorem3X1();
	}

}