import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() throws Exception {
    	Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
    	Scanner out = new Scanner(new File("src/test/resources/test1/out.dat"));

    	int n = in.nextInt();
    	int t = in.nextInt();
    	
    	int[] widths = new int[n];
    	for (int i = 0; i < widths.length; i++) {
			widths[i] = in.nextInt();
		}
		
    	int count = 0;
    	while (count < t) {
        	int i = in.nextInt();
        	int j = in.nextInt();

        	Assert.assertEquals(out.nextInt(), Solution.getIdealVehicle(widths, i, j));
        	
        	count++;
    	}
    	
    	in.close();
    	out.close();
	}
	
	@Test
	public void test2() throws Exception {
    	Scanner in = new Scanner(new File("src/test/resources/test2/in.dat"));
    	Scanner out = new Scanner(new File("src/test/resources/test2/out.dat"));

    	int n = in.nextInt();
    	int t = in.nextInt();
    	
    	int[] widths = new int[n];
    	for (int i = 0; i < widths.length; i++) {
			widths[i] = in.nextInt();
		}
		
    	int count = 0;
    	while (count < t) {
        	int i = in.nextInt();
        	int j = in.nextInt();

        	Assert.assertEquals(out.nextInt(), Solution.getIdealVehicle(widths, i, j));
        	
        	count++;
    	}
    	
    	in.close();
    	out.close();
	}

}
