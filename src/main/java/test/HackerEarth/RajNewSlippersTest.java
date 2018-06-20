package test.HackerEarth;

import org.junit.Test;

import src.HackerEarth.RajNewSlippers;

public class RajNewSlippersTest {

	@Test
	public void newSlipperTest() throws Exception {
		SetupEnvironment se = new SetupEnvironment("RajNewSlippers");
		RajNewSlippers.main(null);
		String output = se.getOutput().toString();
		SetupEnvironment.cleanUp();
		System.out.println(output);
	}
}
