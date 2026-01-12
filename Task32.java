/*
    Escreva um programa que oferece para o usuário as seguintes opções:
        1 – Misto quente R$5,50
        2 – Salada Chinesa R$10,20
        3 – Suco de Laranja R$4,00
        4 – Suco de Manga R$3,50
    Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
    terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
    lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir  “bom apetite,
    vai lhe custar” seguido do valor da comida.
*/
import javax.swing.JOptionPane;
public class Task32 {
    public static void main(String[] args) {

        int option = Integer.parseInt(JOptionPane.showInputDialog(
            "1. Grilled sandwich $5.50\n" +
            "2. Chinese salad $10.20\n" + 
            "3. Orange juice $4.00\n" +
            "4. Mango juice $3.50"));


        switch (option) {
            case 1:
                double sandwich = 5.5;
                JOptionPane.showMessageDialog(null, "Enjoy your meal, it will cost $" + sandwich + ".");
                break;
            case 2:
                double salad = 10.2;
                JOptionPane.showMessageDialog(null, "Enjoy your meal, it will cost $" + salad + ".");
                break;
            case 3:
                double orange = 4;
                JOptionPane.showMessageDialog(null, "Have an excellent drink, it will cost $" + orange + ".");
            break;
            case 4:
                double mango = 3.5;
                JOptionPane.showMessageDialog(null, "Have an excellent drink, it will cost $" + mango + ".");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. (error)");
                break;
        }
    
    }
}
