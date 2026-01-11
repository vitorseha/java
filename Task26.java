/*
    Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
    o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
    números são iguais”.
*/
import javax.swing.JOptionPane;
public class Task26 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));

        if(a == b) {
            JOptionPane.showMessageDialog(null, "These numbers are equal.");
        } else {
            int greater = (a > b) ? a : b;
            JOptionPane.showMessageDialog(null, greater + " is the largest.");  
        } 
    }
}
