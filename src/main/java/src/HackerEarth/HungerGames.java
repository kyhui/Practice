package src.HackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HungerGames {

	public static void main(String[] args) {
		try {
			run();
		} catch (Exception e) {
			System.out.println("Has not been implemented");
		}

	}

	private static void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfAnimals = Integer.parseInt(br.readLine());
		String[] data = br.readLine().split(" ");
		int[] listOfAnimals = new int[data.length];
		int danger = 0;
		for (int i = 0; i < numberOfAnimals; i++) {
			int animal = Integer.parseInt(data[i]);
			listOfAnimals[i] = animal;
		}
		Arrays.sort(listOfAnimals);
		for (int i = 0; i < numberOfAnimals - 2; i++) {
			danger = Math.max(danger,
					Math.max(listOfAnimals[i + 2] - listOfAnimals[i], listOfAnimals[i + 1] - listOfAnimals[i]));
		}
		System.out.println(danger);
	}

}
