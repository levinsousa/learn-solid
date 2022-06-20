package srp.violacao;

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

    public void reabastecer(int gasolina){
        if(gasolina > getCapacidadeTotal() - getGasolinaEmTanque()) setGasolinaEmTanque(getCapacidadeTotal());
        setGasolinaEmTanque(getGasolinaEmTanque()+gasolina);
    }
    // Reabastecer não é uma responsabilidade do veículo

    public void acelerar(){
        gasolinaEmTanque--;
    }
}
