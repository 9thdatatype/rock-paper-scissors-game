public class RockPaperScissorsMain {
	
	DeepBlues deepBlues = new DeepBlues();
	Input input = new Input();
	
	public static void main(String args[]){
		int player1 = 0;
		int player2 = 0;
		
		input.intro();
		
		player1 = input.getInput();
		
		if(player1 == 0)
			return;
			
		player2 = deepBlues.getChoice();
		
		if(player2 == 0)
			return 0;
		
		if(winner == 0)
			System.out.println("It's a tie");
		else if(winner == 1)
			input.win();
		else
			input.loose();
	}
	
	public static int winner(int p1, int p2){
		//1 = rock, 2 = paper, 3 = scissors
		if (p1 == 1 && p2 == 2){ // rock and paper
			return 2;
		}
		else if (p1 == 2 && p2 == 3){ // paper and scissors
			return 2;
		}
		else if (p1 == 3 && p2 == 1){ // scissors and rock
			return 2;
		}
		else if (p1 == 1 && p2 == 3){ // rock and scissors
			return 1;
		}
		else if (p1 == 2 &&  p2 == 1){ // paper and rock
			return 1;
		}
		else if (p1 == 3 && p2 == 2){ // scissors and paper
			return 1;
		}
		else if (p1 == 1 && p2 == 1){ // rock and rock 
			return 0;
		}
		else if (p1 == 2 && p2 == 2){ // paper and paper
			return 0;
		}
		else if (p1 == 3 && p2 == 3){ // scissors and scissors
			return 0;
		}
	}
}