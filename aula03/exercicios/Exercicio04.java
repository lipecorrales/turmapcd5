package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double CUSTO_POR_KW = 500;
        double salarioMinimo, kwConsumido;
        double valorKW, valorTotal, valorComDesconto;

        //entrada
        System.out.println("Digite o valor do salario minimo");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite o consumo em KW:");
        kwConsumido = entrada.nextDouble();

        //processamento
        valorKW = salarioMinimo / CUSTO_POR_KW;
        valorTotal = valorKW * kwConsumido;

        //saida
        System.out.println("1 Kw custa" + valorKW);
        System.out.println("Valor Total: " + valorTotal);

        entrada.close();
    
    }
}
