/*
    A área de um círculo pode ser calculada da seguinte forma: 𝐴 = π * 𝑟2
    Faça umprograma que lê o valor do raio e exibe a área calculada. 
*/
import java.lang.Math;
import javax.swing.JOptionPane;
public class Task13 {
    public static void main(String[] args) {
        double radius;
        double area;

        radius = Double.parseDouble(JOptionPane.showInputDialog("Radius value"));
        area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(null, "A = " + area);
    }
}
