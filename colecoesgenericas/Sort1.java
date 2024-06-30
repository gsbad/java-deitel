// Fig. 16.6: Sort1.java
// Collections method sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 {
   public static void main(String[] args) {
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};
      List<String> list = Arrays.asList(suits);

      System.out.printf("%n%nUnsorted array elements: %s%n", list); //invoca implicitamente metodo de Object.toString()

      Collections.sort(list); //Classifica ArrayList

      System.out.printf("%n%nSorted array elements: %s%n", list); //invoca implicitamente metodo de Object.toString()
   }
}