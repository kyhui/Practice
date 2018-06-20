package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BobsJourney {
	public static void main(String args[]) {
		try {
			run();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void run() throws IOException {
		// standard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int i = 0; i < tests; i++) {
			int cities = Integer.parseInt(br.readLine());
			boolean[] distinct = new boolean[26];
			boolean remember = true;
			for (int j = 0; j < cities; j++) {
				int symbol = (int) br.readLine().charAt(0) - 97;
				if (distinct[symbol] == false) {
					distinct[symbol] = true;
				} else {
					remember = false;
				}
			}
			if (remember) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}
