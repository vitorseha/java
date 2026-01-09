/*
    Ler o salário mensal atual de um funcionário e o percentual de reajuste. 
    Calcular e exibir o valor do novo salário.
*/
import javax.swing.JOptionPane;
public class Task9 {
    public static void main(String[] args) {
        double current_salary;
        double adjustment_percentage;
        double new_salary;

        current_salary = Double.parseDouble(JOptionPane.showInputDialog("Current monthly salary: "));
        adjustment_percentage = Double.parseDouble(JOptionPane.showInputDialog("Adjustment percentage: "));
        new_salary = (current_salary + ((adjustment_percentage/100) * current_salary ));

        JOptionPane.showMessageDialog(null, "New salary: " + new_salary);
    }
}
