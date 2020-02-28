public class EmployeeTest
{
   public static void main(String[] args)
   {
      Employee testEmployee = new Employee();
      //name, Salary, DOH,IDnum
      testEmployee.reset("Chad", 5000.00, 0223,"12345" );
      testEmployee.writeOutput();
   
   
   }


}

/**
  ----jGRASP exec: java EmployeeTest
 Name: Chad
 Salary: 5000.0
 Date of hire: 147
 ID: 12345
 
  ----jGRASP: operation complete.
*/ 