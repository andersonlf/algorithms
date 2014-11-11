import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
			}

			process(a);
		}
	}

	private static void process(int[] a) {
		Set<Integer> divisors = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			discoverDivisors(a[i], divisors);
		}
		
		for (int i = 0; i < a.length; i++) {
			testDivisors(a[i], divisors);
		}
		
		System.out.println(divisors.size() > 0 ? "NO" : "YES");
	}

	private static void testDivisors(int i, Set<Integer> divisors) {
		Set<Integer> toRemove = new TreeSet<Integer>();
		for (Iterator<Integer> iterator = divisors.iterator(); iterator.hasNext();) {
			Integer j = iterator.next();
			
			if ( i % j != 0) {
				toRemove.add(j);
			}
		}
		
		divisors.removeAll(toRemove);
	}

	private static void discoverDivisors(int i, Set<Integer> divisors) {
		for (int j = 2; j <= i; j++) {
			if ( i % j == 0) {
				divisors.add(j);
			}
		}
	}

}
