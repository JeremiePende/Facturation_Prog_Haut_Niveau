public class Facture extends DocumentCommercial{
    // Redefini les methodes de la classe mère à la classe fille
    @Override
    public double getTotal() {
        return 0;
    }

    @Override
    public double getTVA() {
        return 0;
    }
// Faire appel au constructeur de la classe mère
    public Facture(Long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }
}
