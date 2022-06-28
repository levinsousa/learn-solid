package dip.solucao;

public class Faca implements Lamina{
    private int durabilidade;

    public Faca(){
        this.durabilidade = 100;
    }

    public void Cortar(){
        durabilidade--;
        System.out.println("Objeto fatiado com Faca, sua durabilidade foi reduzida!");
    }
}
