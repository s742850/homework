package homework;

import java.util.Date;
import java.util.Scanner;

public class Example1 {

	static int compare(String st1, String st2) {
		Date a = new Date(st1);
		Date b = new Date(st2);
		int result = a.compareTo(b);
		return result;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String st1 = sc.next();
			String st2 = sc.next();
			int result = compare(st1, st2);
			if (result == 0)
				System.out.println("Same");
			if (result < 0)
				System.out.println("Before");
			if (result > 0)
				System.out.println("After");
		}
	}
}
