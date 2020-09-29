import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int ENDINGPOSITION = 100;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   static final int NOPLAY = 0;
   static String Action;
   static final int PLAYER1 = 1;
   static final int PLAYER2 = 2;
   int CurrentPosition = 0;
   int DiceCount = 0; 
     public static int gamePlayed(int CurrentPosition, int DiceCount)
     {
         if( CurrentPosition < ENDINGPOSITION )
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
              System.out.println("Dice value is: " +DICE+ " for " +Action+ " then currentpostion is: " +CurrentPosition);
              }
             else
             {
                CurrentPosition = CurrentPosition;
             }
       if(Action == "Ladder" && CurrentPosition != ENDINGPOSITION)
       {
           int DicesCount = SnakeAndLadder.numOfTimesDicePlayed(0);
           DiceCount = numOfTimesDicePlayed(DiceCount);
           gamePlayed(100, DicesCount);
       }
      return CurrentPosition;
      }
     public static int numOfTimesDicePlayed(int diceCount)
    {
      diceCount++;
      return diceCount;
     }

    public static void main(String args[])
    {
      	System.out.println("Welcome to SnakeAndLadder Game");
      	int Result = SnakeAndLadder.gamePlayed(0, 0);
     }
 

}
