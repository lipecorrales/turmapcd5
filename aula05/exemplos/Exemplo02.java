package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont;

        cont = 10;

        while( cont < 15) {
            System.out.print(cont + " ");
            //cont++; // soma um na variavel cont
            // cont = cont + 1; // mesma coisa do comando acima
            // cont += 2; // soma dois na variavel cont
            cont = cont + 2; // mesma coisa do comando acima
        }
        System.out.println("final: " + cont);
    }
}
