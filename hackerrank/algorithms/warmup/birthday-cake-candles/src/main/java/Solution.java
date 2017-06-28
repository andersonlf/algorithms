import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
    int n = in.nextInt();
    int[] candles = new int[n];
    for(int i = 0; i < n; i++){
        candles[i] = in.nextInt();
    }
    int result = birthdayCakeCandles(n, candles);
    System.out.println(result);
	}

  private static int birthdayCakeCandles(int n, int[] candles) {
    Arrays.sort(candles);
    int sum = 0;
    int lastHeight = candles[n-1];
    for(int i = n-1; i > -1; i--) {
      int x = candles[i];
      if (x == lastHeight) {
        sum++;
      }
    }
    
    return sum;
  }
}
