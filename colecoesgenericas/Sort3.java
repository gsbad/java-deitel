// Fig. 16.9: Sort3.java
// Collections method sort with a custom Comparator object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import classesobjetos.Time2; //Importa Classe Time2 do cap8. Package classeseobjetos

public class Sort3 
{
   public static void main(String[] args)
   {
      List<Time2> list = new ArrayList<>(); // create List

      list.add(new Time2(6, 24, 34));
      list.add(new Time2(18, 14, 58));
      list.add(new Time2(4, 05, 34));
      list.add(new Time2(12, 14, 58));
      list.add(new Time2(16, 19, 58));
      list.add(new Time2(11, 04, 58));
      list.add(new Time2(6, 24, 22));
      
      // output List elements
      System.out.printf("%n%nUnsorted array elements:%n%s%n", list);

      // sort in order using a comparator
      Collections.sort(list, new TimeComparator()); 

      // output List elements
      System.out.printf("Sorted list elements:%n%s%n", list);
   } 
}