package srp.solucao;

public class Reabastecer {
    Veiculo veiculo;

    public Reabastecer(Veiculo veiculo){
        this.veiculo = veiculo;
    }

    public void setGasolina(int gasolina){
        if(gasolina > veiculo.getCapacidadeTotal() - veiculo.getGasolinaEmTanque()) veiculo.setGasolinaEmTanque(veiculo.getCapacidadeTotal());
        veiculo.setGasolinaEmTanque(veiculo.getGasolinaEmTanque()+gasolina);
    }

}
