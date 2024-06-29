package jdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.*;
import javax.swing.table.*;

public class DisplayQueryResults extends JFrame {
   // URL do banco de dados, nome de usuário e senha
   private static final String DATABASE_URL = "jdbc:derby:jdbc/books";
   private static final String USERNAME = "deitel";
   private static final String PASSWORD = "deitel";
   
   // Consulta padrão que recupera todos os dados da tabela authors
   private static final String DEFAULT_QUERY = "SELECT * FROM authors";
   
   private static ResultSetTableModel tableModel;

   public static void main(String args[]) {   
      // Cria ResultSetTableModel e exibe a tabela do banco de dados
      try {
         // Cria um TableModel para os resultados da consulta SELECT * FROM authors
         tableModel = new ResultSetTableModel(DATABASE_URL, USERNAME, PASSWORD, DEFAULT_QUERY);

         // Configura JTextArea onde o usuário digita as consultas
         final JTextArea queryArea = new JTextArea(DEFAULT_QUERY, 8, 60);
         queryArea.setWrapStyleWord(true);
         queryArea.setLineWrap(true);
         queryArea.setFont(new Font("Serif", Font.PLAIN, 14));
         
         JScrollPane scrollPane = new JScrollPane(queryArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                                  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
         
         // Configura JButton para enviar consultas
         JButton submitButton = new JButton("Enviar Consulta");
         submitButton.setFont(new Font("Arial", Font.BOLD, 14));
         submitButton.setBackground(new Color(70, 130, 180));
         submitButton.setForeground(Color.WHITE);
         submitButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         
         // Cria JPanel para gerenciar posicionamento de queryArea e submitButton na GUI
         JPanel panelNorth = new JPanel();
         panelNorth.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Usa FlowLayout para alinhamento à esquerda
         panelNorth.add(scrollPane);
         panelNorth.add(submitButton);
         
         // Cria Box para gerenciar posicionamento de queryArea e submitButton na GUI
         Box boxNorth = Box.createVerticalBox();
         boxNorth.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         boxNorth.add(panelNorth);

         // Cria JTable baseada no tableModel
         JTable resultTable = new JTable(tableModel);
         resultTable.setFont(new Font("Arial", Font.PLAIN, 14));
         resultTable.setRowHeight(25);
         resultTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
         resultTable.setFillsViewportHeight(true);

         // Estiliza as células da tabela
         resultTable.setBackground(new Color(220, 220, 220)); // Cinza claro
         resultTable.setForeground(Color.BLACK);
         resultTable.getTableHeader().setBackground(new Color(105, 105, 105)); // Cinza escuro
         resultTable.getTableHeader().setForeground(Color.WHITE);

         JScrollPane tableScrollPane = new JScrollPane(resultTable);

         JLabel filterLabel = new JLabel("Filtro:");
         filterLabel.setFont(new Font("Arial", Font.PLAIN, 14));
         filterLabel.setForeground(Color.WHITE);
         final JTextField filterText = new JTextField();
         filterText.setFont(new Font("Arial", Font.PLAIN, 14));
         filterText.setColumns(20);

         JButton filterButton = new JButton("Aplicar Filtro");
         filterButton.setFont(new Font("Arial", Font.BOLD, 14));
         filterButton.setBackground(new Color(70, 130, 180));
         filterButton.setForeground(Color.WHITE);
         filterButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
         
         Box boxSouth = Box.createHorizontalBox();
         boxSouth.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         boxSouth.add(filterLabel);
         boxSouth.add(Box.createHorizontalStrut(10));
         boxSouth.add(filterText);
         boxSouth.add(Box.createHorizontalStrut(10));
         boxSouth.add(filterButton);

         // Coloca os componentes da GUI no content pane do JFrame
         JFrame window = new JFrame("Exibindo Resultados da Consulta");
         window.getContentPane().setBackground(new Color(50, 50, 50)); // Fundo cinza escuro
         window.add(boxNorth, BorderLayout.NORTH);
         window.add(tableScrollPane, BorderLayout.CENTER);
         window.add(boxSouth, BorderLayout.SOUTH);

         // Cria listener de eventos para submitButton
         submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               // Executa uma nova consulta
               try {
                  tableModel.setQuery(queryArea.getText());
               } catch (SQLException sqlException) {
                  JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Erro de Banco de Dados", 
                                                JOptionPane.ERROR_MESSAGE);
                  // Tenta se recuperar de consulta inválida do usuário 
                  // executando a consulta padrão
                  try {
                     tableModel.setQuery(DEFAULT_QUERY);
                     queryArea.setText(DEFAULT_QUERY);
                  } catch (SQLException sqlException2) {
                     JOptionPane.showMessageDialog(null, sqlException2.getMessage(), "Erro de Banco de Dados", 
                                                   JOptionPane.ERROR_MESSAGE);
                     // Garante que a conexão com o banco de dados seja fechada
                     tableModel.disconnectFromDatabase();
                     System.exit(1); // Termina a aplicação
                  }                 
               } 
            } 
         });

         final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
         resultTable.setRowSorter(sorter);

         // Cria listener de eventos para filterButton
         filterButton.addActionListener(new ActionListener() {
            // Passa o texto do filtro para o listener
            public void actionPerformed(ActionEvent e) {
               String text = filterText.getText();
               if (text.length() == 0)
                  sorter.setRowFilter(null);
               else {
                  try {
                     sorter.setRowFilter(RowFilter.regexFilter(text));
                  } catch (PatternSyntaxException pse) {
                     JOptionPane.showMessageDialog(null, "Padrão de regex inválido", "Padrão de regex inválido",
                                                   JOptionPane.ERROR_MESSAGE);
                  }
               } 
            } 
         });

         // Fecha a janela quando o usuário fecha a aplicação (substitui
         // o padrão HIDE_ON_CLOSE)
         window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         window.setSize(1024, 768); 
         window.setVisible(true); 
         
         // Garante que o banco de dados seja fechado quando o usuário fecha a aplicação
         window.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent event) {
               tableModel.disconnectFromDatabase();
               System.exit(0);
            } 
         }); 
      } catch (SQLException sqlException) {
         JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Erro de Banco de Dados", 
                                       JOptionPane.ERROR_MESSAGE);
         tableModel.disconnectFromDatabase();
         System.exit(1); // Termina a aplicação
      }     
   } 
}
