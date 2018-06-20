package test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import code.UniqueMaximumNumber;

public class UniqueMaximumNumberTest {

	@Test
	public void test() throws IOException {
		SetupEnvironment se = new SetupEnvironment("UniqueMaximumNumber");
		UniqueMaximumNumber.main(null);
		assertEquals(se.getOutput().toString().trim(), "986");
		SetupEnvironment.cleanUp();
	}
}
