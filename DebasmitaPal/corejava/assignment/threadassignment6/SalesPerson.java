package threadassignment6;

public class SalesPerson extends Thread {
	
	private String[] names = {"Butler","Virat","Williamsons","Richard","Harry"};
	
	public void run() {
		for(String name : names) {
			System.out.println(name);
			
			try {
				sleep(500);
			}
			catch(InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	
}
