package lsp.violacao;

public class App {
    public static void main(String[] args) {
        Bird aguia = new Aguia();
        Bird penguim = new Penguim();

        System.out.println("Temos uma aguia a seguir: ");
        aguia.Voar();
        aguia.Bicar();

        System.out.println("Agora temos um penguim: ");
        penguim.Voar();
        // temos uma excessão pois penguins não podem voar, e este método herdado não tem utilidade
        penguim.Bicar();
    }
}
