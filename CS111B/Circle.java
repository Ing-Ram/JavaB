public class Circle implements Measurable
{
   private double theRadius;
  
   
   //Constructor for Square/rectangle
   public Square(double radius)
   {
     radius = theRadius;
   }

   public double getPerimeter()
   {
      return 2 * 3.14 * theRadius;
   }
   
   public double getCircumference()
   {
      return getPerimeter();
   }
   
   public double getArea()
   {
      return 3.14 * theRadius * theRadius;
   }
}