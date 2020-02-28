import java.util.Scanner; 
/*
 * 
A method called COMPOSITE() that accepts an integer
 argument and checks whether it is a composite number or not. 
 It returns 1 if it is composite and 0 if it is not.
 
A method called COUNT() that accepts an integer and returns the number of digits it has.

A method called POWER() that raises its first argument to the power of the second argument and displays the result.
 
 */


 public class method_test{
	 
	 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int num, a;
		 System.out.println("Enter a number");
		 num = input.nextInt();
		 COMPOSITE(num);
		 COUNT(num);
		 System.out.println("Enter a new number, and lets get the power of this new number: ");
		 a = input.nextInt();
		 POWER(a);
	 }

	 
	 public static void COMPOSITE(int num) {
		 int garb;
		 boolean isPrime = true;
		 for(int i = 2; i < num; i++) {
				
				garb = num%i;
				if (garb == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(num + " is not a composite number.");
				return;
			}	
			else
				System.out.println(num + " is a composite.");
				return;
			}
	
	 
 	public static void COUNT(int num) {
	 
 		int i=0;
	  
 		while( 0 < num){
	    
 			num/=10;
 			i+=1;
 	}
	 System.out.println(i + " digits");
	 
	 
 	}
 	
 	public static void POWER(int a) {
 		Scanner input = new Scanner(System.in);
 		int b;
 		int num=1;
 		//System.out.println("Enter a first number: ");
 		//a = input.nextInt();
 		System.out.println("Enter a second number: ");
 		b = input.nextInt();
 		
 		while (b > 0) {
 			b--;
 			num = num*a;
 		 
 		}
 		System.out.println("Power: "+ num +"\n");
 		
 	}
	 
 }	 
	 
	 
	 
 