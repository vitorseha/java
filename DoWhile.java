import javax.swing.JOptionPane;
public class DoWhile {
    public static void main(String[] args) {

        double grade1, grade2;
        int counter = 1;

        do {
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

            counter = counter + 1;
        } while (counter <= 5);
    }
}
