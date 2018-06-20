package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipTheWorld {

	public static void main(String[] args) {
		try {
			run();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {

		}
	}

	public static boolean[][] flipBits(boolean[][] grid, int x, int y) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (grid[x][j] == true) {
					grid[x][j] = false;
				} else {
					grid[x][j] = true;
				}
			}
		}
		return grid;
	}
}
