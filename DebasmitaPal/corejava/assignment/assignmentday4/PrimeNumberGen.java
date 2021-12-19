package assignmentday4;

public class PrimeNumberGen {
	public static void main(String[] args) {
		int i, count;

		for (i = 10; i <= 99; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count = 1;
					break;
				}
			}

			if (count == 0)
				System.out.println(i + " ");
		}

	}

}
