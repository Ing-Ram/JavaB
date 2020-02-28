import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import java.time.LocalDate;
import java.util.Scanner;


public  class JoptExample_ass3 extends Application
{
   public static void main(String[] args)
   {
      /*Write code for a JOptionPane dialog that will ask whether the user is at least 18 years of age. 
      Then set the boolean variable adult equal to either true, if the user is at least 18, or false otherwise. 
      Include the declaration of the variable adult.
      
      int aws = 
      JOptionPane.showConfirmDialog(null, "Are you 18 years old, or older?",
                                     "Click yes, or no:", JOptionPane.YES_NO_OPTION);
      boolean adult = false;                                
                  
      if(aws == JOptionPane.YES_OPTION){
         adult = true;
         System.out.println("Cool! Let's continue");
         
      
      
      }else if(aws == JOptionPane.NO_OPTION){
         adult = false;
         System.exit(0);
   }else{
      System.out.println("Horrible input");
      }
      
      
   */   
   
    //  2. Write a code to draw a colored frowning face.
      
      launch(args);}
      
   /*
   
   3.  Use showConfirmDialog box to take user confirmation for finding the factorial 
   of a number. If the user confirms Yes, Use dialog boxes to take the input of a number 
   and displaying it’s factorial.

   

   Write a program that inputs two strings that represents a time of day using 
   the format HH:MM:SS AM or PM and then outputs the time elapsed from the first 
   to the second time in minutes and seconds.

   For example, given the strings:

   11:58:10 PM
   12:02:15 AM
   The program should output that the time elapsed is 4 minutes and 5 seconds.

   Use dialog boxes.
   */
  /* 
   String ftime = JOptionPane.showInputDialog("Enter your first time:(HH:MM:SS am)");

   String stime = JOptionPane.showInputDialog("Enter your second time:(HH:MM:SS pm) ");
   
   
   
   System.out.println(ftime.charAt(9));
   //compares am/pm to 
   if (ftime.charAt(9) == 'a' || ftime.charAt(9) == 'A')
   {
      System.out.println("this is normal 1st");
    }
      
   if (stime.charAt(9) == 'a' || stime.charAt(9) == 'A')
   {
         System.out.println("this is normal 2nd");
      
   }   
      
   if (ftime.charAt(9) == 'p' || ftime.charAt(9) == 'P')
   
   {
      int[] first = ftime.split(":");
      System.out.println(first); //Do the math
      
      
   }
   
   if (stime.charAt(9) == 'p' || stime.charAt(9) == 'P')
   {
      System.out.println("this is +12 2nd"); //Do the math
   
   }  
      
    */  
      
   /*
   Write a program that reads a string from the keyboard and tests whether it
   contains a valid date. Display the date and a message that indicates whether
   it is valid. If it is not valid, also display a message explaining why it is
   not valid.

   The input date will have the format mm/dd/yyyy. 
   A valid month value mm must be from 1 to 12 (January is 1). 
   The day value dd must be from 1 to a value that is appropriate for the given month. 
   September, April, June, and November each have 30 days. February has 28 days except
   for leap years when it has 29. The remaining months all have 31 days each.
   A leap year is any year that is divisible by 4 but not divisible by 100 unless 
   it is also divisible by 400. 

   Use dialog boxes.
  */ 
/*
  String input = JOptionPane.showInputDialog("Enter date (dd/MM/yyyy)");
   DateTimeFormatter f = DateTimeFormatter.ofPattern ( "dd/MM/yyyy" );
   try {
    LocalDate ld = LocalDate.parse ( input , f );
    System.out.println ( "ld: " + ld );
         }catch (DateTimeParseException e ) {
             System.out.println ( "ERROR: " + e );
                       
   }

}
*/
/*
Color the inner circle blue.

Outer circle : red

Arcs: Green

Write a JavaFx application to create a colored snowman .
   */
   /*
   
   //This is for snow man-- must uncomment #2
      @Override
    public void start(Stage primaryStage) throws Exception 
   {
      Group root = new Group();
      Scene scene = new Scene(root);
      Canvas canvas =new Canvas(800, 800);
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.setFill(Color.YELLOW);
      gc.fillOval(125,55,150,150);
      gc.fillOval(125,175,175,175);
      gc.fillOval(125,300,200,200);
      //gc.strokeOval(220,50,150,150);
      //gc.strokeOval(390,50,150,150);
      //gc.strokeOval(130,135,150,150);
      //gc.strokeOval(300,135,150,150);
      gc.setFill(Color.BLACK);
      gc.fillOval(175,100,10,20);
      
      gc.fillOval(220,100,10,20);
      gc.setStroke(Color.RED);
      gc.strokeArc(175,135,50,30,180,180,ArcType.CHORD);
      root.getChildren().add(canvas);
      primaryStage.setTitle("Snowman in JavaFX");
      primaryStage.setScene(scene);
      primaryStage.show(); 
   }

   
   */
 
   
   
   //This is for smiley face.
     /* @Override
      public void start(Stage primaryStage) throws Exception 
   {
      Group root = new Group();
      Scene scene = new Scene(root);
      Canvas canvas =new Canvas(600, 400);
      GraphicsContext gc = canvas.getGraphicsContext2D();
      gc.setFill(Color.YELLOW);
      gc.fillOval(125,55,150,150);
      //gc.strokeOval(220,50,150,150);
      //gc.strokeOval(390,50,150,150);
      //gc.strokeOval(130,135,150,150);
      //gc.strokeOval(300,135,150,150);
      gc.setFill(Color.BLACK);
      gc.fillOval(155,100,10,20);
      
      gc.fillOval(230,100,10,20);
      gc.setStroke(Color.RED);
      gc.strokeArc(145,145,110,55,0,180,ArcType.CHORD);
      root.getChildren().add(canvas);
      primaryStage.setTitle("HappyFace in JavaFX");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   */
}