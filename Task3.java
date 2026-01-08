/*
    Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda 
    e que você tem os seguintes dados: preço unitário da peça e quantidade vendida.
*/
import javax.swing.JOptionPane;
public class Task3 {
    public static void main(String[] args) {
        
        double unit_price;
        double quantity_sold;
        double sale_bonus;

        unit_price = Double.parseDouble(JOptionPane.showInputDialog("How much does the item cost?"));
        quantity_sold = Double.parseDouble(JOptionPane.showInputDialog("What quantity was sold?"));
        sale_bonus = (( unit_price * quantity_sold) * 0.05);

        JOptionPane.showMessageDialog(null, "Commission payment: " + sale_bonus);
    }
}
