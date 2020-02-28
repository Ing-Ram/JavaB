class FractionOfFractions implements Calculations
{
   private int gcd = 0; // Greatest Common Factor
   private int n = 0; // numerator
   private int d = 0; // denominator
   private int ns = 0;
   private int ds = 0;
   int f_n = 0;
   int f_d = 0;
   int s_n = 0;
   int s_d = 0;
   int countPlus = 0;
   int countDivide = 0;
   int countSubtract = 0;
   int countMultiply = 0;
   String[] arrayS;
   String fraction = "";
   
   
     public void split(String[] array)
   {
      String[] array1 = array[0].split("/");
      String[] array2 = array[2].split("/");
      f_n = Integer.parseInt(array1[0]);
      f_d = Integer.parseInt(array1[1]);
      s_n = Integer.parseInt(array2[0]);
      s_d = Integer.parseInt(array2[1]);
   }
   
   public void input(String s)
   {
      arrayS = s.split(" ");
      if (arrayS[1].equals("+"))
      {
         split(arrayS);
         //System.out.println("n1: " + f_n + " d1: " + f_d + " n2: " + s_n + " d2: " + s_d);
         add(f_n, f_d, s_n, s_d);
      }
      if (arrayS[1].equals("-"))
      {
         split(arrayS);
         //System.out.println("n1: " + f_n + " d1: " + f_d + " n2: " + s_n + " d2: " + s_d);
         subtract(f_n, f_d, s_n, s_d);
      }
      if (arrayS[1].equals("/"))
      {
         split(arrayS);
         //System.out.println("n1: " + f_n + " d1: " + f_d + " n2: " + s_n + " d2: " + s_d);
         divide(f_n, f_d, s_n, s_d);
      }
      if (arrayS[1].equals("*"))
      {
         split(arrayS);
         //System.out.println("n1: " + f_n + " d1: " + f_d + " n2: " + s_n + " d2: " + s_d);
         multiply(f_n, f_d, s_n, s_d);
      }
   }
   
   public void divideByZero() throws Exception
   {
      if(f_d == 0 || s_d == 0)
      {
         throw new Exception("Division by Zero");
      }
   }
   
   
   public void add(int n1, int d1, int n2, int d2) //n for numerator and d for denominator
   {
      n = ((d1 * n2) + (d2 * n1));
      d = (d1 * d2);
      System.out.print("Answer: ");
   }
   
   public void subtract(int n1, int d1, int n2, int d2)
   {
      n = ((d2 * n1) - (d1 * n2));
      d = (d1 * d2);
      System.out.print("Answer: ");
   }
   
   public void divide(int n1, int d1, int n2, int d2)
   {
      n = (n1 * d2);
      d = (n2 * d1);
      System.out.print("Answer: ");
   }
   
   public void multiply(int n1, int d1, int n2, int d2)
   {
      n = n1 * n2;
      d = d1 * d2;
      System.out.print("Answer: ");
   }
  
  
   public void reciprocal(String[] Array) // flip n and d
   {
      
     System.out.println("n1: " + f_n + " d1: " + f_d + " n2: " + s_n + " d2: " + s_d);
   }
   public int gcd(int n1, int d1)
   {
      if (n1 % d1 == 0)
         if(d1 < 0)
            { gcd = -d1; }
         else
            { gcd = d1; }
      else
         if(n1 < 0)
            { gcd = gcd(d1, -n1 % d1); }
         else
            { gcd = gcd(d1, n1 % d1); }
      return gcd;
   }
   
   public int getgcd()
   {
      return gcd;
   }
   
   public void equals()
   {
      if(f_n == s_n && f_d == s_d) {
         System.out.println("The two fractions are equal");
      }
      else {
         System.out.println("The two fractions are not equal");
      }
   }
   
   public void FtoS()
   {
      fraction = ((n/(gcd(n, d))) + "/" + (d/(gcd(n, d))));
   }
   
   public void getFraction()
   {
      FtoS();
      System.out.println(fraction);
   }
  




}