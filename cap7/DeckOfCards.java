import java.security.SecureRandom;

public class DeckOfCards
{
   private Card[] deck;
   private int currentCard;
   private static final int NUMBER_OF_CARDS = 52;
   private static final SecureRandom randomNumbers = new SecureRandom();

   public DeckOfCards()
   {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS];
      currentCard = 0;

      for (int count = 0; count < deck.length; count++) 
         deck[count] = 
            new Card(faces[count % 13], suits[count / 13]);
   } 

   public void shuffle()
   {
      currentCard = 0; 

      for (int first = 0; first < deck.length; first++) 
      {
         int second =  randomNumbers.nextInt(NUMBER_OF_CARDS);

         Card temp = deck[first];        
         deck[first] = deck[second];   
         deck[second] = temp;            
      } 
   } 

   public Card dealCard()
   {
      if (currentCard < deck.length)
         return deck[currentCard++];
      else        
         return null;
   } 
}


/**************************************************************************
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
