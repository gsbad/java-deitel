package jdbc;
// Um TableModel que fornece os dados de um ResultSet a um JTable
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

// ResultSet começam a contar do 1 and JTable do 0. 
public class ResultSetTableModel extends AbstractTableModel 
{
   private final Connection connection;
   private final Statement statement;
   private ResultSet resultSet;
   private ResultSetMetaData metaData;
   private int numberOfRows;

   // Estado da conexao
   private boolean connectedToDatabase = false;
   
   public ResultSetTableModel(String url, String username, String password, 
                                            String query) 
                                                throws SQLException
   {         
      // conecta ao banco
      connection = DriverManager.getConnection(url, username, password);

      //cria um statment que podera enviar querys ao banco
      statement = connection.createStatement(
         ResultSet.TYPE_SCROLL_INSENSITIVE, //insensivel a alteraçoes no db enquanto esta aberto
         ResultSet.CONCUR_READ_ONLY);

      // muda o estado da conexao
      connectedToDatabase = true;

      // seta query e executa
      setQuery(query);
   } 

   // retorna o nome da classe da coluna
   public Class getColumnClass(int column) throws IllegalStateException
   {
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou");
      try 
      {
         String className = metaData.getColumnClassName(column + 1);
         
         // retorna o nome da classe da coluna
         return Class.forName(className);
      }
      catch (Exception exception) 
      {
         exception.printStackTrace();
      } 
      
      return Object.class; // se der problema, retorna type Object
   } 

   // recupera numero de colunas em ResultSet
   public int getColumnCount() throws IllegalStateException
   {   
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou");

      try 
      {
         return metaData.getColumnCount(); 
      }
      catch (SQLException sqlException) 
      {
         sqlException.printStackTrace();
      } 
      
      return 0; // se der problema, retorna 0 para numero de colunas
   } 

   // retorna nome de uma coluna em particular em ResultSet
   public String getColumnName(int column) throws IllegalStateException
   {    
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou");

      try 
      {
         return metaData.getColumnName(column + 1);  
      } 
      catch (SQLException sqlException) 
      {
         sqlException.printStackTrace();
      } 
      
      return ""; // se der problema retorna uma string vazia
   } 

   // retorna numero de linhas no ResultSet
   @Override //implementa getRowCount da interface TableModel
   public int getRowCount() throws IllegalStateException
   {      
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou");
 
      return numberOfRows;
   }

   // obtem o valor em uma linha e coluna em particular
   @Override //implementa getRowCount da interface TableModel
   public Object getValueAt(int row, int column) 
      throws IllegalStateException
   {
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou");

      // obtem o valor em uma ResultSet linha e coluna especifica
      try 
      {
         resultSet.absolute(row + 1);
         return resultSet.getObject(column + 1);
      }
      catch (SQLException sqlException) 
      {
         sqlException.printStackTrace();
      } 
      
      return ""; // se der problema retorna uma string vazia
   } 
   
   // seta nova query sql
   public void setQuery(String query) 
      throws SQLException, IllegalStateException 
   {
      // testa a flag de conexao
      if (!connectedToDatabase) 
         throw new IllegalStateException("Conexao com o banco de dados falhou!");

      // executa a query
      resultSet = statement.executeQuery(query);

      // obtem metadado do ResultSet
      metaData = resultSet.getMetaData();

      // numero de linhas do ResultSet resultSet
      resultSet.last(); // move o ponteiro para o ultimo registro   
      numberOfRows = resultSet.getRow(); //retorna a quantidade de linhas
      
      // notifica JTable
      fireTableStructureChanged();
   } 

   // fecha a conexao         
   public void disconnectFromDatabase()            
   {              
      if (connectedToDatabase)                  
      {        
         try                                          
         {                                            
            resultSet.close();                        
            statement.close();                        
            connection.close();                       
         }                                  
         catch (SQLException sqlException)          
         {                                            
            sqlException.printStackTrace();           
         }                              
         finally  // update database connection status
         {                                            
            connectedToDatabase = false;              
         }                             
      } 
   }         
}