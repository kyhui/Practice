package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class HeadChefMonica {
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
		char[] data = br.readLine().toCharArray();
		BigInteger total = BigInteger.ONE;
		TreeMap<Character, Integer> chefs = new TreeMap<>();
		for (int i = 0; i < data.length; i++) {
			if (chefs.containsKey(data[i])) {
				chefs.put(data[i], chefs.get(data[i]) + 1);
			} else {
				chefs.put(data[i], 1);
			}
		}

		int dishes = Integer.parseInt(br.readLine());
		TreeSet<String> teams = new TreeSet<>();
		for (int i = 0; i < dishes; i++) {
			char[] dish = br.readLine().toCharArray();
			for (int j = 0; j < dish.length; j++) {
				char chef = dish[j];
				int available = chefs.get(chef);
				if (available > 0) {
					total = total.multiply(BigInteger.valueOf(available));
					available--;
					chefs.put(chef, available);
					teams.add(Arrays.toString(dish));
				} else {
					if (teams.contains(Arrays.toString(dish))) {
						total = BigInteger.ONE;
					} else {
						total = BigInteger.ZERO;
					}
				}
			}
			System.out.println(total.mod(BigInteger.valueOf(1000000007)));
			total = BigInteger.ONE;
		}
	}
}
