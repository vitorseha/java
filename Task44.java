/*
    Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário.
*/
import javax.swing.JOptionPane;
public class Task44 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
