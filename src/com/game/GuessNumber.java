package com.game;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int chances=8;
		int finals=0;
		boolean playAgain=true;
		System.out.println("welcome to game");
		System.out.println("Hey you have about "+chances+"to win the game");
		while(playAgain)
		{
			System.out.println("Enter the Random no");
			int random=sc.nextInt();
			boolean guess=false;
			for(int i=0; i<chances; i++)
			{
				System.out.println("Chance: "+(i+1)+"\nEnter your guess");
				int user=sc.nextInt();
				if(user==random)
				{
					guess=true;
					finals+=1;
					System.out.println("You Won It");
					break;
				}
				else if(user>random)
				{
					System.out.println("Too High");
				}
				else
				{
					System.out.println("Too Low ");
				}
			} 
			if(guess==false)
			{
				System.out.println("Sorry buddy you lost the chances.the number is"+random);
			}
			System.out.println("do you want to play again(y/n");
			String pA=sc.next();
			playAgain=pA.equalsIgnoreCase("y");
			
		}
		System.out.println("Thats it buddy.Hope you enjoyd it");
		System.out.println("here is your score"+finals);
	}
	public static int getrandN(int min,int max)
	{
		return (int)(Math.random()*(max-min+1)+min);
	}
}
