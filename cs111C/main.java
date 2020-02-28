class Main {
//Chad Ingram
//CS111c
//I used REPL.it as my IDE, and then used vi
  public static void main(String[] args) {
      Queens Queen = new Queens(); 
      Queen.displayBoard();
      Queen.clearBoard();
      System.out.println('\n');
      Queen.placeQueens(1);
      Queen.displayBoard(); 
  }
}

