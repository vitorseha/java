/*
    In Java, when a case does not have a break statement, execution continues to the next case.
    This behavior is called fall-through.

    In the example below, if the value is 10, the program enters case 10, displays "Congratulations",
    then falls through to case 9, displays "Grade A", and stops when it reaches the break statement.
*/
import javax.swing.JOptionPane;
public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int grade;
        grade = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the grade")
        );

        switch (grade) {
            case 10:
                JOptionPane.showMessageDialog(null, "Congratulations");
            case 9:
                JOptionPane.showMessageDialog(null, "Grade A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Grade B");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Grade C");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Failed");
                break;
        }
    }
}
