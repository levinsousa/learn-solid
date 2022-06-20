package ocp.solucao;

public class EventHandler {
    private final Celular celular;

    public EventHandler(final Celular celular){
        this.celular = celular;
    }

    public void changePerfilMode(final PerfilMode perfilMode){
        celular.setVolume(perfilMode.getVolume());
        celular.setSomenteVibrar(perfilMode.getSomenteVibrar());
    }
}
