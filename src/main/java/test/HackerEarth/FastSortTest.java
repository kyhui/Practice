package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.HackerEarth.FastSort;

public class FastSortTest {

	@Test
	public void sortTest() throws Exception {
		SetupEnvironment se = new SetupEnvironment("FastSort");
		FastSort.main(null);
		assertEquals(se.getOutput().toString(), "codijak\nosnvfgwy\n");
		SetupEnvironment.cleanUp();
	}
}
