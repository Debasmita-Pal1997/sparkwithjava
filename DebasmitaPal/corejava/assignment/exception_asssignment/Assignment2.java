package exceptionasssignment;

import java.util.Scanner;

import exception.ArrayIndexOutOfBoundException;

/* Write a program that takes as input the size of the array and the elements in the array. 
 * The program then asks the user to enter a particular index and prints the element at that index. 
 * This program may generate Array Index Out Of Bounds Exception. 
 * Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown. Sample Input and Output 1: Enter the number of elements in the array 3 Enter the elements in the array 20 90 4 Enter the index of the array element you want to access 2 The array element at index 2 = 4 The array element successfully accessed*/

public class Assignment2 {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("enter the elements of array:");
		for(int i =0; i<size;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the index of the array element");
		int index = sc.nextInt();
		
		try {
			System.out.println("The array element at Index "+index+"= "+arr[index]);
			System.out.println("The array element accesses successfully");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}

	}

}
