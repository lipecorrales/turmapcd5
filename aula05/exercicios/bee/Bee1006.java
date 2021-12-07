package bee;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextInt();
        double B = entrada.nextInt();
        double C = entrada.nextInt();
        double MEDIA = ((A*2) + (B*3) + (C*5))/(10);
        System.out.printf("MEDIA = %.1f\n", MEDIA);

        entrada.close();
    }
    
}
