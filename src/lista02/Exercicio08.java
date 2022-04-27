package lista02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância percorrida do carro");
        int distanciaPercorrida = scan.nextInt();
        System.out.println("Informe o total de combustível gasto");
        int totalDeCombustivelGasto = scan.nextInt();

        int consumoMedio = distanciaPercorrida / totalDeCombustivelGasto;

        System.out.println("Consumo médio do automóvel: " + consumoMedio + " litros");

    }
}
