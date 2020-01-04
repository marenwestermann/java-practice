/* Practice for using for loops. 
In this pyramid program the number of blocks in a layer is the 
square of the number of a respective layer, counted from the top.
The program prints the total number of blocks in a pyramid.*/ 

public class Pyramid {

	public static int countBlocks(int layers) {
		/* function for counting the total number of 
		blocks in a pyramid */

		int numBlocks = 0;		
		for (int i = 1; i <= layers; i++) {
			numBlocks += (i*i);
		}

		return numBlocks;
	}


	public static void main(String[] args) {
		int numLayers = 5;
		System.out.println(countBlocks(numLayers));
	}

} 
