package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsectColony {
	public static void main(String args[]) {
		try {
			run();
		} catch (Exception e) {
			System.out.println("Has not been implemented");
		}
	}

	private static void run() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int numberOfTestCases = Integer.parseInt(line);
		for (int i = 0; i < numberOfTestCases; i++) {
			String[] dataStr = in.readLine().split(" ");
			int[] data = new int[dataStr.length];
			int index = 0;
			for (String d : dataStr) {
				data[index++] = Integer.parseInt(d.trim());
			}
			int numberOfInsects = data[0];
			// check if minimum insects are available
			if (numberOfInsects < 2) {
				System.out.println("No");
			} else {
				// iterate through the insect list
				int end = 0;
				for (int j = 1; j <= numberOfInsects; j++) {
					if ((data[j] & 1) != 0) {
						end ^= data[j];
					}
					if ((end & 1) == 0) {
						end = 0;
					}
				}
				// after iterating through whole colony
				if (end == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}
