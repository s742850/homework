package homework;

import java.util.Scanner;
//https://blog.csdn.net/u012369373/article/details/52002875
public class Example47 {
	public static void main(String[] args) {
		int fm1, fm2, fz1, fz2;
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			Example47 fa = new Example47();
			String st = sc.next();
			String[] tokens = st.split("/");
			fz1 = Integer.parseInt(tokens[0]);
			fm1 = Integer.parseInt(tokens[1]);
			st = sc.next();
			tokens = st.split("/");

			fz2 = Integer.parseInt(tokens[0]);
			fm2 = Integer.parseInt(tokens[1]);
			int num1 = fa.gbs(fm1, fm2);
			fz1 = (num1 / fm1) * fz1;
			fz2 = (num1 / fm2) * fz2;
			int num2 = fz1 + fz2;
			int num3 = fa.gys(num1, num2);
			if (num2 / num3 == num1 / num3) {
				System.out.println("1");
			} else {
				System.out.println(num2 / num3 + "/" + num1 / num3);
			}

		}
	}

	public int gbs(int n1, int n2) {
		int sum = n1 * n2, i;
		for (i = 1; i <= sum; i++) {
			if (i % n1 == 0 && i % n2 == 0)
				break;
		}
		return i;
	}

	public int gys(int n1, int n2) {
		int r;
		while (n2 > 0) {
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		return n1;
	}

}