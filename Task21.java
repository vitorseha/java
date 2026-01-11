/*
    Ler um número inteiro no intervalo [1, 12]. Considerando que cada número representa um mês da seguinte forma: 
    1: Janeiro, 2: Fevereiro e assim por diante, exiba o número de dias que o mês cujo respectivo número digitado possui.
*/

import javax.swing.JOptionPane;

public class Task21 {
    public static void main(String[] args) {
        int month = Integer.parseInt(JOptionPane.showInputDialog("Type an integer in the range [1, 12]"));

        switch (month) {
            case 1:
                JOptionPane.showMessageDialog(null, "January");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "February");
                JOptionPane.showMessageDialog(null, "28 days.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "March");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "April");
                JOptionPane.showMessageDialog(null, "30 days.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "May");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "June");
                JOptionPane.showMessageDialog(null, "30 days.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "July");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "August");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "September");
                JOptionPane.showMessageDialog(null, "30 days.");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "October");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "November");
                JOptionPane.showMessageDialog(null, "30 days.");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "December");
                JOptionPane.showMessageDialog(null, "31 days.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type an integer in the range [1, 12]");
                break;
        }
    }
}
