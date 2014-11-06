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
		Map<Character, Integer> elements = getAllElements();
		Map<Character, Integer> elementsOfStone = getAllElements();
		int result = 0;
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String stone = in.next();
			
			char[] cstone = stone.toCharArray();
			for (int j = 0; j < cstone.length; j++) {
				elementsOfStone.put(cstone[j], 1);
			}
			
			for (Entry<Character, Integer> pair : elementsOfStone.entrySet()) {
				if (pair.getValue() == 1) {
					elements.put(pair.getKey(), elements.get(pair.getKey()) + 1);
				}
			}
			
			elementsOfStone = getAllElements();
		}
		
		for (Entry<Character, Integer> pair : elements.entrySet()) {
			if (pair.getValue().equals(n)) {
				result++;
			}
		}
		
		System.out.println(result);
	}

	private static Map<Character, Integer> getAllElements() {
		Map<Character, Integer> elements = new HashMap<Character, Integer>();
		
		elements.put('a', 0);
		elements.put('b', 0);
		elements.put('c', 0);
		elements.put('d', 0);
		elements.put('e', 0);
		elements.put('f', 0);
		elements.put('g', 0);
		elements.put('h', 0);
		elements.put('i', 0);
		elements.put('j', 0);
		elements.put('k', 0);
		elements.put('l', 0);
		elements.put('m', 0);
		elements.put('n', 0);
		elements.put('o', 0);
		elements.put('p', 0);
		elements.put('q', 0);
		elements.put('r', 0);
		elements.put('s', 0);
		elements.put('t', 0);
		elements.put('u', 0);
		elements.put('v', 0);
		elements.put('w', 0);
		elements.put('x', 0);
		elements.put('y', 0);
		elements.put('z', 0);
		
		return elements;
	}
}
