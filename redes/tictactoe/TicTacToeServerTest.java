package redes.tictactoe;

// Fig. 28.12: TicTacToeServerTest.java
// Class that tests Tic-Tac-Toe server.
import javax.swing.JFrame;

public class TicTacToeServerTest
{
   public static void main(String[] args)
   {
      TicTacToeServer application = new TicTacToeServer();
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.execute();
   } 
}

