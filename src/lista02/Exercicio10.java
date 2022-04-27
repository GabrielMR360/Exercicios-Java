package lista02;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double TAXA_DE_JUROS = 0.007;

        System.out.println("Digite o valor do deposito: ");
        double valorDepositado = scan.nextDouble();
        double valorDoRendimento = valorDepositado * TAXA_DE_JUROS;

        System.out.println("Valor depositado R$" + valorDepositado);
        System.out.printf("Valor do rendimento após um mês R$%.2f", valorDoRendimento);
    }
}
