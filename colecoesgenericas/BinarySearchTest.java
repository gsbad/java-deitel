// Fig. 16.12: BinarySearchTest.java
// Collections method binarySearch.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest {
   public static void main(String[] args) {
      //Cria um ArrayList a partir do conteudo de array colors
      String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};

      System.out.printf("%n%nUnsorted array: %s%n", Arrays.asList(colors));

      List<String> list = new ArrayList<>(Arrays.asList(colors));

      //classifica o ArrayList
      Collections.sort(list);

      System.out.printf("%nSorted array: %s%n", list);

      printSearchResults(list, "black");
      printSearchResults(list, "diamond");
      printSearchResults(list, "brown");
      printSearchResults(list, "blue");
      printSearchResults(list, "red");
      printSearchResults(list, "yellow");
      printSearchResults(list, "pink");
   }
   //realiza pesquisa e exibe o resultado
   private static void printSearchResults(List<String> list, String key) {
      int result = 0;

      System.out.printf("%nSearching for: %s%n", key);
      result = Collections.binarySearch(list, key);

      if (result >= 0)
         System.out.printf("%n%s founded at index %d%n", key, result);
      else
         System.out.printf("%n%s not founded (%d)%n", key, result);
   }
}