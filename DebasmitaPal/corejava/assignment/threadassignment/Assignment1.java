package threadassignment;

public class Assignment1 implements Runnable {
	static Thread t1;

	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==6)
				try {
					t1.sleep(5000);
				}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
		
		
	}
	
public static void main(String[] args) {
	t1 = new Thread(new Assignment1());
	t1.start();
		

	}


}
