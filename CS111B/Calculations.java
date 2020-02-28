  public interface Calculations
{  
   int n1=0;
   int n2=0;
   int d1=0;
   int d2=0;
   String s = "";
   String[] array = new String[10];
   
   public void split(String[] array);
   public void input(String s);   
   public void add(int n1, int d1, int n2, int d2); //n for numerator d for denominator
   public void subtract(int n1, int d1, int n2, int d2);
   public void divide(int n1, int d1, int n2, int d2);
   public void multiply(int n1, int d1, int n2, int d2);
   public void reciprocal(String[] array); // flip n and d
   public int gcd(int n1, int d1);
   public int getgcd();
   public void FtoS();
   public void getFraction();
}



