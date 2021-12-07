package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;

        System.out.println("Digite o primeiro número: \n");
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo número: \n");
        n2 = entrada.nextInt();

        System.out.println("Digite o terceiro número: \n");
        n3 = entrada.nextInt();

        System.out.println("O menor numero é " + menor(n1, n2, n3));
        System.out.println(" O menor numero é " + menor2(n1, n2, n3));

        entrada.close();
    }

    // Exemplo1
    public static int menor( int n1, int n2, int n3){
        int resposta;

        if(n1 < n2 && n1 < n3){
            resposta = n1;
        } else {
            if(n2 < n1 && n2 < n3){
                resposta = n2;
            } else {
                resposta = n3;
            }
        }
        return resposta;
    }

    // Exemplo2
    public static int menor2( int n1, int n2, int n3){
        if(n1 < n2 && n1 < n3){
            return n1;
        }
        if(n2 < n1 && n2 < n3){
            return n2;
        }
        return n3;
    }
}
