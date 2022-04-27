package lista01.funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        int opcao = 0;

        System.out.println("Nome: ");
        f.setNome(sc.nextLine());
        System.out.println("Sobrenome: ");
        f.setSobreNome(sc.nextLine());
        System.out.println("Cidade: ");
        f.setCidade(sc.nextLine());
        System.out.println("Estado: ");
        f.setEstado(sc.nextLine());
        System.out.println("Horas trabalhadas: ");
        f.setHorasTrabalhadas(sc.nextInt());
        System.out.println("Valor por hora trabalhada: ");
        f.setValorPorHora(sc.nextDouble());

        while (opcao != 5) {
            System.out.println("MENU");
            System.out.println("1 - Incrementar quantidade de horas trabalhadas");
            System.out.println("2 - Substituir valor por hora do funcionário");
            System.out.println("3 - Calcular o valor do funcionário no final do mês");
            System.out.println("4 - Informações do funcionário");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    int quantidadeDeHoras = sc.nextInt();
                    f.incrementaHora(quantidadeDeHoras);
                    break;
                case 2:
                    double novoValorHora = sc.nextDouble();
                    f.novoValorHoraTrabalada(novoValorHora);
                    break;
                case 3:
                    System.out.println("R$" + f.calculaSalario());
                    break;
                case 4:
                    f.imprimeInformacoes();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}