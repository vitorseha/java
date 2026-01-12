/*
    Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
    um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
        0 – Compra à vista
        1 – Compra parcelada no cartão
        2 – Crediário
    Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
    Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
    Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
    desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
    Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e terminar.
*/
import javax.swing.JOptionPane;
public class Task29 {
    public static void main(String[] args) {
        double value = Double.parseDouble(JOptionPane.showInputDialog("Type the price: ")); 
        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "0. Cash payment\n" +
            "1. Credit card installment\n" + 
            "2. Store credit"));
        switch (option) {
            case 0:
                double cash = 0.9 * value;
                JOptionPane.showMessageDialog(null, "Total: " + cash + " $.");
                break;
            case 1:
                int m = Integer.parseInt(JOptionPane.showInputDialog("Number of installments: "));
                double installments = value / m;
                JOptionPane.showMessageDialog(null, "Installment value: \n" + m + " payments of " + installments + " $.");
                break;
            case 2:
                double credit = 1.1 * value;
                int n = Integer.parseInt(JOptionPane.showInputDialog("Number of installments: "));
                double interest_installments = credit / n;
                JOptionPane.showMessageDialog(null, "New price: " + credit + " $.\n" + "Installment value: \n" + n + " payments of " + interest_installments + " $.");
            break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option.");
                break;
        }
    }
}
