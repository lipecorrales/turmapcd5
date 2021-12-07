package exemplos.exemplo03;

public class Pessoa {
    
        // atributos = caracteristicas
        String nome;
        double altura;

        //metodo construtor
        //nome = nome classe, nao pode ter retorno
        Pessoa (String nome, double altura) {
            this.nome = nome;
            this.altura = altura;

        }

        //metodos = acoes
        void apresentar(){
           System.out.println("Olá ! Eu sou " + nome);
           System.out.println("Tenho altura " + altura);
        }
        
}

