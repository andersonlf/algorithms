import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		long t = in.nextLong();
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			isFibo(n);
		}
	}

	private static void isFibo(long n) {
		fibonacci(0l, 1l, n);
	}

	private static void fibonacci(long a, long b, long n) {
		long next = a + b;
		
		if (next == n) {
			System.out.println("IsFibo");
		} else if (next > n) {
			System.out.println("IsNotFibo");
		} else {
			fibonacci(b, next, n);
		}
	}
}
