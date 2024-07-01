// Fig. 16.11: Algorithms1.java
// Collections methods reverse, fill, copy, max and min.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 {
   public static void main(String[] args) {
      // cria e exibe uma List<Character>
      Character[] letters = {'A', 'B', 'C', 'D', 'Z', 'E'};
      List<Character> list =  Arrays.asList(letters); //Obtem List
      System.out.println("\nCharacters: ");
      output(list);

      //inverte e exibe uma List<Character>
      Collections.reverse(list);
      System.out.printf("%nReversed list: %n");
      output(list);

      //cria CopyList de um array de 3 caracteres
      Character[] lettersCopy = new Character[6];
      List<Character> copyList = Arrays.asList(lettersCopy);

      //copia o conteudo da List para copyList
      Collections.copy(copyList, list);
      System.out.printf("%nAfter copying copyList contains: %n");
      output(copyList);

      //preenche a List com R usando fill
      Collections.fill(list, 'R');
      System.out.printf("%nAfter fillying list with R: %n");
      output(list);
   }

   private static void output(List<Character> listRef) {
      System.out.print("The list is: ");
      for(Character c : listRef)
         System.out.printf("%c ", c);
      
      System.out.printf("%nMax: %s", Collections.max(listRef));
      System.out.printf("%nMin: %s", Collections.min(listRef));
   }
}