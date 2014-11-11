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
			String word = in.next();
			process(word);
		}
	}

	private static void process(String word) {
		int operations = 0;
		char[] c = word.toCharArray();
		char fc = c[0];
		for (int i = 1; i < c.length; i++) {
			if (fc == c[i]) {
				operations++;
			}
			fc = c[i];
		}
		
		System.out.println(operations);
	}
}
