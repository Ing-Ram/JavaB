import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
  
   trigger();
  
  
  }
   
 public static void trigger()
 {  
   
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, welcome to our program:\n");
  
      // Prompt user for details of loan
       
    System.out.print("Enter loan amount: ");
    int loanAmount = input.nextInt();
       
    System.out.print("Enter interest rate: ");
    double interestRate = input.nextDouble();
    
    System.out.println("How much will you pay monthly?");
    int loanTerm = 2;  
    
    //calculateMonthlyPayment(loanAmount, loanTerm, interestRate); 
         
      System.out.println("Your monthly payment is: " + calculateMonthlyPayment(loanAmount, loanTerm, interestRate)); 
 }   
    
    
 public double monthlyPayment()
 {
   Scanner input = new Scanner(System.in);
   System.out.println("How will you pay monthly: ");
   double monthly = input.nextDouble();
   return monthly;
 }

    
    
    
    
    
    
    public static double calculateMonthlyPayment(
      int loanAmount, int termInYears, double interestRate)
      {
      termInYears = 2;
      // Convert interest rate into a decimal
      // eg. 6.5% = 0.065
       
      interestRate /= 100.0;
       
      // Monthly interest rate 
      // is the yearly rate divided by 12
       
      double monthlyRate = interestRate / 12.0;
       
      // The length of the term in months 
      // is the number of years times 12
       
      int termInMonths = termInYears * 12;
       
      
       
      double monthlyPayment = 
         (loanAmount*monthlyRate) / 
            (1-Math.pow(1+monthlyRate, -termInMonths));
       
      return monthlyPayment;
    }
    

  
 
    
 
 
     

  
}