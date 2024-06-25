package serializationfiles;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {

    private static ObjectOutputStream output; //gera saida de dados no arquivo

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();    
    }

    private static void openFile() {
        try {
            //gera saida dos dados no aquivo
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("serializationfiles/clients.ser")));

        } catch (IOException ioException) {
            System.err.println("Error opening file! Terminating!");
            System.exit(1);
        }
    }

    private static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name and balance." , 
                            "Enter end-of-file indicator to end input.");
        // Faz o loop até o indicador de fim de arquivo
        while (input.hasNext()){
            try {
                // gera saida do novo registro: supoe entrada valida
                Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());

                //serializa o objeto de registro em um arquivo
                output.writeObject(record);

            } catch (IOException e) {
                System.err.println("Error writing to file. Terminanting.");
                System.exit(1);
            }
            catch (NoSuchElementException e) {
                System.err.println("Invalid input. Please try again!");
                input.nextLine();
            }
            System.out.print("? ");
        }  
        input.close();                 
    }

    private static void closeFile() {
        try {
            if(output != null){
                output.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file. Terminating!");
        }
    }
}
