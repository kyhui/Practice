package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.HackerEarth.HeadChefMonica;

public class HeadChefMonicaTest {

	@Test
	public void test() throws IOException {
		SetupEnvironment se = new SetupEnvironment("HeadChefMonica");
		HeadChefMonica.main(null);
		assertEquals(se.getOutput().toString().trim(), "12\n2\n0\n1\n0");
		SetupEnvironment.cleanUp();
	}
}
