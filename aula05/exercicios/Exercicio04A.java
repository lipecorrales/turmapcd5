package exercicios;

import java.util.Scanner;

public class Exercicio04A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 1, soma, cont;

        soma = 0;
        for(cont = 1; num !=0 ; cont++){
            System.out.println("Digite o " + cont + "º numero: ");
            num = entrada.nextInt();

            soma = soma + num;
        }

        System.out.println("Soma = " + soma);
        entrada.close();
    }
    
}
