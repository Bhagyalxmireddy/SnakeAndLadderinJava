import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int ENDINGPOSITION = 100;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   static final int NOPLAY = 0;
   static String Action;
   
     public  void gamePlayed()
     {
	int Position = STARTINGPOSITION;
   	int Dicecount = 0;
         	if(Position <= ENDINGPOSITION)
                {
                       while( Position != ENDINGPOSITION )
		      {
               	      		int DICE = (int)Math.floor(Math.random()*10)%6;
               			int ChooseOption = (int)Math.floor(Math.random()*10)%3;
                 		switch(ChooseOption)
                  		{
                     			case LADDER:
  						Action = "Ladder";
                        		    	int CurrentPosition = Position + DICE;
						if(CurrentPosition > ENDINGPOSITION)
						{
							System.out.println("NOPLAY");
						}
						else
						{	
							Position = Position + DICE;

						}
					break;
                     			case SNAKE:
                           			Action = "snake";
                          			Position = Position - DICE;
                                                if(Position < 0)
                                                {
 							Position = 0;
                                                }
                     				break;
                     			case NOPLAY:
                     	 			Action = "Noplay";
                      				Position = Position;
                     				break;
                  		}
              		System.out.println("Dice value is: " +DICE+ " for " +Action+ " and the currentpostion is: " +Position);
			Dicecount++;
			System.out.println("The Dicecount value is:" +Dicecount);
                  }


          }
     }
        public void twoPlayers()
        {
                int Player1position = STARTINGPOSITION ;
                int Player2position = STARTINGPOSITION ;
                int dice_count = STARTINGPOSITION ;
                System.out.println("Game Started by two player");
                while( Player1position < ENDINGPOSITION && Player2position < ENDINGPOSITION )
                {
                        System.out.println("Player 1 :-  ");
  	                     SnakeAndLadder play = new SnakeAndLadder();
        	               play.gamePlayed();
                        if(Player1position == ENDINGPOSITION)
                        {
                                break;
                        }
                        System.out.println("Player 2 :-  ");
                        SnakeAndLadder play2 = new SnakeAndLadder();
                        play2.gamePlayed();
                }
                if(Player1position == ENDINGPOSITION)
                {
                        System.out.println("Player 1 Won The Match ");
                }
                else if(Player2position == ENDINGPOSITION)
                {
                        System.out.println("Player 2 Won The Match ");
                }
                System.out.println("Total Dice Count of both Players "+dice_count);
        }


    public static void main(String args[])
    {
    	System.out.println("Welcome to SnakeAndLadder Game");
        SnakeAndLadder player = new SnakeAndLadder();
	player.twoPlayers();
    }


}
