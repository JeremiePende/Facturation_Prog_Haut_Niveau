public class Adresse {

    private String avenue;
    private String numero;
    private String celulle;
    private String ville;
    private String quartier;
    private String commune;
    private String pays;
    //Definition de constructeur

    public Adresse() {
    }

    public Adresse(String avenue, String numero, String celulle, String ville, String quartier, String commune, String pays) {
        this.avenue = avenue;
        this.numero = numero;
        this.celulle = celulle;
        this.ville = ville;
        this.quartier = quartier;
        this.commune = commune;
        this.pays = pays;
    }

    //Definition des getter et setter

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCelulle() {
        return celulle;
    }

    public void setCelulle(String celulle) {
        this.celulle = celulle;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
