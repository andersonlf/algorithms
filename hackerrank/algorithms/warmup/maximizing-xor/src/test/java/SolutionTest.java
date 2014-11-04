import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() throws Exception {
		
		Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
		Scanner out = new Scanner(new File("src/test/resources/test1/out.dat"));
		
		int l = in.nextInt();
		int r = in.nextInt();
		
		Assert.assertEquals(out.nextInt(), Solution.maxXor(l, r));
		
		in.close();
		out.close();
	}
}
