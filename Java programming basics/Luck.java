/* Practice for using while loops. 
This program simulates rolling a dice until either a 6
or a 3 comes up, which results in the user winning or 
losing, respectively. */

public class Luck {

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

	public static String tryYourLuck() {
		
		while (true) {
			int num = rollDice();
			if (num == 6) {
				String outcome = "You won!";
				return outcome;
			} else if (num == 3) { 
				String outcome = "You lost!";
				return outcome;
			} else {
				System.out.println("Try again!");
			}
		}

	} 


	public static void main(String[] args) {

		System.out.println(tryYourLuck()); 
	} 

} 
