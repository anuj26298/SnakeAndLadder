package com.bridgelabz.snakeandladder;
import java.util.Random;
public class SnakeAndLadder {
	public static final int FINAL_POSITION = 100;
	
	public static void main(String[] args) {
		Random random = new Random();
		//Variables
		int playerPosition = 0;
		int diceRollNum = random.nextInt(6) + 1;
		int moveOption = random.nextInt(3);
		System.out.println("------------SNAKE AND LADDER----------------");
		
		
		playerPosition = players(moveOption, diceRollNum);
		
		System.out.println("Player Position is:" + playerPosition);
		
		
		
	}
	
	public static int players(int moveOption, int diceRoll) {
		int playerPosition = 0;
		if(moveOption == 1) 
			playerPosition +=diceRoll;
		else if (moveOption == 2)
			playerPosition -= diceRoll;
		
		if (playerPosition < 0)
			playerPosition = 0;
		return playerPosition;
	}
}
