package dip.solucao;

public class Cozinheiro {
    private Lamina lamina;

    public Cozinheiro(Lamina lamina){
        this.lamina = lamina;
    }

    public void Fatiar(){
        lamina.Cortar();
    }
}
