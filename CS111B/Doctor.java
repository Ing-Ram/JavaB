public class Doctor extends Person{
/**2.	Define a class named Doctor whose objects
are records for a clinic’s doctors. Derive this 
class from the class Person given in Lesson. 
A Doctor record has the doctor’s name—defined in
the class Person—a specialty as a string 
(for example Pediatrician, Obstetrician, General Practitioner,
and so on), and an office-visit fee (use the type double).
Give your class a reasonable complement of constructors 
and accessor methods,. Write a driver program to test all
your methods.
  
  */
      //name from person**
      String specialty;
      double officeFee;
   
   
      public Doctor()
      {
         super();
         specialty = "Say anything";
         officeFee= 0;
      
      }
      
      public Doctor(String name, String title, double fee)
      {
         setName(name); //name
         specialty = title; //occupational title
         officeFee = fee; //office fee
      }
      
      public void reset(String newName, String newTitle, double fee)
      {
         setName(newName);
         specialty = newTitle;
         officeFee=fee ;
      }
      
      public String getSpecialty()
      {
         return specialty;
      }
      public void setSpecialty(String newTitle)
      {
         specialty = newTitle;
      }
      public double getFee()
      {
         return officeFee;
      }
      public void setFee(double fee)
      {
         officeFee = fee;
      }
      
      public void writeOutput()
      {
         System.out.println("Name: " + getName());
         System.out.println("Specialty: "+ getSpecialty());
         System.out.println("Office fee: " + officeFee); 
      }
}
