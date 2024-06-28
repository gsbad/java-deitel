package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors {
    public static void main(String[] args) {
        //Exibindo o conteudo da tabela Authors

        final String DATABASE_URL = "jdbc:derby:jdbc/books";
        final String SELECT_QUERY = "SELECT authorID, firstName, lastName FROM authors";
        
        //usa try-com-recursos para se conectar e consultar o banco de dados
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, "deitel", "deitel");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUERY)){
            
            //obtem os metadados de ResultSet
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            System.out.printf("Authors Table of Books Database:%n%n");
            
            //exibe os nomes de coluna no ResultSet (ResultSet começa em 1)
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();

            //exibe os resultados da consulta (ResultSet começa em 1)
            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            }
        } //os metodos close dos objetos AutoCloseable sao chamados agora 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
