package estruturadedados.stackcomposicao;
// Fig. 21.12: StackCompositionTest.java
// Class StackCompositionTest.
import estruturadedados.com.deitel.datastructures.*;

public class StackCompositionTest 
{
   public static void main(String[] args)
   {
      StackComposition<Integer> stack = new StackComposition<>();

      // use push method
      stack.push(-1);
      stack.print();
      stack.push(0);
      stack.print();
      stack.push(1);
      stack.print();
      stack.push(5);
      stack.print();

      // remove items from stack
      try 
      {
         int removedItem;

         while (true) 
         {
            removedItem = stack.pop(); // use pop method
            System.out.printf("%n%d popped%n", removedItem);
            stack.print();
         } 
      } 
      catch (EmptyListException emptyListException) 
      {
         emptyListException.printStackTrace();
      } 
   } 
} // end class StackCompositionTest



