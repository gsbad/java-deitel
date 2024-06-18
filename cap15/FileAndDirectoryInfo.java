package cap15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo{
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter file or directory name: ");

        //Cria o objeto Path com base na entrada do usuario
        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            // exibe informações sobre o arquivo (ou diretório)
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", 
                                        Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n", 
                                        path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Last modified: %s%n", 
                                        Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)){ // listagem de diretório de saída
                System.out.printf("%nDirectory contents%n");

                //objeto para iteração pelo conteudo do diretorio
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    System.out.println(p);
                }
                directoryStream.close();
            }
        }else{
            System.out.printf("%s does not exist%n", path);
        }
        input.close();
    }
}