package lista02;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double PORCENTAGEM_DISTRIBUIDOR = 0.28;
        final double PORCENTAEM_IMPOSTO = 0.45;
        double custoDefabrica = scan.nextDouble();

        double custoConsumidorFinal = custoDefabrica + PORCENTAEM_IMPOSTO + PORCENTAGEM_DISTRIBUIDOR ;

        System.out.println(custoConsumidorFinal);
    }
}
