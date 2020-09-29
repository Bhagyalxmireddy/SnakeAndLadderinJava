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
         if(Position <= ENDINGPOSITION)
           {
               int DICE = (int)Math.floor(Math.random()*10)%6;
               int ChooseOption = (int)Math.floor(Math.random()*10)%3;
                 switch(ChooseOption)
                  {
                     case LADDER:
  			Action = "Ladder";
                        Position = Position + DICE;

                     break;
                      case SNAKE:
                           Action = "snake";
                          Position = Position - DICE;
                     break;
                     case NOPLAY:
                      Action = "Noplay";
                      Position = Position;
                      break;
                  }
              		System.out.println("Dice value is: " +DICE+ " for " +Action+ " and the currentpostion is: " +Position);
	   }
     }

    public static void main(String args[])
    {
    	System.out.println("Welcome to SnakeAndLadder Game");
        SnakeAndLadder player = new SnakeAndLadder();
	player.gamePlayed();
    }


}
