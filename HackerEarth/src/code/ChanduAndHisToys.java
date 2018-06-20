package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndHisToys {
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
		int[] heightsOfStack1 = new int[1000001];
		int[] heightsOfStack2 = new int[1000001];
		for (int i = 0; i < numberOfTestCases; i++) {
			String[] data = br.readLine().split(" ");
			int stacks = Integer.parseInt(data[0]);
			int removeCost = Integer.parseInt(data[1]);
			int addCost = Integer.parseInt(data[2]);
			int remove = 0;
			int add = 0;
			for (int j = 0; j < stacks; j++) {
				data = br.readLine().split(" ");
				int hos1 = Integer.parseInt(data[0]);
				int hos2 = Integer.parseInt(data[1]);
				if (hos1 != hos2) {
					if (heightsOfStack1[hos2] > 0) {
						heightsOfStack1[hos2] -= 1;
					} else {
						heightsOfStack2[hos2] += 1;
					}
					if (heightsOfStack2[hos1] > 0) {
						heightsOfStack2[hos1] -= 1;
					} else {
						heightsOfStack1[hos1] += 1;
					}
				}
			}

			int index1 = heightsOfStack1.length - 1;
			int index2 = heightsOfStack2.length - 1;
			int remainder1 = 0;
			int remainder2 = 0;

			while (index1 > 0 && index2 > 0) {
				while (heightsOfStack1[index1] == 0 && index1 > 0)
					index1--;
				while (heightsOfStack2[index2] == 0 && index2 > 0)
					index2--;

				if (heightsOfStack1[index1] * index1 > heightsOfStack2[index2] * index2) {
					int change = heightsOfStack1[index1] * index1 - heightsOfStack2[index2] * index2;
					if (remainder2 > change) {
						remainder2 -= change;
						add = change * addCost;
					} else {
						remainder1 += change - remainder2;
						add += remainder2 * addCost;
						remove += (change - remainder2) * removeCost;
						remainder2 = 0;
					}
				} else if (heightsOfStack1[index1] * index1 < heightsOfStack2[index2] * index2) {
					int change = heightsOfStack2[index2] * index2 - heightsOfStack1[index1] * index1;
					if (remainder1 > change) {
						remainder1 -= change;
						add += change * addCost;
					} else {
						remainder2 += change - remainder1;
						add += remainder1 * addCost;
						remove += (change - remainder1) * removeCost;
						remainder1 = 0;
					}
				} else {
					if (index1 > index2) {
						remove += (index1 - index2) * index2 * removeCost;
					} else {
						remove += (index2 - index1) * index1 * removeCost;
					}
				}
				index1--;
				index2--;
			}
			System.out.println(add + remove);
		}
	}
}
