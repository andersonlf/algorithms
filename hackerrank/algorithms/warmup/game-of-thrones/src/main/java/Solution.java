import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
		System.out.println(isPossiblePalidrome(in.next()));
	}

	private static String isPossiblePalidrome(String text) {
		Map<Character, Long> charactersByQuantity = new HashMap<Character, Long>();
		boolean alreadyOddCharacters = false;

		char[] characters = text.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			char c = characters[i];
			charactersByQuantity.put(c, charactersByQuantity.get(c) == null ? 1
					: charactersByQuantity.get(c) + 1);
		}

		for (Entry<Character, Long> pair : charactersByQuantity.entrySet()) {
			boolean p = pair.getValue() % 2 == 0;

			if (!p && !alreadyOddCharacters) {
				alreadyOddCharacters = true;
			} else if (!p && alreadyOddCharacters) {
				return "NO";
			}
		}

		return "YES";
	}

}
