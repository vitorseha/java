/*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos 
    impostos (aplicados ao custo de fábrica). 

    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, 
    calcular e escrever o custo final ao consumidor.
*/

import javax.swing.JOptionPane;

public class Task10 {
    public static void main(String[] args) {
        double factory_cost;
        double distributor_percentage;
        double taxes;
        double final_cost;

        factory_cost = Double.parseDouble(JOptionPane.showInputDialog("Factory cost: "));
        distributor_percentage = 0.28;
        taxes = 0.45;

        final_cost = ((distributor_percentage + taxes) * factory_cost) + factory_cost;
        JOptionPane.showMessageDialog(null, "Final cost to the consumer" + final_cost);

    }
}