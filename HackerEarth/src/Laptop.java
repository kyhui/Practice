package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Laptop {
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
		// int tests = Integer.parseInt(br.readLine());
		// for (int i = 0; i < tests; i++) {
		int consumers = Integer.parseInt(br.readLine());
		String leadCompany = null;
		TreeMap<String, Integer> companyStats = new TreeMap<>();
		int maxConsumers = 0;
		for (int j = 0; j < consumers; j++) {
			String company = br.readLine();
			if (companyStats.containsKey(company)) {
				companyStats.put(company, companyStats.get(company) + 1);
				if (companyStats.get(company) > maxConsumers) {
					maxConsumers = companyStats.get(company);
					leadCompany = company;
				} else if (companyStats.get(company) == maxConsumers) {
					if (leadCompany.compareTo(company) > 1) {
						leadCompany = company;
					}
				}
			} else {
				companyStats.put(company, 1);
			}
		}
		System.out.println(leadCompany);
		// }
	}
}
