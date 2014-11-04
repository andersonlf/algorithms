import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		while (count < t) {
			System.out.println(Solution.calculate(in.nextInt()));
			count++;
		}
		in.close();
	}

	public static long calculate(long k) {
		if (k == 2) {
			return 1;
		} else if (k % 2 == 0) {
			return (long) Math.pow(k/2, 2);
		} else if (k % 2 != 0) {
			return k/2 * ((long)k/2 + 1);
		}

		return 0;
	}
}
