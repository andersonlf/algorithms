import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int n = in.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		process(array);
	}

	private static void process(int[] a) {
		int answer = 0;
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				sum = doSum(a, i, j);
				
				if (sum < 0) {
					answer++;
					sum = 0;
				}
			}
		}
		
		System.out.println(answer);
	}

	private static int doSum(int[] a, int i, int j) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += a[k];
		}
		return sum;
	}
}
