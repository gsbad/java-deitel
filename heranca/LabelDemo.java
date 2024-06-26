package heranca;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo
{
   public static void main(String[] args)
   {
      

      ImageIcon originalIcon = new ImageIcon("heranca/skullCompressed.png");

      // Redimensionar a imagem
      Image originalImage = originalIcon.getImage();
      Image resizedImage = originalImage.getScaledInstance(111, 111, Image.SCALE_SMOOTH); // redimensiona para 100x100 pixels
      
      
      ImageIcon labelIcon = new ImageIcon(resizedImage);
      JLabel centerLabel = new JLabel(labelIcon);
      JLabel southLabel = new JLabel(labelIcon);
      JLabel northLabel = new JLabel(labelIcon);
      
      northLabel.setText("North");
      southLabel.setText("South");
      centerLabel.setText("Center");

      JFrame application = new JFrame();
      
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      application.add(northLabel, BorderLayout.NORTH);
      application.add(centerLabel, BorderLayout.CENTER);      
      application.add(southLabel, BorderLayout.SOUTH);      

      application.setSize(440, 620);
      application.setVisible(true);
   }
}
