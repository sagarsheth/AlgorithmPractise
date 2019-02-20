
package week3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DotProduct {
	private static long maxDotProduct(int[] a, int[] b) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			a1.add(a[i]);
			b1.add(b[i]);
//			long val = readLong("a.txt", -1);
//			if (val == 10 || val == -1) {
//				System.out.println("a:" + a[i] + "; b:" + b[i]);
//			}
		}
		Collections.sort(a1);
		Collections.sort(b1);
		long result = 0;
		for (int i = 0; i < a.length; i++) {
			result += (long) a1.get(i) * (long) b1.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
//		long vvv = readLong("a.txt", 0);
//		try {
//			writeLong("a.txt", vvv++);
//		} catch (Exception e) {
//
//		}
		System.out.println(maxDotProduct(a, b));
	}

	public static void writeLong(String filename, long number) throws IOException {
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
			dos.writeLong(number);
		}
	}

	public static long readLong(String filename, long valueIfNotFound) {
		if (!new File(filename).canRead())
			return valueIfNotFound;
		InputStream stream = null;
		try {
			stream = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (DataInputStream dis = new DataInputStream(stream)) {
			return dis.readLong();
		} catch (IOException ignored) {
			return valueIfNotFound;
		}
	}
}
