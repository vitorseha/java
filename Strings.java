import javax.swing.JOptionPane;
public class Strings {
    public static void main(String[] args) {
        // Check the length of a string
        String s = JOptionPane.showInputDialog("Enter a string");
        int length = s.length();
        JOptionPane.showMessageDialog(null, s + " has " + length + " characters.");
    }
}
