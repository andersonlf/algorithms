import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
		Scanner out = new Scanner(new File("src/test/resources/test1/out.dat"));
		
		Assert.assertEquals(out.next(), Solution.isPossiblePalidrome(in.next()));
		
		in.close();
		out.close();
	}
	@Test
	public void test2() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test2/in.dat"));
		Scanner out = new Scanner(new File("src/test/resources/test2/out.dat"));
		
		Assert.assertEquals(out.next(), Solution.isPossiblePalidrome(in.next()));
		
		in.close();
		out.close();
	}
	@Test
	public void test3() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test3/in.dat"));
		Scanner out = new Scanner(new File("src/test/resources/test3/out.dat"));
		
		Assert.assertEquals(out.next(), Solution.isPossiblePalidrome(in.next()));
		
		in.close();
		out.close();
	}
}
