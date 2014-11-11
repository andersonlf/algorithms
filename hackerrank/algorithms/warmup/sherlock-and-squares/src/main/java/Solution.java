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
			int a = in.nextInt();
			int b = in.nextInt();
			
			process(a, b);
		}
	}

	private static void process(int a, int b) {
		int count = 0;
		
		double x = 0;
		for (int i = a; i <= b; i++) {
			x = Math.sqrt(i);
			if ((x == Math.floor(x)) && !Double.isInfinite(x)) {
				count++;
				break;
			}
		}		
		
		while (Math.pow(x + 1, 2) <= b) {
			count++;
			x = x + 1;
		}
		
//		for (int i = a; i <= b; i++) {
//			double x = Math.sqrt(i);
//			if ((x == Math.floor(x)) && !Double.isInfinite(x)) {
//				count++;
//			}
//		}
		
		System.out.println(count);
	}
}
