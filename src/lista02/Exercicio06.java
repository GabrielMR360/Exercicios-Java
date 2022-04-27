package lista02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para ser convertido para Dólar, Euro e Libra");
        double valor = scan.nextDouble();

        double dolar = valor * 4.68;
        double euro = valor * 5.05;
        double libra = valor * 6.08;

        String format = String.format("$ %.2f\n£ %.2f\n€ %.2f\n", dolar, euro, libra);

        System.out.println(format);
    }
}
