package exercicios.cap10;

import javax.swing.JFrame;

public class TestDraw
{
   public static void main(String[] args)
   {
      DrawPanel panel = new DrawPanel();      
      JFrame app = new JFrame();
      
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.add(panel);
      app.setSize(900, 600);
      app.setVisible(true);
   } 
}