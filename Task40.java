/*
    Escreva um programa que:
    a. lê uma string s
    b. lê dois inteiros a e b
    c. Exibe a substring que começa na posição a e termina na posição b, incluindo a posição b.
    Exemplo: s = Hello World, a = 2, b = 4. Resultado: llo.
*/
import javax.swing.JOptionPane;
public class Task40 {
    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog("Type a text:");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type the start position:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Type the end position:"));

        String result = s.substring(a, b + 1);

        JOptionPane.showMessageDialog(null, result);
    }
}

