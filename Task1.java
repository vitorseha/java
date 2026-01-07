//Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado.
import javax.swing.JOptionPane;
public class Task1 {
    public static void main(String[] args) {

        double usd;
        double quotation;
        double exchange;
        //USD 1 = BRL 5,39

        usd =  Double.parseDouble(JOptionPane.showInputDialog("What is the dollar exchange rate today?"));
        quotation = Double.parseDouble(JOptionPane.showInputDialog("How many US dollars do you have?"));
        exchange = usd * quotation;

        JOptionPane.showMessageDialog(null, "You have " + exchange + " BRL.");
    }
}
