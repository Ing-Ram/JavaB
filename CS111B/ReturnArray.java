import java.util.Scanner;
class ReturnArray

{

  public static void main(String[] args)

  {

    int[] a = new int[5];



    a = fun();



    System.out.println("done with fun");

    System.out.println(a.length + " = length and a[0] = " + a);

    System.out.println("a[9] = " + a[9]);


  }



  static int[] fun()

  {
    Scanner input = new Scanner(System.in);
    int[] aa = new int[10];
    for(int i=0; i<aa.length; i++)
    {
      aa[i] = input.nextInt();
    }

    return aa;

  }

}




