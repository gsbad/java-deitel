package classobjmethodsstrings;

import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Digite seu nome: ");
        String message = String.format("Seja bem vindo ao Java GUI, %s!", name);

        JOptionPane.showMessageDialog(null, message);

    }
}
