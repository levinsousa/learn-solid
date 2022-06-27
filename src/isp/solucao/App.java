package isp.solucao;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Drone drone = new Drone();

        System.out.println("_____________________________");
        System.out.println("|    status dos veiculos     |");
        System.out.println("_____________________________");
        System.out.println("Carro: "+carro.retornaStatusDoSistema());
        System.out.println("Radio do carro: "+carro.retornaStatusDoRadio());
        System.out.println("Drone: "+drone.retornaStatusDoSistema());
        System.out.println("Camera do Drone: "+drone.retornaStatusDaCamera());
    }
}
