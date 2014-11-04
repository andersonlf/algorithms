import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
		Scanner out = new Scanner(new File( "src/test/resources/test1/out.dat"));
		int t = in.nextInt();
		int count = 0;
		while (count < t) {
			long k = in.nextLong();
			Assert.assertEquals(out.nextInt(), Solution.calculate(k));
			count++;
		}
		in.close();
		out.close();
	}

	@Test
	public void test2() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test2/in.dat"));
		Scanner out = new Scanner(new File( "src/test/resources/test2/out.dat"));
		int t = in.nextInt();
		int count = 0;
		while (count < t) {
			long k = in.nextLong();
			Assert.assertEquals(out.nextInt(), Solution.calculate(k));
			count++;
		}
		in.close();
		out.close();
	}
}
