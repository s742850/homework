package homework;

import java.util.Scanner;

public class Example42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String st = sc.next();
			int len = st.length();
			int sum = 0;
			Boolean correct = true;
			for (int i = 0; i < len; i++) {
				if (st.charAt(i) >= 65 && st.charAt(i) <= 90) {
					sum += st.charAt(i) - 64;
				} else {
					if (st.charAt(i) >= 97 && st.charAt(i) <= 122) {
						sum += st.charAt(i) - 96;
					} else {
						correct = false;
						break;
					}
				}
			}
			if (correct)
				System.out.println(sum);
			else
				System.out.println("Fail");
		}

	}

}
