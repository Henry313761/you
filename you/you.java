package you;

import java.util.Scanner;

public class you {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number 1:");
		int number1= sc.nextInt();
		
		//Scanner number2=new Scanner(System.in);
		System.out.println("Enter a number 2: ");
		int number2= sc.nextInt();



		if (number1>number2) {
		System.out.println("number1 is greater than number2");
		}
		
		else if(number1<number2) { 
		System.out.println("number1 is less than number2");
		}
		else {
			System.out.println("both number1 and number2 are the same");
		}
	}

}