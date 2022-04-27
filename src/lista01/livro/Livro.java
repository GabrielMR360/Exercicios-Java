package lista01.livro;

public class Livro {
    private String titulo;
    private String nomeLeitor;
    private int quantidadeDePaginasTotal;
    private int quantidadeDePaginasLidas;

    public void progressoLeitura() {
        double result = (double) this.quantidadeDePaginasLidas / this.quantidadeDePaginasTotal;
        result = Math.round(result * 100);

        System.out.println("Você já leu " + (int) result + "% " + "do livro");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public void setNomeLeitor(String nomeLeitor) {
        this.nomeLeitor = nomeLeitor;
    }

    public int getQuantidadeDePaginasTotal() {
        return quantidadeDePaginasTotal;
    }

    public void setQuantidadeDePaginasTotal(int quantidadeDePaginasTotal) {
        this.quantidadeDePaginasTotal = quantidadeDePaginasTotal;
    }

    public int getQuantidadeDePaginasLidas() {
        return quantidadeDePaginasLidas;
    }

    public void setQuantidadeDePaginasLidas(int quantidadeDePaginasLidas) {
        this.quantidadeDePaginasLidas = quantidadeDePaginasLidas;
    }
}
