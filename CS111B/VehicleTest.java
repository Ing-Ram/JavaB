public class VehicleTest
{

   public static void main(String[] args)
   {
      Vehicle testVehicle = new Vehicle();
      Truck testTruck = new Truck();
      
      testTruck.reset(2.4, 6.7);
      
      testVehicle.reset("Toyota",6,"Chad");
      
      testVehicle.writeOutput();
      testTruck.writeOutput();
   }

/**
 ----jGRASP exec: java VehicleTest
 Manufacturers name: Toyota
 Number of cylinders: 6
 Name of owner: Chad
 Load capacity: 2.4
 Tow capacity: 6.7
 
  ----jGRASP: operation complete.
 */

}