package innerclass;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class TestH {

	public static void main(String[] args) {
		//obtain the number of teams from user input
	    Scanner input = new Scanner(System.in);
	    System.out.print("How many teams should the fixture table have?");

	    int teams;
	    teams = input.nextInt();


	    // Generate the schedule using round robin algorithm.
	    int totalRounds = (teams - 1)*2;
	    int matchesPerRound = teams / 2;
	    String[][] rounds = new String[totalRounds][matchesPerRound];

	    for (int round = 0; round < totalRounds; round++) {
	        for (int match = 0; match < matchesPerRound; match++) {
	            int home = (round + match) % (teams - 1);
	            int away = (teams - 1 - match + round) % (teams - 1);

	            // Last team stays in the same place while the others
	            // rotate around it.
	            if (match == 0) {
	                away = teams - 1;
	            }

	            // Add one so teams are number 1 to teams not 0 to teams - 1
	            // upon display.
	            rounds[round][match] = ("team " + (home + 1) + " plays against team " + (away + 1));
	        }
	    }

	    // Display the rounds    
	    for (int i = 0; i < rounds.length; i++) {
	        System.out.println("Round " + (i + 1));
	        System.out.println(Arrays.asList(rounds[i]));
	        System.out.println();
	    }
	
	}
}


class Team{
	
	int id ;
	Set<Integer> played;
	Set<Integer> day;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the played
	 */
	public Set<Integer> getPlayed() {
		return played;
	}
	/**
	 * @param played the played to set
	 */
	public void setPlayed(Set<Integer> played) {
		this.played = played;
	}
	/**
	 * @return the day
	 */
	public Set<Integer> getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(Set<Integer> day) {
		this.day = day;
	}
	
}