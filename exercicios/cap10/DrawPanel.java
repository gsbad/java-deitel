package exercicios.cap10;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import java.util.Scanner;

public class DrawPanel extends JPanel
{
   private SecureRandom randomNumbers = new SecureRandom();   
   private MyLine[] lines;
   private MyOval[] ovals;
   private MyRectangle[] rectangles;
   Scanner input = new Scanner(System.in);

   // constructor, creates a panel with random shapes
   public DrawPanel()
   {
      setBackground(Color.WHITE);
      
      System.out.print("Quantas linhas no desenho? ");
      lines = new MyLine[input.nextInt()];

      System.out.print("\nQuantos ovais no desenho? ");
      ovals = new MyOval[input.nextInt()];

      System.out.print("\nQuantos retangulos no desenho? ");
      rectangles = new MyRectangle[input.nextInt()];

      // create lines
      for (int count = 0; count < lines.length; count++)
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(900);
         int y1 = randomNumbers.nextInt(900);
         int x2 = randomNumbers.nextInt(600);
         int y2 = randomNumbers.nextInt(600);
         
         // generate a random color
         Color color = new Color(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));

         lines[count] = new MyLine(x1, y1, x2, y2, color);
      }
      // create ovals
      for (int count = 0; count < ovals.length; count++)
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(900);
         int y1 = randomNumbers.nextInt(900);
         int x2 = randomNumbers.nextInt(600);
         int y2 = randomNumbers.nextInt(600);
         
         // generate a random color
         Color color = new Color(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
         
         ovals[count] = new MyOval(x1, y1, x2, y2, color);
      }
      // create rectangles
      for (int count = 0; count < lines.length; count++)
      {
         // generate random coordinates
         int x1 = randomNumbers.nextInt(900);
         int y1 = randomNumbers.nextInt(900);
         int x2 = randomNumbers.nextInt(600);
         int y2 = randomNumbers.nextInt(600);
         
         // generate a random color
         Color color = new Color(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));

         rectangles[count] = new MyRectangle(x1, y1, x2, y2, color);
      } 
   } 

   // for each shape array, draw the individual shapes
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      // draw the lines
      for (MyLine line : lines)
         line.draw(g);
      // draw the ovals
      for (MyOval oval : ovals)
         oval.draw(g);
      // draw the rectangles
      for (MyRectangle rectangle : rectangles)
         rectangle.draw(g);      
   } 
} 