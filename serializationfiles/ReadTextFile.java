package serializationfiles;

import java.io.IOException;
import java.lang.IllegalStateException;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadTextFile {

    private static Scanner input; 
    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    //Abre o arquivo clients.txt
    private static void openFile() {
        try {
            input = new Scanner(Paths.get("serializationfiles/clients.txt"));
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
            while (input.hasNext()) {
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException b) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException c) {
            System.err.println("Error reading from file. Terminating.");
        }
    }
    private static void closeFile() {
        if (input != null)
            input.close();
    }
}
