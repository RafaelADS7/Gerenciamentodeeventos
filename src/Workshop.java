

public class Workshop extends Evento {
    public Workshop(String nomeEvento, String local, String descricao, String organizador, int numeroMaximo) {
        super(nomeEvento, local, descricao, organizador, numeroMaximo); // Chama o construtor da superclasse
    }

    @Override
    public String mostrarDetalhes() {
        return "Nome do evento: " + getNomeEvento() +
                "\nLocal: " + getLocal() +
                "\nDescrição: " + getDescricao() +
                "\nOrganizador: " + getOrganizador() +
                "\nNumero maximo de pessoas: " + getNumeroMaximo();
    }

}
