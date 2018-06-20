package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduConsecutiveLetters {
	public static void main(String args[]) {
		try {
			run();
		} catch (Exception e) {
			System.out.println("Has not been implemented");
		}
	}

	private static void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = Integer.parseInt(br.readLine());
		StringBuilder good = new StringBuilder();
		for (int i = 0; i < numberOfTestCases; i++) {
			String bad = br.readLine().trim();
			char[] letters = bad.toCharArray();
			for (char letter : letters) {
				if (good.length() == 0) {
					good.append(letter);
				} else if (letter != good.charAt(good.length() - 1)) {
					good.append(letter);
				}
			}
			System.out.println(good.toString());
			good.setLength(0);
		}
	}
}
