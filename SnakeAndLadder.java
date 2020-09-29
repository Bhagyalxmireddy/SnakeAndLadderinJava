import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int ENDINGPOSITION = 100;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   static final int NOPLAY = 0;
   static String Action;
   int CurrentPosition = 0;
   int DiecCount;
     public int gamePlayed(int CurrentPosition, int DiceCount)
     {
      for(int CurrentPosition = 0; CurrentPosition <= 100;)
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
              System.out.println("Dice value is: " +DICE+ " for " +Action+ " then currentpostion is: " +CurrentPosition);
              }
             else
             { 
                CurrentPosition = CurrentPosition;
             }
      }
       if(Action == "Ladder" && CurrentPosition != ENDINGPOSITION)
       {
           DiceCount = numOfTimesDicePlayed(DiceCount);
           gamePlayed(CurrentPositin, DiceCount);
       } 
      return CurrentPosition; 
      }
     public int numOfTimesDiceplayed(int diceCount)
    {
      diceCount++;
      return diceCount;
      SnakeAndLadder player = new SnakeAndLadder();
      player.gamePlayed(0, 0);
    }

    public static void main(String args[])
    {
      System.out.println("Welcome to SnakeAndLadder Game");
      //SnakeAndLadder player = new SnakeAndLadder();
      SnakeAndLadder played = new SnakeAndLadder();
      //player.gamePlayed(0, 0);
      played.numOfTimesDicePlayed(0);
     }
 

}
