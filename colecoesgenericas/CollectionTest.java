// Fig. 16.2: CollectionTest.java
// List, ArrayList, Collection, Iterator.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
   public static void main(String[] args) {
      // adiciona elementos no array colors a listar
      String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
      List<String> list = new ArrayList<>();  // equivale a new ArrayList<String>(); //Declara ArrayList

      for(String color : colors)
         list.add(color); //adiciona color ao final da list
      
      //adiciona elementos de array removeColors em removeList
      String[] removeColors = {"RED", "WHITE", "BLUE"};
      List<String> removeList = new ArrayList<>();

      for(String color : removeColors)
         removeList.add(color);
      
      //list e removeList estao preenchidas com elementos vindos dos arrays colors e removeColors

      //gera saida com o conteudo da lista
      System.out.println("\n\nConteudos da ArrayList<String> list: ");

      for (int i = 0; i < list.size(); i++)
         System.out.printf("%s ", list.get(i));
      
      removeColors(list, removeList);

      //gera saida com o conteudo da lista
      System.out.println("\n\nConteudos da ArrayList<String> list depois do removeList: ");

      for (int i = 0; i < list.size(); i++)
         System.out.printf("%s ", list.get(i));
   }

   private static void removeColors(Collection<String> list, Collection<String> removeList) {
      //obtem o iterador
      Iterator<String> iterator = list.iterator();

      while (iterator.hasNext()) {
         if(removeList.contains(iterator.next()))
            iterator.remove();
      }
   }
}