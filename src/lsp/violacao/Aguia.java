package lsp.violacao;

public class Aguia extends Bird{

    @Override
    void Bicar() {
        forcaDaBicada = 100;
        super.Bicar();
    }

    @Override
    void Voar() {
        distDeVoo = 200;
        super.Voar();
    }
}
