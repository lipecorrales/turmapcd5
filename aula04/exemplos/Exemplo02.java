package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        // printf( Formato, DADOS)
        //FORMATO:
        // %d = inteiro
        // %f = decimal
        // %s = texto

        // %.2f = 2 casas decimais, com arredondamento

        int valor = 10;

        System.out.printf("O numero é %d\n", valor);

        System.out.printf("Os numeros sao %d e %d\n", 10, 15);

        System.out.printf("A media é %.2f\n", 45.6754321);

        System.out.printf("A media é %f\n", 45.6754321);
    }
    
}
