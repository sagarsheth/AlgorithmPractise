import java.util.Scanner;

public class Fibonacci {

	public static long calc_fib(int n) {
		if (n <= 1)
			return n;
		long[] arry = new long[n + 1];
		arry[0] = 0;
		arry[1] = 1;
		for (int i = 2; i <= n; i++) {
			arry[i] = arry[i - 1] + arry[i - 2];
			// System.out.println("arry[" + i + "] = " + arry[i]);
		}
		return arry[n];
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println(calc_fib(n));
	}
}
