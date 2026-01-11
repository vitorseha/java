/*
    Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
    do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
    somente termina.
*/
import javax.swing.JOptionPane;
public class Task23 {
    public static void main(String[] args) {
        int z = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Type a real (R) number: ")); 

        if(z < r){
            JOptionPane.showMessageDialog(null, "Integer number (Z) < real (R) number.");
        }
    }
}
