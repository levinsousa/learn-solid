package srp.violacao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.println();

        Veiculo veiculo = new Veiculo(inputText.nextInt());

        for(int i = veiculo.getGasolinaEmTanque(); i > veiculo.getGasolinaEmTanque()/2; i--){veiculo.acelerar();}

        System.out.println("Apos percorrer um longo caminho, seu gasolina atual é de: "+veiculo.getGasolinaEmTanque());
        System.out.println("Quanto deseja reabastecer: ");
        veiculo.reabastecer(inputText.nextInt());
    }
}
