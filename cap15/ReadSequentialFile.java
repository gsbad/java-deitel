package cap15;

import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

    private static ObjectInputStream input; 
    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    //Abre o arquivo clients.txt
    private static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));

        } catch (IOException a) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    //Le os registros do arquivo
    private static void readRecords() {
        System.out.printf("%n%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        try {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                            record.getAccount(), record.getFirstName(), 
                            record.getLastName(), record.getBalance());
            }
        } catch (EOFException b) {
            System.err.println("No more records. Terminating.");
        } catch (ClassNotFoundException c) {
            System.err.println("Invalid Object Type. Terminating.");
        } catch (IOException d) {
            System.err.println("Error reading from file. Terminating.");
        }
    }
    private static void closeFile() {
        try {
            if(input != null){
                input.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file. Terminating!");
        }
    }
}
