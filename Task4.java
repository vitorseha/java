//Ler um valor inteiro e exibir seu antecessor.
import javax.swing.JOptionPane;
public class Task4 {
    public static void main(String[] args) {
        int a;
        int result;

        a = Integer.parseInt(JOptionPane.showInputDialog("Type a number"));
        result = a - 1;

        JOptionPane.showMessageDialog(null, "Predecessor: " + result);
    }
}
