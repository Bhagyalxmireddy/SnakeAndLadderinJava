import java.util.*;
class SnakeAndLadder{
        static final int STARTINGPOSITION = 0;
        static final int ENDINGPOSITION = 100;
        static final int LADDER = 1;
        static final int SNAKE = 2;
        static final int NOPLAY = 0;
        static final int PLAYER = 0;
        static final int PLAYER1 = 0;
        static final int PLAYER2 = 0;
        static Random random = new Random();
        static String action;
        static int diceCount = 0;
        static int numberOfPlayers = 2;
        static int[] playerarray = new int[numberOfPlayers];
            public static void playerPosition()
            {
                for(int i = 0; i < playerarray.length; i++)
                {
                 	playerarray[i] = STARTINGPOSITION;
                }
            }
                
		public static void gamePlayed()
                {
                        int position = STARTINGPOSITION;
                        for(int i = 0; i < playerarray.length; i++)
                        {
                                        System.out.println("player is:" +(i+1));
                                        int dice = (random.nextInt(6)+1);
                                        System.out.println("The Dicenumber is:" +dice);
                                        diceCount ++;
                                        int chooseOption = (random.nextInt(3));
                                        switch(chooseOption)
                                        {
                                                case LADDER:
                                                        action = "Ladder";
                                                        int currentPosition = (playerarray[i] + dice);
                                                        if(currentPosition > ENDINGPOSITION)
                                                        {
                                                                System.out.println("Dice value is more than 100 so that player stay in the same position");
                                                        }
                                                        else
                                                        {
                                                                playerarray[i] = currentPosition;
                                                                if(playerarray[i] != ENDINGPOSITION)
                                                                {
                                                                        gamePlayed();
                                                                }
                                                        }
                                                break;
                                                case SNAKE:
                                                        action = "snake";
                                                        int currentPosition1 = playerarray[i] - dice;
                                                        playerarray[i] = currentPosition1;
                                                        if(playerarray[i] < 0)
                                                        {
                                                                playerarray[i] = 0;
                                                        }
                                                break;
                                                case NOPLAY:
                                                        action = "Noplay";
                                                        position = position;
                                                break;
                                      }
                                System.out.println("The Dice value is: " +dice+ " for " +action+ " and the current position is :" +playerarray[i]);
                        }
                }
                public static void turn()
                {
                        playerPosition();
                        int game = 0;
                        while(game != 1)
                        {
                        	for(int i = 0; i < playerarray.length; i++)
                           	{
                                	System.out.println("The player is: " +(i+1));
                                	gamePlayed();
                                	if(playerarray[i] == ENDINGPOSITION)
                                	{
                                        	game = 1;
                                        	System.out.println("player:" +(i+1)+ " won the game");
                                         	break;
                                	}
                           	}
                        }
                         for(int i = 0; i < numberOfPlayers; i++)
                         {
                          	System.out.println("player:"+(i+1)+ " and the position is" +playerarray[i]);
                         }
                         System.out.println("dicecount value is:" +diceCount);
                }
                public static void main(String args[])
                {
                        System.out.println("Welcome to SnakeAndLadder Game");
                        gamePlayed();
                        playerPosition();
                        turn();
                }
}
