import java.util.Scanner;
class TimeCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //int minute = 60; int hour = 3600; int day = 86400;
    
    
    
    System.out.println("Please enter your seconds: ");
    int seconds = input.nextInt();  
      
      if((seconds >= 1) && (seconds <=59)) // shows seconds
      {
        System.out.println("Seconds: "+ seconds);
      }
      
      if((seconds >= 60) && (seconds <= 3599)) // add minutes calculation and subtracts seconds from minutes
      {
       int minute=seconds/60 ;//- (seconds%60);
       seconds= seconds -(minute*60);  
        System.out.println("Minutes: "+ minute + " Seconds: "+ seconds);
      }
      
      if ((seconds >= 3600) && (seconds <= 86399))//add hours calc and subracts hours and minutes and then displays them.
      {
        int hour = seconds/3600;
        int minute= (seconds/60)-(hour*60);
        seconds = seconds - (minute*60) - (hour*3600);
        System.out.println("Hours: " + hour +" Minutes: " + minute+ " Seconds: " + seconds);
      }
      
      if (seconds >= 86400)
      {
        int day =  seconds/86400;
        int hour = (seconds/60)%60;
        int minute = (seconds%3600 ) / 60;
        
        
        seconds = seconds % 60;
        System.out.println("Days: " + day +" Hours: " + hour + " Minutes: " + minute + " Seconds: " + seconds);
      }
    
  }
  
}
