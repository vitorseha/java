/*
    Escreva um programa que verifica se um número natural digitado pelo usuário é primo.
*/
import javax.swing.JOptionPane;
public class Task45 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));
        boolean prime = true;

        if(n <= 1){
            System.out.println("Must be greater than 1.");
            return;
        }

        if(n == 2){
            JOptionPane.showMessageDialog(null, "The number is prime.");
            return;
        } 

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }

        if(prime){
            JOptionPane.showMessageDialog(null, "The number is prime.");
        } else {
            JOptionPane.showMessageDialog(null, "The number is not prime.");
        }
    }
}
