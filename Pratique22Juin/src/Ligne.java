public class Ligne{
    private int numero;
    private int quantite;
    private Produit produit;
// Constructeur

    public Ligne(int numero, int quantite) {
        this.numero = numero;
        this.quantite = quantite;

    }


    //Getter et Setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit() {

    }
    // Methode
    public double getPrixTotal(){

        return produit.getPrix()*this.getQuantite();
    }

}
