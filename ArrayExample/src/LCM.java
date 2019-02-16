import java.util.*;

public class LCM {
	public static String lcm_naive(long a, long b) {
		String val = String.valueOf(a * b / gcd_naive(a, b));
		return val;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm_naive(a, b));
	}

	public static long gcd_naive(long a, long b) {
		if (a == 0)
			return b;

		long gcd = (long) gcd_naive(b % a, a);
		return gcd;
	}
}
