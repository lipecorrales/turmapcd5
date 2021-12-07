package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int count = 1;
        int digit = 1;

        while(digit != 0) {
            System.out.printf("Digite um %d número: ", count);
            digit = entrada.nextInt();
            soma += digit;
            count++;
        }

        System.out.printf("A soma dos valores é: %d", soma);
    
        entrada.close();
    }
}


