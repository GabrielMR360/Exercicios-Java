package lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double valorTotal = scan.nextDouble();;

        double valorDasPrestacoes = 0;
        for (int i = 1; i <= 5; i++) {
            valorDasPrestacoes = valorTotal / i;
            System.out.printf("%dª prestação R$%.2f\n", i, valorDasPrestacoes);
        }
    }
}
