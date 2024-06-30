// Fig. 16.4: UsingToArray.java
// Visualizando arrays como listas e convertendo List para Array
import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {
   public static void main(String[] args) {
      String[] colors = {"preto", "branco", "amarelo", "azul", "roxo", "marrom", "vermelho", "rosa", "cinza", "verde", "magenta", "ciano"};
      LinkedList<String> links = new LinkedList<>(Arrays.asList(colors)); //Metodo Arrays.asList para view de Array as List

      links.add("azul-marinho");
      links.add("violeta");
      links.addFirst("bege");
      links.addLast("laranja");
      
      //obtem elementos LinkedList como se um array fosse
      colors = links.toArray(new String[links.size()]); //converte lista para array definido com links.size de tamanho

      System.out.println("\n\nColors: ");

      for (String color : colors)
         System.out.printf("%s ", color);

   }
}
