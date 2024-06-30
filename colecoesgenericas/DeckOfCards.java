// Fig. 16.10: DeckOfCards.java
// Card shuffling and dealing with Collections method shuffle.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// classe que representa uma Card no baralho DeckOfCards
class Card 
{   
   public static enum Face {Ás, Duque, Três, Quatro, Cinco, Seis,
      Sete, Oito, Nove, Dez, Valete, Dama, Rei}; //cartas de 1 a 13
   public static enum Suit {Paus, Ouro, Copa, Espada}; //naipes

   private final Face face; 
   private final Suit suit;
   
   // constructor
   public Card(Face face, Suit suit) 
   {  
       this.face = face;
       this.suit = suit; 
   } 
   
   // return face of the card
   public Face getFace() 
   {
      return face; 
   } 

   // return suit of Card
   public Suit getSuit() 
   {
      return suit; 
   } 

   // return String representation of Card
   public String toString()
   {
      return String.format("%s de %s", face, suit);
   } 
} // end class Card

// class DeckOfCards
public class DeckOfCards 
{
   private List<Card> list; // Lista que armazenara as 52 cartas

   // construtor do deck de 52 cartas
   public DeckOfCards()
   {
      Card[] deck = new Card[52];
      int count = 0; // number of cards

      // populate deck with Card objects
      for (Card.Suit suit : Card.Suit.values())  
      {
         for (Card.Face face : Card.Face.values())   
         {
            deck[count] = new Card(face, suit);
            ++count;
         } 
      } 

      list = Arrays.asList(deck); // get List
      Collections.shuffle(list);  // shuffle deck
   } // end DeckOfCards constructor

   // output deck
   public void printCards()
   {
      // display 52 cards in two columns
      for (int i = 0; i < list.size(); i++)
         System.out.printf("%-19s%s", list.get(i),
            ((i + 1) % 4 == 0) ? "\n" : "");
   } 

   public static void main(String[] args)
   {
      System.out.println();
      DeckOfCards cards = new DeckOfCards();
      cards.printCards();
   }   
}