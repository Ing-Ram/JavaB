import java.util.Scanner;
/*
Write a program that accepts 10 numbers into an array and 
then finds and displays the sum of all even numbers 
and sum of all odd numbers in the array. 
Display the array, and both the sums. 
*/
class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int arraySize = 10;
    int num;
    int array[] = new int[arraySize];
    int total_odds=0; int total_evens =0;
    
    for (int i =0; i < 10; i++ ){
    
      System.out.print("Enter a number: ");  
      array[i] = input.nextInt();
      if (array[i]%2==0)  
        total_evens+=array[i];
      
      else
        total_odds+=array[i];
      }
      System.out.println("Total odds: " + total_odds);
      System.out.println("Total evens:"+ total_evens);
      
  }
}