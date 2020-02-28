public class Square implements Measurable
{
   private double wide;
   private double high;
   
   //Constructor for Square/rectangle
   public Square(double width, double height)
   {
      wide = width;
      high = height;
   }

   public double getPerimeter()
   {
      return 2 * (wide + high);
   }

   public double getArea()
   {
      return wide * high;
   }
}