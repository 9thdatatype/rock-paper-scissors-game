import java.util.Scanner;

/**
 * Program Name: Input.java 
 * Purpose: 
 * Author: Dan Thertell
 * Date: Jan 20, 2016
 */

/**
 * @author Dan
 *
 */
public class Input {
	
		 		
		/**
		 * Method Name: getInput()
		 * Date Added: 20/1/2016
		 * Purpose: gets and validates input and turns into an int
		 * Accepts: null
		 * Returns: int represinting user input; 0 if unexpected exit
		 * Coder: Daniel Thertell
		 */
	public static int getInput(){
		Scanner input = new Scanner(System.in);
		String rawInput = "";
		int refinedInput = 0;
		boolean valid = false;
		int loopCount = 0; //used to prevent infinate looping
		
		while(!valid){
			rawInput = input.nextLine().toUpperCase();
			
			//checks to see if a number is inputed
			try {
				refinedInput = Integer.parseInt(rawInput);
				valid = true;
				// if a number is inputed  exits loop and returns number
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				//used for debuging 
			}
			
			//if statment to check strings
			if(rawInput.equals("ROCK")){
				refinedInput = 1;
				valid = true;
			}
			else if (rawInput.equals("PAPER")){
				refinedInput = 2;
				valid = true;
			}
			else if (rawInput.equals("SCISSORS")){
				refinedInput = 3;
				valid = true;
			}
			else{
				System.out.println("Invalid input. please try again");
				loopCount++;
			}
			
			if(loopCount>10){
				System.out.println("Exiting input to many failed attempts");
				valid = true;
			}
		}
		//no matter what the outcome is input is closed and something is returned
		input.close();
		return refinedInput;
	}
	
	
	/**
	 * Method Name: print()
	 * Date Added: 20/1/2016
	 * Purpose: prints stuff, use if nessecary. this comment will never be seen again so please enjoy it
	 * Accepts: strings
	 * Returns: null
	 * Coder: Daniel Thertell
	 */
	public static void print(String in){
		System.out.println(in);
	}
	
	
	
	/**
	 * Method Name: win()
	 * Date Added: 20/1/2016
	 * Purpose: tells the use they win
	 * Accepts: null
	 * Returns: null
	 * Coder: Daniel Thertell
	 */
	public static void win(){
		print("You Win!");
	}
	
	/**
	 * Method Name: win()
	 * Date Added: 20/1/2016
	 * Purpose: tells the use they loose
	 * Accepts: null
	 * Returns: null
	 * Coder: Daniel Thertell
	 */
	public static void loose(){
		print("you loose");
	}
	
	
	
	/**
	 * Method Name: intro()
	 * Date Added: 20/1/2016
	 * Purpose: display rules and options
	 * Accepts: null
	 * Returns: null
	 * Coder: Daniel Thertell
	 */
	public static void intro(){
		print("Welcome to rock paper scissors");
		print("please pick an option");
		print("1. Rock");
		print("2. Paper");
		print("3. Scissors");
	}
}
