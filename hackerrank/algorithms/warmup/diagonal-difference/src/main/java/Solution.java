import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int n = in.nextInt();
		
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
		  for (int j = 0; j < n; j++) {
		    matrix[i][j] = in.nextInt();
		  }
		}
		
		process(matrix, n);
	}

  private static void process(int[][] matrix, int n) {
    int diga = 0;
    for (int i = 0; i < n; i++) {
      diga += matrix[i][i];
    }
    
    int digb = 0;
    for (int i = 0; i < n; i++) {
      digb += matrix[i][n-1-i];
    }
    
    System.out.println(Math.abs(diga - digb));
  }
}
