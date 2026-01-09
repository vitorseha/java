/*
    Suponha que um aluno tem três notas: A, B e C. Para calcular a média final, seu professor aplica os pesos 2, 3 e 5, respectivamente.
    Escreva um programa que lê os valores A, B e C e seus respectivos pesos. 
    O programa deve produzir a média ponderada conforme descrito.
*/
import javax.swing.JOptionPane;
public class Task14 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double weight_a;
        double weight_b;
        double weight_c;
        double avg;

        a = Double.parseDouble(JOptionPane.showInputDialog("A:"));
        weight_a = Double.parseDouble(JOptionPane.showInputDialog("Weight:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("B:"));
        weight_b= Double.parseDouble(JOptionPane.showInputDialog("Weight"));
        c = Double.parseDouble(JOptionPane.showInputDialog("C:"));
        weight_c = Double.parseDouble(JOptionPane.showInputDialog("Weight"));
        avg = ((a * weight_a) + (b * weight_b) + (c * weight_c)) / (weight_a + weight_b + weight_b) ;

        JOptionPane.showMessageDialog(null, "Final average:" + avg);
    }
}
