package test;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

import code.FlipTheWorld;

public class FlipTheWorldTest {

	@Test
	public void flipBits() throws IOException {
		// SetupEnvironment se = new SetupEnvironment("FlipTheWorld");
		// FlipTheWorld.main(null);
		// assertEquals(se.getOutput().toString().trim(), "22");
		// SetupEnvironment.cleanUp();
		boolean[][] grid = new boolean[5][5];
		System.out.println("Grid 1");
		printArray(grid);
		grid = FlipTheWorld.flipBits(grid, 3, 3);
		System.out.println("Grid 2");
		printArray(grid);
	}

	private void printArray(boolean[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
	}
}
