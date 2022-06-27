package isp.violacao;

public class Drone extends Veiculo{
    private boolean statusCamera;

    public boolean retornaStatusDaCamera(){
        return statusCamera;
    }

    @Override
    public void ligarRadio() {}

    @Override
    public void desligarRadio() {}

    @Override
    public void ligarCamera() {
        statusCamera = true;
    }

    @Override
    public void desligarCamera() {
        statusCamera = false;
    }
}
