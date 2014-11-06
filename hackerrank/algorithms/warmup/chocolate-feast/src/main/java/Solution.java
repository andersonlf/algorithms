import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			long n = in.nextLong();
			long c = in.nextLong();
			long m = in.nextLong();
			
			calculate(n, c, m);
		}
	}

	private static void calculate(long n, long c, long m) {
		long chocolates = n / c;
		long wrappers = chocolates / m;
		
		System.out.println(chocolates + wrappers + calculateWrappers(chocolates % m + wrappers, m));
	}

	private static long calculateWrappers(long wrappers, long m) {
		if (wrappers < m) {
			return 0;
		}
		long chocolates = wrappers / m;
		return chocolates + calculateWrappers(wrappers % m + chocolates, m) ;
	}
}
