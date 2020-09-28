import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int ENDINGPOSITION = 100;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   static final int NOPLAY = 0;
   static String Action;
   int CurrentPosition = 0;
     public int gamePlayed()
     {
         if(CurrentPosition < ENDINGPOSITION)
           {
               int DICE = (int)Math.floor(Math.random()*10)%6;
               int ChooseOption = (int)Math.floor(Math.random()*10)%3;
                 switch(ChooseOption)
                  {
                     case LADDER:
                     if(CurrentPosition + DICE <= ENDINGPOSITION)
                     {
                         Action = "Ledder";
                         CurrentPosition = CurrentPosition + DICE;
                     }
                     break;
                      case SNAKE:
                     if(CurrentPosition - DICE >= STARTINGPOSITION)
                     {
                          Action = "snake";
                          CurrentPosition = CurrentPosition - DICE;
                     }
                     break;
                     case NOPLAY:
                      Action = "Noplay";
                      CurrentPosition = CurrentPosition;
                      break;
                  }
              System.out.println("Dice value is: " +DICE+ " for " +Action+ " and the currentpostion is: " +CurrentPosition);
              }
         return CurrentPosition;
     }

    public static void main(String args[])
    {
      System.out.println("Welcome to SnakeAndLadder Game");
      SnakeAndLadder player = new SnakeAndLadder();
      player.gamePlayed();
     }
 

}
