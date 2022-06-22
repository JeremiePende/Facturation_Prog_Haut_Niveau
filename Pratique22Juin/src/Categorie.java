public class Categorie {
    private String designation;
    private String description;
    // Constructeur

    public Categorie(String designation, String description) {
        this.designation = designation;
        this.description = description;
    }
    //Getter et Setter

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
