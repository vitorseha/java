import javax.swing.JOptionPane;
//example of static import
import static java.lang.Integer.parseInt;

public class Task47 {
    public static void main(String[] args) {
        int n;

        do {
            // Now we use parseInt without qualifying it with Integer
            n = parseInt(JOptionPane.showInputDialog("Enter the value of n. Type a positive value:"));
        } while (n <= 0);

        int count = 1;

        while (count <= n) {
            int b, h;

            do {
                b = parseInt(
                    JOptionPane.showInputDialog(
                        "Enter a positive base value:"
                    )
                );
            } while (b <= 0);

            do {
                h = parseInt(
                    JOptionPane.showInputDialog(
                        "Enter a positive height value:"
                    )
                );
            } while (h <= 0);

            JOptionPane.showMessageDialog(
                null,
                String.format(
                    "Area: %dm x %dm = %dm\u00B2\n",
                    b,
                    h,
                    b * h
                )
            );

            count++;
        }
    }
}
