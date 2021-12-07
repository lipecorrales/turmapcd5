package exercicios.exercicio03;

public class Veiculo {
    String marca, modelo;
    double consumo;

    Veiculo(String marca, String modelo, double consumo){
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    void imprimirDados(){
        System.out.println(" Marca: " + marca + " Modelo: " + modelo);
    }

    double obterConsumo(){
        return consumo;
    }

    void alterarConsumo (double novoConsumo){
        if(novoConsumo > 0){
            consumo = novoConsumo;
        }
    }


}
