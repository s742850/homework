package homework;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int min;
		while (sc.hasNextInt()) {
			min = Integer.MAX_VALUE;
			numbers[0] = Math.abs(sc.nextInt());
			numbers[1] = Math.abs(sc.nextInt());
			numbers[2] = Math.abs(sc.nextInt());
			numbers[3] = Math.abs(sc.nextInt());
			numbers[4] = Math.abs(sc.nextInt());

			for (int i = 0; i < 5; i++) {
				for (int j = i+1; j < 5; j++) {
					int result = numbers[i] * numbers[j];
					if (result < min)
						min = result;
				}
			}
			System.out.print(min);
		}
	}
}
