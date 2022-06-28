package dip.solucao;

public class Cutelo implements Lamina{
    private int durabilidade;

    public Cutelo(){
        this.durabilidade = 170;
    }

    public void Cortar(){
        durabilidade--;
        System.out.println("Objeto fatiado com Cutelo, sua durabilidade foi reduzida!");
    }
}
