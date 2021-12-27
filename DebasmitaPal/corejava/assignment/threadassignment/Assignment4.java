package threadassignment;

public class Assignment4 {

	public static void main(String[] args) {
		Thread t1 = new Thread("Scooby") {
			public void run() {
				System.out.println("I'm" +Thread.currentThread().getName());
			}
		};
		
		Thread t2 = new Thread("shaggy") {
			public void run() {
				System.out.println("I'm" +Thread.currentThread().getName());
				
			}
		};
		
		t1.start();
		t2.start();
		

	}

}
