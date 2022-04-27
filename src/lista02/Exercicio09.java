package lista02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = scan.nextLine();

        double media = 0;
        System.out.println("Informe as três notas do aluno");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Nota %d: ", i);
            int nota = scan.nextInt();
            media += nota;
        }
        System.out.println("\n\nNome do aluno: " + nome);
        System.out.println("Média: " + media / 3);
    }
}
