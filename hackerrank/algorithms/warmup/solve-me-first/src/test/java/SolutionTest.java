import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

	@Test
	public void test1() {
		
		try (Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
				Scanner out = new Scanner(new File("src/test/resources/test1/out.dat"))) {
			
			Assert.assertEquals(out.nextInt(), Solution.solveMeFirst(in.nextInt(), in.nextInt()));
			
		} catch (FileNotFoundException e) {
			Assert.fail(e.getMessage());
		}

	}
}
