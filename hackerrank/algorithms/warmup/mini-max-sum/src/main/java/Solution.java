import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
	  int[] numbers = new int[5];
	  for(int i = 0; i < 5; i++) {
	    numbers[i] = in.nextInt();
	  }
	  Arrays.sort(numbers);
	  
	  long l = 0l;
	  for(int i = 0; i < 4; i++) {
	    l += numbers[i];
	  }
	  
	  long u = 0l;
	  for(int i = 4; i > 0; i--) {
      u += numbers[i];
    }

	  System.out.println(l + " " + u);
	}
}
