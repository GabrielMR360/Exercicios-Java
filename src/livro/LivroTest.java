package livro;

import java.util.Scanner;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner sc = new Scanner(System.in);
        int leitor;

        System.out.println("Nome do leitor: ");
        String nome = sc.nextLine();
        System.out.println("Título do livro: ");
        String titulo = sc.nextLine();
        System.out.println("Quantidades de páginas do livro: ");
        int qtdPaginasTotal = sc.nextInt();
        System.out.println("Quantidade de páginas lidas: ");
        int qtdPaginasLidas = sc.nextInt();

        livro.setNomeLeitor(nome);
        livro.setTitulo(titulo);
        livro.setQuantidadeDePaginasLidas(qtdPaginasLidas);
        livro.setQuantidadeDePaginasTotal(qtdPaginasTotal);
        livro.progressoLeitura();
    }
}
