package lista02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mass = scan.nextDouble();
        double height = scan.nextDouble();
        int seconds = scan.nextInt();

        double cavalos = ((mass * height) / seconds) / 745.6999;

        System.out.println(cavalos);
    }
}
