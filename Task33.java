/*
    Faça um programa que lê os seguintes dados:
      a. código de estado (um inteiro de 1 a 5).
      b. valor inicial de carga.
    Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras:
      a. Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
      b. Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%.
*/
import javax.swing.JOptionPane;
public class Task33 {
    public static void main(String[] args) {
        int state_code = Integer.parseInt(JOptionPane.showInputDialog("State code (between 1 and 5): "));

        if(state_code != 1 && state_code != 2 && state_code != 3 && state_code != 4 && state_code != 5) {
            JOptionPane.showMessageDialog(null, "Invalid option. (error)");
        } else {
            double cargo = Double.parseDouble(JOptionPane.showInputDialog("Initial cargo value: "));
            double price = (state_code == 2 || state_code == 5) ? cargo * 0.88 : cargo * 0.85;
            JOptionPane.showMessageDialog(null, "Price: $" + price + ".");
        }
    }
}
