/* 
    Faça um programa que apresente um menu de opções para o cálculo das seguintes operações entre dois números. 
        a. adição (1) 
        b. subtração (2) 
        c. multiplicação (3) 
        d. divisão (4) 
        e. saída (5) 
    O programa deve possibilitar ao usuário a escolha da operação desejada, a exibição do resultado e a volta ao menu de opções. 
    O programa só termina quando for escolhida a opção de saída (5). Use as estruturas do/while e switch/case. 
*/
import javax.swing.JOptionPane;

public class Task48 {
    public static void main(String[] args) {

        int option;
        double num1, num2, result;

        do {
            option = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "MENU\n" +
                    "1 - Addition\n" +
                    "2 - Subtraction\n" +
                    "3 - Multiplication\n" +
                    "4 - Division\n" +
                    "5 - Exit"
                )
            );

            switch (option) {
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
                    result = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Addition result: " + result);
                    break;

                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
                    result = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Subtraction result: " + result);
                    break;

                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));
                    result = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Multiplication result: " + result);
                    break;

                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));

                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "Error: division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        JOptionPane.showMessageDialog(null, "Division result: " + result);
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Program terminated.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option.");
            }

        } while (option != 5);
    }
}
