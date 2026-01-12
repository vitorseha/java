/*
    With two strings in hand, we can check which one appears first in the dictionary.
    This can be done using the compareTo method.

    The compareTo method produces an integer.
        If s1 comes before s2 in the dictionary, the result is negative.
        If s2 comes before s1 in the dictionary, the result is positive.
        If the strings are equal, the value produced by compareTo is zero.
    
    ! Character comparison is based on their Unicode values.
*/

import javax.swing.JOptionPane;
public class CompareTo {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("What is the first string?");
        String s2 = JOptionPane.showInputDialog("What is the second string?");

        // Case-sensitive comparison
        int result = s1.compareTo(s2);

        if (result < 0) {
            JOptionPane.showMessageDialog(
                    null,
                    s1 + " comes before " + s2 + " in the dictionary"
            );
        } else if (result > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    s2 + " comes before " + s1 + " in the dictionary"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    s2 + " and " + s1 + " are equal"
            );
        }

        // Case-insensitive comparison
        result = s1.compareToIgnoreCase(s2);

        if (result < 0) {
            JOptionPane.showMessageDialog(
                    null,
                    s1 + " comes before " + s2 + " in the dictionary"
            );
        } else if (result > 0) {
            JOptionPane.showMessageDialog(
                    null,
                    s2 + " comes before " + s1 + " in the dictionary"
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    s2 + " and " + s1 + " are equal"
            );
        }
    }
}
