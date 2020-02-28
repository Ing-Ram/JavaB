public class Employee extends Person{
   /**
   1.	Define a class named Employee whose
    objects are records for employees. 
    Derive this class from the class Person 
    given in Lesson. An employee record 
    inherits an employee’s name from the 
    class Person. In addition, an employee 
    record contains an annual salary 
    represented as a single value of 
    type double, a hire date that gives the 
    year hired as a single value of 
    type int, and an identification number that
    is a value of type String. 
    Give your class a reasonable
    complement of constructors, 
    accessor methods, and mutator methods. 
    Write a program to fully test your class
    definition.
*/



   //name from person**
   private double salary;
   private int dateOfHire;
   private String iD;
   
   public Employee()
   {
      super();
      salary = 0.0;
      dateOfHire = 0;
      iD = "Nothing";
      
   }
   
   //This is my employee constructor 
   public Employee(String startName,double StartSalary, int StartDateOfHire, String StartId)
   {
      super(startName);
      salary = StartSalary;
      dateOfHire = StartDateOfHire;
      iD = StartId;
   
   }
   
   //reset method
   public void reset(String newName, double newSalary, int newDate, String newId)
   {
      setName(newName);  //name
      salary = newSalary; //salary
      dateOfHire = newDate; //doh
      iD= newId;  //id
   
   }
   
   public double getEmployeeSalary()
   {
      return salary;
   }
   
   public void setEmployeeSalary(double newSalary)
   {
      salary = newSalary;
   }
   
   public int getEmployeeDateOfHire()
   {
      return dateOfHire;
   }
   
   public void setEmployeeDateOfHire(int newDate)
   {
      dateOfHire = newDate;
   }
   
   public String getEmployeeId()
   {
      return iD;
   }
   
   public void setEmployeeId(String newId)
   {
      iD = newId;
   }
   
   public void writeOutput()
   {
      System.out.println("Name: " + getName());
      System.out.println("Salary: " + salary);
      System.out.println("Date of hire: " + dateOfHire);
      System.out.println("ID: " + iD);
   
   }
}





