import java.util.*;

public class Grades {
	
	Scanner sc;

	public static void main(String[] args){    new Grades();    }
	
	public Grades(){
		sc = new Scanner(System.in);
		System.out.print("Percentage: ");
		double marks = sc.nextDouble();
		check(marks);
	}
	
	
	public void check(double marks){
		if(marks >= 91 && marks <= 100){
			System.out.println("You Got An 'A1'");}
		else if(marks >= 81 && marks <= 90){
			System.out.println("You Got An 'A2'");}
		else if(marks >= 71 && marks <= 80){
			System.out.println("You Got A 'B1'");}
		else if(marks >= 61 && marks <= 70){
			System.out.println("You Got A 'B2'");}
		else if(marks >= 51 && marks <= 60){
			System.out.println("You Got A 'C1'");}
		else if(marks >= 41 && marks <= 50){
			System.out.println("You Got A 'C2'");}
		else if(marks >= 33 && marks <= 40){
			System.out.println("You Got A 'D1'");}
		else if(marks >= 21 && marks <= 32){
			System.out.println("You Got A 'D2'");}
		else if(marks >= 00 && marks <= 20){
			System.out.println("You Got An 'E'");}
	}

}
