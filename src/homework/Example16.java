package homework;

import java.util.Scanner;

public class Example16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String st = sc.nextLine();
			int len = st.length();
			int[] count = new int[27];
			for (int i = 0; i < len; i++) {
				if (st.charAt(i) >= 65 && st.charAt(i) <= 90)
					count[st.charAt(i) - 64]++;

				if (st.charAt(i) >= 97 && st.charAt(i) <= 122)
					count[st.charAt(i) - 96]++;

			}
			for (int i = 1; i < 27; i++) {
				if (count[i] != 0) {
					char ch = (char) (i + 96);
					System.out.printf("(" + ch + ",%d)", count[i]);
				}
			}
			System.out.println();
		}

	}
}
