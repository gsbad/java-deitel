// Fig. 28.1: ReadServerFile.java
// Reading a file by opening a connection through a URL.
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame 
{
   private JTextField enterField; // JTextField to enter site name
   private JEditorPane contentsArea; // to display website

   // set up GUI
   public ReadServerFile()
   {
      super("Simple Web Browser");

      // create enterField and register its listener
      enterField = new JTextField("Enter file URL here");
      enterField.addActionListener(
         new ActionListener() 
         {
            // get document specified by user
            public void actionPerformed(ActionEvent event)
            {
               getThePage(event.getActionCommand());
            } 
         } 
      ); 

      add(enterField, BorderLayout.NORTH);

      contentsArea = new JEditorPane(); // create contentsArea
      contentsArea.setEditable(false);
      contentsArea.addHyperlinkListener(
         new HyperlinkListener() 
         {
            // if user clicked hyperlink, go to specified page
            public void hyperlinkUpdate(HyperlinkEvent event)
            {
               if (event.getEventType() == 
                    HyperlinkEvent.EventType.ACTIVATED)
                  getThePage(event.getURL().toString());
            } 
         } 
      ); 

      add(new JScrollPane(contentsArea), BorderLayout.CENTER);
      setSize(400, 300); // set size of window
      setVisible(true); // show window
   }

   // load document
   private void getThePage(String location)
   {
      try // load document and display location 
      {
         contentsArea.setPage(location); // set the page
         enterField.setText(location); // set the text
      } 
      catch (IOException ioException) 
      {
         JOptionPane.showMessageDialog(this,
            "Error retrieving specified URL", "Bad URL", 
            JOptionPane.ERROR_MESSAGE);
      } 
   }
} 


