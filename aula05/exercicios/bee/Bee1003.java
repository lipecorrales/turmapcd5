package bee;

import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int soma;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

        entrada.close();
    }
}