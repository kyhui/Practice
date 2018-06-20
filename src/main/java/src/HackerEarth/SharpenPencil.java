package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SharpenPencil {
	public static void main(String args[]) throws Exception {
		run();
	}

	private static void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < numberOfTestCases; i++) {
			int totalPencils = Integer.parseInt(br.readLine());
			int madhav = 0;
			int mtick = 0;
			int rtick = 0;
			String data[] = br.readLine().split(" ");
			for (int riya = totalPencils - 1; madhav < riya; riya--) {
				rtick += Integer.parseInt(data[riya]);
				while (mtick / 2 < rtick && madhav != riya) {
					mtick += Integer.parseInt(data[madhav]);
					madhav++;
				}
			}
			if ((mtick - rtick) == (Integer.parseInt(data[madhav]) - 2)) {
				madhav++;
			}
			System.out.println((madhav) + " " + (data.length - madhav));
		}

	}
}
