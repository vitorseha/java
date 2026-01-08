//Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado.
import javax.swing.JOptionPane;
public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double result;

        a = Double.parseDouble(JOptionPane.showInputDialog("Type the 1st number"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Type the 2nd number"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Type the 3rd number"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Type the 4th number"));

        result = ((a*a) + (b*b) + (c*c) + (d*d));

        JOptionPane.showMessageDialog(null, "the sum of the squared numbers is " + result);
    }
}
