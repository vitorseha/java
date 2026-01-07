import javax.swing.JOptionPane;
public class Exercise1 {
    public static void main(String[] args) {
        double a;
        double b;
        double result;

        a = Double.parseDouble(JOptionPane.showInputDialog("Type the first value."));
        b = Double.parseDouble(JOptionPane.showInputDialog("Type the second value."));

        /*
            The showInputDialog method always returns a String.
            We use parseDouble(); to convert a string value to a numeric value, in this case a double.
        */

        result = a + b;
        //JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, a + " + " + b + " = " + result);
    }
}
