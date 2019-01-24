package homework;

import java.util.Scanner;

public class Example8 {

	public static int gcd(int m, int n) {
		return n == 0 ? m : gcd(n, m % n);
	}

	public static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.printf("最大公因數:%d", gcd(n1, n2));
			System.out.printf(", 最小公倍數:%d\n", lcm(n1, n2));
		}
	}

}
