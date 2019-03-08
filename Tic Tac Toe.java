import java.util.Scanner;

class Tictactoe
{
   public static void main(String[] args)
   {
      int playerWin = 0; //determines the status of the game, 1 for player 1 wins, 2 for player 2 wins.
      int input = 0; //this will be used to take input from the user
      int rounds = 0; // this will keep track of the rounds, when it reaches 9th round and no one has won it will help us declare draw
      boolean p1turn = true; // this is to keep track of the turn
      boolean gameEnd = false; // this will be used to stop any other code from running and skip to the end if winning condition has been met, 9th round, or other conditions that should stop the game.
      int row = 4, col = 4; 
      char[][] array = new char[row][col];
      reset(array, row, col, gameEnd, p1turn, playerWin);
      displayGame(array, row, col);
      change2Darray
      
      
      if(playerWin != 0)
      {
         gameEnd = true;
      }
   }
   
   public static void reset(char[][] array, int row, int col, boolean gameEnd, boolean p1turn, int playerWin) { //this reset statement is to reset the game to its initial values.
      gameEnd = false;
      p1turn = true;
      rounds = 0;
      playerWin = 0;
      char num = '1';
      char space = 32;
      for(int i = 0; i < row; i++) { // the reset statement will be used to initialize the game as well. so it will initialize the game board.
         for(int j = 0;j < col; j++) {
            if (i >= (row-3) && j >= (col-3)) {
               array[i][j] = num;
               num++;
            }else if(i == (row-4) && j == (col-3)) {
               array[i][j] = 'c';
            }else if(i == (row-4) && j == (col-2)) {
               array[i][j] = 'o';
            }else if(i == (row-4) && j == (col-1)) {
               array[i][j] = 'l';
            }else if(i == (row-3) && j == (col-4)) {
               array[i][j] = 'r';
            }else if(i == (row-2) && j == (col-4)) {
               array[i][j] = 'o';
            }else if(i == (row-1) && j == (col-4)) {
               array[i][j] = 'w';
            }else {
               array[i][j] = space;
            }
         }
      }
   }
   
   public static void displayGame(char[][] array, int row, int col) // this just displays the board
   {
      System.out.println("Tic-Tac-Toe");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < col; j++)
         {
            System.out.print(array[i][j]);
            if(j < (col-1)) //this prevents the  '|' to be printed out on the right side
            {
               if(i > (row-4) && j > (col-4)) // this prints out the '|' only after the first and second row of the tic tac toe number area
               {
                  System.out.print("|");
               }
               else
               {
                  System.out.print(" "); // if its before the tic tac toe area, it prints a space to keep everything aligned
               }
            }
         }
         if(i > (row-4))
         {
            System.out.println(); // new line after each of these lines
         }
         for(int j = 0; j < col; j++)
         {
            if(i < (row-1) && i > (row-4)) // this makes sure that the dashes is only printed out in the tic tac toe area so it squeezes the area from top to bottom
            {
               if(j > (col-4) && j < (col-1)) // this squeezes the area between the left and right side
               {
                  System.out.print("--"); // prints -- if its in the tic tac toe area
               }
               else if(j >= (col-1)) // if its at the on the right side, so last column it will print just a single -
               {
                  System.out.print("-");
               }
               else
               {
                  System.out.print("  "); // if its anywhere before the tic tac toe area it will print two spaces "  "
               }
            }
         }   
         System.out.println(); // new line after each of these lines
      }
   }
   
   public static boolean P1turn(boolean turn) // turn counter, this is like a flip flop to change turns
   {
      if(turn == false)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public static void change2Darray(char[][] array, int row, int col, int input, boolean turn) // this is used to change the markings in the array and is turn dependant
   {
      switch(input)
      {
         case 1:  array[row-3][col-3] = marking(turn);
                  break;
         case 2:  array[row-3][col-2] = marking(turn);
                  break;
         case 3:  array[row-3][col-1] = marking(turn);
                  break;
         case 4:  array[row-2][col-3] = marking(turn);
                  break;
         case 5:  array[row-2][col-2] = marking(turn);
                  break;
         case 6:  array[row-2][col-1] = marking(turn);
                  break;
         case 7:  array[row-1][col-3] = marking(turn);
                  break;
         case 8:  array[row-1][col-2] = marking(turn);
                  break;
         case 9:  array[row-1][col-1] = marking(turn);
                  break;
      }
   }
   public static char marking(boolean turn) // this returns a X or O dependant on the turn
   {
      if(turn)
      {
         return 'X';
      }
      else
      {
         return 'O';
      }
   }
   
   public static int winningCondition(char[][] array, int row, int col, int playerWin) // this is the winning condition, it checks all the rows and columns and diagonals for a winning condition. if it returns a number then another statement will know that the game as ended
   {            
      if((array[row-3][col-3] == 'X' && array[row-3][col-2] == 'X' && array[row-3][col-1] == 'X') || 
      (array[row-2][col-3] == 'X' && array[row-2][col-2] == 'X' && array[row-2][col-1] == 'X') || 
      (array[row-1][col-3] == 'X' && array[row-1][col-2] == 'X' && array[row-1][col-1] == 'X') || 
      (array[row-3][col-3] == 'X' && array[row-2][col-3] == 'X' && array[row-1][col-3] == 'X') || 
      (array[row-3][col-2] == 'X' && array[row-2][col-2] == 'X' && array[row-2][col-2] == 'X') || 
      (array[row-3][col-1] == 'X' && array[row-2][col-1] == 'X' && array[row-1][col-1] == 'X') || 
      (array[row-3][col-3] == 'X' && array[row-2][col-2] == 'X' && array[row-1][col-1] == 'X') || 
      (array[row-3][col-1] == 'X' && array[row-2][col-2] == 'X' && array[row-1][col-3] == 'X'))
      {
         return 1;
      }
      if((array[row-3][col-3] == 'O' && array[row-3][col-2] == 'O' && array[row-3][col-1] == 'O') || 
      (array[row-2][col-3] == 'O' && array[row-2][col-2] == 'O' && array[row-2][col-1] == 'O') || 
      (array[row-1][col-3] == 'O' && array[row-1][col-2] == 'O' && array[row-1][col-1] == 'O') || 
      (array[row-3][col-3] == 'O' && array[row-2][col-3] == 'O' && array[row-1][col-3] == 'O') || 
      (array[row-3][col-2] == 'O' && array[row-2][col-2] == 'O' && array[row-2][col-2] == 'O') || 
      (array[row-3][col-1] == 'O' && array[row-2][col-1] == 'O' && array[row-1][col-1] == 'O') || 
      (array[row-3][col-3] == 'O' && array[row-2][col-2] == 'O' && array[row-1][col-1] == 'O') || 
      (array[row-3][col-1] == 'O' && array[row-2][col-2] == 'O' && array[row-1][col-3] == 'O'))
      {
         return 2;
      }
      return 0;
   }
}