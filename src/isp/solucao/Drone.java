package isp.solucao;

public class Drone extends Veiculo implements ChaveCamera{
    private boolean statusCamera;

    public boolean retornaStatusDaCamera(){
        return statusCamera;
    }

    @Override
    public void ligarCamera() {
        statusCamera = true;
    }

    @Override
    public void desligarCamera() {
        statusCamera = false;
    }
}
