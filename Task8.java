/*
    Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
    Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
*/
import javax.swing.JOptionPane;
public class Task8 {
    public static void main(String[] args) {
        double voters;
        double blank_votes;
        double null_votes;
        double valid_votes;
        double percentage_blank;
        double percentage_null;
        double percentage_valid;
       
        voters = Double.parseDouble(JOptionPane.showInputDialog("Type the total number of voters"));
        blank_votes = Double.parseDouble(JOptionPane.showInputDialog("The total number of blank votes."));
        null_votes = Double.parseDouble(JOptionPane.showInputDialog("The total number of null votes."));
        valid_votes = Double.parseDouble(JOptionPane.showInputDialog("The total number of valid votes."));

        percentage_blank = ((blank_votes/voters) * 100);
        percentage_null = ((null_votes/voters) * 100);
        percentage_valid = ((valid_votes/voters) * 100);

        JOptionPane.showMessageDialog(null, "Percentage in relation to the total number of voters: " + "blank votes: " + percentage_blank + " null votes:" + percentage_null + " valid votes: " + percentage_valid);


    }
}
