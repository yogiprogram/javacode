package innerclass;

import java.awt.List;

public class GameSchedule {
	public static void scheduleGames(int nmb) {
		int days = (nmb % 2 == 0) ? nmb - 1 : nmb;
		int day = 0;
		int match = 0;
		for (int i = 0; i < days; i++) {
			if (i == 0)
				System.out.println("\tDay " + (day + 1) + ":");

			for (int j = 0; j < nmb / 2; j++) {
				match++;
				int t1 = (j + i) % nmb + 1;
				int t2 = ((nmb - j - 1) + i) % nmb + 1;
				System.out.println("\t\tTeam " + t1 + " v.s Team " + t2);
				if (match == 2) {
					match = 0;
					day++;
					System.out.println("\tDay " + (day + 2) + ":");
				}
			}

		}
	}

	public static void scheduleGames1(int nmb) {
		int days = (nmb % 2 == 0) ? nmb - 1 : nmb;
		for (int i = 0; i < days; i++) {
			System.out.println("\tDay " + (i + 1) + ":");
			for (int j = 0; j < nmb / 2; j++) {
				int t1 = (j + i) % nmb + 1;
				int t2 = ((nmb - j - 1) + i) % nmb + 1;
				System.out.println("\t\tTeam " + t1 + " v.s Team " + t2);
			}
		}
	}

	public static void main(String[] args) {

		GameSchedule.scheduleGames2(4);
		// GameSchedule.scheduleGames3(12);
	}

	public static void scheduleGames3(int n) {
		// int r = 1;
		for (int r = 1; r <= n / 2; r++) {
			System.out.println("");
			for (int i = 1; i <= n / 2; i++) {
				System.out.print(" [ ");
				if (i == 1) {
					System.out.print(1 + " " + ((r + n - i - 1) % (n - 1)) + 2);
				} else {
					System.out.print(((r + i - 2) % (n - 1) + 2) + " " + ((r + n - i - 1) % (n - 1) + 2));
				}
				System.out.print(" ]\t");
			}
		}
	}

	public static void scheduleGames2(int nmb) {
		int arr[][] = new int[nmb][nmb];
		int day = 1;
		int t2 = 0;
		for (int i = 0; i < nmb / 2; i++) {
			int j = (nmb - 1 + i) % nmb + 1;
			int cunt =0;
			System.out.println("=--------");
			while (true) {
				System.out.println(i+1 + "  " + j);
				j--;
				cunt++;
				if(cunt > nmb/2)
					break;
				
			}
		}
	}

}