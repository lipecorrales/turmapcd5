package exercicios;

public class Exercicio01 {
    public static void main(String[] args)
    {
	    boolean resultado;

        resultado = ehPar(28);
    
        if(resultado){
            System.out.println("Número é Par");
        } else {
            System.out.println("Número é Impar");
        }
	
	}
    // return devolve um valor E TERMINA a execução do método
    public static boolean ehPar(int num)
    { 
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}