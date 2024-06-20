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

    private static void openFile() {
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
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
                output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
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
        if(output != null){
            output.close();
        }
    }
}
