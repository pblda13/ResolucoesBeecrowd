package beecrowd.exercicios.iniciante;

import java.util.Scanner;

public class beecrowd_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
