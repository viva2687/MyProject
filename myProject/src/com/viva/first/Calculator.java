package com.viva.first;

public class Calculator {
	
	public Calculator() {

		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) {
		int number1 = 5;
		int number2 = 10;
		
	Calculator cal = new Calculator();
	int sum = cal.addnumbers(number1, number2);
	System.out.println("Sum of two numbers.. number1 and number2: "+sum);
	}
	
	int addnumbers(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}
