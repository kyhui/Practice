package test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import code.InsectColony;

public class InsectColonyTest {
	
	@Test
	public void testXOR() throws IOException{
		SetupEnvironment se = new SetupEnvironment("InsectColony");
		InsectColony.main(null);
		assertEquals(se.getOutput().toString().trim(), "Yes");
		SetupEnvironment.cleanUp();
	}
}
