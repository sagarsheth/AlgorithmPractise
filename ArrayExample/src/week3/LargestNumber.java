package week3;

import java.util.*;

public class LargestNumber {
	private static String largestNumber(String[] a) {
		for (int i = 0; i < a.length; i++) {
			int nextDigit = 0;
			int firstDigit = Integer.parseInt(a[i].substring(0, 1));
			for (int j = i + 1; j < a.length; j++) {
				nextDigit = Integer.parseInt(a[j].substring(0, 1));
				if (firstDigit > nextDigit) {

				}
			}
		}
		// write your code here
		String result = "";
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.next();
		}
		System.out.println(largestNumber(a));
	}
}
