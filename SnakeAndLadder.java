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

    public static void main(String args[])
    {
    	System.out.println("Welcome to SnakeAndLadder Game");
        SnakeAndLadder player = new SnakeAndLadder();
	player.gamePlayed();
    }


}
