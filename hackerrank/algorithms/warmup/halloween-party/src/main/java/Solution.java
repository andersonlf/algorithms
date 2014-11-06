import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int t = in.nextInt();
		int count = 0;
		while (count < t) {
			System.out.println(Solution.calculate(in.nextInt()));
			count++;
		}
	}

	private static long calculate(long k) {
		return k / 2 * (((long) k / 2 + k % 2));
	}

}
