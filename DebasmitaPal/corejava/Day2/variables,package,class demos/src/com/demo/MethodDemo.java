package com.demo;

class AdditionDemo {
	void Addition(){
		int number1 = 20;
		int number2 = 10;
		int addresult;
		
		addresult = number1 + number2;
		System.out.println("Add of two "+addresult);
	}
}

class SubtractionDemo {
	void Subtraction(){
		int number1 = 20;
		int number2 = 10;
		int subresult;
			
		subresult = number1 - number2;
		System.out.println("Sub of two "+subresult);
		}
}

public class MethodDemo{ //client class
	public static void main(String[] args) {
		AdditionDemo addition = new AdditionDemo();
		addition.Addition();
		
		SubtractionDemo subtraction  = new SubtractionDemo();
		subtraction.Subtraction();
	}
}


