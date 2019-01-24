package homework;

import java.util.Scanner;

public class Example37 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String s = in.nextLine();
			StringBuffer sb = new StringBuffer();
			sb.append(s);
			sb.reverse();
			String sv = sb.toString();
			if (sv.equals(s)) {
				int n = Integer.parseInt(s);
				int count = 0;
				for (int i = 1; i <= n; i++) {
					if (n % i == 0)
						count++;
				}
				if (count == 2)
					System.out.print("YES");
				else
					System.out.print("NO");
			} else {
				System.out.print("NO");
			}
		}
	}

}
