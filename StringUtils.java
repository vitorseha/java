import javax.swing.JOptionPane;

public class StringUtils {
    public static void main(String[] args) {

        String text = "Hello, World";

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();

        JOptionPane.showMessageDialog(null, String.format("Uppercase: %s\nLowercase: %s", upper, lower));
    }
}
