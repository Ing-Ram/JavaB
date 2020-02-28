import java.util.Scanner;

class Enter_10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arraySize = 10;
    int num;
    int array[] = new int[arraySize];
    int total = 0;
    int average =0;
    
    for (int i =0; i < 10; i++ ){
      System.out.println("Enter a number: ");  
      array[i] = input.nextInt();
      total += array[i];
      System.out.println("total:"+ total);
    }
    average = total / arraySize;
    System.out.println("Your average is:" + average);
    
    
  }
}
