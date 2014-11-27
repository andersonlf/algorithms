import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int s = in.nextInt();
		
		int[] array = new int[s];
		for (int i = 0; i < s; i++) {
			array[i] = in.nextInt();
		}
		
		sort(array);
	}

	private static void sort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int a = array[i];
			int b = array[i-1];
			
			if (b > a) {
				array[i] = b;
			}
			
			print(array);
			System.out.println();
		}
	}

	private static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}
