package serializationfiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {
    private final JTextArea outputArea; //exibe o conteudo do arquivo

    //configura a GUI
    public JFileChooserDemo() throws IOException{
        super("JFileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea)); //outputArea é rolavel
        analyzePath(); //objtem o path do usuario e exibe informações
    }
    //exibe informacoes sobre o arquivo ou diretorio que o usuario especifica
    private void analyzePath() throws IOException {
        //obtem o path para o arquivo ou diretorio selecionado pelo usuario
        Path path = getFileOrDirectoryPath();

        if(path != null && Files.exists(path)) //se existir exibe as informações
        {
            //coleta as informações sobre o arquivo (ou diretorio)
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n" , path.getFileName()));
            builder.append(String.format("%s a directory%n" , Files.isDirectory(path) ? "Is" : "Is not"));
            builder.append(String.format("%s an absolute path%n" , path.isAbsolute() ? "Is" : "Is not"));
            builder.append(String.format("Last modified: %s%n" , Files.getLastModifiedTime(path)));
            builder.append(String.format("Size: %s%n" , Files.size(path)));
            builder.append(String.format("Path: %s%n" , path));
            builder.append(String.format("Absolute Path: %s%n" , path.toAbsolutePath()));

            if(Files.isDirectory(path)) //listagem de diretorio de saida
            {
                builder.append(String.format("%nDirectory Contents:%n"));

                //objeto para iteraçao pelo conteudo de um diretorio
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    builder.append(String.format("%s%n", p));
                }
            }
            outputArea.setText(builder.toString()); //exibe o conteudo String
        } else {
            //Path nao existe
            JOptionPane.showMessageDialog(this, path.getFileName() + " does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    } //fim do metodo analyzePath

    //permite que o usuario especifique o nome de arquivo ou diretorio
    private Path getFileOrDirectoryPath() {
        //configura o dialogo permitindo a seleçao de um arquivo ou diretorio
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int result = fileChooser.showOpenDialog(this);

        //se o usuario clicou no botao Cancel no dialogo, retorna
        if(result == JFileChooser.CANCEL_OPTION){
            System.exit(1);
        }
        //retorna o Path representando o arquivo selecionado
        return fileChooser.getSelectedFile().toPath();
    }
} //fim da classe JFileChooserDemo
