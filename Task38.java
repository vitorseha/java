/*
    Ler uma única string que contém nome e sobrenome de uma pessoa. Exemplo: “João Silva”. 
    Para este exemplo, o programa deve exibir: “Olá, João. Seu sobrenome é Silva”.
*/
import javax.swing.JOptionPane;
public class Task38 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String surname = JOptionPane.showInputDialog("What is your surname?");
        String result = String.format("Hi, %s. Your surname is %s.", name, surname);

        JOptionPane.showMessageDialog(null,result);
    }
}
