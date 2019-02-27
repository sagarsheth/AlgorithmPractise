package week3;

import java.util.*;

public class DifferentSummands {
	public static List<Integer> optimalSummands(int n) {
		List<Integer> summands = new ArrayList<Integer>();
		if (n <= 2) {
			summands.add(n);
			return summands;
		}
		int index = 1;
		while (n >= index) {
//			if (summands.contains(index) == false) {
//				System.out.println("index: " + index + " added to the list");
//				System.out.println("***************************************t");
				n = n - index;
				summands.add(index);
//			}
			index++;
//			System.out.println("index: " + index);
//			System.out.println("n: " + n);
//			System.out.println("counter :" + counter);
		}
		if (n != 0) {
			int size = summands.size() - 1;
			int previous = summands.get(size) + n;
			summands.remove(size);
//			System.out.println("n: " + n);
//			System.out.println("previous :" + previous);
			// previous = previous + n;
			summands.add(previous);
		}
//		for (Integer summand : summands) {
//			System.out.print(summand + " ");
//		}
		return summands;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> summands = optimalSummands(n);
		System.out.println(summands.size());
		for (Integer summand : summands) {
			System.out.print(summand + " ");
		}
	}
}
