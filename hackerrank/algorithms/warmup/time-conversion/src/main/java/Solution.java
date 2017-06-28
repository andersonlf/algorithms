import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		solve(in);
		in.close();
	}

	public static void solve(Scanner in) {
    String s = in.next();
    String result = timeConversion(s);
    System.out.println(result);
	}

  private static String timeConversion(String s) {
    String[] hours = s.substring(0, 8).split(":");
    String meridium = s.substring(8);

    if (meridium.equalsIgnoreCase("PM")) {
      if (!hours[0].equalsIgnoreCase("12")) {
        hours[0] = new Integer((Integer.parseInt(hours[0]) + 12)).toString();
      }
    } else {
      if (hours[0].equalsIgnoreCase("12")) {
        hours[0] = "00";
      }
    }
    
    return hours[0] + ":" + hours[1] + ":" + hours[2];
    
  }
}
