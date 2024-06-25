package cap15;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.util.Scanner;

public class FileAndDirectoryInfo{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome de um arquivo ou diretório: ");

        //cria o objeto Path com base na entrada do usuario
        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.printf("%n%s exists!%n", path.getFileName());
            System.out.printf("%n%s a directory!%n", Files.isDirectory(path) ? "Is " : "Is not ");
            System.out.printf("%n%s an absolute Path!%n", path.isAbsolute() ? "Is " : "Is not ");
             //getLastModifiedTime - Retorna um FileTime (java.nio.file.attribute)
            System.out.printf("%nLast modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("%nSize: %s%n", Files.size(path));
            System.out.printf("%nPath: %s%n", path);
            System.out.printf("%nAbsolute Path: %s%n", path.toAbsolutePath());

            if(Files.isDirectory(path)){
                System.out.printf("%nDirectory contents:%n");

                // objeto para iteraçao pelo conteudo de um diretorio
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    System.out.println(p);
                }
                directoryStream.close();
            }

        }else{
            System.out.printf("%s does not exist!%n", path);
        }
        input.close();
    }
}
