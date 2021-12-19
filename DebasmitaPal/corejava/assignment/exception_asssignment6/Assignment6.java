package exceptionasssignment6;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subjectA = 0;
			int subjectB = 0;
			int subjectC = 0;

			try {
				name = sc.nextLine();

				if (sc.hasNextInt())
					subjectA = sc.nextInt();

				else
					throw new NumberFormatException();

				if (sc.hasNextInt())
					subjectB = sc.nextInt();

				else
					throw new NumberFormatException();
				if (sc.hasNextInt())
					subjectC = sc.nextInt();

				else
					throw new NumberFormatException();

				if (subjectA < 0)
					throw new NegativeValuesException();
				if (subjectA > 100)
					throw new ValuesOutOfRangeException();

				if (subjectB < 0)
					throw new NegativeValuesException();
				if (subjectB > 100)
					throw new ValuesOutOfRangeException();

				if (subjectC < 0)
					throw new NegativeValuesException();
				if (subjectC > 100)
					throw new ValuesOutOfRangeException();

			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subjectA);
			System.out.println("Marks of subject B: " + subjectB);
			System.out.println("Marks of subject C: " + subjectC);

		}

	}

}
