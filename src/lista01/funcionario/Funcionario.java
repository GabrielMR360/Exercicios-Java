package lista01.funcionario;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private String cidade;
    private String estado;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobreNome, String estado) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.estado = estado;
    }

    public void imprimeNome() {
        System.out.println("Nome: " + this.nome + " " + this.sobreNome);
    }

    public void incrementaHora(int quantidadeDeHoras) {
        this.horasTrabalhadas += quantidadeDeHoras;
    }

    public void novoValorHoraTrabalada(double novoValorPorHora) {
        this.valorPorHora = novoValorPorHora;
        System.out.println("Novo valor por hora trabalhada R$" + this.valorPorHora);
    }

    public double calculaSalario() {
        double salario = this.horasTrabalhadas * this.valorPorHora;
        return salario;
    }

    public void imprimeInformacoes() {
        imprimeNome();
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Valor por hora trabalhada: " + this.valorPorHora);
        System.out.println("Salário: R$" + calculaSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}

