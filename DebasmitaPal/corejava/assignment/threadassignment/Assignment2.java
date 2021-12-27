package threadassignment;

public class Assignment2 implements Runnable {
	static Thread oddThread;
	static Thread evenThread;

	public static void main(String[] args) {
		Assignment2 assignment2 = new Assignment2();
		
		oddThread = new Thread(assignment2,"oddThread");
		evenThread = new Thread(assignment2,"evenThread");
		
		oddThread.start();
		evenThread.start();
		
		

	}

	@Override
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("oddThread"))
				evenThread.join();
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		for(int i =1;i<=20;i++) {
			if(Thread.currentThread().getName().equals("evenThread")) {
				if(i%2 == 0)
					System.out.println(i);
			}
			
			if(Thread.currentThread().getName().equals("oddThread")) {
				if(i%2 == 1)
					System.out.println(i);
			}
			
			
		}
		
	}

}
