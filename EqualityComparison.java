import javax.swing.JOptionPane;
public class EqualityComparison {
     public static void main(String[] args) {

        String s1 = JOptionPane.showInputDialog("What is the first string?");
        String s2 = JOptionPane.showInputDialog("What is the second string?");

        // Comparison considering uppercase and lowercase: 's' is different from 'S'
        if (s1.equals(s2)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Considering case sensitivity, the strings are equal"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Considering case sensitivity, the strings are different"
            );
        }

        // Comparison ignoring uppercase and lowercase: 's' is equal to 'S'
        if (s1.equalsIgnoreCase(s2)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ignoring case sensitivity, the strings are equal"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Ignoring case sensitivity, the strings are different"
            );
        }
    }
}
