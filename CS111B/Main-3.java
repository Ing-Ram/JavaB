import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arraySize = 10;
    int num;
    int array[] = new int[arraySize];
    int lowest=Integer.MAX_VALUE;
    int biggest=0;
    
  for (int i =0; i < 10; i++ ){
    
      System.out.print("Enter a number: ");  
      array[i] = input.nextInt();
       
       if (lowest > array[i])
        lowest = array[i];
       if (biggest < array[i])
        biggest = array[i];
  } 
        
          System.out.println(lowest + " is the lowest.");
        
        
          System.out.println(biggest + " is the higest.");
     
     
      
     
    
  }
    //average = total / arraySize;
    //System.out.println("Your average is:" + array[]);
    
    
  }
