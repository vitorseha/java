/*
    Escreva um programa  que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
    menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
    deve exibir a quantidade de alunos que tiraram nota 0.
*/
import javax.swing.JOptionPane;
public class Task36 {
    public static void main(String[] args) {

        int cont = 0;
        int cont8 = 0;

        double a = Double.parseDouble(JOptionPane.showInputDialog("Grade 1: "));
        if (a == 0) {
            cont++;
        } else if (a > 8) {
            cont8++;
        }

        double b = Double.parseDouble(JOptionPane.showInputDialog("Grade 2: "));
        if (b == 0) {
            cont++;
        } else if (b > 8) {
            cont8++;
        }

        double c = Double.parseDouble(JOptionPane.showInputDialog("Grade 3: "));
        if (c == 0) {
            cont++;
        } else if (c > 8) {
            cont8++;
        }

        double d = Double.parseDouble(JOptionPane.showInputDialog("Grade 4: "));
        if (d == 0) {
            cont++;
        } else if (d > 8) {
            cont8++;
        }

        double e = Double.parseDouble(JOptionPane.showInputDialog("Grade 5: "));
        if (e == 0) {
            cont++;
        } else if (e > 8) {
            cont8++;
        }

        double f = Double.parseDouble(JOptionPane.showInputDialog("Grade 6: "));
        if (f == 0) {
            cont++;
        } else if (f > 8) {
            cont8++;
        }

        double g = Double.parseDouble(JOptionPane.showInputDialog("Grade 7: "));
        if (g == 0) {
            cont++;
        } else if (g > 8) {
            cont8++;
        }

        double h = Double.parseDouble(JOptionPane.showInputDialog("Grade 8: "));
        if (h == 0) {
            cont++;
        } else if (h > 8) {
            cont8++;
        }

        double i = Double.parseDouble(JOptionPane.showInputDialog("Grade 9: "));
        if (i == 0) {
            cont++;
        } else if (i > 8) {
            cont8++;
        }

        double j = Double.parseDouble(JOptionPane.showInputDialog("Grade 10: "));
        if (j == 0) {
            cont++;
        } else if (j > 8) {
            cont8++;
        }

        double avg = (a + b + c + d + e + f + g + h + i + j) / 10;

        if (avg < 6) {
            JOptionPane.showMessageDialog(null, cont);
        } else {
            JOptionPane.showMessageDialog(null, cont8);
        }
    }
}
