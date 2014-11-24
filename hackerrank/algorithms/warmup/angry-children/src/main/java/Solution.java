import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		long n = in.nextLong();
		long k = in.nextLong();

		List<Long> packets = new ArrayList<Long>((int)n);
		for (int i = 0; i < n; i++) {
			long j = in.nextLong();
			
			packets.add(j);
		}
		
		process(packets, n, k);
	}

	private static void process(List<Long> packets, long n, long k) {
		List<Long> unfairness = new ArrayList<Long>();
		Collections.sort(packets);
		for (int i = 0; i <= k; i++) {
			long min = packets.get(i);
			long max = packets.get(i+(int)k-1);
			unfairness.add(max - min);
		}
		Collections.sort(unfairness);
		System.out.println(unfairness.get(0));
	}
}
