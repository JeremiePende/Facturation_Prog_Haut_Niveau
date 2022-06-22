public class Client extends Personne {
    private String numero;
// Creation de constructeur

    public Client(String numero) {
        this.numero = numero;
    }

    public Client(String nom, String prenom, Adresse adresse, String numero) {
        super(nom, prenom, adresse);
        this.numero = numero;
    }
    // Getter et Setter

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}


