import javax.swing.JOptionPane;
public class NestedIfElse {
    public static void main(String[] args) {
        double grade;
        grade = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the grade")
        );

        if (grade >= 90) {
            JOptionPane.showMessageDialog(null, "Congratulations");
            JOptionPane.showMessageDialog(null, "Grade A");
        } else {
            if (grade >= 80) {
                JOptionPane.showMessageDialog(null, "Grade B");
            } else {
                if (grade >= 70) {
                    JOptionPane.showMessageDialog(null, "Grade C");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed");
                }
            }
        }
    }
}
