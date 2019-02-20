package week3;

import java.util.Scanner;

public class Change {

	public static int getChange(int m) {
		if (m == 5 || m == 10) {
			return 1;
		}

		if (m < 5) {
			return m;
		}

		int change = 0;
		while (m != 0) {
			if (m >= 10) {
				m = m - 10;
				change++;
			} else if (m >= 5) {
				m = m - 5;
				change++;
			} else {
				m = m - 1;
				change++;
			}
		}
		return change;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		System.out.println(getChange(m));

	}
}
