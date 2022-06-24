package lsp.solucao;

public abstract class Bird {
    int forcaDaBicada;


    public int getForcaDaBicada() {
        return forcaDaBicada;
    }


    void Bicar() {
        System.out.println("Esta ave deu uma bicada com a força de "+forcaDaBicada+"N");
    }
}
