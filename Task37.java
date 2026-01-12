/*
    Faça um programa que lê os seguintes dados:
        a. valor/hora (é um número real positivo)
        b. horas trabalhadas (é um inteiro)
        c. imposto (um real entre 0 e 1, inclusive)
        d. comissão (é um real positivo)
    Seu programa deve calcular e exibir para o usuário os seguintes valores:
        Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
        Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão.
           !Note que a comissão somente entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120
*/
import javax.swing.JOptionPane;
public class Task37 {
   public static void main(String[] args) {
        double wage = Double.parseDouble(JOptionPane.showInputDialog("Hourly wage: "));
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Hours worked: "));
        double tax = Double.parseDouble(JOptionPane.showInputDialog("Tax (between 0 and 1): "));
        double commission = Double.parseDouble(JOptionPane.showInputDialog("Commission: "));

        if (tax < 0 || tax > 1) {
            JOptionPane.showMessageDialog(null, "Invalid data (error)");
            return;
        }

        if (hours < 120){
            commission = 0;
        }

        double gross = wage * hours;
        
        double net = gross * (1 - tax) + commission;

        JOptionPane.showMessageDialog(null, "Gross salary: $" + gross + "\nNet salary: $" + net);
   } 
}
