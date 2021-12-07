package exercicios;

import java.util.Scanner;

public class Exercicio01B {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite o numero: ");
        num = entrada.nextInt();

        if(ehPar(num)){
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é impar");
        }
        entrada.close();
    }

    //return
    public static boolean ehPar(int num)
    {
        if(num % 2 == 0 ){
            return true;
        }
            return false;
    }
    
}
