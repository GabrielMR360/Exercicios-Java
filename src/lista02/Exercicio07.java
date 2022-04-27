package lista02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois valores");

        int valorUm = scan.nextInt();
        int valorDois = scan.nextInt();
        int soma = valorUm + valorDois;
        int subtracao = valorUm - valorDois;
        int multiplicacao = valorUm * valorDois;
        int divisao = valorUm / valorDois;


        System.out.println("Soma " + soma);
        System.out.println("Subtração " + subtracao);
        System.out.println("Multiplicação " + multiplicacao);
        System.out.println("Divisão " + divisao);
    }
}
