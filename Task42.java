/*
    Escreva um programa que exibe os primeiros 100 números naturais. 
    Faça versões usando for, while e do/while.
*/
public class Task42 {
    public static void main(String[] args) {
        //while
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        //for
        for (int j = 1; j <= 100; j++){
            System.out.println(j);
        }
        //do-while
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 100);
    }
}
