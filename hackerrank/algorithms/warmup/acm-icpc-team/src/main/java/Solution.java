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
		discoverTeamsThatCanKnowTheMaximumNumberOfTopics(matrixKnowledge, n, m);
	}

	private static void discoverTeamsThatCanKnowTheMaximumNumberOfTopics(int[][] matrixKnowledge, int n, int m) {
		int countTeamKnowMaxTopics = 0;
		int[] personN = new int[m];
		int[] personM = new int[m];
		
		for (int i = 0; i < n; i++) {
			personN = matrixKnowledge[i];
			
			for (int j = i; j < n; j++) {
				personM = matrixKnowledge[j];
						
				boolean allKnowledge = true;
				for(int z = 0; z < m; z++) {
					int know = personN[z] + personM[z];
					
					if (know < 1) {
						allKnowledge = false;
						break;
					}
				}
				
				if (allKnowledge) {
					countTeamKnowMaxTopics++;
				}
			}
		}
		
		System.out.println(countTeamKnowMaxTopics);
	}

	private static void discoverNumMaxTopics(int[][] matrixKnowledge, int n, int m) {
		int maxTopics = 0;
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
		System.out.println(maxTopics);
	}
}
