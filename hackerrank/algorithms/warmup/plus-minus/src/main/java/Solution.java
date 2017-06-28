import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
	  int n = in.nextInt();
	  int positives = 0;
	  int negatives = 0;
	  int zeroes = 0;
	  
	  int x = 0;
	  for (int i = 0; i < n; i++) {
	    x = in.nextInt();
	    
	    if (x == 0) {
	      zeroes++;
	    } else if (x > 0) {
	      positives++;
	    } else {
	      negatives++;
	    }
	  }
	  
	  System.out.println(new BigDecimal((double)positives/n).setScale(6, RoundingMode.HALF_DOWN));
	  System.out.println(new BigDecimal((double)negatives/n).setScale(6, RoundingMode.HALF_DOWN));
	  System.out.println(new BigDecimal((double)zeroes/n).setScale(6, RoundingMode.HALF_DOWN));
	  
	}
}
