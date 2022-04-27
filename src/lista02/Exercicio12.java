package lista02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoDeCusto = scan.nextDouble();
        double percentual = scan.nextDouble();

        double valorDeVenda = precoDeCusto + (percentual / 100);

        System.out.printf("Preço de custo R$%.2f\n", precoDeCusto);
        System.out.printf("Preço de venda R$%.2f", valorDeVenda);
    }
}
