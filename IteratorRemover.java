//Name - Carolyn Savas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
   private ArrayList<String> list;
   private String toRemove;

   public IteratorRemover(String line, String rem)
   {
     //store rem in toRemove
     toRemove = rem;
     //split line into an array and then store each element as an element of list
    String[] words= line.split(" ");
    list = new ArrayList<String>(Arrays.asList(words));
     
   }

   public void setTest(String line, String rem)
   {
     //store rem in toRemove
     toRemove = rem;
     //split line into an array and then store each element as an element of list
    String[] words= line.split(" ");
    list = new ArrayList<String>(Arrays.asList(words));
   }

   public void remove()
   {
      //write the remove method using an iterator
     Iterator<String> spot= list.iterator();
     while(spot.hasNext()){
       if(spot.next().compareTo(toRemove)==0){
         spot.remove();
       }
     }
   }

   public String toString()
   {
      //write a toString that returns in format same as Word Doc
     return list.toString();
   }
}
