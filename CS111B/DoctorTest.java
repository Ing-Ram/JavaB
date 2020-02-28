public class DoctorTest
{

   public static void main(String[] args)
   {
      Doctor num1 = new Doctor();
      num1.reset("Chad Ingram", "General Practitioner",532.23);
      num1.writeOutput();
   
   }


/**

      
  ----jGRASP exec: java DoctorTest
 Name: Chad Ingram
 Specialty: General Practitioner
 Office fee: 532.23
 
  ----jGRASP: operation complete.
 
*/


}