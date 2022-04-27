package lista02;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14;

        System.out.println("Digite o raio do círculo");
        int raio = scan.nextInt();

        double area = PI * Math.pow(raio, 2);

        System.out.println("Área = " + area);
    }
}
