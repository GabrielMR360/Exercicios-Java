package lista01.veiculo;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private int velocidadeMaxima;
    private String cor;
    private double valorFipe;

    public void imprimeInformacoesDoCarro() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void adcionaVelocidade(int velocidade) {
        if (velocidade > this.velocidadeMaxima) {
            System.out.println("Velocidade acima do valor permitido para o veículo");
        } else {
            System.out.printf("Estou acelerando %dKm/h", velocidade);
        }
    }

    public void frearVeiculo() {
        System.out.println("Estou freando o veículo " + this.modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }
}
