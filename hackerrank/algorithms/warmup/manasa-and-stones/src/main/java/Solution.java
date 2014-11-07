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
		Set<Integer> possibleLastStones = new TreeSet<Integer>();
		
		possibleLastStones.add(getPossible1(n, a));
		possibleLastStones.add(getPossible1(n, a, b));
		// testar casos médios:
		// - sempre a ate ultima pedra com b
		// - sempre a ate penultima pedra com b
		// ...
		possibleLastStones.add(getPossible1(n, b, a));
		possibleLastStones.add(getPossible1(n, b));
		
		for (Integer s : possibleLastStones) {
			System.out.print(s + " ");
		}
	}

	private static Integer getPossible1(int n, int a, int b) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				count = count + a;
			} else {
				count = count + b;
			}
		}
		return count;
	}

	private static Integer getPossible1(int n, int a) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			count = count + a;
		}
		return count;
	}
}
