package dip.violacao;

public class Faca {
    private int durabilidade;

    public Faca(){
        this.durabilidade = 100;
    }

    public void Cortar(){
        durabilidade--;
        System.out.println("Objeto Fatiado e durabilidade reduzida!");
    }
}
