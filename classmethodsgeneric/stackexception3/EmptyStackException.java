package classmethodsgeneric.stackexception3;
// Fig. 20.8: EmptyStackException.java
// EmptyStackException class declaration.
public class EmptyStackException extends RuntimeException
{
   // no-argument constructor
   public EmptyStackException()
   {
      this("Stack is empty");
   } 

   // one-argument constructor
   public EmptyStackException(String exception)
   {
      super(exception);
   } 
} // end class EmptyStackException

