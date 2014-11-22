import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		long n = in.nextInt();
		long m = in.nextInt();

		long sum = 0;
		for (int i = 0; i < m; i++) {
			long a = in.nextInt();
			long b = in.nextInt();
			long k = in.nextInt();

			sum += ((b - a) + 1) * k;
		}
		
		System.out.println((long)sum/n);
	}

}
