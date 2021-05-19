package com.bridgelabz.snakeandladder;
import java.util.Random;
public class SnakeAndLadder {
	public static void main(String[] args) {
		Random random = new Random();
		//Variables
		System.out.println("------------SNAKE AND LADDER----------------");
		int positionPlayer1 = 0;
		int diceNumber = random.nextInt(6) + 1;
		
		System.out.println(diceNumber);
		
		
		
	}
}
