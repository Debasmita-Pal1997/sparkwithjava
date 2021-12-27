package threadassignment6;

public class Days extends Thread {

	private String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

	public void run() {
		SalesPerson salesPerson = new SalesPerson();
		salesPerson.start();

		for (String day : days) {
			System.out.println(day);
			try {
				sleep(500);
			}

			catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			if (day.equals("Sunday")) {
				System.out.println("Suspending");
				salesPerson.suspend();

				try {
					sleep(200);
				}

				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (day.equals("Wednesday")) {
				System.out.println("Resumig...");
				salesPerson.resume();
			}

		}

	}

}
