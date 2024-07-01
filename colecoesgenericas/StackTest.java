// Fig. 16.14: StackTest.java
// Stack class of package java.util.
import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {
   public static void main(String[] args) {
      //Cria-se uma Stack<Number> (Lê-se: Stack de Number)
      Stack<Number> stack = new Stack<>();

      //utiliza o metodo push
      stack.push(12L);
      stack.push(3.14F);
      stack.push(42);
      stack.push(0.666);
      stack.push(784515);
      stack.push(333.333);
      stack.push(99L);
      
      //LIFO - Last in, First Out. Topo da pilha naturalmente será o 99
      System.out.printf("%nTopo da pilha: %d%n", stack.peek());

      try {
         Number removedObject = null;
         ///remove elementos da pilha
         while (true) {
            removedObject = stack.pop(); //utiliza o metodo pop
            System.out.printf("%nElemento removido: %s%n", removedObject);
            printStack(stack);
         }
      } catch (EmptyStackException e) {
         e.printStackTrace();
      }

   }
   //exibe o conteudo de stack
   private static void printStack(Stack<Number> stack) {
      if (stack.isEmpty())
         System.out.printf("%nStack está vazia%n", stack);
      else
         System.out.printf("%nConteudo da stack: %s%n", stack);
   }
}
