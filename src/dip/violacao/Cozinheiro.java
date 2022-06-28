package dip.violacao;

public class Cozinheiro {
    private final Faca lamina;

    public Cozinheiro(){
        this.lamina = new Faca();
    }

    public void Fatiar(){
        lamina.Cortar();
    }
}
