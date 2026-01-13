/*
    Faça um programa que leia valores inteiros continuamente, até que um valor menor ou igual a zero seja digitado. 
    A seguir, o programa deve exibir.
        a. A soma dos números digitados
        b. A quantidade de números digitados
        c. A média dos números digitados
        d. O maior número digitado
        e. O menor número digitado
*/
import java.util.Scanner;
public class Task49 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Enter an integer (<= 0 to stop): ");
        number = scanner.nextInt();

        while (number > 0) {
            sum += number;
            count++;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            System.out.print("Enter an integer (<= 0 to stop): ");
            number = scanner.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("\nResults:");
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Quantity of numbers: " + count);
            System.out.println("Average of numbers: " + average);
            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
        } else {
            System.out.println("\nNo positive numbers were entered.");
        }

        scanner.close();
    }
}
