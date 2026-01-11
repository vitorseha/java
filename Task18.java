/*
    Ler coeficientes reais a, b e c de uma equação de segundo grau e exibir a(s) raiz(es),
    caso exista(m). 
    Lembretes: Calcule o valor de delta. Se ele for negativo, não há raízes.
    Se for igual a zero, há uma única raiz. Se delta for maior do que zero, então há duas raízes.
*/
import java.lang.Math;
import javax.swing.JOptionPane;
public class Task18 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c: "));
        double delta = Math.pow(b, 2) - 4 * a * c; 
        double x1;
        double x2;

        JOptionPane.showMessageDialog(null, "Δ = " + delta);

        if(delta > 0){
            x1 = ((-b) + Math.sqrt(delta)) / 2 * a;
            x2 = ((-b) - Math.sqrt(delta)) / 2 * a;
            JOptionPane.showMessageDialog(null, "x' = " + x1);
            JOptionPane.showMessageDialog(null, "x'' = " + x2);
        } else if(delta == 0) {
            x1 = -b / 2 * a;
            JOptionPane.showMessageDialog(null, "x = " + x1);
        } else {
            JOptionPane.showMessageDialog(null, "x ∉ R");
        }
    }
}
