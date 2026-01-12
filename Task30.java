/*
    Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea. 
    O programa deve exibir um texto para o usuário conforme a tabela abaixo: 
        Abaixo de 18,5 - Abaixo do peso ideal.
        Entre 18,5 e 24,9 - Peso ideal, muito bem.
        Entre 25,0 e 29,9 - Sobrepeso, um regime leve pode ajudar.
        Entre 30,0 e 34,9 - Obesidade leve.
        Entre 35,0 e 39,9 - Obesidade moderada.
        Acima de 40 Obesidade mórbida.

*/
import javax.swing.JOptionPane;
public class Task30 {
    public static void main(String[] args) {
        double height = Double.parseDouble(JOptionPane.showInputDialog("Height (m): ")); 
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Weight (Kg): ")); 
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nBelow ideal weight.");
        } else if (bmi < 25) {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nIdeal weight, very good.");
        } else if (bmi < 30) {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nOverweight, a light diet may help.");
        } else if (bmi < 35) {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nMild obesity.");
        } else if (bmi < 40) {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nModerate obesity.");
        } else {
            JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nMorbid obesity.");
        }
    }
}
