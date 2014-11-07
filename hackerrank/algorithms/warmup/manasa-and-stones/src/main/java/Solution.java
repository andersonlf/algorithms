import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
			int a = in.nextInt();
			int b = in.nextInt();
			
			calculateLastStone(n, a, b);
			System.out.println();
		}
	}

	private static void calculateLastStone(int n, int a, int b) {
		Set<Integer> lastStones = new TreeSet<Integer>();
		
		int pos = n - 1;
		
		for (int i = pos, j = 0; i >= 0; i--, j++) {
			lastStones.add(i*a + j*b);
		}
		
		for (Integer s : lastStones) {
			System.out.print(s + " ");
		}
	}


}
