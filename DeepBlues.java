/**
 * Class Name: DeepBlues.java
 * Purpose: Generates the program's choice between
 * 			'Rock', 'Paper' or 'Scissors'
 * Coded by: Murilo
 * Date: Jan 25, 2016 
 */

public class DeepBlues
{
	static final int ROCK = 1,
					 PAPER = 2,
					 SCISSORS = 3;
	
	static final String[] RPS_ARRAY = {"ERROR" , "ROCK", "PAPER", "SCISSORS"};
	
	static final int LOWEST_ROLL = 1,
					 HIGHEST_ROLL = 3,
					 ROLL_RANGE = HIGHEST_ROLL - LOWEST_ROLL +1;
	
	public static int getChoice()
	{
		return (int)(Math.random()*ROLL_RANGE + LOWEST_ROLL);
	}
	//end getChoice
}
//end DeepBlues