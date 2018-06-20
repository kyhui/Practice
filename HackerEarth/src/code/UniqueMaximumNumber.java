package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class UniqueMaximumNumber {
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
		br.readLine();
		String[] data = br.readLine().split(" ");
		TreeMap<Integer, Boolean> unique = new TreeMap<>();
		int highest = -1;
		for (int i = 0; i < data.length; i++) {
			int tmp = Integer.parseInt(data[i]);
			if (!unique.containsKey(tmp)) {
				unique.put(tmp, false);
			} else {
				unique.put(tmp, true);
			}

		}
		for (Map.Entry<Integer, Boolean> entry : unique.entrySet()) {
			if (entry.getValue() == false && entry.getKey() > highest) {
				highest = entry.getKey();
			}
		}
		System.out.println(highest);
	}
}
