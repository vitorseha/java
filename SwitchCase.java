import javax.swing.JOptionPane;
public class SwitchCase {
    public static void main(String[] args) {
        int grade;
        grade = Integer.parseInt(
            JOptionPane.showInputDialog("Enter the grade")
        );

        switch (grade) {
            case 10:
                JOptionPane.showMessageDialog(null, "Congratulations");
                JOptionPane.showMessageDialog(null, "Grade A");
                break;
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
