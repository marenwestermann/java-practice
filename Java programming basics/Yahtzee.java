/* Calculate the number of times it takes to get a Yahtzee.
Practice for using while loops */

public class Yahtzee {

	public static int rollDice() { 
		// get a random number between 1 and 6

		// random num between 0 and (almost) 1
		double randomNumber = Math.random();
		
		// change range to number of sides
		randomNumber *= 6;
		
		// shift range up one
		randomNumber += 1;

		// cast to integer
		int randomInt = (int) randomNumber;		

		// return statement
		return randomInt;
	} 

	public static int keepRolling() {
		// keep rolling until all dice show the same number

		int count = 0;		
		while (true) { 
			int dice1 = rollDice();
			int dice2 = rollDice();
			int dice3 = rollDice();
			int dice4 = rollDice();
			int dice5 = rollDice();

			count += 1;			

			if (dice1 == dice2 && dice2 == dice3 && 
				dice3 == dice4 && dice4 == dice5) {
				break;
			}
		}

		return count;
	}


	public static void main(String[] args) {
		System.out.println(keepRolling());
	}

} 
