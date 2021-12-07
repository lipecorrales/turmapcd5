package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Philippe", 1.74);
        Pessoa p2 = new Pessoa("Majori", 1.64);

        //Pessoa p3 = new P

        //p1.nome = "Philippe";
        //p1.altura = 1.74;
        p1.apresentar();
        
        p2.apresentar();
    }
    
}
