import java.util.Scanner;

class InterfaceProject
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      FractionOfFractions f = new FractionOfFractions();
      String input = "";
      boolean repeat = true;
      while(repeat)
      {
         System.out.println("                Enter Fraction Function\n" + 
                            "Format: fraction seperated by a space between the operator\n" + 
                            "                       n/d + n/d");
         input = in.nextLine();
         f.input(input);
         repeat = false;
         try{
            f.divideByZero();
         }
         catch(Exception e){
            System.out.println(e.getMessage());
            repeat = true;
         }
        // f.reciprocal();
      f.getFraction();
      }
      
      
   }
}