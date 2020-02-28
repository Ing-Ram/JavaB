import java.util.Scanner;
/*
Chad Ingram
CS111A
Lab10:Palindrome
*/
class StringToCompare {
  public static void main(String[] args) {
    isItPalindrome();
  }
  
   static void isItPalindrome()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your word, and we'll tell you if it's\na palindrome or not.");
    String a = input.nextLine();
    char[] word = a.toCharArray();
    System.out.println(word);
    System.out.println(rVersedAct(a));
    compute(word, rVersedAct(a));
     }
  static char[] rVersedAct(String morpheme)
  { 
    
    char[] word = morpheme.toCharArray();
    int num = word.length;
    
    for(int i = 0; i < num/2; i++)
    {
      char tmp = word[i];
      word[i] = word[word.length-i-1];
      word[word.length - i - 1] = tmp;
    }
    return word; //System.out.print(word);
  }
  public static void compute(char[] a, char[] b)
  {   
         boolean flag = true;
         for(int i = 0; i < b.length;i++)
         {
            
            if(a[i] != b[i]){
                flag = true; 
             }
            else{
              flag = false; 
              }   
         }
         
          if (flag == true)
               System.out.println("This is not a palindrome");
            
          if (flag == false)
               System.out.println("This be a palindrome"); 
        
    }  
   
}

/*

 ----jGRASP exec: java StringToCompare
 Enter your word, and we'll tell you if it's
 a palindrome or not.
 abcba
 abcba
 abcba
 This be a palindrome
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java StringToCompare
 Enter your word, and we'll tell you if it's
 a palindrome or not.
 asdf
 asdf
 fdsa
 This is not a palindrome
 Im not sure how you messed this up.
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java StringToCompare
 Enter your word, and we'll tell you if it's
 a palindrome or not.
 aes;oae8
 aes;oae8
 8eao;sea
 This is not a palindrome
 
*/