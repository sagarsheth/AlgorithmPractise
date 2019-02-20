
package week3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FractionalKnapsack {
	static double getOptimalValue(int capacity, int[] values, int[] weights) {
		if (capacity == 0 || weights.length == 0 || values.length == 0) {
			return 0;
		}
		System.out.println("Bag capacity: " + weights.length);
		if (weights.length == 1 && capacity > weights[0]) {
			return values[0];
		}
		// System.out.println("Bag capacity: " + capacity);
		double value = 0;

		int[] newWrights = new int[weights.length - 1];
		int[] newvalues = new int[values.length - 1];

		int weight = 0;
		int value1 = 0;
		double rate = 0;

		for (int i = 0; i < weights.length; i++) {
			double newrate = ((double) values[i] / (double) weights[i]);
			// System.out.println("new rate: " + newrate + "; old rate: " + rate);
			if (newrate > rate) {
				// System.out.println("new rate: is greater than old rate: hence swap ");
				rate = newrate;
				if (weight != 0) {
					newWrights[i - 1] = weight;
					newvalues[i - 1] = value1;
				}
				// System.out.println("new weight: " + weights[i] + "; old weight: " + weight);
				// System.out.println("new value: " + values[i] + "; old weight: " + value1);
				weight = weights[i];
				value1 = values[i];
			} else {
				newWrights[i - 1] = weights[i];
				newvalues[i - 1] = values[i];
			}
		}

//		for (int i = 0; i < newWrights.length; i++) {
//			System.out.println("new weight: " + newWrights[i]);
//			System.out.println("new values: " + newvalues[i]);
//		}

		while (capacity > 0 && weight > 0) {
			value = value + rate;
			capacity--;
			weight--;
			// System.out.println("capacity: " + capacity + "; value: " + value + ";
			// weight:" + weight);
		}

		// System.out.println("value of loot: " + value + "; capacity Left in Bag: " +
		// capacity);
		// System.out.println("***********************************************************");

		value = value + getOptimalValue(capacity, newvalues, newWrights);

//		DecimalFormat df = new DecimalFormat("#.#####");
//		df.setRoundingMode(RoundingMode.CEILING);
		// System.out.println("Final loot value: " + df.format(value));
		return value;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
//		DecimalFormat df = new DecimalFormat("#.####");
//		df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(getOptimalValue(capacity, values, weights));
	}

	private static BigDecimal truncateDecimal(double x, int numberofDecimals) {
		if (x > 0) {
			return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
		} else {
			return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
		}
	}
}
