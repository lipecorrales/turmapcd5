package exemplos.exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Philippe", "41988451050");
        Estudante estudante = new Estudante("Carlão", "41988451050", "Analista de TI");
        Professor prof = new Professor("Nobeu", "41988451050", 5000);

        System.out.println(pessoa.getDados());
        System.out.println(estudante.getDados());
        System.out.println(prof.getDados());
    }
}
