package isp.violacao;

public class Carro extends Veiculo{
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

    @Override
    public void ligarCamera() {}

    @Override
    public void desligarCamera() {}
}
