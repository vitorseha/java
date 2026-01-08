/*
    Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa apenas em dias. 
    Considerar ano com 365 dias e mês com 30 dias.
*/
import javax.swing.JOptionPane;
public class Task7 {
    public static void main(String[] args) {
        
        int year;
        int month;
        int day;

        int age;

        year = Integer.parseInt(JOptionPane.showInputDialog("How older are you?"));
        month = Integer.parseInt(JOptionPane.showInputDialog("How many full months ago was your last birthday?"));
        day = Integer.parseInt(JOptionPane.showInputDialog("How many days have passed since then?"));

        age = ((year * 365) + (month * 30) + day);
        JOptionPane.showMessageDialog(null, "You're alive for " + age + " days!");
    }
}
