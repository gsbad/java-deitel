// Fig. 16.7: Sort2.java
// Using a Comparator object with method sort.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
   public static void main(String[] args) {
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};
      List<String> list = Arrays.asList(suits);

      System.out.printf("%n%nUnsorted array elements: %s%n", list); //invoca implicitamente metodo de Object.toString()

      Collections.sort(list, Collections.reverseOrder()); //Classifica ArrayList e depois inverte c metodo reverseOrder de Collections

      System.out.printf("%n%nSorted array elements: %s%n", list);
   }
}