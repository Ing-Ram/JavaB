import java.util.Scanner;
import java.io.*;
/*Chad Ingram
Lab 12
*/


class DistanceFileExtra {
  
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
   // while (getMiles() != 0 || getTime() != 0 || getSplits() != 0){
    int mph = getMiles(); //miles per hour
    int sMins = getTime(); //Duration of drive
    int dMins = getSplits(); //splits to check
   
    System.out.println("\nReport written to DistanceReport.txt.");
    //d = r * t
    double milesT = mileCalc(mph);
    double distance = distTravl(milesT, sMins);
    String chad = reportD(sMins,distance, dMins, milesT) ;
    //printint out my results
    
   
   
    
    
    
    
           // The name of the file to create.
        String fileName = "DistanceReport.txt";

        try {
            // Put some bytes in a buffer so we can
            // write them. Usually this would be
            // image data or something. Or it might
            // be unicode text.
            String bytes = reportD(sMins,distance, dMins, milesT);
            byte[] buffer = chad.getBytes();

            FileOutputStream outputStream =
                new FileOutputStream(fileName);

            // write() writes as many bytes from the buffer
            // as the length of the buffer. You can also
            // use
            // write(buffer, offset, length)
            // if you want to write a specific number of
            // bytes, or only part of the buffer.
            outputStream.write(buffer);

            // Always close files.
            outputStream.close();       

            System.out.println("Wrote " + buffer.length + 
                " bytes");
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        
    
  }
    
   
  
  
  
  
  public static int getMiles()
  {
    try 
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter vehicles speed in mile per hour:");
    int mph = input.nextInt();
    
    if (mph < 0)
      throw new Exception("This must be above 0 mph.");
      
    return mph;
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        
    }
    

  return giveSecondchance();
  }
  public static int getTime()
  {
      try
      {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number of minutes the vehicle " + "was in motion: "); 
        int dMins = input.nextInt();
        if (dMins < 60)
           throw new Exception("This must be greater than 60");
      
        return dMins;
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
        
        
      }
    return giveSecondchance();
  }
  
  
  public static int getSplits()
  {   try
      {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many minutes should be skipped" + 
         " between lines in the report?: ");
        int sMins = input.nextInt();
        if (sMins < 0)
          throw new Exception("This cant be negavitve");
        
        return sMins;
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
        
      }
    return giveSecondchance();  
  }
  
  //convert miles to number 
  public static double mileCalc(int a)
  {
      double calc = (double)a/60;
      return calc;
  }
  
  public static double distTravl( double dconMiles, int dMins)
  {
     double dTravl =  dconMiles * dMins;
     return dTravl;
    
  }
  public static int giveSecondchance()
  { Scanner input = new Scanner(System.in);
    System.out.println("Enter the info again");
    int a = input.nextInt();
    if (a < 0)
    {
      System.out.println("Still too low!");
      System.exit(0);
      
    }
    return a;
  }
  
  
  public static String reportD(double minutes, double distance, int incre, double rate)
   {      String Cares = " ";
          String Chad = "Minutes           Distance Traveled\n "+ "----------------------------------\n"+(int)minutes +"               " + distance;
     
     
     for (int i = (int)minutes; i-incre > 0; i--)
     {
     //"%,.1f               %,.1f  \n", minutes,distance);
    
     minutes -= incre;
     distance = minutes* rate;
     if (minutes==0 || distance == 0)  
      break;
     Cares +=  "\n" + (int)minutes + "                " + distance;
     }
     
     return Chad += Cares; 
     
   }
    //System.out.println(incre + "  "+ rate);
   //System.out.printf(minutes + "                " + distance);
   // System.out.println("Minutes           Distance Traveled");
    // System.out.println("---------------------------------- ");
     //int a = minutes%incre;
}
