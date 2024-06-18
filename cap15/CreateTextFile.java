package cap15;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateTextFile {

    private static Formatter output; 
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    //Abre o arquivo clients.txt
    private static void openFile() {
        try {
            output = new Formatter("cap15/clients.txt");
        } catch (SecurityException a) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // termina o programa
        }
        catch (FileNotFoundException b) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // termina o programa
        }
    }

    //Adiciona registros ao arquivo
    private static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%n%s%n? ", 
        "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");
        while (input.hasNext()) {
            try {
                output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException c) {
                System.err.println("Error writing to file. Terminating.");
                System.exit(1); // termina o programa
            } catch (NoSuchElementException d) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // termina o programa
            }
            System.out.print("? ");
        }
        input.close();
    }
    private static void closeFile() {
        if (output != null)
            output.close();
    }
}
