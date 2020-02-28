/* Chad Ingram
   CS 111A Programming Lab 9 
   Count Words and display longest word
*/

import java.util.Scanner;

public class AnalyzePhrase
{
  public static void main(String[] args)
  {
    String phrase;
    int numWords;

    phrase = inputPhrase();
    
    numWords = analyzePhrase(phrase);
    int count = phrase.split("\\w+").length ;
        
    System.out.println("Your top word has " + numWords + " characters in it.");
    System.out.println("And you have " + count + " words in your string");
    System.out.println();
  }

  
  static String inputPhrase()
  {
    String a;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your phrase, and make sure that it's  atleast5 characters long");
    a = input.nextLine();
    return a;
      
  }


  /**
     analyzePhrase method
     Count the number of words in a given string, and determine its longest word.
     Assume the string is well formed and doesn't have leading 
     or trailing spaces, or multiple spaces in a row, and number of words is returned.
     Longest word is output on the console.
     @param str string to analyze
     @return number of words in str
  */
  
  
  
    public static int analyzePhrase(String array) 
    
    {
       String s; 
       String[] word=array.split(" ");
       String rts=" ";
       for(int i=0;i<word.length;i++)
       {
           if(word[i].length()>=rts.length())
           {
               rts=word[i];
           }
       }   
         System.out.println(rts);
         return rts.length();
    }
    

// INSERT YOUR CODE HERE

} //last brace

/* Sample Output:

 ----jGRASP exec: java AnalyzePhrase
 Enter your phrase, and make sure that it's  atleast5 characters long
 the hills are alive
 alive
 Your top word has 5 characters in it.
 And you have 4 words in your string
 
 
  ----jGRASP: operation complete.
 

[cpersiko@fog cs111a]$ java AnalyzePhrase
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
This is my phrase
The longest word in your phrase is "phrase" with 6 characters.
Your phrase has 4 words in it.

[cpersiko@fog cs111a]$ java AnalyzePhrase
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Hi
Your phrase must contain at least 5 characters.
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Hello
The longest word in your phrase is "Hello" with 5 characters.
Your phrase has 1 words in it.

[cpersiko@fog cs111a]$ java AnalyzePhrase
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Now I will try with a very long phrase that contains many words
The longest word in your phrase is "contains" with 8 characters.
Your phrase has 13 words in it.

[cpersiko@fog cs111a]$ java AnalyzePhrase
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Programming is cool
The longest word in your phrase is "Programming" with 11 characters.
Your phrase has 3 words in it.
[cpersiko@fog cs111a]$ 

*/