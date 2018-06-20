package test;

import static org.junit.Assert.*;
import java.io.IOException;

import org.junit.Test;

import code.MonkInPokemon;

public class MonkInPokemonTest {

	@Test
	public void testInput() {
		String desiredOutput = null;
		try {
			SetupEnvironment se = new SetupEnvironment("MonkInPokemonTest");
			MonkInPokemon.main(null);
			desiredOutput = se.getOutput().toString();
		} catch (IOException e) {
			System.out.println("Not yet implemented");
			e.printStackTrace();
		} finally {
			SetupEnvironment.cleanUp();
		}
		assertEquals(desiredOutput.trim(),"1");
	}
}
