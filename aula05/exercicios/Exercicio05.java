package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int i;
        int par = 0;
        int impar = 0;

        for(i = 1; i <= 10; i++){
            System.out.printf("Digite %d numero: ", i);
            num = entrada.nextInt();

            if(num % 2 == 0){
                par ++;
            } else {
                impar ++;
            }
        }

        System.out.println("O total de pares é: " + par);
        System.out.println("O total de impares é: " + impar);

        entrada.close();
    }
}
