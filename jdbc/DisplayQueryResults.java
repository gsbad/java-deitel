package jdbc;
// Fig. 24.28: DisplayQueryResults.java
// Exibe os resultados de várias consultas.
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

public class DisplayQueryResults extends JFrame 
{
   // URL do banco de dados, nome de usuário e senha
   private static final String DATABASE_URL = "jdbc:derby:jdbc/books";
   private static final String USERNAME = "deitel";
   private static final String PASSWORD = "deitel";
   
   // Consulta padrão que recupera todos os dados da tabela authors
   private static final String DEFAULT_QUERY = "SELECT * FROM authors";
   
   private static ResultSetTableModel tableModel;

   public static void main(String args[]) 
   {   
      // Cria ResultSetTableModel e exibe a tabela do banco de dados
      try 
      {
         // Cria um TableModel para os resultados da consulta SELECT * FROM authors
         tableModel = new ResultSetTableModel(
            DATABASE_URL, USERNAME, PASSWORD, DEFAULT_QUERY);

         // Configura JTextArea onde o usuário digita as consultas
         final JTextArea queryArea = new JTextArea(DEFAULT_QUERY, 3, 100);
         queryArea.setWrapStyleWord(true);
         queryArea.setLineWrap(true);
         
         JScrollPane scrollPane = new JScrollPane(queryArea,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
         
         // Configura JButton para enviar consultas
         JButton submitButton = new JButton("Enviar Consulta");

         // Cria Box para gerenciar posicionamento de queryArea e submitButton na GUI
         Box boxNorth = Box.createHorizontalBox();
         boxNorth.add(scrollPane);
         boxNorth.add(submitButton);

         // Cria JTable baseada no tableModel
         JTable resultTable = new JTable(tableModel);
         
         JLabel filterLabel = new JLabel("Filtro:");
         final JTextField filterText = new JTextField();
         JButton filterButton = new JButton("Aplicar Filtro");
         Box boxSouth = Box.createHorizontalBox();
         
         boxSouth.add(filterLabel);
         boxSouth.add(filterText);
         boxSouth.add(filterButton);
         
         // Coloca os componentes da GUI no content pane do JFrame
         JFrame window = new JFrame("Exibindo Resultados da Consulta");
         window.add(boxNorth, BorderLayout.NORTH);
         window.add(new JScrollPane(resultTable), BorderLayout.CENTER);
         window.add(boxSouth, BorderLayout.SOUTH);

         // Cria listener de eventos para submitButton
         submitButton.addActionListener(        
            new ActionListener() 
            {
               public void actionPerformed(ActionEvent event)
               {
                  // Executa uma nova consulta
                  try 
                  {
                     tableModel.setQuery(queryArea.getText());
                  }
                  catch (SQLException sqlException) 
                  {
                     JOptionPane.showMessageDialog(null, 
                        sqlException.getMessage(), "Erro de Banco de Dados", 
                        JOptionPane.ERROR_MESSAGE);
                     
                     // Tenta se recuperar de consulta inválida do usuário 
                     // executando a consulta padrão
                     try 
                     {
                        tableModel.setQuery(DEFAULT_QUERY);
                        queryArea.setText(DEFAULT_QUERY);
                     } 
                     catch (SQLException sqlException2) 
                     {
                        JOptionPane.showMessageDialog(null, 
                           sqlException2.getMessage(), "Erro de Banco de Dados", 
                           JOptionPane.ERROR_MESSAGE);
         
                        // Garante que a conexão com o banco de dados seja fechada
                        tableModel.disconnectFromDatabase();
         
                        System.exit(1); // Termina a aplicação
                     }                 
                  } 
               } 
            }         
         ); // Fim da chamada para addActionListener
         
         final TableRowSorter<TableModel> sorter = 
            new TableRowSorter<TableModel>(tableModel);
         resultTable.setRowSorter(sorter);
         
         // Cria listener de eventos para filterButton
         filterButton.addActionListener(           
            new ActionListener() 
            {
               // Passa o texto do filtro para o listener
               public void actionPerformed(ActionEvent e) 
               {
                  String text = filterText.getText();

                  if (text.length() == 0)
                     sorter.setRowFilter(null);
                  else
                  {
                     try
                     {
                        sorter.setRowFilter(
                           RowFilter.regexFilter(text));
                     } 
                     catch (PatternSyntaxException pse) 
                     {
                        JOptionPane.showMessageDialog(null,
                           "Padrão de regex inválido", "Padrão de regex inválido",
                           JOptionPane.ERROR_MESSAGE);
                     }
                  } 
               } 
            } 
         ); // Fim da chamada para addActionListener

         // Fecha a janela quando o usuário fecha a aplicação (substitui
         // o padrão HIDE_ON_CLOSE)
         window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         window.setSize(500, 250); 
         window.setVisible(true); 
         
         // Garante que o banco de dados seja fechado quando o usuário fecha a aplicação
         window.addWindowListener(
            new WindowAdapter() 
            {
               public void windowClosed(WindowEvent event)
               {
                  tableModel.disconnectFromDatabase();
                  System.exit(0);
               } 
            } 
         ); 
      } 
      catch (SQLException sqlException) 
      {
         JOptionPane.showMessageDialog(null, sqlException.getMessage(), 
            "Erro de Banco de Dados", JOptionPane.ERROR_MESSAGE);
         tableModel.disconnectFromDatabase();
         System.exit(1); // Termina a aplicação
      }     
   } 
}
