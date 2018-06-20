package test.HackerEarth;

import static org.junit.Assert.assertEquals;
import static src.HackerEarth.BiasedChandu.*;

import java.io.IOException;
import org.junit.Test;

public class BiasedChanduTest {

	@Test
	public void countTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("BiasedChandu.txt");
		main(null);
		assertEquals(se.getOutput().toString().trim(), "21433");
		SetupEnvironment.cleanUp();
	}
}
