/*
    Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
    média e exibir um texto para o usuário conforme a tabela a seguir:
        média >= 9 Parabéns, continue assim!
        7 <= média < 9 Aprovado.
        6 <= média < 7 Aprovado no limite, estude um pouco mais.
        2 <= média < 6 Não está aprovado mas ainda pode fazer a segunda época
        média < 2 Reprovado. Nos vemos semestre que vem.
*/

import javax.swing.JOptionPane;

public class Task31 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Grade 1: ")); 
        double b = Double.parseDouble(JOptionPane.showInputDialog("Grade 2: ")); 
        double avg = (a + b) / 2;

        if(avg >= 9){
            JOptionPane.showMessageDialog(null, "Congratulations, keep up the good work!");
        } else if (avg >= 7) {
            JOptionPane.showMessageDialog(null, "Approved.");
        } else if (avg >= 6) {
            JOptionPane.showMessageDialog(null, "Approved on the limit, study a little more.");
        } else if (avg >= 2) {
            JOptionPane.showMessageDialog(null, "Not approved, but you can still take the second exam.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed. See you next semester.");
        }
    }
}
