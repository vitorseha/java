/*
    Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
    deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
*/

import javax.swing.JOptionPane;

public class Task24 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Type a real (R) number: ")); 
        double b = Double.parseDouble(JOptionPane.showInputDialog("Type a real (R) number: ")); 

        if(a == b){
            JOptionPane.showMessageDialog(null, "They are equal.");
        }
    }
}
