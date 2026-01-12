/*
    Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
    valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
    programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
    saque.
*/
import javax.swing.JOptionPane;
public class Task28 {
    public static void main(String[] args) {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Bank account balance: ")); 
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount to withdraw: ")); 

        if(amount <= balance){
            double new_amount = balance - amount; 
            JOptionPane.showMessageDialog(null, "Remaining balance: " + new_amount + " $.");
        } else {
            JOptionPane.showMessageDialog(null, "The withdrawal could not be completed.");
        }
    }
}
