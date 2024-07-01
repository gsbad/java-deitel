// Fig. 16.13: Algorithms2.java
// Collections methods addAll, frequency and disjoint.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms2 {
   public static void main(String[] args) {
      //inicializa list1 e list2
      String[] colors = {"red", "white", "yellow", "blue"};
      List<String> list1 = Arrays.asList(colors);
      ArrayList<String> list2 = new ArrayList<>();

      System.out.printf("%nlist1 contains: %s%n", list1);
      
      list2.add("black");
      list2.add("red");
      list2.add("green");

      System.out.println("\nBefore addAll list2 contains: ");

      //exibe os elementos em list2
      for(String color : list2)
         System.out.printf("%s ", color);
      
      //Adiciona array colors a list2 com addAll
      Collections.addAll(list2, colors);

      System.out.println("\nAfter addAll list2 contains: ");

      //exibe os elementos em list2
      for(String color : list2)
         System.out.printf("%s ", color);
      
      //obtem frequencia de red
      int frequency = Collections.frequency(list2, "red");
      System.out.printf("%nRed Frequency on list2: %d%n", frequency);

      //verifica se list1 e list2 tem elementos em comum
      boolean disjoint = Collections.disjoint(list1, list2);
      System.out.printf("%nlist1 e list2 %s elementos em comum", (disjoint ? "nao tem" : "tem"));
   }
}