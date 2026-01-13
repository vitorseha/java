/*
    Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem reversa.
*/
public class Task43 {
    public static void main(String[] args) {
        //while
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        //for
        for (int j = 100; j >= 1; j--){
            System.out.println(j);
        }
        //do-while
        int k = 100;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);
    }
}
