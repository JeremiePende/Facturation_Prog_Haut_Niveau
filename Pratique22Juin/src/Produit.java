import java.util.Date;

public class Produit <T> extends Detail{
    private String code;
    private String designation;
    private Categorie categorie;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;


    //Constructeur

    public Produit(int numero, int quantite, String code, String designation, Categorie categorie, double prix, T uniteMesure, Date dateExpiration) {
        super(numero, quantite);
        this.code = code;
        this.designation = designation;
        this.categorie = categorie;
        this.prix = prix;
        this.uniteMesure = uniteMesure;
        this.dateExpiration = dateExpiration;
    }


    // Getter et setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUniteMesure() {
        return uniteMesure;
    }

    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    public double getPrixTotal(){

        return this.getPrix()*this.getQuantite();
    }

}
