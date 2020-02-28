import java.util.Scanner;
/*
   Chad Ingram
   Jackalope
   CS111A

*/
public class Jackalope
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int starting_population, popu, numGen;
    String calc_again;
    final double BIRTH_RATE = 0.03, DEATH_RATE = 0.01;

    do
    {
      System.out.print("How many jackalopes do you have? ");
      starting_population = input.nextInt();
      System.out.print("How many generations do you want to wait? ");
      numGen = input.nextInt();
      input.nextLine(); 

      popu = starting_population;
      
      for(int g=0; g < numGen; g++)
      {
        popu += (int)(popu * BIRTH_RATE);
        popu -= (int)(popu* DEATH_RATE);  
      }

      System.out.println("If you start with " + starting_population
                         + " jackalopes and wait " + numGen
                         + " generations,\nyou'll end up with a total of "
                         + popu + " of them.");

      System.out.print("Do you want to calculate another population? ");
      calc_again = input.nextLine();
    }while(Character.toLowerCase(calc_again.charAt(0)) == 'y');
  }
}


/*
How many jackalopes do you have? 200
How many generations do you want to wait? 1
If you start with 200 jackalopes and wait 1 generations,
you'll end up with a total of 204 of them.

Do you want to calculate another population? y

How many jackalopes do you have? 132
How many generations do you want to wait? 2
If you start with 132 jackalopes and wait 2 generations,
you'll end up with a total of 137 of them.

Do you want to calculate another population? y

How many jackalopes do you have? 40
How many generations do you want to wait? 100
If you start with 40 jackalopes and wait 100 generations,
you'll end up with a total of 291 of them.

Do you want to calculate another population? n
*/
