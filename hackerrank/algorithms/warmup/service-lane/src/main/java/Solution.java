import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner sc) {
		int n = sc.nextInt();
		int t = sc.nextInt();

		int[] widths = new int[n];
		for (int i = 0; i < widths.length; i++) {
			widths[i] = sc.nextInt();
		}

		for (int count = 0; count < t; count++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.println(getIdealVehicle(widths, i, j));
		}
	}

	private static int getIdealVehicle(int[] widths, int i, int j) {
		int[] pos = Arrays.copyOfRange(widths, i, j + 1);
		int min = 4;
		for (int k = 0; k < pos.length; k++) {
			if (pos[k] < min) {
				min = pos[k];
			}
		}
		return min;
	}
}