import java.util.*;
class SnakeAndLadder{
	static final int STARTINGPOSITION = 0;
   	static final int LADDER = 1;
   	static final int SNAKE = 2;
	static final int PLAYER = 0;
   	static Random random = new Random();
     		public static void gamePlayed()
     		{
			System.out.println("Game for single Player");
        		int dice = (random.nextInt(6)+1);
			System.out.println("The Dicenumber is:" +dice);
     		}
	public static void main(String args[])
    	{
    		System.out.println("Welcome to SnakeAndLadder Game");
        	gamePlayed();
    	}
}
