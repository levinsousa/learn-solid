package ocp.violacao;

public class EventHandler {
    private final Celular celular;

    public EventHandler(final Celular celular){
        this.celular = celular;
    }

    public void changePerfilMode(final PerfilMode perfilMode){
        switch (perfilMode){
            case CASUAL:
                celular.setVolume(100);
                celular.setSomenteVibrar(false);
                break;
            case REUNIAO:
                celular.setVolume(0);
                celular.setSomenteVibrar(true);
                break;
            default:
                celular.setVolume(50);
                celular.setSomenteVibrar(false);
                break;
        }
    }
}
