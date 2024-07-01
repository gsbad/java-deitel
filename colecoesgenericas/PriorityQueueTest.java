// Fig. 16.15: PriorityQueueTest.java
// PriorityQueue test program.
import java.util.PriorityQueue;

public class PriorityQueueTest {
   public static void main(String[] args) {
      //inicializa queue com capacidade de 11
      PriorityQueue<Double> fila = new PriorityQueue<>(11);
      
      //insere elementos na fila usando o metodo offer
      fila.offer(3.3);
      fila.offer(6.6);
      fila.offer(9.2);
      fila.offer(1.8);
      fila.offer(4.5);
      fila.offer(1.3);
      fila.offer(2.6);
      fila.offer(3.2);
      fila.offer(4.8);
      fila.offer(5.5);
      fila.offer(6.5);
      

      System.out.println("\n\nElementos na fila: ");
      System.out.println(fila);

      System.out.println("\nRemovendo c metodo pool()(\"pooling\"): ");

      while (fila.size() > 0) {
         System.out.printf("%nelemento do topo: %.2f", fila.peek()); //visualiza o elemento superior
         fila.poll(); //remove o elemento superior
      }
   }
}
