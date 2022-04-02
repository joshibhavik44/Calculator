package Tests;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		while(true) {
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a = sc.nextInt();
		System.out.println("Enter second value: ");
		int b = sc.nextInt();

		System.out.println("which operation would you like to perform?");
		System.out.println("1.Addition(+)\n2.Substraction(-)\n3.Multiplication(x)\n4.Division(/)");

		int checkOp = sc.nextInt();

		if (checkOp == 1) {
			UnitTesting.add(a, b);
		} 	
		else if (checkOp == 2) {
			UnitTesting.sub(a, b);
			} 
		else if (checkOp == 3) {
				UnitTesting.mul(a, b);
			} 
		else if (checkOp == 4) {
				UnitTesting.div(a, b);
			} 
		else {
			System.out.println("this entry is invalid");
		}
	} 
	catch (Exception e) {
		System.out.println(e+" :Enter a valid number");
	}
	System.out.println("\n\n******************\n\n");
	}

}}
