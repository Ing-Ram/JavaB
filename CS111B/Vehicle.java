public class Vehicle extends Person{
/**

3.	Create a base class called Vehicle that 
has the manufacturer’s name (type String), number of 
cylinders in the engine (type int), and owner 
(type Person given in Lesson). Then create a class 
called Truck that is derived from Vehicle and has
additional properties: the load capacity in tons 
(type double, since it may contain a fractional part) 
and towing capacity in tons (type double). Give your 
classes a reasonable complement of constructors and 
accessor methods. Write a driver program that tests 
all your methods.
    
    */
    
    
     String manName;
     int numCylndr;
     Person owner;
     
     public Vehicle()
     {   
         super();
         manName = "Manufacter name";
         numCylndr = 0;
         
     }
     
     public Vehicle(String ManFact, int Cylndr, String newName)
     {   
         super(newName);
         manName=ManFact;
         numCylndr=Cylndr; 
     
     }
     
     public void reset(String newManName, int newCylndr, String newerName)
     {
         setName(newerName);
         manName=newManName;
         numCylndr=newCylndr;
         
     }
     
     public String getManName()
     {
         return manName;
     }
     
     public void setManName(String newManName)
     {
         manName = newManName;
     }
     public int getCylndr()
     {
         return numCylndr;
     }  
     public void setCylndr(int newNumCylndr)
     {
         numCylndr = newNumCylndr;
     } 
     public void writeOutput()
     {
         System.out.println("Manufacturers name: " + manName);
         System.out.println("Number of cylinders: " + numCylndr);
         System.out.println("Name of owner: " + getName());
         
     }
}  