import javax.swing.JOptionPane;
public class SimpleIf {
    public static void main(String[] args) {
        double grade;
        grade = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the grade")
        );

        if (grade >= 70) {
            JOptionPane.showMessageDialog(null, "Approved");
        }
    }
}
