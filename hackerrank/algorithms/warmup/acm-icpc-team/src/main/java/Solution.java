import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		Pattern pattern = Pattern.compile("\\d");
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] matrixKnowledge = new int[n][m];
		String knowledge = null;
		String[] knowledgeUnits = null;
		for (int i = 0; i < n; i++) {
			knowledge = in.next();
			knowledgeUnits = pattern.split(knowledge);
			for (int j = 0; j < knowledgeUnits.length; j++) {
				matrixKnowledge[i][j] = Integer.parseInt(knowledgeUnits[j]);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrixKnowledge[i][j]);
			}
			System.out.println();
		}
		
	}
}
