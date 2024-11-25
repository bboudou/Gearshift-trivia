
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;


public class GameRunner {

	private static boolean notAWinner;
	public GameRunner(long seed) {
		this.seed = seed;
	}

	public static long seed;
	public static Game aGame = new Game();


	public static void main(long seed) {

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");


		Random rand = new Random(seed);
	
		do {
			
			aGame.roll(rand.nextInt(5) + 1);
			
			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			
			
		} while (notAWinner);
		
	}
}
