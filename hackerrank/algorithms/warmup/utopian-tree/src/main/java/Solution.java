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
			int n = in.nextInt();
			System.out.println(Solution.calculateCycles(n));
		}
	}

	private static Object calculateCycles(int n) {
		int height = 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				height = 2 * height;
			} else {
				height = height + 1;
			}
		}

		return height;
	}
}
