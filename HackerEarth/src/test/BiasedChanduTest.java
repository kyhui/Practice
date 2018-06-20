package test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import code.BiasedChandu;

public class BiasedChanduTest {

	@Test
	public void countTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("BiasedChandu");
		BiasedChandu.main(null);
		assertEquals(se.getOutput().toString().trim(), "21433");
		SetupEnvironment.cleanUp();
	}
}
