// Program for simulating the Martingale strategy

public class Martingale {

	public static boolean play(double success) {
		// simulation for playing a game of chance

		// generate random number between 0 and <1
		double randomNumber = Math.random(); 

		// declare outcome variable
		boolean outcome;

		// encode win or loss
		if (randomNumber < success) {
			outcome = true; 
		} else {
			outcome = false;
		}
					
		return outcome;
	}	


	public static int martingale(double success) {
		/* Keep playing until the target is reached or 
		the player runs out of money. */
		
		int money = 1000;
		int target = 1200;
		int bet = 10; 

		while (money>bet) {
			boolean win = play(success);
			if (win) {
				money += bet; 
				// System.out.println(money);
				if (money >= target) {
       				break;
				}
				bet = 10;
			} else { 
				money -= bet;
				// System.out.println(money);
				bet *= 2;
			}
		} 
		
		return money;
	} 	

	public static void main(String[] args) {

		// define success rate
		double successRate = 0.3;

		// run simulation 10 times
		for (int i = 0; i < 10; i++) {
			System.out.println(martingale(successRate));
		} 
	}

} 
