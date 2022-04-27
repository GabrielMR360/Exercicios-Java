package lista02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int celsius = scan.nextInt();

        double kelvin = celsius + 273.15;
        double fahrenheit = ((celsius * 1.8) + 32);
        double rankine = ((celsius * 1.8) + 32 + 459.67);
        double reaumur = celsius * 0.8;

        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Rankine: " + rankine);
        System.out.println("Réaumur: " + reaumur);
    }
}
