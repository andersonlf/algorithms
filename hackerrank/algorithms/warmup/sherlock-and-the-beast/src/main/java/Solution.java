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
			
			System.out.println(calculateDecentNumber(n, 0));
		}
	}

	private static String calculateDecentNumber(int n, int z) {
		String decentNumber = "";
		
		if (n % 3 == 0 && z % 5 == 0) {
			for (int i = 0; i < n; i++) {
				decentNumber += "5";
			}
			for (int i = 0; i < z; i++) {
				decentNumber += "3";
			}
			return decentNumber;
		} 

		if (n % 5 == 0 && z % 3 == 0) {
			for (int i = 0; i < n; i++) {
				decentNumber += "3";
			}
			for (int i = 0; i < z; i++) {
				decentNumber += "5";
			}
			return decentNumber;
		} 
		
		if (n == 1) {
			decentNumber = "-1";
			return decentNumber;
		}
		
		return calculateDecentNumber(n-1, z + 1);
	}
}
