package com.demo;

//return type demo

class SubtractionDemo2 {
	//passing parameter in method
	int Subtraction1(int number1, int number2){
		
		int subresult;
			
		subresult = number1 - number2;
		return subresult;
		}
}
public class ReturnTypeWithPassingParameterDemo {
	public static void main(String[] args) {
		SubtractionDemo2 subtraction  = new SubtractionDemo2();
		int result=subtraction.Subtraction1 (20,10);
		System.out.println("result from main class " + result);
	}
}
