package serializationfiles;

import java.io.IOException;
import javax.swing.JFrame;

public class JFileChooserTest {
    public static void main(String[] args) throws IOException {
        JFileChooserDemo appChooserDemo = new JFileChooserDemo();
        appChooserDemo.setSize(400,400);
        appChooserDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appChooserDemo.setVisible(true);
    }
}
