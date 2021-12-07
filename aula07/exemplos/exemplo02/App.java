package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Philippe");

        //f.nome = "Philippe";

        System.out.println(f.toString());
        System.out.println(f.getNome());
    }
}
