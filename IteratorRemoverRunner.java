//Name - Carolyn Savas

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
   public static void main ( String[] args )
   {
      String test = "a b c a b c a";
      String remTest = "a";
      //Create a IteratorRemover object that loads in test and remTest
      IteratorRemover one = new IteratorRemover(test, remTest);
      //run the remove method you wrote 
      one.remove();
      //call the toString you wrote
      out.println(one);
      
      
      /*repeat the above steps with twice with new data sets.*/
       
       test = "a b c d e f g h i j x x x x";
       remTest = "x";
       //Create a IteratorRemover object that loads in test and remTest
       one = new IteratorRemover(test, remTest);
      //run the remove method you wrote 
      one.remove();
      //call the toString you wrote
      out.println(one);
       
       test = "1 2 3 4 5 6 a b c a b c";
       remTest = "b";
       //Create a IteratorRemover object that loads in test and remTest
       one = new IteratorRemover(test, remTest);
      //run the remove method you wrote 
      one.remove();
      //call the toString you wrote
      out.println(one);
      
   }
}
