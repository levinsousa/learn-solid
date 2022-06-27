package isp.solucao;

public abstract class Veiculo implements ChaveSistema {
    private boolean statusDoSistema;

    public boolean retornaStatusDoSistema() {
        return statusDoSistema;
    }

    @Override
    public void ligarSistema() {
        statusDoSistema = true;
    }

    @Override
    public void desligarSistema() {
        statusDoSistema = false;
    }
}
