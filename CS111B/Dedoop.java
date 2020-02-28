import java.util.Scanner;
class Dedoop
{
   public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number will you put into your array?");
        int num = input.nextInt();
        int arr[] = new int[num]; //intialize array and set num of inputs (10)
        System.out.println("Enter your numbers: ");
        for(int i = 0; i < arr.length; i++)
          arr[i] = input.nextInt();  
        
       
       
        
        
       int n[] = new int[num];//intilize array for dynamic method array. 
       n  = removeDuplicates(arr,num);
       count(n);
       
    }
    
    
    
  public static void count(int[] n)
   {
   int count = 0;
       // Print updated array
        for (int i=0; i<n.length-1; i++){
           System.out.print( n[i]+" ");
           count = i;
        }
        
        
       
        System.out.print("\nYou have " + count + " unique values." + n);
   
   }   
    
  
  /*public static int[] removeDuplicates(int[] array) {
    int del = 0;
    for( int i = 0; i < array.length - (1 + del); ++i ) {
        for( int j = array.length - (1 + del); j > i; --j ) {
            if( array[i] == array[j]) {
                for( int k = j; k < array.length - (1 + del); ++k ) {
                    array[k] = array[k + 1];
                }
               
                del++;
            }
        }
    }
    return array;
    }
   */
   public static int[] removeDuplicates(int[] arr, int n) 
   {
      
    int[] tmp = new int[n];
    
      
      
      for (int i = 0; i < n; i++)
      {
         for (int j = 0; j < n; j++)
         {
               if (arr[i] == arr[j])
               {
                  for (int k = j; k < n; k++)
                  {
                  tmp[i] = arr[k+1];
                  }
               }else
                  tmp[i] = arr[i];
         }
      }
    return tmp;
   }
   
   
}
  
  
   
