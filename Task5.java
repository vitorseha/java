//Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
import javax.swing.JOptionPane;
public class Task5 {
    public static void main(String[] args) {
        double base;
        double height;
        double area;

        base = Double.parseDouble(JOptionPane.showInputDialog("Type the base of the rectangle"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Type the height of the rectangle"));
        area = base * height;
        JOptionPane.showMessageDialog(null, "Area of the rectangle: " + area);
    }
}
