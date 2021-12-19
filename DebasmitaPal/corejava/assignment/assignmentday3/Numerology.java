package assignment;

import java.util.Scanner;

class Calculate {
	void SumofDigit(int number) {
		int d, ns, s = 0, ev = 0, od = 0;

		while (number > 0) {
			d = number % 10;
			s = s + d;
			number = number / 10;
			if (d % 2 == 0)
				ev++;
			else
				od++;
		}
		System.out.println("sum of digits:" + s);

		while (s > 9) {
			if (s < 10)
				break;
			s = (s / 10) + (s % 10);

		}

		System.out.println("Numerology number: " + s);
		System.out.println("Number of odd numbers: " + od);
		System.out.println("Number of even numbers: " + ev);

	}

}

public class Numerology {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		Calculate calculate = new Calculate();
		calculate.SumofDigit(number);

	}

}
