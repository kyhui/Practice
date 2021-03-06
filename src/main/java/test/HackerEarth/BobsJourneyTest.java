package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.HackerEarth.BobsJourney;

public class BobsJourneyTest {

	@Test
	public void test() throws IOException {
		SetupEnvironment se = new SetupEnvironment("BobsJourney");
		BobsJourney.main(null);
		assertEquals(se.getOutput().toString().trim(), "YES\nNO");
		SetupEnvironment.cleanUp();
	}
}
