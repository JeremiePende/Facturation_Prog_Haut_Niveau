public abstract class DocumentCommercial {
    private Long numero;
    private Client client;
    private Detail detail;

    public abstract double getTotal();
    public abstract double getTVA();
//Constructeur

    public DocumentCommercial(Long numero, Client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }
    // getter et setter

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

}
