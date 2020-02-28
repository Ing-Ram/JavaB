public class Truck extends Vehicle{

   double loadCapTon;
   double towLoad;
   
   public Truck()
   {
      super();
      loadCapTon = 0;
      towLoad = 0;
   }
   
   public Truck(double newLoadCap, double newTowLoad)
   {
      newLoadCap = loadCapTon;
      newTowLoad = towLoad;
   }
   
   public void reset(double newLoadCap, double newTowLoad)
   {
      loadCapTon=newLoadCap;
      towLoad=newTowLoad; 
   }
   
   public double getLoad()
   {
      return loadCapTon;
   }
   
   public void setLoad(double newLoadCap)
   {
      newLoadCap = loadCapTon;
   }
   
   public double getTow()
   {
      return towLoad;
   }
   
   public void setTow(double newTowLoad)
   {
      newTowLoad = towLoad;
   }
   
   public void writeOutput()
   {
      System.out.println("Load capacity: " + loadCapTon);
      System.out.println("Tow capacity: " + towLoad);
   }
}