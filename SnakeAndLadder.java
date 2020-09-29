import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int ENDINGPOSITION = 100;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   static final int NOPLAY = 0;
   static String Action;
   
     public static void gamePlayed()
     {
         if(CurrentPosition < ENDINGPOSITION)
     public  void gamePlayed()
     {
	int Position = STARTINGPOSITION;
  	int Dicecount = 0;
         if(Position <= ENDINGPOSITION)
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
                     break;
                     case NOPLAY:
                      Action = "Noplay";
                      Position = Position;
                      break;
                  }
			System.out.println("Dice value is: " +DICE+ " for " +Action+ " and the currentpostion is: " +Position);
                        Dicecount ++;
                        System.out.println("Dicecount is:" +Dicecount);
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
			Player1position = GamePlayed(Player1position,dice_count);
			dice_count = dice_Player(dice_count);
			if(Player1position == ENDINGPOSITION)
			{
				break;
			}
			System.out.println("Player 2 :-  ");
			Player2position = GamePlayed(Player2position,dice_count);
			dice_count = dice_Player(dice_count);
		}
		if(Player1position == ENDINGPOSITION)
		{
			System.out.println();
			System.out.println("Player 1 Won The Match ");
		}
		else if(Player2position == ENDINGPOSITION)
		{
			System.out.println();
			System.out.println("Player 2 Won The Match ");
		}
		System.out.println("Total Dice Count of both Players "+dice_count);
	}

    public static void main(String args[])
    {
    	System.out.println("Welcome to SnakeAndLadder Game");
        SnakeAndLadder player = new SnakeAndLadder();
	player.gamePlayed();
    }


}
