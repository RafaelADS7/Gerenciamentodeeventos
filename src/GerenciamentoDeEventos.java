
import java.util.ArrayList;

public class GerenciamentoDeEventos {
    private ArrayList<Evento> eventos;

    public GerenciamentoDeEventos() {
        eventos = new ArrayList<>();
    }




    public  void adicionarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento adicionado; " + evento.getNomeEvento());
    }

}
