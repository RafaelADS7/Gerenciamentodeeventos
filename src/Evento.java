
public abstract class Evento {
    private String nomeEvento;
    private String local;
    private String descricao;
    private String organizador;
    private int numeroMaximo;


    public Evento(String nomeEvento, String local, String descricao, String organizador, int numeroMaximo) {
        this.nomeEvento = nomeEvento;
        this.local = local;
        this.descricao = descricao;
        this.organizador = organizador;
        this.numeroMaximo = numeroMaximo;
    }

    public abstract String mostrarDetalhes();

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOrganizador() {
        return this.organizador;
    }
    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public int getNumeroMaximo() {
        return  numeroMaximo;
    }
    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }
}

