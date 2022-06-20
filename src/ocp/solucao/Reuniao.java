package ocp.solucao;

public class Reuniao implements PerfilMode {

    private static final int volume = 0;
    private static final boolean somenteVibrar = true;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean getSomenteVibrar() {
        return somenteVibrar;
    }
}
