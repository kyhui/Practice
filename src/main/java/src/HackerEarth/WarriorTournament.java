package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WarriorTournament {
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
		int matches = Integer.parseInt(br.readLine());
		TreeMap<String, Integer> tourneyStats = new TreeMap<>();
		int maxWins = 0;
		for (int j = 0; j < matches; j++) {
			String[] contenders = br.readLine().split(" ");
			for (int i = 0; i < contenders.length; i++) {
				String contender = contenders[i];
				if (tourneyStats.containsKey(contender)) {
					tourneyStats.put(contender, tourneyStats.get(contender) + 1);
					if (tourneyStats.get(contender) > maxWins)
						maxWins = tourneyStats.get(contender);
				} else {
					tourneyStats.put(contender, 1);
				}
			}
		}
		String[] winners = new String[1];
		int index = 0;
		for (Map.Entry<String, Integer> entry : tourneyStats.entrySet()) {
			String key = entry.getKey();
			if (tourneyStats.get(key) == maxWins) {
				if (index == winners.length) {
					winners = Arrays.copyOf(winners, index * 2);
				}
				winners[index++] = key;
			}
		}
		winners = Arrays.copyOf(winners, index);
		Arrays.sort(winners);
		System.out.println(winners.length);
		for (String winner : winners) {
			System.out.println(winner);
		}
	}
}
