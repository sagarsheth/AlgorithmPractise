import java.util.*;

public class GCD {
	public static int gcd_naive(int a, int b) {
		if (a <= 1 || b <= 1) {
			return 1;
		}
		if (a == b)
			return b;
		int result = 0;
		int value = b;
		if (a > b) {
			value = a;
		}
		for (int i = 1; i < value; i++) {
			if (a % i == 0 && b % i == 0) {
				result = i;
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(gcd_naive(a, b));
	}
}
