package isp.solucao;

public class Carro extends Veiculo implements ChaveRadio {
    private boolean statusRadio;

    public boolean retornaStatusDoRadio(){
        return statusRadio;
    }

    @Override
    public void ligarRadio() {
        statusRadio = true;
    }

    @Override
    public void desligarRadio() {
        statusRadio = false;
    }
}
