// Fig. 16.3: ListTest.java
// Lists, LinkedLists and ListIterators.
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListTest {
   public static void main(String[] args) {
      String[] colors = {"black", "yellow", "blue",  "green", "violet", "silver"};
      List<String> list1 = new LinkedList<>(); //Declara LinkedList list1

      for(String color : colors)
         list1.add(color); //Inicializa LinkedList list1 c valores de [] colors1
      
      //adiciona elementos colors2 a list2
      String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
      List<String> list2 = new LinkedList<>(); //Declara LinkedList list2

      for(String color : colors2)
         list2.add(color); //Inicializa LinkedList list2 c valores de [] colors2

      //concatena as listas
      list1.addAll(list2);
      list2 = null; //libera recursos em list2 ja q nao sera mais usada

      printList(list1); //imprime conteudo da lista pós addAll

      convertToUppercaseStrings(list1); // converte em string de letras maiúsculas
      printList(list1); //imprime list1

      System.out.printf("%nDeleting elements 4 to 6...");
      removeItens(list1, 4, 7);
      printList(list1); //imprime list1
      printReversedList(list1); // imprime lista na ordem inversa

   }

   private static void printReversedList(List<String> list) {
      ListIterator<String> iterator = list.listIterator(list.size());
      System.out.printf("%nReversed List:%n");
      while (iterator.hasPrevious())
         System.out.printf("%s ", iterator.previous()); //obtem o item    
   }

   private static void removeItens(List<String> list, int start, int end) {
      list.subList(start, end).clear(); // remove os itens
   }

   private static void convertToUppercaseStrings(List<String> list) {
      ListIterator<String> iterator = list.listIterator();

      while (iterator.hasNext()) {
         String color = iterator.next(); //obtem o item
         iterator.set(color.toUpperCase()); //converte em letras maiusculas
      }
   }

   private static void printList(List<String> list) {
      System.out.printf("%nList:%n");
      for (String color : list) 
         System.out.printf("%s ", color);
      System.out.println();
   }
}