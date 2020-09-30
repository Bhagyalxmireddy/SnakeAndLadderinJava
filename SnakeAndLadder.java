import java.util.*;
class SnakeAndLadder{
	static final int STARTINGPOSITION = 0;
   	static final int ENDINGPOSITION = 100;
   	static final int LADDER = 1;
   	static final int SNAKE = 2;
   	static final int NOPLAY = 0;
	static final int PLAYER = 0;
        static Random random = new Random();
   	static String Action;

		public static void gamePlayed()
                {
			int position = STARTINGPOSITION;
                  	if(position <= ENDINGPOSITION)
			{
                        	System.out.println("Game for single Player");
                        	int dice = (random.nextInt(6)+1);
                        	System.out.println("The Dicenumber is:" +dice);
				int chooseOption = (random.nextInt(3));
				switch(chooseOption)
				{
	                     		case LADDER:
  						Action = "Ladder";
                	        		position = position + dice;
	                        	break;
                      			case SNAKE:
                           			Action = "snake";
                          			position = position - dice;
                     			break;
                     			case NOPLAY:
                      				Action = "Noplay";
                      				position = position;
                      			break;
                  		}
              			System.out.println("Dice value is: " +dice+ " for " +Action+ " and the currentpostion is: " +position);
	       		}
		}
		public static void main(String args[])
    		{
    			System.out.println("Welcome to SnakeAndLadder Game");
        		gamePlayed();
    		}
}
