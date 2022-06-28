package dip.solucao;

public class App {
    public static void main(String[] args) {
        Cozinheiro chiefComFaca = new Cozinheiro(new Faca());
        Cozinheiro chiefComCutelo = new Cozinheiro(new Cutelo());
        System.out.println("Olá, meu nome é Chief, sou cozinheiro e consigo fatiar com qualquer lâmina!");
        chiefComFaca.Fatiar();
        chiefComCutelo.Fatiar();
    }
}
