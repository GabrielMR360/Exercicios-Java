package lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();
        double reajusteSalarial = salario * 1.7;

        System.out.println("Antes do reajuste " + salario);
        System.out.println("Após o resjuste " + reajusteSalarial);
    }
}
