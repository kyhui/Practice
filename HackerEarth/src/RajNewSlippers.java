package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RajNewSlippers {

	public static void main(String[] args) throws Exception {
		run();
	}

	private static void run() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTestCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < numberOfTestCases; i++) {
			ArrayList<Integer> earlyCandidates = new ArrayList<>();
			ArrayList<Friend> lateCandidates = new ArrayList<>();
			int numberOfFriends = Integer.parseInt(br.readLine());
			int dayEndTime = timeToMinutes(br.readLine());
			int wakeUpTime = timeToMinutes(br.readLine());
			int storeOpen = timeToMinutes(br.readLine());
			int timeToTravel = Integer.parseInt(br.readLine());
			int timeToShop = Integer.parseInt(br.readLine());
			int[] friendStartTime = new int[numberOfFriends];
			int[] friendEndTime = new int[numberOfFriends];

			// generate milestone numbers
			int totalTimeToShop = timeToTravel + timeToShop;
			int dayStartTime = Math.max(wakeUpTime, storeOpen);

			// find eligible friends
			for (int j = 0; j < numberOfFriends; j++) {
				String[] data = br.readLine().split(" ");
				friendStartTime[j] = timeToMinutes(data[0]);
				friendEndTime[j] = timeToMinutes(data[1]);

				if (dayStartTime + totalTimeToShop < friendStartTime[j]) {
					earlyCandidates.add(j);
				} else if (dayEndTime - totalTimeToShop > friendEndTime[j]) {
					lateCandidates.add(new Friend(j, dayEndTime - friendEndTime[j]));
				}
			}

			// find best friend to borrow from
			if (earlyCandidates.isEmpty() && !lateCandidates.isEmpty()) {
				Collections.sort(lateCandidates, new FriendComparator());
				System.out.println("Case " + (i + 1) + ": " + lateCandidates.get(0).number + 1);
			} else if (earlyCandidates.isEmpty() && lateCandidates.isEmpty()) {
				System.out.println("Case " + (i + 1) + ": " + "-1");
			} else {
				System.out.println("Case " + (i + 1) + ": " + (earlyCandidates.get(0) + 1));
			}

		}

	}

	private static int timeToMinutes(String time) {
		String[] timeFormat = time.split(":");
		return Integer.parseInt(timeFormat[0]) * 60 + Integer.parseInt(timeFormat[1]);
	}

	protected static class Friend {
		int number;
		int diff;

		protected Friend(int number, int diff) {
			this.number = number;
			this.diff = diff;
		}
	}

	protected static class FriendComparator implements Comparator<Friend> {

		@Override
		public int compare(Friend o1, Friend o2) {
			if (o1.diff > o2.diff) {
				return -1;
			} else if (o2.diff > o1.diff) {
				return 1;
			} else {
				if (o1.number < o2.number)
					return -1;
				if (o1.number > o2.number)
					return 1;
				return 0;
			}
		}

	}
}
