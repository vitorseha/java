/*
    Concatenating strings using the + operator is computationally inefficient, and its use tends to reduce code readability.
    The format method of the String class can help. 

    We specify a template that contains the fixed parts of the string we want.
    The template includes format specifiers that will be replaced with values of interest.
    We specify which values will be used to replace the format specifiers, according to their order.
    Each data type has an appropriate format specifier.
*/
import javax.swing.JOptionPane;
public class Format {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        // Concatenating using the + operator
        JOptionPane.showMessageDialog(null, "Hi, " + name + ". You are " + age + " years old.");

        // Building the string using the format method
        String s = String.format("Hi, %s. You are %d years old.", name, age);

        JOptionPane.showMessageDialog(null, s);
    }
}
