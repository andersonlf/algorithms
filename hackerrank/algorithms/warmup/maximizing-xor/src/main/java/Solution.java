import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(maxXor(in.nextInt(), in.nextInt()));
		
		in.close();
	}

	public static Object maxXor(int l, int r) {
		int max = 0;
		
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				int x = i ^ j;
				
				if (max < x) {
					max = x;
				}
			}
		}
		
		return max;
	}
}
