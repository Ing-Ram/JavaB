
import java.util.Scanner;
 
public class ConsumerLoanProgram 
{
    public static void main(String s[])
    {   Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
         
        double time = 2; // 2 years
        double rate = input.nextDouble(); 
    
        double interest = calculateInterest( principal, time, rate ); // LINE A
    
        printSummary( principal, time, rate, interest );
    }
    
    public static double calculateInterest(double principal, double time, double rate) // LINE B
    {
        double result = principal * time * rate / 100.0; // LINE C
        return result;
    }
    
    public static void printSummary(double p, double t, double r, double interest)
    {
        System.out.print("Interest for Rs " + p + " for " + t + " years ");
        System.out.print("at the rate of " + r + "% p.a. is Rs " + interest);
    }




















/*
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        double balance;
        double monthlyPayment;
        double interestRate;
        System.out.print(" ** Welcome to the Consumer Loan Calculator **");
        System.out.println();
        balance = getPosNumber("How much do you want to borrow? $");
        interestRate = getPosNumber("What is the annual interst rate expressed as a percent? ");
        monthlyPayment = getPosNumber("What is the monthly payment amount? $");
        payOffLoan(balance, monthlyPayment, interestRate);
         
    }
 
    static double getPosNumber(String prompt)
    {
        double val;
        do
        {
        System.out.print(prompt);
        val = sc.nextDouble();
        if (val <= 0)
            System.out.println("You must enter a positive number");
        } while (val <= 0);
        return val;
    }
    static void payOffLoan(double balance, double monthlyPayment, double interestRate)
    {
        interestRate = interestRate/100.0;
        double monthlyRate = interestRate / 12.0;
        //double tmp = (balance * interestRate);
        double totalInterest = 0;
        double newbalance = 0;
        
        double totalBal =balance + (balance * interestRate);
        double month = totalBal/monthlyPayment;
        double tmp = totalBal/monthlyPayment;
        
        for (int i = 0; i < month;i++){
            monthlyPayment-=totalBal*(monthlyRate*monthlyPayment);
        }
        
        double interestMonth = month -(balance * monthlyRate) ;
         
        if (interestMonth > monthlyPayment)
        {
            System.out.println("You must make payments of at least $" + (interestMonth + 1));
            System.out.println("Because your monthly interest is $" + tmp);
        }
        else
        {
            newbalance = (monthlyPayment*month)-balance;
            double finalPayment = monthlyPayment + newbalance;
            totalInterest += interestMonth;
            System.out.println("Your dept will be paid off after months " + ((int)month+1)); //newbalance);
            System.out.println("with a final payment of just $" + newbalance); //finalPayment);
            System.out.println("The total amount of interest you");
            System.out.println("will pay during that time is $" + totalInterest);
                         
        }

   }*/

}


