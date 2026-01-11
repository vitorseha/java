/*
    Ler um inteiro no intervalo [1, 7] e exibir o dia da semana associado a ele, como a seguir: 
    1: Domingo, 2: Segunda, 3: Terça. E assim por diante.
*/

import javax.swing.JOptionPane;

public class Task20 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type an integer in the range [1, 7]"));

        switch (a) {
            case 1:
                JOptionPane.showMessageDialog(null, "Sunday");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Monday");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tuesday");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Wednesday");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Thursday");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Friday");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Saturday");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Type an integer in the range [1, 7]");
                break;
        }
    }
}
