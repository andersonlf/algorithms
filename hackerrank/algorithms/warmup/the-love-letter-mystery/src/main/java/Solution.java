import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		
		while (count < t) {
			String word = in.next();
			System.out.println(Solution.getNumOperations(word));
			count++;
		}
		
		in.close();
	}

	public static int getNumOperations(String word) {
		int numOperations = 0;
		char[] cword = word.toCharArray();
		
		for (int i = 0; i < cword.length/2; i++) {
			int n = calculate(cword[i], cword[cword.length-i-1]);
			
			numOperations += n;
		}
		
		return numOperations;
	}

	private static int calculate(char c, char d) {
		List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
		return Math.abs(alphabet.indexOf(d) - alphabet.indexOf(c));
	}
}
