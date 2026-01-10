// Ler um número inteiro e exibir se ele é positivo, negativo ou neutro (0).
import javax.swing.JOptionPane;
public class Task17 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));

        if(number > 0){
            JOptionPane.showMessageDialog(null, "Positive.");
        } else if(number < 0) {
            JOptionPane.showMessageDialog(null, "Negative.");
        } else {
             JOptionPane.showMessageDialog(null, "Null.");
        }
    }
}
