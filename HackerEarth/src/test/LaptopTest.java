package test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import code.Laptop;

public class LaptopTest {

	@Test
	public void countTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("Laptop");
		Laptop.main(null);
		assertEquals(se.getOutput().toString().trim(), "apple");
		SetupEnvironment.cleanUp();
	}
}
