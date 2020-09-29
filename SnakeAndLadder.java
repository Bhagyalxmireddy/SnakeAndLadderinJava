import java.util.*;
class SnakeAndLadder{
   static final int STARTINGPOSITION = 0;
   static final int LADDER = 1;
   static final int SNAKE = 2;
   
     public static void gamePlayed()
     {
          double DICE = Math.floor(Math.random()*10)%6;
     }


    public static void main(String args[])
    {
    	System.out.println("Welcome to SnakeAndLadder Game");
        gamePlayed();
    }


}
