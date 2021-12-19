package assignmentday4;

public class DivisibleByTwoThreeFive {

	public static void main(String[] args) {
		int count = 0;
		int i = 0;

		while (count <= 5) {
			i++;

			if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				count++;
			}

		}
	}
}
