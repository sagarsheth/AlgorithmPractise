import java.util.*;

public class FibonacciLastDigit {
    public static int getFibonacciLastDigitNaive(int n) {
    	if (n <= 1)
			return n;
		int[] arry = new int[n + 1];
		arry[0] = 0;
		arry[1] = 1;
		for (int i = 2; i <= n; i++) {
			arry[i] = arry[i - 1] + arry[i - 2];
			arry[i] = arry[i] % 10;
			// System.out.println("arry[" + i + "] = " + arry[i]);
		}
		return arry[n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

