
/*
1.	In the following two lines, one identifier names a class, one identifier names a method, and something is an argument. What is the class name? What is the method name? What is the argument? The Class is JOptionPane. The method is  showInputDialog. And the argument is “Enter the number of apples”.
appleString = JOptionPane.showInputDialog("Enter number of apples:");


2. Give a Java statement that will display a dialog window on the screen with the message
I Love San Francisco.
JOptionpane.showDialog(null,“I Love San Francisco”);

3. Give a Java statement that, when executed, will end the program.
System.exit(0);

4. What would happen if you omitted System.exit(0) from the program in example? Would the program compile? Would it run without problems?
Nothing would happen if you omitted System.exit(0) from your program. The program would compile,
and it would without the notice of anything going wrong. 
However, the program is still running invisibly in the back ground. Still taking up memory.
*/

import javax.swing.JOptionPane;
public  class JoptExample{
public static void main(String[] args){

//5. Write a complete Java program that takes the input of First Name, Middle Name
// and Last name using input dialog box. 
//It produces a dialog window containing the complete name . 

/*
String fname = JOptionPane.showInputDialog("Enter your first name");
String mname = JOptionPane.showInputDialog("Enter your middle name");
String lname = JOptionPane.showInputDialog("Enter your last name");

JOptionPane.showMessageDialog(null, fname + " " + mname + " "+ lname);
System.exit(0);
*/



//6. Write a complete Java program that behaves as follows. 
//The program displays an input dialog window asking the user to enter a whole number.
//When the user enters a whole number and clicks the OK button, the window 
//goes away and an output dialog window appears. This window simply tells 
//the user what is the factorial of the number. When the user clicks the 
//OK button in the window, the program ends. 
/*
long num = Integer.parseInt(JOptionPane.showInputDialog("Enter a whole number"));
long fact=1;
for (int i = 1; i <= num; i++)
{
      fact = fact*i;
}
System.out.println(num);
JOptionPane.showMessageDialog(null,"Factorial:"+ fact);
System.exit(0);
*/




//7. Write a complete Java program to take the input of salary and then calculate taxes.
// Display the calculated taxes. (search to find the tax brackets).Use input and 
// display dialog boxes. 


/*
double pay = Double.parseDouble(JOptionPane.showInputDialog("Enter your Salary:"));
double salary = pay;
double tax = 0.0;

if (salary < 0){
   JOptionPane.showMessageDialog(null,"No need to do taxes this year!"); 

}else if ((salary >= 0) && (salary <= 9325.00)){
   tax = salary * .10;

}else if((tax > 9325.00) && (tax <= 37950.00)){
   tax = salary * .15;

}else if ((tax > 37950.00) && (tax <= 91900.00)){
   tax = (salary * (25/100));
   
}else if ((tax > 91900.00) && (tax <= 191651.00)){
   tax = (salary * .28);
   
}else if ((tax > 191651.00) && (tax <=416700.00)){
   tax = (salary * .33);
   
}else if ((tax > 416701) && (tax<=418400.00)){
   tax = (salary * .35);
   
}else {
   tax = (salary * .396);
}   


JOptionPane.showMessageDialog(null,String.format("Your tax is $%.2f",tax));
System.exit(0);
*/


}
}
