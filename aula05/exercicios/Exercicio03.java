package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, cont;

        System.out.println("Digite o valor limite: ");
        limite = entrada.nextInt();

        cont = 1;

        while( cont <= limite /2){
            int proximoNumero = cont * 2;
            System.out.print(cont);

            if( proximoNumero <= limite) { // existira outro numero depois?
                System.out.print(", ");
            } 
            cont *= 2; // cont = cont * 2;
       

        
    }

    System.out.print(cont);

    entrada.close();
    
    }
}