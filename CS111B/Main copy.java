import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter 3 numbers");
  int a,b,c;
  a = input.nextInt();
  b = input.nextInt();
  c = input.nextInt();
  
  if ((a > b) && (b >c))
    System.out.println(a + " is your larger number");
  else if ((a < b) && (b > c))
    System.out.println(b + " is your larger number");
  else if (a == b)
    System.out.println(a + " was entered twice. Do it again!");
  else if (b == c)
    System.out.println(b + " was entered twice. Do it again!");
  else
    System.out.println(c + " is your larger number");
  
  }
}