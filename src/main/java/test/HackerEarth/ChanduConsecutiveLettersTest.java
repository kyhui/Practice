package test.HackerEarth;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import src.HackerEarth.ChanduConsecutiveLetters;

public class ChanduConsecutiveLettersTest {

	@Test
	public void letterTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("ChanduConsecutiveLetters");
		ChanduConsecutiveLetters.main(null);
		assertEquals(se.getOutput().toString().trim(), "ab\nab\nababa");
		SetupEnvironment.cleanUp();
	}
}
