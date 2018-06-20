package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.HackerEarth.HungerGames;

public class HungerGamesTest {

	@Test
	public void dangerValueTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("HungerGames");
		HungerGames.main(null);
		assertEquals(se.getOutput().toString().trim(), "3");
		SetupEnvironment.cleanUp();
	}
}
