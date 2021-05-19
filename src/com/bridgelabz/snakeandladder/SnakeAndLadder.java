package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {

		//Variables
		int finalPosition = 0, stepCounter = 0;
		// Initializing position to 0
		int firstPlayerPosition = 0, secondPlayerPosition = 0;


		//Object

		Player firstPlayer = new Player();
		Player secondPlayer = new Player();


		while(finalPosition < 100 && finalPosition > 0) {
			firstPlayerPosition = firstPlayer.player(firstPlayerPosition);
			secondPlayerPosition = secondPlayer.player(secondPlayerPosition);


			stepCounter += 1;
			finalPosition = Math.max(firstPlayerPosition, secondPlayerPosition);

			if (firstPlayerPosition == 100) {
				System.out.println("First Player Wins!");
				break;
			}
			else if (secondPlayerPosition == 100)
				System.out.println("Second Player Wins!");

		}
		System.out.println(stepCounter);


	}

}
