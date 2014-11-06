import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int _a;
		_a = in.nextInt();
		int _b;
		_b = in.nextInt();
		int sum;
		sum = solveMeFirst(_a, _b);
		System.out.println(sum);
	}

	private static int solveMeFirst(int a, int b) {
		return a + b;
	}
}
