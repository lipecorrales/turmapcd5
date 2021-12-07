package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("VW", "GOL", 15.5);

        veiculo.imprimirDados();
        System.out.println("Consumo : " + veiculo.obterConsumo());
    }
}
