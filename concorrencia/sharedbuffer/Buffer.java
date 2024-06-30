package concorrencia.sharedbuffer;
// Fig. 23.9: Buffer.java
// Buffer interface specifies methods called by Producer and Consumer.
public interface Buffer
{
   // place int value into Buffer
   public void blockingPut(int value) throws InterruptedException; 

   // obtain int value from Buffer
   public int blockingGet() throws InterruptedException; 
} // end interface Buffer


