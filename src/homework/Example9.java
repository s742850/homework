package homework;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int[] numbers = new int[10001];
			for (int i = 0; i < n; i++) {
				numbers[sc.nextInt()]++;
			}
			for (int i = 0; i < 10001; i++) {
				if (numbers[i] != 0) {
					System.out.println(i + " " + numbers[i]);
				}
			}
		}
	}

}
