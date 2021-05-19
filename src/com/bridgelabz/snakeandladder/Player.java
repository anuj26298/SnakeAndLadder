package com.bridgelabz.snakeandladder;
import java.util.*;
public class Player {
	public int player(int playerPosition) {
		Random random = new Random();
		int diceRollNum = random.nextInt(6) + 1;
		int moveOption = random.nextInt(3);

		if(moveOption == 1) { 
			playerPosition +=diceRollNum;
			if (playerPosition > 100)
				playerPosition -= diceRollNum ;
			player(playerPosition);
		}
		else if (moveOption == 2)
			playerPosition -= diceRollNum;
		if (playerPosition < 0)
			playerPosition = playerPosition-playerPosition;
		return playerPosition;
	}
}
