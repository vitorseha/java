/*
    Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa
    para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
    Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido.
    Calcular e exibir o salário final do vendedor.
*/

import javax.swing.JOptionPane;

public class Task11 {
    public static void main(String[] args) {
        double fixed_salary;
        double fixed_comission;
        double cars_sold;
        double sales_value;
        double final_salary;

        cars_sold = Double.parseDouble(JOptionPane.showInputDialog("Cars sold: "));
        sales_value = Double.parseDouble(JOptionPane.showInputDialog("Total sales value made by the salesperson: "));
        fixed_salary = Double.parseDouble(JOptionPane.showInputDialog("Fixed monthly salary: "));
        fixed_comission = Double.parseDouble(JOptionPane.showInputDialog("Commission for each car sold: "));

        final_salary = fixed_salary + (cars_sold * fixed_comission) + (0.05 * sales_value);
        JOptionPane.showInternalMessageDialog(null, "Salesperson's final salary: " + final_salary + " R$");

    }
}
