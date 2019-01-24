package homework;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int one = 0;
			int five = 0;
			int ten = 0;
			int fifty = 0;
			int hundred = 0;

			int n = sc.nextInt();
			if (n / 100 != 0) {
				hundred = n / 100;
				n = n - (n / 100) * 100;

			}
			if (n / 50 != 0) {
				fifty = n / 50;
				n = n - (n / 50) * 50;

			}
			if (n / 10 != 0) {
				ten = n / 10;
				n = n - (n / 10) * 10;

			}
			if (n / 5 != 0) {
				five = n / 5;
				n = n - (n / 5) * 5;

			}

			one = n;

			System.out.printf("%d-%d, ", 1, one);
			System.out.printf("%d-%d, ", 5, five);
			System.out.printf("%d-%d, ", 10, ten);
			System.out.printf("%d-%d, ", 50, fifty);
			System.out.printf("%d-%d\n", 100, hundred);
		}
	}

}
