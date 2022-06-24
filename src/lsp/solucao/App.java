package lsp.solucao;

public class App {
    public static void main(String[] args) {
        Aguia aguia = new Aguia();
        Bird penguim = new Penguim();

        System.out.println("Temos uma aguia a seguir: ");
        aguia.Voar();
        aguia.Bicar();

        System.out.println("Agora temos um penguim: ");
        penguim.Bicar();
    }
}
