/*
    Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
    programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
    primeiro”.
*/

import javax.swing.JOptionPane;

public class Task25 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));

        String greater = (a > b) ? "First is greater than second" : "Second is greater than first";     
        JOptionPane.showMessageDialog(null, greater);   
    }
}
