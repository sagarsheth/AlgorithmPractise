
//package week4;

import java.util.*;
import java.io.*;

public class MajorityElement {
	public static int getMajorityElement(int[] a, int left, int right) {
		if (left == right) {
			return -1;
		}
		if (a.length == 1) {
			return 1;
		}
		List<Integer> value = new ArrayList<Integer>();
		List<Integer> time = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (value.contains(a[i])) {
				int index = value.indexOf(a[i]);
//				System.out.println("Add " + a[i] + ", times = " + (time.get(index) + 1));
				time.add(index, time.get(index) + 1);
			} else {
				value.add(a[i]);
				time.add(1);
//				System.out.println("Add " + a[i] + ", times = 1");
			}
		}
		int half = a.length / 2;
//		System.out.println("half " + half);
		for (int i = 0; i < time.size(); i++) {
			if (time.get(i) > half) {
				return 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		if (getMajorityElement(a, 0, a.length) != -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
