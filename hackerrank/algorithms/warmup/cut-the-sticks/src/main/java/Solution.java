import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int n = in.nextInt();
		int[] sticks = new int[n];
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = in.nextInt();
		}
		cutSticks(sticks);
	}

	private static void cutSticks(int[] sticks) {
		int min = getSmallerStick(sticks);
		int count = cutSticks(sticks, min);
		if (count != 0) {
			System.out.println(count);
			cutSticks(sticks);
		}
	}

	private static int getSmallerStick(int[] sticks) {
		int min = 1001;
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] < min && sticks[i] != 0) {
				min = sticks[i];
			}
		}
		return min;
	}

	private static int cutSticks(int[] sticks, int min) {
		int count = 0;
		for (int i = 0; i < sticks.length; i++) {
			if (sticks[i] >= min) {
				sticks[i] = sticks[i] - min;
				count++;
			}
		}
		return count;
	}

}
