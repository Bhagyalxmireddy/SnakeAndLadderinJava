import java.util.*;
class SnakeAndLadder{
	static final int STARTINGPOSITION = 0;
   	static final int ENDINGPOSITION = 100;
   	static final int LADDER = 1;
   	static final int SNAKE = 2;
   	static final int NOPLAY = 0;
	static final int PLAYER = 0;
   	static String action;

		public static void gamePlayed()
                {
			int position = STARTINGPOSITION;
                  	if(position <= ENDINGPOSITION)
			{
				System.out.println("Game for single Player");
				while(position < ENDINGPOSITION)
				{
					Random random = new Random();
                        		int dice = (random.nextInt(6)+1);
                        		System.out.println("The Dicenumber is:" +dice);
					int chooseOption = (random.nextInt(3));
					switch(chooseOption)
					{
	                     			case LADDER:
  							action = "Ladder";
                	        			position = position + dice;
	                        		break;
                      				case SNAKE:
                           				action = "snake";
                          				position = position - dice;
							if(position < 0)
							{
								position = 0;
							}
                     				break;
                     				case NOPLAY:
                      					action = "Noplay";
                      					position = position;
                      				break;
                                      }
                                System.out.println("The Dice value is " +dice+ "for" +action+ "and the current position is" +position);
				}
			}
 		}
		public static void main(String args[])
    		{
    			System.out.println("Welcome to SnakeAndLadder Game");
        		gamePlayed();
    		}
}
