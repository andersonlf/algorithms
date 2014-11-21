import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] matrixKnowledge = new int[n][m];
		String knowledge = null;
		char[] knowledgeUnits = null;
		for (int i = 0; i < n; i++) {
			knowledge = in.next();
			knowledgeUnits = knowledge.toCharArray();
			for (int j = 0; j < knowledgeUnits.length; j++) {
				matrixKnowledge[i][j] = Integer.parseInt(knowledgeUnits[j]+"");
			}
		}
		
		process(matrixKnowledge, n, m);
	}

	private static void process(int[][] matrixKnowledge, int n, int m) {
		discoverNumMaxTopics(matrixKnowledge, n, m);
	}

	private static void discoverNumMaxTopics(int[][] matrixKnowledge, int n, int m) {
		int maxTopics = 0;
		int numTeams = 0;
		int[] knowledgePersonA = null;
		int[] knowledgePersonB = null;
		for (int i = 0; i < n; i++) {
			knowledgePersonA = matrixKnowledge[i];
			for (int j = i+1; j < n; j++) {
				int maxTopicsTeam = 0;
				knowledgePersonB = matrixKnowledge[j];
				for (int t = 0; t < m; t++) {
					if (knowledgePersonA[t] + knowledgePersonB[t] > 0) {
						maxTopicsTeam++;
					}
				}
				if(maxTopicsTeam > maxTopics) {
					maxTopics = maxTopicsTeam;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			knowledgePersonA = matrixKnowledge[i];
			for (int j = i+1; j < n; j++) {
				int topicsTeam = 0;
				knowledgePersonB = matrixKnowledge[j];
				for (int t = 0; t < m; t++) {
					if (knowledgePersonA[t] + knowledgePersonB[t] > 0) {
						topicsTeam++;
					}
				}
				if(maxTopics == topicsTeam) {
					numTeams++;
				}
			}
		}
		
		System.out.println(maxTopics);
		System.out.println(numTeams);
	}
}
