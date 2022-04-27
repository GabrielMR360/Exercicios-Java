package lista02;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int FERRADURAS = 4;
        int quantidadeDeCavalos = scan.nextInt();

        int quantidadeDeFerraduras = quantidadeDeCavalos * FERRADURAS;

        System.out.println(quantidadeDeFerraduras);
    }
}
