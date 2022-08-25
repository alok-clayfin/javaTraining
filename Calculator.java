package clayfinTrainee;

import java.util.Scanner;

public class Calculator {
	double add(double input1, double input2) {
		return input1+input2;
	}
	double subtract(double a, double b) {
		return a-b;
	}
	double multiplication(double a, double b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}

}

class SantificCalculator extends Calculator{
	double log(double a) {
		return a;
	}
	double mod(double a) {
		return -(-a);
	}
}

class CurrencyCalculator extends Calculator{
	double dollor(double a) {
		return 75*a;
	}
	double inr(double a) {
		return 75/a;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input number");
		double input1 = scan.nextDouble();
		double input2 = scan.nextDouble();
		
		Calculator calculator = new Calculator();
		CurrencyCalculator currencyCalculator = new CurrencyCalculator();
		SantificCalculator santificCalculator = new SantificCalculator();
		
		switch (input1) {
		
		}
		
		System.out.println(calculator.add(input1, input2));
		System.out.println(calculator.subtract(input1, input2));
		System.out.println(calculator.multiplication(input1, input2));
		System.out.println(calculator.divide(input1, input2));
		System.out.println(currencyCalculator.dollor(input1));
		System.out.println(currencyCalculator.inr(input1));
		System.out.println(santificCalculator.log(input1));
		System.out.println(santificCalculator.mod(input1));
		
		
	}
}