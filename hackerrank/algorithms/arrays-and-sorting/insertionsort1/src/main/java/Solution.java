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
		int aux = array[array.length - 1];
		for (int j = array.length - 2; j > -1; j--) {
			if (aux < array[j]) {
				array[j + 1] = array[j];
				print(array);
			} else {
				array[j + 1] = aux;
				break;
			}
		}
		print(array);
	}

	private static void print(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i : array) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
