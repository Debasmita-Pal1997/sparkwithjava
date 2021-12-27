package threadassignment;

import java.util.Random;

public class Assignment5 implements Runnable {

	public static void main(String[] args) {
		Assignment5 assignment5 = new Assignment5();
		Thread t1 = new Thread(assignment5);
		t1.start();
		

	}

	@Override
	public void run() {
		Random random = new Random();
		String colours[] ={"white","blue","black","green","red","yellow"};
		int index;
		
		while((index = random.nextInt(6))!=4) {
			System.out.println(colours[index]);
			
		}
		
		
	}

}
