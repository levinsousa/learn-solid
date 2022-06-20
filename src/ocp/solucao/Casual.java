package ocp.solucao;

public class Casual implements PerfilMode {

    private static final int volume = 100;
    private static final boolean somenteVibrar = false;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean getSomenteVibrar() {
        return somenteVibrar;
    }
}
