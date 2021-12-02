package exercicios;

import java.util.Scanner;

public class Execicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um numero inteiro:");
        numero = entrada.nextInt();

        if(numero > 20){
            // metade = numero / 2.0; // transforma o 2 em double 2.0
            metade = numero / 2; // casting = conversao de tipo
            System.out.println("Metade = " + metade);
            System.out.println("Metade = " + (numero / 2.0));
        }

        entrada.close();
    }
    
}
