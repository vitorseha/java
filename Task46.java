/*
    Faça um programa que simula o lançamento de dois dados, d1 e d2, n vezes, e tem como saída 
        a. o número de cada dado
        b. relação entre eles ( >,<,=) de cada lançamento.
*/
import java.util.Random;
import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = reader.nextInt();

        for (int i = 1; i <= n; i++) {
            // This method generates a random integer between: 0 and 5. The number 6 is not included.
            int d1 = generator.nextInt(6) + 1; 
            int d2 = generator.nextInt(6) + 1;

            System.out.printf(
                "%d %c %d\n",
                d1,
                d1 > d2 ? '>' : d2 > d1 ? '<' : '=',
                d2
            );
        }
        reader.close();
    }
}
