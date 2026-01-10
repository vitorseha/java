import javax.swing.JOptionPane;
public class CanGetDriversLicenseTernary {
    public static void main(String[] args) {
        int age = Integer.parseInt(
            JOptionPane.showInputDialog("How old are you?")
        );

        String canDrive;
        canDrive = age >= 16
                ? "Yes, you can get a driver's license in the USA"
                : "No, you cannot get a driver's license yet";

        JOptionPane.showMessageDialog(null, canDrive);
    }
}
