package isp.violacao;

public abstract class Veiculo implements Chaves {
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
