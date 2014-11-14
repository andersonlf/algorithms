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
			int n = in.nextInt();
			
			calculateDecentNumber(n);
		}
	}

	private static void calculateDecentNumber(int n) {
		StringBuilder sb = new StringBuilder();
		
		if (n < 3) {
			sb.append("-1");
//		} else if (n == 3 || n % 3 == 0) {
//			write5(n, sb);
//		} else if (n == 5 || n % 5 == 0) {
//			write3(n, sb);
		} else {
			for (int i = 0; i < n; i++) {
				
				// qnt 5  
				int n5 = n - i;
				int n3 = i;
				
				if ((n3 % 5 == 0 && n5 % 3 == 0) || n3 % 5 == 0 || n5 % 3 == 0) {
					write5(n5, sb);
					write3(n3, sb);
				}
				
			}
		}
		
		System.out.println(sb.toString());
	}
	
	private static void write3(int n, StringBuilder sb) {
		write("3", n, sb);
	}

	private static void write5(int n, StringBuilder sb) {
		write("5", n, sb);
	}
	
	private static void write(String value, int n, StringBuilder sb) {
		for (int i = 0; i < n; i++) {
			sb.append(value);
		}
	}

}