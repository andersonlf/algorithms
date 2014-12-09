import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int s = in.nextInt();
		int[] ar = new int[s];
		
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		
		process(ar);
	}

	private static void process(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int a = ar[i];
			for (int j = i + 1; j < ar.length; j++) {
				int b = ar[j];
				if (a > b) {
					ar[j] = a;
					ar[i] = b;
					break;
				}
			}
			print(ar);
		}
	}

	private static void print(int[] ar) {
		StringBuilder sb = new StringBuilder();
		for (int i : ar) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
