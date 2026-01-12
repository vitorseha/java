import javax.swing.JOptionPane;
public class Concat {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("What is your first name?");
        String lastName = JOptionPane.showInputDialog("What is your last name?");

        String result = firstName.concat(" ").concat(lastName);

        JOptionPane.showMessageDialog(null, result);
    }
}
