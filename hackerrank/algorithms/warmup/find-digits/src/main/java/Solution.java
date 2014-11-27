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
			process(n);
		}
	}

	private static void process(long n) {
		System.out.println(n);
	}
}
