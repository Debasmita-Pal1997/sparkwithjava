package com.demo;

//without any return type

class AdditionDemo1 {
	void Addition(int number1, int number2){
		
		int addresult;
		
		addresult = number1 + number2;
		System.out.println("Add of two "+addresult);
	}
}

class SubtractionDemo1 {
	//passing parameter in method
	void Subtraction(int number1, int number2){
		
		int subresult;
			
		subresult = number1 - number2;
		System.out.println("Sub of two "+subresult);
		}
}
public class PassingParameterMethodDemo {
	public static void main(String[] args) {
		AdditionDemo1 addition = new AdditionDemo1();
		addition.Addition(15,15);
		
		SubtractionDemo1 subtraction  = new SubtractionDemo1();//object created
		subtraction.Subtraction(20,10);//calling from here
	}
}
