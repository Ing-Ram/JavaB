import java.util.Scanner;

public class Purchase{

   private String name;
   private int groupCount; // Part fo the price- like "2 for 1"
   private double groupPrice;//2nd part of the "2 for 1"
   private int numberBought; // number of items bought
   
   
  
   
   /**
   This will read input from the keyboard- the price, name, 
   and number purchased
   */
   
   public void readInput()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of your item that " +
      "you are purchasing");
      name = input.nextLine();
      System.out.println("\nEnter the price as two numbers, "+
      "With a space between them");
      System.out.println("For Example 3 for 2.99 is enter: "+
       "(3 2.99)");
      System.out.println("Enter the price of the item as 2 " +
      "now");
      groupCount = input.nextInt();
      groupPrice = input.nextDouble();
      
      while ((groupCount <= 0) || (groupPrice <= 0))
      {//This will allow the user to try again
         System.out.println("Both numbers must be postive. " +
         "try again.");
         System.out.println("Enter price of items as pair. ");
         System.out.println("for example, 3 for 1.99 is entered" +
         "3 1.99");
         System.out.println("Enter price again-- as two numbers!");
         groupCount = input.nextInt();
         groupPrice = input.nextDouble();
      }
      
      System.out.println("\nEnter the number of items purchased:");
      numberBought = input.nextInt();
      
      while (numberBought<=0)
      {
         System.out.println("This number must be positve! do it again!");
         System.out.println("Enter number of item purchased:");
         numberBought = input.nextInt();
      }
   }
   
   public
    void setName(String newName)
   {
      name = newName;
   }
   /** 
   Sets the price count pieces for costForCount
   For example 2 for 1.99 (2 1.99)
   */
   public void setPrice(int count, double costForCount)
   {
      if ((count <= 0) || (costForCount <=0))
      {
         System.out.println("Error: Bad parameter in " +
         "set price");
         System.exit(0);
      }
      else
      {
         groupCount = count;
         groupPrice = costForCount;
      }
   }
   public void setNumberBought(int number)
   {
      if(number <= 0)
      {
         System.out.println("Error:Bad Parameter in "+
                     "setNumberBought");
         System.exit(0);
      }
      else 
         {
            numberBought = number;
         }
   }

      
   public double getTotalCost()
   {
      return (groupPrice / groupCount) * numberBought;
   }
   
   public double getUnitCost()
   {
      return groupPrice/groupCount;
   }
   public void writeOutput()
   {
      System.out.println(numberBought + " " + name);
      System.out.println("at " + groupCount + " for $"+ groupPrice);
      System.out.println("Total cost is: " + getTotalCost());
      System.out.println("Unit price is: " + getUnitCost());
   }

}