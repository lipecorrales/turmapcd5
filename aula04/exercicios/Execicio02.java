package exercicios;

import java.util.Scanner;

public class Execicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.println("Digite as duas notas");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        // media = (nota1 * 40 + nota2 * 60) / 100;
        media = nota1 * 0.4 + nota2 * 0.6;
    
        if (nota1 >= nota2) {
            System.out.println("Parabéns, Aprovado!");
        }else{
            System.out.println("Não foi dessa vez, Reprovado!");
        }
        entrada.close();
    }
}
