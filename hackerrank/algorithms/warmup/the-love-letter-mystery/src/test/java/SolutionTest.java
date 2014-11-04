import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() throws Exception {
		
		Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
		Scanner out = new Scanner(new File("src/test/resources/test1/out.dat"));
		
		int t = in.nextInt();
		int count = 0;
		
		while (count < t) {
			String word = in.next();
			
			Assert.assertEquals(out.nextInt(), Solution.getNumOperations(word));
			
			count++;
		}
		
		in.close();
		out.close();
	}
}
