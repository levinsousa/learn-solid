package srp.solucao;

public class Veiculo{
    private final int capacidadeTotal;
    private int gasolinaEmTanque;

    public Veiculo(final int capacidadeTotal){
        this.capacidadeTotal = capacidadeTotal;
        this.gasolinaEmTanque = capacidadeTotal;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getGasolinaEmTanque() {
        return gasolinaEmTanque;
    }

    public void setGasolinaEmTanque(int gasolinaEmTanque) {
        this.gasolinaEmTanque = gasolinaEmTanque;
    }

    public void acelerar(){
        gasolinaEmTanque--;
    }
}
