/*
    Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o maior desses números. 
*/
import javax.swing.JOptionPane;
public class Task27 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Type a integer(Z) number: "));
        int smallest; 
        int largest;
        
        int sum = a + b + c;
        int average = sum / 3;
        int product = a * b * c;
        smallest = (a < b) ? a : b;
        smallest = (c < smallest) ? c : smallest;
        largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        JOptionPane.showMessageDialog(null, "sum = " + sum);
        JOptionPane.showMessageDialog(null, "avg = " + average);
        JOptionPane.showMessageDialog(null, "product = " + product);
        JOptionPane.showMessageDialog(null, "smallest: " + smallest + " largest: " + largest);
       
    }
}
