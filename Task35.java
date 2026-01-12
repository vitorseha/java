/*
    Escreva um programa que lê três números inteiros diferentes e os exibe em ordem crescente. Se o usuário digitar
    números iguais, seu programa deve exibir uma mensagem de erro e terminar
*/
import javax.swing.JOptionPane;
public class Task35 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type an integer(Z) number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Type an integer(Z) number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Type an integer(Z) number: "));

        if (a == b || a == c || b == c) {
            JOptionPane.showMessageDialog(null, "Numbers must be different. (error)");
            return;
        }

        int smallest, middle, largest;

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }

        if (a != smallest && a != largest) {
            middle = a;
        } else if (b != smallest && b != largest) {
            middle = b;
        } else {
            middle = c;
        }

        JOptionPane.showMessageDialog(null, "Ascending order: " + smallest + ", " + middle + ", " + largest);
    }
}
