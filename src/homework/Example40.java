package homework;

import java.util.Scanner;

public class Example40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.print(n + " ");
			while (n != 1) {
				if (n % 2 != 0)
					n = 3 * n + 1;
				else
					n /= 2;
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
