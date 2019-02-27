import java.util.*;

public class FibonacciSumLastDigit {
	public static long getFibonacciSumNaive(long n) {
		if (n <= 2)
			return n;

		return getFibonacciHugeNaive(n, 10);

	}

	public static long getFibonacciHugeNaive(long n, long m) {
		long remainder = n % get_pisano_period(m);

		long first = 0;
		long second = 1;

		long res = remainder;

		long sum = remainder;

		for (int i = 1; i < remainder; i++) {
			res = (first + second) % m;
			first = second;
			second = res;
			sum = sum + res;
			sum = sum % 10;
		}

		return res % m;
	}

	public static long get_pisano_period(long m) {
		long value = 0;
		long a = 0, b = 1, c = a + b;
		for (int i = 0; i < m * m; i++) {
			c = (a + b) % m;
			a = b;
			b = c;
			if (a == 0 && b == 1) {
				value = i + 1;
				break;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s = getFibonacciSumNaive(n);
		System.out.println(s);
	}
}
