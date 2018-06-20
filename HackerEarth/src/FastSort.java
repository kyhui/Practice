package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class FastSort {

	public static void main(String[] args) throws Exception {
		run();
	}

	private static void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < numberOfTestCases; i++) {
			HashMap<Character, Integer> index = new HashMap<>();
			char[] dict = br.readLine().toCharArray();
			for (int j = 0; j < dict.length; j++) {
				index.put(dict[j], j);
			}
			char[] sorted = br.readLine().toCharArray();
			int[] convertSorted = new int[sorted.length];
			for (int k = 0; k < sorted.length; k++) {
				convertSorted[k] = index.get(sorted[k]);
			}
			Arrays.sort(convertSorted);
			for (int l = 0; l < sorted.length; l++) {
				sorted[l] = dict[convertSorted[l]];
			}
			System.out.println(new String(sorted));
		}
	}

}
