import java.io.*;
import java.util.*;

public class Solution {
	

    public static void main(String[] args) throws FileNotFoundException {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int t = sc.nextInt();
    	
    	int[] widths = new int[n];
    	for (int i = 0; i < widths.length; i++) {
			widths[i] = sc.nextInt();
		}
    	
    	int count = 0;
    	while (count < t) {
        	int i = sc.nextInt();
        	int j = sc.nextInt();

        	System.out.println(getIdealVehicle(widths, i, j));
        	
        	count++;
    	}
    	
    	sc.close();
    }

	static int getIdealVehicle(int[] widths, int i, int j) {
    	int[] pos = Arrays.copyOfRange(widths, i, j+1);
    	int min = 4;
    	for (int k = 0; k < pos.length; k++) {
			if (pos[k] < min) {
				min = pos[k];
			}
		}
		return min;
	}
}