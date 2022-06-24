package lsp.violacao;

public abstract class Bird {
    int forcaDaBicada;
    int distDeVoo;

    public int getForcaDaBicada() {
        return forcaDaBicada;
    }

    public int getDistDeVoo() {
        return distDeVoo;
    }

    void Bicar() {
        System.out.println("Esta ave deu uma bicada com a força de "+forcaDaBicada+"N");
    }

    void Voar(){
        System.out.println("Esta ave voa "+distDeVoo+"m");
    }
}
