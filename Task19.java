/*
    Ler três valores reais e exibir o maior valor entre eles. Suponha que eles sejam diferentes.
*/
import javax.swing.JOptionPane;

public class Task19 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("c: "));
        int greater_value;

        greater_value = (a > b) ? a : b;
        greater_value = (greater_value > c) ? greater_value : c;

        JOptionPane.showMessageDialog(null, "Greater value: " + greater_value);
        
    }
}
