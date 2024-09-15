
public class NetworkingSession extends Evento {
    public NetworkingSession(String nomeEvento, String local, String descricao, String organizador, int numeroMaximo) {
        super(nomeEvento, local, descricao, organizador, numeroMaximo);
    }

    public String mostrarDetalhes() {
        return "Nome do evento: " + getNomeEvento() +
                "Local: " + getLocal() +
                "Descrição: " + getDescricao() +
                "Organizador: " + getOrganizador() +
                "Numero maximo de pessoas: " + getNumeroMaximo();
    }

}
