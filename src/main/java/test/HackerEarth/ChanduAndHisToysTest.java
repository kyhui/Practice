package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.HackerEarth.ChanduAndHisToys;

public class ChanduAndHisToysTest {

	@Test
	public void letterTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("ChanduAndHisToys");
		ChanduAndHisToys.main(null);
		assertEquals(se.getOutput().toString().trim(), "22");
		SetupEnvironment.cleanUp();
	}
}
