import java.util.Scanner;
class Dog{
Scanner input = new Scanner(System.in);
String name;
int age;
String location;

void display()
{
   System.out.println("name: " + name); 
   System.out.println("age: " + age); 
   System.out.println("location: " + location); 
   System.out.println("Age in human years: " + getAgeInHumanYears());
   System.out.println();
}

public int getAgeInHumanYears()
   {
      int humanAge = 0;
      if (age <= 2)
          humanAge=age*11;
      else
          humanAge = 22 + ((age-2) *5);
      
          return humanAge;

   }
}