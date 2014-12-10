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
		if (ar.length > 1) {
			for (int i = 1; i < ar.length; i++) {
				for (int j = 0; j < i; j++) {
					if (ar[j] > ar[i]) {
						int aux = ar[j];
						ar[j] = ar[i];
						ar[i] = aux;
					}
				}
				print(ar);
			}
		} else {
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
