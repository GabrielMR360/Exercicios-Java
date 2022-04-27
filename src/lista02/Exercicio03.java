package lista02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do emprestimo: ");
        double capitalAplicado = scan.nextDouble();
        System.out.print("Parcelas que pretende pagar: ");
        int tempo = scan.nextInt();
        final double taxa = 0.02;

        double montante = (capitalAplicado * Math.pow((1 + taxa), tempo));

        String numeroFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(montante);

        System.out.println("Total a pagar após " + tempo + " meses " + numeroFormatado);
    }
}
