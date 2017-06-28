import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
	  int n = in.nextInt();

	  String line = "";
	  for (int i = 0; i < n; i++) {
	    int spaces = n - (i+1);
	    int charp = n - spaces;
	    
	    for (int j = 0; j < spaces; j++) {
	      line = line + " ";
	    }
      for (int j = 0; j < charp ; j++) {
        line = line + "#";
      }
      
      System.out.println(line);
      line = "";
	  }
	  
	}
}
