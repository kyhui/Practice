package test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import code.WarriorTournament;

public class WarriorTournamentTest {

	@Test
	public void countTest() throws IOException {
		SetupEnvironment se = new SetupEnvironment("WarriorTournament");
		WarriorTournament.main(null);
		assertEquals(se.getOutput().toString().trim(), "2\nIND\nJAP");
		SetupEnvironment.cleanUp();
	}
}
