/*
    Escreva um programa que lê dois valores inteiros A e B e exibe o texto “Soma: “ seguido
    da soma de A e B. Se A = 2 e B = 3, por exemplo, o programa deve exibir Soma: 5.
*/

import javax.swing.JOptionPane;

public class Task15 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;

        a = Integer.parseInt(JOptionPane.showInputDialog("A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("B:"));
        sum = a + b;

        JOptionPane.showMessageDialog(null, "Soma: " + sum);
    }
}
