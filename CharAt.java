import javax.swing.JOptionPane;

public class CharAt {
    public static void main(String[] args) {
        String s = "Hello, strings";
        int position = Integer.parseInt(JOptionPane.showInputDialog("Enter the desired position (between 0 and 13): "));

        String result = String.format("The character at position %d is %c.", position, s.charAt(position));

        JOptionPane.showMessageDialog(null, result);
    }
}
