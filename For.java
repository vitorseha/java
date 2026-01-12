import javax.swing.JOptionPane;
public class For {
    public static void main(String[] args) {

        double grade1, grade2;

        for (int counter = 1; counter <= 5; counter = counter + 1) {
            grade1 = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter grade 1")
            );
            grade2 = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter grade 2")
            );

            JOptionPane.showMessageDialog(
                    null,
                    "Average: " + (grade1 + grade2) / 2
            );
        }
    }
}

