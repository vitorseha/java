/*
    Ler um número inteiro e responder se ele é bissexto ou não. Um ano bissexto tem as seguintes características:
    é múltiplo de quatro e não é múltiplo de 100 ou
    é múltiplo de 400

*/
import javax.swing.JOptionPane;
public class Task22 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type a year: "));
        String year;
        year = ( a % 4 == 0 && a % 100 != 0 || a % 400 == 0) ? "é bissexto" : "não é bissexto";
        JOptionPane.showMessageDialog(null, year);
    }
}
