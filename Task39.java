/*
    Ler uma string e verificar se ela representa uma senha válida. Para tal, ela deve ter as seguintes características:
    a. comprimento igual a 4
    b. primeiro símbolo igual a A ou a
    c. conter pelo menos um número ímpar
*/
import javax.swing.JOptionPane;

public class Task39 {
    public static void main(String[] args) {

        String password = JOptionPane.showInputDialog("Choose your password: ");

        if (password.length() != 4) {
            JOptionPane.showMessageDialog(null, "Your password must have 4 characters.");
            return;
        }

        char first = password.charAt(0);
        if (Character.toLowerCase(first) != 'a') {
            JOptionPane.showMessageDialog(null, "The first character must be A or a.");
            return;
        }

        char second = password.charAt(1);
        char third  = password.charAt(2);
        char fourth = password.charAt(3);

        boolean hasOdd = false;

        // check second
        if (Character.isDigit(second) && Character.getNumericValue(second) % 2 != 0) {
            hasOdd = true;
        }
        // check third
        if (Character.isDigit(third) && Character.getNumericValue(third) % 2 != 0) {
            hasOdd = true;
        }
        // check fourth
        if (Character.isDigit(fourth) && Character.getNumericValue(fourth) % 2 != 0) {
            hasOdd = true;
        }

        if (hasOdd) {
            JOptionPane.showMessageDialog(null, "Password created successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "At least one digit must be odd.");
        }
    }
}
