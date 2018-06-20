package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkInPokemon {

	public static void main(String args[]) throws IOException {
		try {
			run();
		} catch (IOException e) {
			System.out.println("Could not read input: ");
			e.printStackTrace();
		}

	}

	private static void run() throws IOException {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int numberOfTestCases = Integer.parseInt(line);
		boolean[] foodList = new boolean[(int) Math.pow(10, 6)];
		int foodNeeded = 0;
		int food, pokemon;
		for (int i = 0; i < numberOfTestCases; i++) {
			int testCaseLength = Integer.parseInt(in.readLine().trim());
			for (int j = 0; j < testCaseLength - 1; j++) {
				String[] data = in.readLine().split(" ");
				food = Integer.parseInt(data[0].trim());
				pokemon = Integer.parseInt(data[1].trim());
				if (food != pokemon && foodList[pokemon]==true) {
					foodList[pokemon] = false;
					foodList[food] = true;
				} else if (food != pokemon && foodList[pokemon]==false) {
					foodList[food] = true;
					foodNeeded++;
				}
			}
			System.out.println(foodNeeded);
			Arrays.fill(foodList, Boolean.FALSE);
			foodNeeded = 0;
		}
	}
}
