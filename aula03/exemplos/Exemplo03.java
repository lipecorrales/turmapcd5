package exemplos;

import java.util.Scanner;

public class Exemplo03 {

    public static void main(String[] args) {     
    
    Scanner entrada = new Scanner(System.in);
    int idade;

    System.out.println("Digite sua idade: ");
    idade = entrada.nextInt(); // le um valor inteiro do teclado e guarda na variavel idade

    System.out.println("Voce tem " + idade + " anos"); // concatenar = juntar

    entrada.close();
    }
}
