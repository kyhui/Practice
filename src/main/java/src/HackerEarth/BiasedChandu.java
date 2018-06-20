package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiasedChandu {
	public static void main(String args[]) {
		try {
			run();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int sum = 0;
		int N = Integer.parseInt(line);
		int deletedCandidates = 0;
		int[] candidates = new int[N];
		for (int i = 0; i < N; i++) {
			int rating = Integer.parseInt(br.readLine().trim());
			if (rating == 0 && i >= deletedCandidates + 1) {
				deletedCandidates += 2;
			} else {
				candidates[i - deletedCandidates] = rating;
			}
		}
		for (int j = 0; j < candidates.length - deletedCandidates; j++) {
			sum += candidates[j];
		}
		System.out.println(sum);
	}
}
