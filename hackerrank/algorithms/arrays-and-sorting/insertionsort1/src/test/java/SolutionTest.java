import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private final OutputStream out = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(out));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void test1() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test1/in.dat"));
		String expectedOutput = getExpectedOutput("src/test/resources/test1/out.dat");
		Solution.solve(in);
		Assert.assertEquals(expectedOutput, out.toString());
	}
	
	@Test
	public void test2() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test2/in.dat"));
		String expectedOutput = getExpectedOutput("src/test/resources/test2/out.dat");
		Solution.solve(in);
		Assert.assertEquals(expectedOutput, out.toString());
	}

	@Test
	public void test3() throws Exception {
		Scanner in = new Scanner(new File("src/test/resources/test3/in.dat"));
		String expectedOutput = getExpectedOutput("src/test/resources/test3/out.dat");
		Solution.solve(in);
		Assert.assertEquals(expectedOutput, out.toString());
	}

	private String getExpectedOutput(String string) throws IOException {
		return new String(Files.readAllBytes(Paths.get(string))) + "\n";
	}
}
