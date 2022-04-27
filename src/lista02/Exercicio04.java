package lista02;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento");

        System.out.println("Dia");
        int dia = scan.nextInt();
        System.out.println("Mês");
        int mes = scan.nextInt();
        System.out.println("Ano");
        int ano = scan.nextInt();

        LocalDate date1 = LocalDate.of(ano, mes, dia);
        LocalDate date2 = LocalDate.now();

        long totalDeDias = Duration.between(date1.atStartOfDay(), date2.atStartOfDay()).toDays();
        int anos = (int) totalDeDias / 365;

        System.out.println("Você tem " + anos + " anos e já viveu " + totalDeDias + " dias");

    }
}
