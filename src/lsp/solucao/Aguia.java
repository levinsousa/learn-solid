package lsp.solucao;

public class Aguia extends Bird implements isVoa{
    private final int forcaDaBicada = 100;

    @Override
    void Bicar() {
        super.Bicar();
    }

    @Override
    public void Voar() {
        int distDeVoo = 200;
        System.out.println("Esta ave voa "+ distDeVoo +"m");
    }
}
