package cap15;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadTextFile {
    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    //abre o arquivo clients.txt
    public static void openFile(){
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch(IOException ioException){
            System.err.println("Error opening file! Terminating!");
            System.exit(1);
        } 
    }

    //le o registro no arquivo
    public static void readRecords(){
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try {
            while(input.hasNext){
                //exibe o conteudo de registro
                System.out.printf("%-10s%-12s%-12s%10s%n" , input.nextInt() , input.next() , input.next() , input.nextDouble());
            }
        } catch(NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating!");
        } catch()

    }

}
