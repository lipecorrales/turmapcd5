package exemplos.exercicios.exercicio01;


public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(12, 20, 34);

        System.out.println(relogio.getHoraAtual());

        relogio.setHora(5);

        System.out.println(relogio.getHoraAtual());
    }
  
}
