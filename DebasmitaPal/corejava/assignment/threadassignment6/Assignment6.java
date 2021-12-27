package threadassignment6;

public class Assignment6 {

	public static void main(String[] args) {
		Days days = new Days();
		Thread t1 = new Thread(days);
		t1.start();
		

	}

}
