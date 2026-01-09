/*
    No plano cartesiano, a distância entre dois pontos p1(x1, y1) e p2(x2, y2) é definida como:
    dist(p1, p2) = √(𝑥2 − 𝑥1)² + (𝑦2 − 𝑦1)²

    Escreva um programa que lê os valores x1, y1, x2 e y2 nesta ordem e exibe a distância entre
    p1 e p2. Utilize valores reais.
*/
import java.lang.Math;
import javax.swing.JOptionPane;
public class Task12 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double dist;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("x1:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("y1:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("x2:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("y2:"));
        dist = Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));

        JOptionPane.showMessageDialog(null, "dist(p1, p2) =" + dist);
    }
}
