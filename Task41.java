/*
    Escreva um programa que lê uma string composta por duas palavras separadas por um espaço em branco. Seu programa deve exibir o comprimento de cada palavra
*/
import javax.swing.JOptionPane;
public class Task41 {
    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog("Type a text:");

        int spaceIndex = s.indexOf(" ");

        String firstWord = s.substring(0, spaceIndex);
        String secondWord = s.substring(spaceIndex + 1);

        JOptionPane.showMessageDialog(
                null,
                "First word length: " + firstWord.length() +
                "\nSecond word length: " + secondWord.length()
        );
    }
}
