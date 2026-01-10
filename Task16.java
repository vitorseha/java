/*
    Faça um programa que lê um número inteiro e calcula o menor número de notas suficiente para representar tal valor. 
    
    Considere a existência de notas de valores 200, 100, 50, 20, 10, 5, 2 e 1. 
    Por exemplo, se o valor lido for 643, esse valor pode ser representado por:
        3 notas de 200
        2 notas de 20
        1 nota de 2
        1 nota de 1
    Assim, seu programa deve exibir o texto “7 notas”.

*/
import javax.swing.JOptionPane;
public class Task16 {
    public static void main(String[] args) {
        int value;
        int notes = 0;
        value = Integer.parseInt(JOptionPane.showInputDialog("Value: "));

        notes += value / 200;
        value %= 200;

        notes += value / 100;
        value %= 100;

        notes += value / 50;
        value %= 50;

        notes += value / 20;
        value %= 20;

        notes += value / 10;
        value %= 10;

        notes += value / 5;
        value %= 5;

        notes += value / 2;
        value %= 2;

        notes += value / 1;

        JOptionPane.showMessageDialog(null, notes + " notes");

    }
}
