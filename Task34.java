/*
    Escreva um programa  que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
    considerado como uma senha válida, um número tem que ter as seguintes características:
    
    a. O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
    b. O quarto dígito da esquerda para a direita tem que ser 5 ou 1
    c. A soma do segundo com o terceiro dígito tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1

    Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
    meio é 3.
*/
import javax.swing.JOptionPane;
public class Task34 {
    public static void main(String[] args) {
        int password = Integer.parseInt(JOptionPane.showInputDialog("Type your password: "));
        int a, b, c, d;
        String result;

        a = password / 1000; //first digit
        b = (password % 1000) / 100; //second digit 
        c = (password % 100) / 10; //third digit
        d = password % 10; //fourth digit

       
        if( (a == 8 || a == 5) && (d == 5 || d == 1) ){
            if( d == 5) {
                result = (b + c == 3) ? "Created successfully!" : "Invalid password." ;
                JOptionPane.showMessageDialog(null, result);
            } else {
                result = (b + c == 0) ? "Created successfully!" : "Invalid password." ;
                JOptionPane.showMessageDialog(null, result);
            }
        } else {
            result = "Invalid password.";
            JOptionPane.showMessageDialog(null, result);
        }
        
    }
}
                
