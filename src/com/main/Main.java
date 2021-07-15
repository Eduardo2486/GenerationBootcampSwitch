package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.println("insert first number");
		int number1 = input.nextInt();
		System.out.println("insert second number");
		int number2 = input.nextInt();
		System.out.println("1 : sum");
		System.out.println("2 : substraction");
		System.out.println("3 : division");
		System.out.println("4 : muliplication");
		int operation = input.nextInt();

		switch (operation) {
			case 1:
				result = number1 + number2;
				System.out.println("la suma es igual: " + result);
				break;
			case 2:
				result = number1 - number2;
				System.out.println("la resta es igual: " + result);
				break;
			case 3:
				result = number1 * number2;
				System.out.println("la multiplacacion es igual: " + result);
				break;
			case 4:
				result = number1 / number2;
				System.out.println("la division es igual: " + result);
				break;
			default:
				System.out.println("error");
				break;
		}
		input.close();
	}

}
