package veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo v = new Veiculo();

        v.setMarca("teste");
        v.setModelo("teste");
        v.setAno(2010);
        v.setCor("branco");
        v.setVelocidadeMaxima(80);
        v.setValorFipe(1200.50);

        v.imprimeInformacoesDoCarro();
        v.adcionaVelocidade(81);
        v.frearVeiculo();
    }
}
