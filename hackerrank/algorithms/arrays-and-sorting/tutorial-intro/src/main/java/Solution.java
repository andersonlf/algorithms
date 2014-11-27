import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int v = in.nextInt();
		int n = in.nextInt();
		
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			array.add(in.nextInt());
		}
		
		System.out.println(array.indexOf(v));
	}
}
