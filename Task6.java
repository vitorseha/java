//Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias.
import javax.swing.JOptionPane;
public class Task6 {
    public static void main(String[] args) {
        int years_old;
        int days;

        years_old = Integer.parseInt(JOptionPane.showInputDialog("How older are you?"));
        days = years_old * 365;
        JOptionPane.showMessageDialog(null, "You're alive for " + days + " days!");
    }
}
