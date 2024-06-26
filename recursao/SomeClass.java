package recursao;

// Exercise 18.13 Solution: SomeClass.java
public class SomeClass
{
   public static String someMethod(int[] array2, int x)
   {
      if (x < array2.length)
         return String.format(
            "%s%d ", someMethod(array2, x + 1), array2[x]);
      else
         return "";
   } 

   public static void main(String[] args)
   {
      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      String results = someMethod(array, 0);
      System.out.println(results);
   } 
} // end class SomeClass

/*************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/
