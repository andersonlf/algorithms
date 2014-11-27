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
		int answer = 0;
		String nString = Long.toString(n);
		char[] digits = nString.toCharArray();
		for (char c : digits) {
			int digit = Integer.valueOf(Character.toString(c));
			
			if (digit == 0) {
				continue;
			} else if (n % digit == 0) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
